JPA - Hibernate Code Demo 

CruddemoApplication.java contains the following methods that perform the respective CRUD updates on a local mySQL database. 

createStudent(studentDAO);
- Create one row in Student DB
			
createMultipleStudents(studentDAO);
- Create multiple rows in Student DB

readStudent(studentDAO);
- Retrieve Student information with JPQL 

queryForStudents(studentDAO);
- Find Student by ID with JPQL 

queryForStudentsByLastName(studentDAO);
- Find Student by givent last name using JPQL

updateStudent(studentDAO);
Update Student by give ID
			
deleteStudent(studentDAO);
- Delete Student by given ID 

deleteAllStudents(studentDAO);
- Delete all students in Student DB
