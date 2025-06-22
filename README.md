
# 📘 Student Management System (Java Console Application)

This is a simple **Java console-based application** for managing student records. It supports operations such as adding, viewing, updating, deleting, and searching for students by ID. The system is interactive, menu-driven, and runs in the terminal.

---

## ✅ Features

- ➕ Add new students with ID, name, age, and course
- 📋 View all student records
- 🔍 Search for a student by ID
- ✏️ Update existing student details
- 🗑️ Delete a student by ID
- 🚪 Exit the system gracefully

---

## 🛠️ How to Run

### Requirements

- Java JDK 8 or higher
- Terminal or Java IDE (e.g., IntelliJ, Eclipse, NetBeans)

### Steps

1. Save the code in a file named:
   ```
   StudentManagementSystem.java
   ```

2. Compile the program:
   ```bash
   javac StudentManagementSystem.java
   ```

3. Run the compiled class:
   ```bash
   java StudentManagementSystem
   ```

---

## 🖥️ Menu Options

```text
===== Student Management Menu =====
1. Add Student
2. View All Students
3. Search Student by ID
4. Update Student
5. Delete Student
6. Exit
```

---

## 📂 Program Structure

### 🔹 `Student` Class

**Attributes:**
- `id` (int)
- `name` (String)
- `age` (int)
- `course` (String)

**Methods:**
- `setName(String)`
- `setAge(int)`
- `setCourse(String)`
- `toString()` – formatted display of student info

---

### 🔹 `StudentManagementSystem` Class (Main)

**Responsibilities:**
- Menu navigation
- Manages a list of students using `ArrayList`
- Provides methods for each menu operation:
  - `addStudent()`
  - `viewAllStudents()`
  - `searchStudent()`
  - `updateStudent()`
  - `deleteStudent()`

---

## 🧪 Example Interaction

```text
Enter ID: 1
Enter Name: Priya
Enter Age: 20
Enter Course: BCA
✅ Student added successfully.

Enter Student ID: 1
🔍 Student Found:
ID: 1
Name: Priya
Age: 20
Course: BCA

Enter Student ID to delete: 1
🗑️ Student deleted.
```

---

## 🛡️ Validations & Notes

- Each student is uniquely identified by `ID`
- Update and delete actions require valid ID input
- Prevents crash on invalid input types using structured prompts

---

## 📜 License

This project is open-source and intended for educational or academic purposes.

---

## 👨‍💻 Author

**Gaurav Raj**

> You can enhance this system by adding:
> - File or database persistence
> - Validation against duplicate IDs
> - GUI interface using Swing/JavaFX

