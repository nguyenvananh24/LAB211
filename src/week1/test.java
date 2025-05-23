package week1;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        //------------Week 1-------------------//
        Menu menuweek1 = new Menu.menuWeek1();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {

            menuweek1.displayMenu();
            choice = Validator.checkOption();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter your content:");
                    String input = sc.nextLine();
                    WordAndCharacterCount text = new WordAndCharacterCount(input);
                    System.out.println(text.countWords());
                    System.out.println(text.countCharacters());
                }
                case 2 -> {
                    LinearSearch search = new LinearSearch();
                    int size = Validator.checkNumber("Enter size of array: ");
                    search.generateArray(size);

                    int searchNumber = Validator.checkNumber("Enter search number: ");

                    search.setSearchNumber(searchNumber);
                    search.displayArray();
                    search.getIndex();
                }
                case 3 -> {
                    ChangeBaseNumberSystem change = new ChangeBaseNumberSystem();
                    int enterToOut;
                    do {
                        System.out.println("----Change base number system(2,10,16)----");
                        System.out.println("The basic number INPUT:");
                        Menu menuChangeBaseNumber = new Menu.menuChooseBaseNumber();
                        menuChangeBaseNumber.displayMenu();

                        int inputBase = Validator.checkNumber("Enter base number INPUT: ");

                        System.out.println("The basic number OUTPUT:");
                        menuChangeBaseNumber.displayMenu();

                        int outputBase = Validator.checkNumber("Enter base number OUTPUT: ");

                        String inputValue = Validator.checkValue("Enter value input: ", inputBase);
                        change.setValue(inputValue);

                        System.out.println("Output Value: ");
                        switch (outputBase) {
                            case 1 -> {
                                if (inputBase == 2) {   //hệ 10 -> 2
                                    change.convertFromDec(2);
                                } else if (inputBase == 3) { //hệ 16 ->2
                                    change.convertHexToBin();
                                }
                                System.out.println(change.getValue());
                            }
                            case 2 -> {
                                if (inputBase == 1) { //hệ 2 -> 10
                                    change.convertToDec(2);
                                } else if (inputBase == 3) { //hệ 16 -> 10
                                    change.convertToDec(16);
                                }
                                System.out.println(change.getValue());
                            }
                            case 3 -> {
                                if (inputBase == 1) { //he 2 -> 16
                                    change.convertBinToHex();
                                } else if (inputBase == 2) { // he 10 -> 16
                                    change.convertFromDec(16);
                                }
                                System.out.println(change.getValue());
                            }
                        }
                        System.out.println("Do you want to continue with this function? (0-NO 1-YES)");
                        enterToOut = Integer.parseInt(sc.nextLine());
                    } while (enterToOut != 0);
                }
                case 4 -> {
                    Menu menuSolvingTheEquation = new Menu.menuSolvingTheEquation();
                    menuSolvingTheEquation.displayMenu();

                    int option = Validator.checkOption2();

                    SolvingTheEquation solver = new SolvingTheEquation();
                    float a, b, c;
                    if (option == 1) {
                        System.out.println("----Calculate Equation----");
                        a = Validator.checkNumber2("Enter A: ");
                        b = Validator.checkNumber2("Enter B: ");
                        solver.displayEquationResult(a, b);
                    }

                    if (option == 2) {
                        System.out.println("---Calculate Quadratic Equation---");
                        a = Validator.checkNumber2("Enter A: ");
                        b = Validator.checkNumber2("Enter B: ");
                        c = Validator.checkNumber2("Enter C: ");
                        solver.displayQuadraticEquation(a, b, c);
                    }
                    if (option == 3) {
                        System.out.println("Exiting...");
                    }

                }
                case 5 -> System.out.println("Exiting...");
            }
        } while (choice != 5);
    }

}
