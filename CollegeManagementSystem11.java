class StudentData {

    synchronized void updateStudent(CollegeData college) {

        System.out.println("Thread 1: Locked StudentData");

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        college.displayCollege();
    }

    synchronized void displayStudent() {

        System.out.println("Thread 2: Locked StudentData");
    }
}


class CollegeData {

    synchronized void updateCollege(StudentData student) {

        System.out.println("Thread 2: Locked CollegeData");

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        student.displayStudent();
    }

    synchronized void displayCollege() {

        System.out.println("Thread 1: Waiting for CollegeData");
    }
}

 
public class CollegeManagementSystem11 {

    public static void main(String[] args) {

        StudentData student = new StudentData();
        CollegeData college = new CollegeData();

        Thread t1 = new Thread(() -> {
            student.updateStudent(college);
        });

        Thread t2 = new Thread(() -> {
            college.updateCollege(student);
        });

        t1.start();
        t2.start();
    }
}