class Student extends Thread {

    public void run() {
        System.out.println("Student Thread is running");

        System.out.println("Student Name : Netra");
        System.out.println("Student ID   : 106");
        System.out.println("Department   : IT");
        System.out.println("Year         : 2nd Year");
    }
}

class College extends Thread {

    public void run() {
        System.out.println("College Thread is running");

        System.out.println("College Name : KPR Institute of Engineering and Technology");
        System.out.println("Location     : Coimbatore");
    }
}

public class CollegeManagementSystem9a {

    public static void main(String[] args) {

        Student s = new Student();
        College c = new College();

        s.start();
        c.start();
    }
}
