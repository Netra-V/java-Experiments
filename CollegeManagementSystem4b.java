class College {
    String collegeName = "KPR Institute of Engineering and Technology";
    String location = "Coimbatore";

    void displayCollege() {
        System.out.println("College Name : " + collegeName);
        System.out.println("Location     : " + location);
    }
}

class Department extends College {
    String department = "IT";
    String year = "2nd Year";

    void displayDepartment() {
        System.out.println("Department   : " + department);
        System.out.println("Year         : " + year);
    }
}

class Student extends Department {
    int studentId = 106;
    String studentName = "Netra";
    String email = "netra@gmail.com";

    void displayStudent() {
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Email        : " + email);
    }

    void checkInternshipEligibility() {
        if (department.equals("IT")) {
            System.out.println("Internship Status : Eligible");
        } else {
            System.out.println("Internship Status : Not Eligible");
        }
    }
}

public class CollegeManagementSystem4b {
    public static void main(String[] args) {

        Student s = new Student();

        s.displayCollege();
        System.out.println();

        s.displayDepartment();
        System.out.println();

        s.displayStudent();
        System.out.println();

        s.checkInternshipEligibility();
    }
}