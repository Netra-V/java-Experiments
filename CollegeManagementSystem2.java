class Student {

    int studentId;
    String studentName;
    String department;

    static String collegeName = "KPRIET";

    Student(int id, String name, String dept) {
        studentId = id;
        studentName = name;
        department = dept;
    }
    
    void display() {
        System.out.println("College Name : " + collegeName);
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Department   : " + department);
    }

    void display(String course) {
        System.out.println("\nCourse Enrolled : " + course);
    }

    void display(int semester) {
        System.out.println("Semester : " + semester);
    }

    static void collegeInfo() {
        System.out.println("Welcome to " + collegeName);
        System.out.println("----------------------------");
    }
}

public class CollegeManagementSystem2 {

    public static void main(String[] args) {

        Student.collegeInfo();

        Student s1 = new Student(106, "Netra", "IT");
        Student s2 = new Student(126, "Preethika", "IT");

        s1.display();
        s1.display("Java Programming");
        s1.display(3);

        System.out.println();

        s2.display();
        s2.display("Java Programming");
        s2.display(3);

        System.out.println();

        // Accessing static variable
        System.out.println("College Name (Static Variable): " + Student.collegeName);
    }
}