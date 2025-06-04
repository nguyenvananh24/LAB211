package week3;

import java.util.Scanner;

public class Validator {

    static Scanner sc = new Scanner(System.in);

    public static int checkChoiceMenu(String msg) {
        System.out.println(msg);
        while (true) {
            try {
                int choice = Integer.parseInt(sc.nextLine());
                if (choice < 1 || choice > 5) {
                    throw new IllegalArgumentException("Enter a number between 1 - 4");
                }
                return choice;
            } catch (Exception e) {
                System.out.println("Enter a number: ");
            }
        }
    }

    public static int checkIntNumber() {
        while (true) {
            try {
                int number = Integer.parseInt(sc.nextLine());
                if (number <= 0) {
                    throw new IllegalArgumentException("Enter a positive number");
                }
                return number;
            } catch (Exception e) {
                System.out.println("Enter a number!");
            }

        }
    }
}
