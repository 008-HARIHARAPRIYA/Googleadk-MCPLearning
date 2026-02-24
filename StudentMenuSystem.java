import java.util.Scanner;

public class StudentMenuSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== STUDENT MENU SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Student Details");
            System.out.println("3. Calculate Grade");
            System.out.println("4. Exit Option");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student Name: ");
                    sc.nextLine(); // consume newline
                    String name = sc.nextLine();
                    System.out.print("Enter Roll Number: ");
                    int roll = sc.nextInt();
                    System.out.println("Student Added Successfully!");
                    break;

                case 2:
                    System.out.println("Displaying Student Details...");
                    System.out.println("Name: Demo Student");
                    System.out.println("Roll No: 101");
                    break;

                case 3:
                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();

                    if (marks >= 90)
                        System.out.println("Grade: A");
                    else if (marks >= 75)
                        System.out.println("Grade: B");
                    else if (marks >= 50)
                        System.out.println("Grade: C");
                    else
                        System.out.println("Grade: Fail");
                    break;

                case 4:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice! Try Again.");
            }

        } while (choice != 4);

        sc.close();
    }
}