package week7;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class Shopping {
    private ArrayList<Fruit> fruits = new ArrayList<>();
    Hashtable<String, ArrayList<OrderItem>> orderList = new Hashtable<>();

    Validator validator = new Validator();
    Scanner sc = new Scanner(System.in);

    public void createFruit() {
        while (true) {
            System.out.println("Please enter the fruit ID: ");
            String id = sc.nextLine().trim();
            System.out.println("Please enter the fruit name: ");
            String name = sc.nextLine().trim();
            System.out.println("Please enter the fruit price: ");
            double price = Double.parseDouble(sc.nextLine().trim());
            System.out.println("Please enter the fruit quantity: ");
            int quantity = Integer.parseInt(sc.nextLine().trim());
            System.out.println("Please enter the fruit origin: ");
            String origin = sc.nextLine().trim();

            fruits.add(new Fruit(id, name, price, quantity, origin));

            Boolean choice = validator.YesOrNo("Do you want to add another fruit? (Y/N)");
            if (!choice) {
                break;
            }
        }
    }

    public void displayFruits() {
        System.out.println("| ++ Item ++ | ++ Fruit Name ++| ++ Origin ++ | ++ Price ++ |");
        int index = 1;
        for (Fruit fruit : fruits) {
            System.out.printf("|%-12d|%-17s|%-14s|%-13f$|", index, fruit.getName(),
                    fruit.getOrigin(), fruit.getPrice());
            index++;
            System.out.println();
        }
    }

    public void viewOrder() {
        if (orderList.isEmpty()) {
            System.out.println("No orders found");
            return;
        }

        for (String customerName : orderList.keySet()) {
            System.out.println("Customer Name: " + customerName);
            ArrayList<OrderItem> items = orderList.get(customerName);
            System.out.println("|  Product  |  Quantity  |  Price  |  Amount  |");

            for (OrderItem item : items) {
                System.out.printf(" %-10s  %-8d %-10.2f  %-7.2f$  \n",
                        item.getFruit().getName(), item.getQuantity(), item.getFruit().getPrice(),
                        item.getFruit().getPrice() * item.getQuantity());
            }
        }
    }

    public void shopping() {
        ArrayList<OrderItem> cart = new ArrayList<>();
        while (true) {
            displayFruits();

            int choiceItem = Integer.parseInt(sc.nextLine());
            Fruit selectedFruit = fruits.get(choiceItem - 1);
            System.out.println("You selected: " + selectedFruit.getName());

            System.out.println("Please enter the quantity you want to buy: ");
            int quantity = Integer.parseInt(sc.nextLine());

            cart.add(new OrderItem(selectedFruit, quantity));

            boolean choice = validator.YesOrNo("Do you want to odder NOW?? (Y/N)");
            double total = 0;

            if (choice) {
                System.out.println("|  Product  |  Quantity  |  Price  |  Amount  |");

                for (OrderItem item : cart) {
                    System.out.printf("%-10s %-12d %-9.2f$ %-10.2f$ \n",
                            item.getFruit().getName(), item.getQuantity(),
                            item.getFruit().getPrice(), item.getFruit().getPrice() * item.getQuantity());
                    total += item.getFruit().getPrice() * item.getQuantity();
                }
                System.out.println("Total: " + total + "$");
                System.out.println("Input your name: ");
                String customerName = sc.nextLine().trim();
                orderList.put(customerName, cart);
                return;
            }

        }

    }
}
