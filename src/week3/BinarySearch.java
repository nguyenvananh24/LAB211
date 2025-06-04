package week3;

import java.util.Random;

public class BinarySearch {

    private int size;
    private int searchNumber;
    private int[] array;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSearchNumber() {
        return searchNumber;
    }

    public void setSearchNumber(int searchNumber) {
        this.searchNumber = searchNumber;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public BinarySearch() {
        this.array = new int[0];
    }

    public void generateArray() {
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

    public int binarySearch(int left, int right) {
        if (left > right) return -1;
        int mid = (left + right) / 2;

        if (searchNumber == array[mid]) {
            return mid;
        } else if (searchNumber > array[mid]) {
            return binarySearch(mid + 1, right);
        } else {
            return binarySearch(left, mid - 1);
        }
    }

    public void printResult() {
        quickSort(0, size - 1);
        if (binarySearch(0, size - 1) != -1) {
            System.out.printf("The number %d is found at index %d\n", searchNumber, binarySearch(0, size - 1));
        } else {
            System.out.printf("The number %d is not found in the array\n", searchNumber);
        }
    }
}
