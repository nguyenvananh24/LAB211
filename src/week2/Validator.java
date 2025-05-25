package week2;

import java.util.Scanner;

public class Validator {

    static Scanner sc = new Scanner(System.in);

    public static int checkOption2() {
        while (true) {
            try {
                int choice = Integer.parseInt(sc.nextLine());
                if (choice < 1 || choice > 4) {
                    throw new IllegalArgumentException();
                }
                return choice;
            } catch (Exception e) {
                System.out.println("Invalid choice, please enter again!");
                System.out.println("Please choice one option: ");
            }
        }
    }

    public static int checkOption() {
        while (true) {
            try {
                int choice = Integer.parseInt(sc.nextLine());
                if (choice < 1 || choice > 3) {
                    throw new IllegalArgumentException();
                }
                return choice;
            } catch (Exception e) {
                System.out.println("Invalid choice, please enter again!");
                System.out.println("Please choice one option: ");
            }
        }
    }

    public static String checkOperator(String msg) {
        System.out.println(msg);
        String regex = "[+\\-*/=]";
        while (true) {
            String op = sc.nextLine();
            if (op.matches(regex)) {
                return op;
            } else {
                System.out.println(msg);
            }
        }
    }

    public static double checkNumber(String msg) {
        System.out.println(msg);
        while (true) {
            try {
                double number = Double.parseDouble(sc.nextLine());
                if (number <= 0) {
                    throw new IllegalArgumentException("Enter a positive number");
                }
                return number;
            } catch (Exception e) {
                System.out.println(msg);
            }

        }
    }

    public static double checkWeightHeight(String msg) {
        System.out.println(msg);
        while (true) {
            try {
                double number = Double.parseDouble(sc.nextLine());
                if (number <= 0) {
                    throw new IllegalArgumentException("BMI > 0");
                }
                return number;
            } catch (Exception e) {
                System.out.println("BMI is digit");
            }

        }
    }

    public static int checkIntNumber(String msg) {
        System.out.println(msg);
        while (true) {
            try {
                int number = Integer.parseInt(sc.nextLine());
                if (number <= 0) {
                    throw new IllegalArgumentException("Enter a positive number");
                }
                return number;
            } catch (Exception e) {
                System.out.println(msg);
            }

        }
    }
}
