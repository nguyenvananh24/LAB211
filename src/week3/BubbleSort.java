package week3;

import java.util.Random;

public class BubbleSort {
    private int[] array;

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public BubbleSort() {
        this.array = new int[0];
    }

    public void generateArray(int size) {
        Random random = new Random();
        array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(size);
        }
        System.out.print("Array: ");
        for (int i = 0; i < size ; i++) {
            System.out.printf(array[i] + " ");
        }
        System.out.println();
    }

    public void bubbleSort() {
        boolean check = false;
        for (int i = 0; i < array.length - 1 & !check; i++) {
            check = true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    check = false;
                }
            }
        }
    }

    public void printArray() {
        System.out.print("After sorting: ");
        for (int j : array) {
            System.out.printf(j + " ");
        }
        System.out.println();
    }
}
