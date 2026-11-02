import java.util.Scanner;

class Student {
    int studentId;
    String studentName;
    String department;
    String mobileNumber;
    String email;

    Student(int id, String name, String dept, String mobile, String email) {
        studentId = id;
        studentName = name;
        department = dept;
        mobileNumber = mobile;
        this.email = email;
    }

    void display() {
        System.out.println("\n----- Student Details -----");
        System.out.println("Student ID    : " + studentId);
        System.out.println("Student Name  : " + studentName);
        System.out.println("Department    : " + department);
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println("Email         : " + email);
    }

    void display(String course) {
        System.out.println("Course        : " + course);
    }

    void display(int semester) {
        System.out.println("Semester      : " + semester);
    }
}

public class CollegeManagementSystem3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.print("Enter Mobile Number: ");
        String mobile = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        System.out.print("Enter Semester: ");
        int semester = sc.nextInt();

        Student s1 = new Student(id, name, dept, mobile, email);

        s1.display();
        s1.display(course);
        s1.display(semester);

        sc.close();
    }
}