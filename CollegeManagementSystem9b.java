class Student implements Runnable {

    public void run() {
        System.out.println("Student Details");

        System.out.println("Student ID   : 106");
        System.out.println("Student Name : Netra");
        System.out.println("Department   : IT");
        System.out.println("Year         : 2nd Year");
        System.out.println("Email        : netra@gmail.com");
    }
}

class College implements Runnable {

    public void run() {
        System.out.println("College Details");

        System.out.println("College Name : KPR Institute of Engineering and Technology");
        System.out.println("Location     : Coimbatore");
    }
}

public class CollegeManagementSystem9b {

    public static void main(String[] args) {

        Student s = new Student();
        College c = new College();

        Thread t1 = new Thread(s);
        Thread t2 = new Thread(c);

        t1.start();
        t2.start();
    }
}
