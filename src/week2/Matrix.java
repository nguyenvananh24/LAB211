package week2;

import java.util.Scanner;

public class Matrix {

    private int[][] matrix;
    private int rows;
    private int cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        matrix = new int[rows][cols];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int getValue(int row, int col) {
        return matrix[row][col];
    }

    public void setValue(int row, int col, int value) {
        matrix[row][col] = value;
    }

    public void displayMenu() {
        System.out.println("1. Addition Matrix");
        System.out.println("2. Subtraction Matrix");
        System.out.println("3. Multiplication Matrix");
        System.out.println("4. Exit");
        System.out.println("Please choice one option: ");
    }

    public Matrix additionMatrix(Matrix a, Matrix b) {
        Matrix results = new Matrix(a.rows, a.cols);
        for (int i = 0; i < a.rows; i++) {
            for (int j = 0; j < a.cols; j++) {
                results.setValue(i, j, a.getValue(i, j) + b.getValue(i, j));
            }
        }
        return results;
    }

    public Matrix subtractMatrix(Matrix a, Matrix b) {
        Matrix results = new Matrix(a.rows, a.cols);
        for (int i = 0; i < a.rows; i++) {
            for (int j = 0; j < a.cols; j++) {
                results.setValue(i, j, a.getValue(i, j) - b.getValue(i, j));
            }
        }
        return results;
    }

    public Matrix multiplyMatrix(Matrix a, Matrix b) {
        Matrix results = new Matrix(a.rows, b.cols);
        for (int i = 0; i < a.rows; i++) {
            for (int j = 0; j < b.cols; j++) {
                for (int k = 0; k < a.cols; k++) {
                    results.setValue(i, j, results.getValue(i, j) + a.getValue(i, k) * b.getValue(k, j));
                }
            }
        }
        return results;
    }

    public void inputValueOfMatrix() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter matrix [" + i + "][" + j + "] = ");
                setValue(i, j, sc.nextInt());
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("[%d]", getValue(i, j));
            }
            System.out.println();
        }
    }
}
