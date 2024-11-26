# Employee_Crud_Operations

## Employee Management System (JDBC)

## Project Description
The Employee Management System is a simple console-based application that uses Java, JDBC, and MySQL. In this project, you can store, update, delete, and retrieve employee data from a MySQL database.

### Key Features:
- **Database Connectivity**: Connects to MySQL database using JDBC.
- **CRUD Operations**:
  - **Create**: Insert new employee records.
  - **Read**: Fetch existing employee records.
  - **Update**: Update employee data.
  - **Delete**: Delete employee records.
- **User-Friendly Console Interface**: A simple command-line interface to perform operations through user input.

## Prerequisites:
1. **JDK**: Java Development Kit (JDK) version 8 or higher should be installed.
2. **MySQL**: MySQL database system should be installed.
3. **Database Configuration**:
   - Database: `jdbcemp`
   - Tables: `employee`
   
   **SQL Commands**:
   ```sql
   CREATE DATABASE jdbcemp;
   USE jdbcemp;

   CREATE TABLE employee (
       id INT PRIMARY KEY,
       name VARCHAR(100),
       address VARCHAR(255),
       salary VARCHAR(50)
   );
