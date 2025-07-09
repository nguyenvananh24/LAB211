package week7;

import java.util.Scanner;

public class Test {
    Scanner sc = new Scanner(System.in);
    Shopping shopping = new Shopping();
    Validator validator = new Validator();
    public static void main(String[] args) {
        // menu
        Test test = new Test();
        test.run();
    }

    public void run() {
        while (true) {
            showMainMenu();
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1 -> shopping.createFruit();
                case 2 -> shopping.viewOrder();
                case 3 -> shopping.shopping();
                case 4 -> {
                    System.out.println("Exiting the system. Goodbye!");
                    return; 
                } 
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void showMainMenu() {
        System.out.println("""
                === FRUIT SHOP SYSTEM ===
                    1. Create Fruit
                    2. View Orders
                    3. Shopping (for buyer)
                    4. Exit
                """);
    }

}
