class College {

    int studentId;
    String studentName;
    boolean dataReady = false;

    synchronized void addStudent(int id, String name) {

        studentId = id;
        studentName = name;

        dataReady = true;

        System.out.println("Student details added.");

        notify();
    }

    synchronized void displayStudent() {

        while (!dataReady) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println("\n--- College Management System ---");
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
    }
}

public class CollegeManagementSystem10 {

    public static void main(String[] args) {

        College c = new College();

        Thread t1 = new Thread(() -> {
            c.displayStudent();
        });

        Thread t2 = new Thread(() -> {
            c.addStudent(106, "Netra");
        });

        t1.start();
        t2.start();
    }
}