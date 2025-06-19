package week5;

import java.util.Scanner;

public class Test {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Test test = new Test();
        test.run();
    }

    public void run() {
        int choice;
        while (true) {
            System.out.println("-------WEEK 5------");
            System.out.println("1. Large Numbers");
            System.out.println("2. Coursera Management");
            System.out.println("3. Room Reservation Management");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> largeNumbers();
                case 2 -> courseraManagement();
                case 3 -> roomReservationManagement();
                case 4 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice, Please try again!!");
            }
            if (choice == 4) {return; }
        }
    }

    public void largeNumbers() {
        System.out.println("-------Large Numbers------");
        System.out.println("1. Add two large numbers");
        System.out.println("2. Multiply two large numbers");
        System.out.println("3. Back to main menu");
        int choice;
        while (true) {
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter first number: ");
                    MyBigInteger num1 = new MyBigInteger(sc.nextLine());
                    System.out.print("Enter second number: ");
                    MyBigInteger num2 = new MyBigInteger(sc.nextLine());

                    System.out.println("Sum: " + num1.add(num2));
                }
                case 2 -> {
                    System.out.print("Enter first number: ");
                    MyBigInteger num1 = new MyBigInteger(sc.nextLine());
                    System.out.print("Enter second number: ");
                    MyBigInteger num2 = new MyBigInteger(sc.nextLine());
                    System.out.println("Product: " + num1.multiply(num2));
                }
                case 3 -> {
                    return;
                }
                default -> System.out.println("Invalid choice, please try again.");
            }
        }
    }

    public void courseraManagement() {
        CourseraManagement management = new CourseraManagement();
        int choice;
        while (true) {
            System.out.println("-------Coursera Management------");
            System.out.println("1. Add Course");
            System.out.println("2. Update Course");
            System.out.println("3. Delete Course");
            System.out.println("4. Print All / online courses / offline courses");
            System.out.println("5. Search information based on course name");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.println("-------Add Course------");
                    management.addCourse();
                }
                case 2 -> {
                    System.out.println("-------Update Course------");
                    management.updateCourse();
                }
                case 3 -> {
                    System.out.println("-------Delete Course------");
                    management.deleteCourse();
                }
                case 4 -> {
                    System.out.println("-------Print All Courses------");
                    management.displayCourses();
                }
                case 5 -> {
                    System.out.println("-------Search Course------");
                    management.searchCourseByName();
                }
                case 6 -> {
                    System.out.println("BYE AND SEE YOU NEXT TIME");
                    return;
                }
                default -> System.out.println("Invalid choice, please try again");

            }
        }
    }

    public void roomReservationManagement() {

    }
}
