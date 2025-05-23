package week1;

import java.util.Scanner;

public class Validator {

    static Scanner sc = new Scanner(System.in);

    public static int checkOption() {
        while (true) {
            try {
                int choice = Integer.parseInt(sc.nextLine());
                if (choice < 1 || choice > 5) {
                    throw new IllegalArgumentException();
                }
                return choice;
            } catch (Exception e) {
                System.out.println("Invalid choice, please enter again!");
                System.out.println("Please choice one option: ");
            }
        }
    }

    public static int checkNumber(String msg) {
        System.out.println(msg);
        while (true) {
            try {
                int number = Integer.parseInt(sc.nextLine());
                if (number <= 0) {
                    throw new IllegalArgumentException("Enter a positive number");
                }
                return number;
            } catch (Exception e) {
                System.out.println("Invalid input, please enter again!");
                System.out.println(msg);
            }

        }
    }

    public static int checkOption2() {
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

    public static float checkNumber2(String msg) {
        System.out.println(msg);
        while (true) {
            try {
                float number = Integer.parseInt(sc.nextLine());
                return number;
            } catch (Exception e) {
                System.out.println("Invalid input, please enter again!");
                System.out.println(msg);
            }

        }
    }

    public static String checkValue(String msg, int inputBase) {
        System.out.println(msg);
        while (true) {
            try {
                String value = sc.nextLine();
                if (inputBase == 1) { // he 2
                    if (!value.matches("[01]+")) {
                        throw new IllegalArgumentException("Invalid binary number");
                    }
                } else if (inputBase == 2) { // he 10
                    if (!value.matches("\\d+")) {
                        throw new IllegalArgumentException("Invalid decimal number");
                    }
                } else if (inputBase == 3) { // he 16
                    if (!value.matches("[0-9A-Fa-f]+")) {
                        throw new IllegalArgumentException("Invalid hexadecimal number");
                    }
                }
                return value;
            } catch (Exception e) {
                System.out.println("Invalid input, please enter again!");
                System.out.println(msg);
            }
        }

    }

}
