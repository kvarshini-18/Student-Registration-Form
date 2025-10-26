# Student-Registration-Form
# StudentRegistrationForm 
A sleek Java Swing-based Student Management Application with a modern tabbed interface.

---

## Overview
This project is a **modern Student Portal** built using **Java Swing**. It provides a clean and organized interface with the **Nimbus look-and-feel**, featuring gradient backgrounds, rounded buttons, and intuitive tabbed navigation.

---

## Application Structure

### 1. Welcome Page
- Acts as the landing page of the application.  
- Includes short introductory text and quick navigation options.  
- Provides buttons to move directly to the Register or View Data sections.  

### 2. Registration Page
- Contains input fields for student details such as name, gender, and course.  
- Includes **Save** and **Clear** buttons with smooth hover effects.  
- Validates inputs before saving data to the database.  

### 3. View Data Page
- Displays stored student data in a table format.  
- Includes a **Refresh** button to reload data from the database.  
- Allows users to verify all saved records.  

---

## Requirements

- **Java:** JDK 8 or higher (Java 11 recommended)  
- **Database:** MySQL Server (local or remote)  
- **Driver:** MySQL Connector/J 9.4.0  
- **Look and Feel:** Nimbus (built-in Java Swing theme)  

---
## Folder Layout
```
Launcher.java              # Main entry (contains tabs and modern UI)
mysql-connector-j-9.4.0.jar  # JDBC driver (kept in this folder)
DB.java or DB.class        # Database helper (ensures schema, performs queries)
```

## Build & Run (Windows)
Run the following commands from this folder:

```bat
javac -cp ".;mysql-connector-j-9.4.0.jar" Launcher.java
java -cp ".;mysql-connector-j-9.4.0.jar" Launcher
```
 Troubleshooting
- Driver not found: double-check the JAR path in `-cp`.
- Cannot connect to DB: verify `DB.java` credentials and that MySQL is running.
- Class not found (DB)
