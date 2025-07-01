package week5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Validator {

    Scanner sc = new Scanner(System.in);

    public String checkEmpty(String msg) {
        while (true) {
            System.out.print(msg);
            String inp = sc.nextLine().trim();
            if (inp.isEmpty()) {
                System.out.println("Input cannot be empty. Please try again");
                continue;
            }
            return inp;
        }
    }

    public int checkCredits(String msg) {
        int credits;
        while (true) {
            System.out.print(msg);
            try {
                credits = Integer.parseInt(sc.nextLine());
                if (credits > 0)
                    return credits;
                else
                    System.out.println("Credits must be than 0. Please try again");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter again");
                System.out.println(msg);
            }
        }
    }

    public LocalDate checkBegin(String msg) {
        LocalDate begin;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        while (true) {
            System.out.print(msg);
            try {
                begin = LocalDate.parse(sc.nextLine(), formatter);
                if (begin.isAfter(LocalDate.now()))
                    return begin;
                else
                    System.out.println("Begin date must be after today. Please try again");
            } catch (Exception e) {
                System.out.println("Invalid date format. Please enter again (DD-MM-YYYY)");
            }
        }
    }

    public LocalDate checkEnd(String msg, LocalDate begin) {
        LocalDate end;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        while (true) {
            System.out.print(msg);
            try {
                end = LocalDate.parse(sc.nextLine(), formatter);
                if (end.isAfter(begin))
                    return end;
                else
                    System.out.println("End date must be after begin date. Please try again");
            } catch (Exception e) {
                System.out.println("Invalid date format. Please enter again (DD-MM-YYYY)");
            }
        }
    }
}
