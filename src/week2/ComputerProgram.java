package week2;

public class ComputerProgram {

    private double memory;
    private double bmi;

    public ComputerProgram() {
        this.bmi = 0;
        this.memory = 0;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public void displayMenuAComputerProgram() {

        System.out.println("----Calculate Program----");
        System.out.println("1. Normal Calculator");
        System.out.println("2. BMI Calculator");
        System.out.println("3. Exit");
        System.out.println("Please choice one option: ");
    }

    public void changeMemory(double number, String operator) {
        switch (operator) {
            case "+" -> memory += number;
            case "-" -> memory -= number;
            case "*" -> memory *= number;
            case "/" -> memory /= number;
        }
    }

    public void calculateBMI(double weight, double height) {
        bmi = (weight / (height * height)) * 10000;
        System.out.printf("BMI Number: %.2f \n", bmi);
        if (bmi <= 19) {
            System.out.println("Under-standard");
        } else if (bmi > 19 && bmi <= 25) {
            System.out.println("Standard");
        } else if (bmi > 25 && bmi <= 30) {
            System.out.println("Overweight");
        } else if (bmi > 30 && bmi <= 40) {
            System.out.println("Fat - should lose weight");
        } else {
            System.out.println("Very fat - should lose weight immediaately");
        }

    }
}

