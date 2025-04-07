// Base class
class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived class
class Student extends Person {
    String studentId;
    String course;

    // Constructor
    public Student(String name, int age, String studentId, String course) {
        super(name, age); // Call constructor of base class
        this.studentId = studentId;
        this.course = course;
    }

    // Method to display student details
    public void displayStudentInfo() {
        displayInfo(); // Call method from base class
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
    }
}

// Main class to run the program
public class InheritanceDemo {
    public static void main(String[] args) {
        Student student = new Student("Himanshu Yadav", 21, "CU12013", "Computer Science");
        student.displayStudentInfo();
    }
}
