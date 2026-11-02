class College {
    String collegeName = "KPR Institute of Engineering and Technology";
    String location = "Coimbatore";

    void displayCollege() {
        System.out.println("College Name : " + collegeName);
        System.out.println("Location     : " + location);
    }
}

class Student extends College {
    int studentId = 106;
    String studentName = "Netra";
    String department = "IT";
    String year = "2nd Year";
    String email = "netra@gmail.com";


    @Override
    void displayCollege() {
        super.displayCollege();  
        System.out.println("Student belongs to the IT Department");
    }

    void displayStudent() {
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Department   : " + department);
        System.out.println("Year         : " + year);
        System.out.println("Email        : " + email);
    }

    void checkPlacementEligibility() {
        if (year.equals("2nd Year")) {
            System.out.println("Placement Status : Not Eligible");
        } else {
            System.out.println("Placement Status : Eligible");
        }
    }
}

public class CollegeManagementSystem5 {
    public static void main(String[] args) {

        Student s = new Student();

        // Calls the overridden method
        s.displayCollege();
        System.out.println();

        s.displayStudent();
        System.out.println();

        s.checkPlacementEligibility();
    }
}