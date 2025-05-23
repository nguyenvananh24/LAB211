package week1;

import java.util.ArrayList;
import java.util.List;

public class SolvingTheEquation {

    public SolvingTheEquation() {
    }

    public boolean isEven(float number) {
        return number % 2 == 0;
    }

    public boolean isOdd(float number) {
        return number % 2 != 0;
    }

    public boolean isPerfectSquare(float number) {
        int temp = (int) (Math.sqrt(number));
        return temp * temp == number;
    }

    public List<Float> calculateEquation(float a, float b) {
        List<Float> results = new ArrayList<>();
        if (a == 0) {
            return results;
        }
        float x = -b / a;
        results.add(x);
        return results;
    }

    public List<Float> calculateQuadraticEquation(float a, float b, float c) {
        List<Float> results = new ArrayList<>();
        float dental = b * b - 4 * a * c;
        if (dental < 0) {
            return results;
        } else if (dental == 0) {
            float x = -b / (2 * a);
            results.add(x);
        } else {
            float x1 = (float) ((-b + Math.sqrt(dental)) / (2 * a));
            float x2 = (float) ((-b - Math.sqrt(dental)) / (2 * a));
            results.add(x1);
            results.add(x2);
        }
        return results;
    }

    public void displayNumberProperties(float... numbers) {
        System.out.print("Number is Odd: ");
        for (float number : numbers) {
            if (isOdd(number)) {
                System.out.print(number + " ");
            }
        }

        System.out.println();

        System.out.print("Number is Even: ");
        for (float number : numbers) {
            if (isEven(number)) {
                System.out.print(number + " ");
            }
        }

        System.out.println();

        System.out.print("Number is Perfect Square: ");
        for (float number : numbers) {
            if (isPerfectSquare(number)) {
                System.out.print(number + " ");
            }
        }

        System.out.println();
    }

    public void displayEquationResult(float a, float b) {
        List<Float> result = calculateEquation(a, b);
        if (!result.isEmpty()) {
            System.out.println("Solution: x = " + result.get(0));
        } else {
            System.out.println("Equation with no solution!");
        }
        displayNumberProperties(a, b);
    }

    public void displayQuadraticEquation(float a, float b, float c) {
        List<Float> result = calculateQuadraticEquation(a, b, c);
        if (!result.isEmpty()) {
            System.out.println("Solution: x1 = " + result.get(0) + " x2 = " + result.get(1));
        } else {
            System.out.println("Quadratic Equation with no solution!");
        }
        displayNumberProperties(a, b, c);
    }
}
