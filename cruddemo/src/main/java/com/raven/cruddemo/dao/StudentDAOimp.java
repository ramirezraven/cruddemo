package com.raven.cruddemo.dao;
import com.raven.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOimp implements StudentDAO {

    //define entity manager fields
    private EntityManager entityManager;

    //inject entity manager w costructor injection
    @Autowired
    public StudentDAOimp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    // implement save method
    @Override
    @Transactional
    public void save(Student theStudent) {
        entityManager.persist(theStudent);

    }

    //Find by ID
    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    //Find all students
    @Override
    public List<Student> findAll() {
        // create query

        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student", Student.class);

        // return query results
        return theQuery.getResultList();
    }

    //Find student by id
    @Override
    public List<Student> findByLastName(String lastName) {
       //create query
        TypedQuery<Student> nameQuery = entityManager.createQuery(
                "FROM Student WHERE lastName=:thedata", Student.class);

        // set query
        nameQuery.setParameter("thedata", lastName);

       // return results
        return nameQuery.getResultList();

    }

    @Override
    @Transactional
    public void update(Student theStudent) {
        entityManager.merge(theStudent);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        // retrieve student
        Student theStudent = entityManager.find(Student.class, id);

        // delete student
        entityManager.remove(theStudent);


    }

    @Override
    @Transactional
    public int deleteAll() {
        int numRowsDeleted = entityManager.createQuery("DELETE FROM Student").executeUpdate();
        return numRowsDeleted;
    }


}
