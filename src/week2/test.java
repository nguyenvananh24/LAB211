package week2;

public class test {

    public static void main(String[] args) {

        int option;
        do {
            System.out.println("----------Week2--------");
            System.out.println("1. Computer Program");
            System.out.println("2. Calculate Perimeter And Area");
            System.out.println("3. Matrix");
            System.out.println("4. Exit");
            System.out.println("Enter a option: ");
            option = Validator.checkOption2();
            switch (option) {
                case 1 -> {
                    //-----Computer Program-----//
                    ComputerProgram calculator = new ComputerProgram();
                    int choice;
                    do {
                        calculator.displayMenuAComputerProgram();
                        choice = Validator.checkOption();
                        switch (choice) {
                            case 1 -> {
                                double number = Validator.checkNumber("Enter a Number: ");
                                calculator.setMemory(number);
                                String op;
                                while (true) {
                                    op = Validator.checkOperator("Enter a Operator: ");
                                    if (op.equals("=")) {
                                        System.out.println("Result = " + calculator.getMemory());
                                        break;
                                    }
                                    number = Validator.checkNumber("Enter a Number: ");
                                    calculator.changeMemory(number, op);
                                    System.out.println("Memory = " + calculator.getMemory());

                                }
                                System.out.println();
                            }
                            case 2 -> {
                                double weight = Validator.checkWeightHeight("Enter Weight(kg): ");
                                double height = Validator.checkWeightHeight("Enter Height(cm): ");
                                calculator.calculateBMI(weight, height);
                                System.out.println();
                            }
                            case 3 -> {
                                System.out.println("Exiting...");
                            }
                        }
                    } while (choice != 3);
                }
                case 2 -> {

                    //-----Calculate Perimeter And Area-----//
                    System.out.println("----Calculator Shape Program------");
                    double width = Validator.checkNumber("Please input width of Rectangle: ");
                    double length = Validator.checkNumber("Please input length of Rectangle: ");
                    double radius = Validator.checkNumber("Please input radius of Circle: ");
                    double sideA = Validator.checkNumber("Please input side A of Triangle: ");
                    double sideB = Validator.checkNumber("Please input side B of Triangle: ");
                    double sideC = Validator.checkNumber("Please input side C of Triangle: ");

                    Shape rectangle = new Rectangle(width, length);
                    rectangle.printResult();
                    Shape circle = new Circle(radius);
                    circle.printResult();
                    Shape triangle = new Triangle(sideA, sideB, sideC);
                    triangle.printResult();
                }
                case 3 -> {
                    //-----Matrix------//
                    System.out.println("----Calculator Program-----");
                    System.out.println("1. Add Matrix");
                    System.out.println("2. Subtract Matrix");
                    System.out.println("3. Multiply Matrix");
                    System.out.println("4. Exit");
                    System.out.println("Enter a option: ");
                }
            }
        }
        while (option != 4);
    }
}

