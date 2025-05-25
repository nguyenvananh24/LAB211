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
                    System.out.println("----Calculator Program-----");
                    System.out.println("1. Add Matrix");
                    System.out.println("2. Subtract Matrix");
                    System.out.println("3. Multiply Matrix");
                    System.out.println("4. Exit");
                    System.out.println("Enter a option: ");
                    int optionMatrix = Validator.checkOption2();

                    int row, col;
                    row = Validator.checkIntNumber("Enter row of matrix1: ");
                    col = Validator.checkIntNumber("Enter col of matrix1: ");
                    Matrix matrix1 = new Matrix(row, col);
                    matrix1.inputValueOfMatrix();

                    row = Validator.checkIntNumber("Enter row of matrix2: ");
                    col = Validator.checkIntNumber("Enter col of matrix2: ");
                    Matrix matrix2 = new Matrix(row, col);
                    matrix2.inputValueOfMatrix();

                    switch (optionMatrix) {
                        case 1 -> {
                            if (matrix1.getRows() != matrix2.getRows() || matrix1.getCols() != matrix2.getCols()) {
                                System.out.println("Cannot add two matix");
                                break;
                            }
                            Matrix result = new Matrix(row, col);
                            result = result.additionMatrix(matrix1, matrix2);
                            matrix1.printMatrix();
                            System.out.println("+");
                            matrix2.printMatrix();
                            System.out.println("=");
                            result.printMatrix();
                        }
                        case 2 -> {
                            if (matrix1.getRows() != matrix2.getRows() || matrix1.getCols() != matrix2.getCols()) {
                                System.out.println("Cannot add two matix");
                                break;
                            }
                            Matrix result = new Matrix(row, col);
                            result = result.subtractMatrix(matrix1, matrix2);
                            matrix1.printMatrix();
                            System.out.println("-");
                            matrix2.printMatrix();
                            System.out.println("=");
                            result.printMatrix();

                        }
                        case 3 -> {
                            if (matrix1.getCols() != matrix2.getRows()) {
                                System.out.println("Cannot subtract matrix");
                                break;
                            }
                            Matrix result = new Matrix(matrix1.getRows(), matrix2.getCols());
        
                            result = result.multiplyMatrix(matrix1, matrix2);
                            matrix1.printMatrix();
                            System.out.println("*");
                            matrix2.printMatrix();
                            System.out.println("=");
                            result.printMatrix();
                        }
                    }
                }
                case 4 -> {
                    System.out.println("Exiting...");
                }
            }

        } while (option != 4);
    }
}
