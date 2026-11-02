abstract class College {
    String collegeName = "KPR Institute of Engineering and Technology";
    String location = "Coimbatore";

    void displayCollege() {
        System.out.println("College Name : " + collegeName);
        System.out.println("Location     : " + location);
    }

    abstract void displayStudent();
}

class Student extends College {
    int studentId = 106;
    String studentName = "Netra";
    String department = "Information Technology";
    int year = 2;
    
    @Override
    void displayStudent() {
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Department   : " + department);
        System.out.println("Year         : " + year);
    }
}

public class CollegeManagementSystem6a {
    public static void main(String[] args) {

        College c = new Student();

        c.displayCollege();
        c.displayStudent();
    }
}