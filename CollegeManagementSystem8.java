import java.util.Scanner;

class InvalidStudentYearException extends Exception {

    InvalidStudentYearException(String message) {
        super(message);
    }
}

public class CollegeManagementSystem8 {

    static void checkYear(int year) throws InvalidStudentYearException {

        if (year < 1 || year > 4) {
            throw new InvalidStudentYearException(
                "Year must be between 1 and 4."
            );
        }

        System.out.println("Year is valid.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Year (1-4): ");
        int year = sc.nextInt();

        System.out.print("Enter Student ID: ");
        int studentId = sc.nextInt();

        try {

            checkYear(year);

            System.out.println("\n--- College Management System ---");
            System.out.println("Student ID : " + studentId);
            System.out.println("Name       : " + name);
            System.out.println("Department : " + department);
            System.out.println("Year       : " + year);

        }
        catch (InvalidStudentYearException e) {

            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}