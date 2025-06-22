import java.util.*;

class Student {
    private int id;
    private String name;
    private int age;
    private String course;

    public Student(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getId() { return id; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setCourse(String course) { this.course = course; }

    @Override
    public String toString() {
        return "ID: " + id +
                "\nName: " + name +
                "\nAge: " + age +
                "\nCourse: " + course + "\n";
    }
}

public class StudentManagementSystem {
    private static final Scanner sc = new Scanner(System.in);
    private static final List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== Student Management Menu =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> viewAllStudents();
                case 3 -> searchStudent();
                case 4 -> updateStudent();
                case 5 -> deleteStudent();
                case 6 -> {
                    System.out.println("👋 Exiting System. Goodbye!");
                    return;
                }
                default -> System.out.println("❗ Invalid choice. Try again.");
            }
        }
    }

    private static void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Course: ");
        String course = sc.nextLine();
        students.add(new Student(id, name, age, course));
        System.out.println("✅ Student added successfully.");
    }

    private static void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("📭 No students available.");
        } else {
            System.out.println("📋 All Students:");
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }

    private static void searchStudent() {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        Student s = findStudentById(id);
        if (s != null) {
            System.out.println("🔍 Student Found:\n" + s);
        } else {
            System.out.println("❌ Student not found.");
        }
    }

    private static void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();
        Student s = findStudentById(id);
        if (s != null) {
            System.out.print("Enter new name: ");
            String name = sc.nextLine();
            System.out.print("Enter new age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter new course: ");
            String course = sc.nextLine();
            s.setName(name);
            s.setAge(age);
            s.setCourse(course);
            System.out.println("✅ Student updated.");
        } else {
            System.out.println("❌ Student not found.");
        }
    }

    private static void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = sc.nextInt();
        Student s = findStudentById(id);
        if (s != null) {
            students.remove(s);
            System.out.println("🗑️ Student deleted.");
        } else {
            System.out.println("❌ Student not found.");
        }
    }

    private static Student findStudentById(int id) {
        for (Student s : students) {
            if (s.getId() == id) return s;
        }
        return null;
    }
}
