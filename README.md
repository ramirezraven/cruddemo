# Spring Boot Hibernate JPA - CRUD Demo

This is a Spring Boot application that demonstrates CRUD (Create, Read, Update, Delete) operations using Hibernate and JPA with a MySQL database.

## Project Overview

The `CruddemoApplication.java` contains methods to interact with a local MySQL database and perform various CRUD operations on a `Student` entity. The operations include creating a single student, creating multiple students, retrieving students via JPQL, and updating student information. The application utilizes JPA for object-relational mapping (ORM) and Hibernate as the persistence provider.

## Features

- **Create a single student**: Adds a new row to the `Student` table.
- **Create multiple students**: Adds multiple rows to the `Student` table.
- **Retrieve student information**: Fetches student information from the database using JPQL.
- **Find student by ID**: Searches for a student based on their ID using JPQL.
- **Find student by last name**: Searches for students based on their last name using JPQL.
- **Update student information**: Updates an existing student's details in the database.

## Requirements

- Java 11 or newer
- Spring Boot 2.x
- Hibernate ORM
- MySQL 5.x or newer
- Maven or Gradle for project management
- IntelliJ IDEA or your preferred IDE

## Installation

### Clone the Repository

```bash
git clone https://github.com/ramirezraven/spring-boot-hibernate-demo.git
cd spring-boot-hibernate-demo

