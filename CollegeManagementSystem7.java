interface College {
    void displayCollege();
}

interface Department {
    void displayDepartment();
}

class Student implements College, Department {
    String collegeName = "KPR Institute of Engineering and Technology";
    String location = "Coimbatore";
    String department = "Information Technology";
    int studentId = 106;
    String studentName = "Netra";
    int year = 2;

    public void displayCollege() {
        System.out.println("College Name : " + collegeName);
        System.out.println("Location     : " + location);
    }

    public void displayDepartment() {
        System.out.println("Department   : " + department);
    }

    void displayStudent() {
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Year         : " + year);
    }
}

public class CollegeManagementSystem7 {
    public static void main(String[] args) {

        College c = new Student();
        c.displayCollege();
        Department d = new Student();
        d.displayDepartment();
        
        Student s = new Student();
        s.displayStudent();
    }
}