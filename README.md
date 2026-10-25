# 🎓 Student Management System | Core Java

A simple, menu-driven **Student Management System** built using Core Java to manage student records through a console-based application.

This project demonstrates fundamental Java programming concepts, Object-Oriented Programming (OOP), collection handling, input validation, and CRUD operations.

## 📌 Features

- **Add Student** — Register a student with ID, name, age, and marks.
- **View All Students** — Display all student records in a formatted table.
- **Search Student** — Find a student by their unique ID.
- **Update Student** — Modify an existing student's details.
- **Delete Student** — Remove a student record using their ID.
- **Input Validation** — Validate numeric input and enforce acceptable value ranges.
- **Duplicate ID Prevention** — Prevent students from being registered with an existing ID.
- **Exception Handling** — Handle invalid numeric input without terminating the application unexpectedly.

## 🛠️ Tech Stack

| Technology | Purpose |
|---|---|
| Java | Core application logic |
| ArrayList | Store and manage student records |
| Scanner | Read user input |
| Exception Handling | Handle invalid input |
| IntelliJ IDEA | Development environment |

## 🧠 Concepts Practiced

- Object-Oriented Programming (OOP)
- Classes and Objects
- Encapsulation
- Constructors, Getters, and Setters
- Methods and Code Reusability
- ArrayList and Generics
- Loops and Conditional Statements
- Type Conversion and String Manipulation
- Input Validation using `try-catch`
- Linear Search
- CRUD Operations

## 📂 Project Structure

```text
Student-Management-System/
├── src/
│   ├── Main.java
│   ├── Student.java
│   └── StudentManagementSystem.java
└── README.md
```

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK)
- IntelliJ IDEA or another Java-compatible IDE

### Run Locally

1. Clone the repository:

   ```bash
   git clone YOUR_REPOSITORY_URL
   ```

2. Open the project in IntelliJ IDEA.
3. Make sure all Java source files are configured correctly.
4. Run `Main.java`.
5. Use the console menu to manage student records.

## 🖥️ Application Menu

```text
===== Student Management System =====
1. Add Student
2. Display All Students
3. Search Student
4. Update Student
5. Delete Student
6. Exit
```

## ⚙️ How It Works

1. The application displays a menu of available operations.
2. The user selects an operation.
3. Input is collected and validated.
4. Student records are created, searched, updated, displayed, or deleted.
5. The application continues until the user selects Exit.

## ⚠️ Current Limitations

- Student records are stored in an `ArrayList` in memory.
- Data is not permanently saved after the application exits.
- The application uses a console-based interface.
- No database integration is currently implemented.

## 🔮 Future Enhancements

- Implement file handling for persistent storage.
- Integrate MySQL using JDBC.
- Develop a graphical user interface.
- Add sorting and filtering functionality.

## 👨‍💻 Author

Developed as a **Core Java project** to practice Java fundamentals, object-oriented programming, and basic application development.

---

If you find this project useful, feel free to ⭐ the repository!
