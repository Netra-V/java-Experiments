class Student {

    int studentId;
    String studentName;
    String department;
    int age;
    String year;
    String mobileNumber;
    String email;

    Student(int id, String name, String dept, int age,
            String year, String mobile, String email) {

        studentId = id;
        studentName = name;
        department = dept;
        this.age = age;
        this.year = year;
        mobileNumber = mobile;
        this.email = email;
    }

    // Method to display details
    void display() {
        System.out.println("----- Student Details -----");
        System.out.println("Student ID     : " + studentId);
        System.out.println("Student Name   : " + studentName);
        System.out.println("Department     : " + department);
        System.out.println("Age            : " + age);
        System.out.println("Year           : " + year);
        System.out.println("Mobile Number  : " + mobileNumber);
        System.out.println("Email          : " + email);
    }
}

public class CollegeManagementSystem {

    public static void main(String[] args) {

        Student s1 = new Student(106, "Netra", "Information Technology", 19, "II Year", "9876543210", "netra@gmail.com");

        s1.display();
    }
}