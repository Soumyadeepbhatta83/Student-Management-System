public class Student {

    // Private fields (Encapsulation)
    private int id;
    private String name;
    private int age;
    private double marks;

    // Constructor
    public Student(int id, String name, int age, double marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMarks() {
        return marks;
    }

    // Setters (ID-er setter nei, karon ID change kora jabe na)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Prints one student's details in a table row
    public void display() {
        System.out.printf("%-8d %-20s %-6d %-8.2f%n", id, name, age, marks);
    }
}