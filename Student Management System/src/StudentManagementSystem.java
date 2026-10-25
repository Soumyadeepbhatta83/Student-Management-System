import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {


    private ArrayList<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        int choice;

        do {
            showMenu();
            choice = readInt("Enter your choice (1-6): ", 1, 6);

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayAllStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    updateStudent();
                    break;
                case 5:
                    deleteStudent();
                    break;
                case 6:
                    System.out.println("Thank you for using the system. Goodbye!");
                    break;
            }
        } while (choice != 6);

        scanner.close();
    }

    private void showMenu() {
        System.out.println();
        System.out.println("===== STUDENT MANAGEMENT SYSTEM =====");
        System.out.println("1. Add Student");
        System.out.println("2. Display All Students");
        System.out.println("3. Search Student by ID");
        System.out.println("4. Update Student");
        System.out.println("5. Delete Student");
        System.out.println("6. Exit");
        System.out.println("=====================================");
    }
//-------------------Feature Methods-------------
    private void addStudent() {
        System.out.println("\n--- Add New Student ---");

        int id = readId("Enter Student ID (1-99999): ");

        if (findStudentById(id) != null) {
            System.out.println("Error: A student with ID " + id + " already exists!");
            return;
        }

        String name = readName("Enter Name: ");
        int age = readInt("Enter Age (1-100): ", 1, 100);
        double marks = readDouble("Enter Marks (0-100): ", 0, 100);

        Student student = new Student(id, name, age, marks);
        students.add(student);

        System.out.println("Student added successfully!");
    }

    
    private void displayAllStudents() {
        System.out.println("\n--- All Students ---");

        if (students.isEmpty()) {
            System.out.println("No students found. Please add some students first.");
            return;
        }

        printTableHeader();
        for (Student s : students) {
            s.display();
        }
        System.out.println("Total students: " + students.size());
    }

    
    private void searchStudent() {
        System.out.println("\n--- Search Student ---");

        int id = readId("Enter Student ID to search: ");
        Student student = findStudentById(id);

        if (student == null) {
            System.out.println("Student with ID " + id + " not found.");
        } else {
            System.out.println("Student found:");
            printTableHeader();
            student.display();
        }
    }

    
    private void updateStudent() {
        System.out.println("\n--- Update Student ---");

        int id = readId("Enter Student ID to update: ");
        Student student = findStudentById(id);

        if (student == null) {
            System.out.println("Student with ID " + id + " not found.");
            return;
        }

        System.out.println("Current details:");
        printTableHeader();
        student.display();

        System.out.println("\nEnter new details (ID cannot be changed):");
        String newName = readName("Enter new Name: ");
        int newAge = readInt("Enter new Age (1-100): ", 1, 100);
        double newMarks = readDouble("Enter new Marks (0-100): ", 0, 100);

        student.setName(newName);
        student.setAge(newAge);
        student.setMarks(newMarks);

        System.out.println("Student updated successfully!");
    }

    
    private void deleteStudent() {
        System.out.println("\n--- Delete Student ---");

        int id = readId("Enter Student ID to delete: ");
        Student student = findStudentById(id);

        if (student == null) {
            System.out.println("Student with ID " + id + " not found.");
        } else {
            students.remove(student);
            System.out.println("Student with ID " + id + " deleted successfully!");
        }
    }

    // ---------------- Helper methods ----------------

    private Student findStudentById(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    private void printTableHeader() {
        System.out.printf("%-8s %-20s %-6s %-8s%n", "ID", "Name", "Age", "Marks");
        System.out.println("---------------------------------------------");
    }

    
    private int readInt(String message, int min, int max) {
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine().trim();

            try {
                int value = Integer.parseInt(input);
                if (value >= min && value <= max) {
                    return value;
                }
                System.out.println("Please enter a number between " + min + " and " + max + ".");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a whole number.");
            }
        }
    }

    
    private double readDouble(String message, double min, double max) {
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine().trim();

            try {
                double value = Double.parseDouble(input);
                if (value >= min && value <= max) {
                    return value;
                }
                System.out.println("Please enter a number between " + min + " and " + max + ".");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number.");
            }
        }
    }

    private int readId(String message) {
        return readInt(message, 1, 99999);
    }

    
    private String readName(String message) {
        while (true) {
            System.out.print(message);
            String name = scanner.nextLine().trim();

            if (!name.isEmpty()) {
                return name;
            }
            System.out.println("Name cannot be empty!");
        }
    }
}
