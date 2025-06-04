package week3;

import java.util.Random;

public class QuickSort {

    private int[] array;

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public QuickSort() {
        this.array = new int[0];
    }

    public void generateArray(int size) {
        Random random = new Random();
        array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(size);
        }
        System.out.print("Array: ");
        for (int i = 0; i < size; i++) {
            System.out.printf(array[i] + " ");
        }
        System.out.println();
    }

    public void quickSort(int first, int last) {
        if (first < last) {
            int pointIndex = findKeyPoint(first, last);
            quickSort(first, pointIndex - 1);
            quickSort(pointIndex + 1, last);
        }
    }

    public int findKeyPoint(int first, int last) {
        int point = array[last];
        int i = first - 1;

        for (int j = first; j < last; j++) {
            if (array[j] < point) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[last];
        array[last] = temp;
        return i + 1;
    }

    public void printArray() {
        System.out.print("After sorting: ");
        for (int j : array) {
            System.out.printf(j + " ");
        }
        System.out.println();
    }
}
