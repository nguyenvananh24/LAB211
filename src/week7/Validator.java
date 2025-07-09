package week7;

import java.util.Scanner;

public class Validator {
    Scanner sc = new Scanner(System.in);

    public Boolean YesOrNo (String msg) {
        while (true) {
            System.out.println(msg);
            String input = sc.nextLine().trim().toUpperCase();
            if (input.equalsIgnoreCase("Y")) {
                return true;
            }
            else if (input.equalsIgnoreCase("N")) {
                return false;
            } else {
                System.out.println("Invalid input. Please enter Y or N");
                input = sc.nextLine().trim();
            }
        }
    }


}
