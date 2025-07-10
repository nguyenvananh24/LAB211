package week8.GeographicManagement;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManageEastAsiaCountries manager = new ManageEastAsiaCountries();

        while (true) {
            System.out.println("\nMENU");
            System.out.println("====================================");
            System.out.println("1. Input the information of 11 countries in East Asia");
            System.out.println("2. Display the information of countries you've just input");
            System.out.println("3. Search the information of country by user-entered name");
            System.out.println("4. Display the information of countries sorted name in ascending order");
            System.out.println("5. Exit");
            System.out.println("====================================");
            System.out.print("Enter your choice: ");

            int choice = Integer.parseInt(sc.nextLine());

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter code of country: ");
                        String code = sc.nextLine();
                        System.out.print("Enter name of country: ");
                        String name = sc.nextLine();
                        System.out.print("Enter total area: ");
                        float area = Float.parseFloat(sc.nextLine());
                        if (area <= 0)
                            throw new Exception("Area must be > 0");
                        System.out.print("Enter terrain of country: ");
                        String terrain = sc.nextLine();

                        EastAsiaCountries country = new EastAsiaCountries(code, name, area, terrain);
                        manager.addCountryInformation(country);
                        System.out.println("Country added successfully.");
                        break;

                    case 2:
                        System.out.printf("%-15s%-20s%-20s%-20s\n", "ID", "Name", "Total Area", "Terrain");
                        for (EastAsiaCountries c : manager.getRecentlyEnteredInformation()) {
                            c.display();
                        }
                        break;

                    case 3:
                        System.out.print("Enter the name you want to search for: ");
                        String searchName = sc.nextLine();
                        List<EastAsiaCountries> result = manager.searchInformationByName(searchName);
                        System.out.printf("%-15s%-20s%-20s%-20s\n", "ID", "Name", "Total Area", "Terrain");
                        for (EastAsiaCountries c : result) {
                            c.display();
                        }
                        break;

                    case 4:
                        List<EastAsiaCountries> sortedList = manager.sortInformationByAscendingOrder();
                        System.out.printf("%-15s%-20s%-20s%-20s\n", "ID", "Name", "Total Area", "Terrain");
                        for (EastAsiaCountries c : sortedList) {
                            c.display();
                        }
                        break;

                    case 5:
                        System.out.println("Program exited.");
                        return;

                    default:
                        System.out.println(" Invalid choice. Please enter 1-5.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
