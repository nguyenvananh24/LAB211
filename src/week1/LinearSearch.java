package week1;

import java.util.Random;

public class LinearSearch {

    private int[] array;
    private int searchNumber;

    public LinearSearch() {
        this.array = new int[0];
        this.searchNumber = 0;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getSearchNumber() {
        return searchNumber;
    }

    public void setSearchNumber(int searchNumber) {
        this.searchNumber = searchNumber;
    }
   
    public void generateArray(int size) {
        Random random = new Random();
        array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(size);
        }
    }
    
    public void displayArray() {
        System.out.print("The array: [");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }

    public int linearSearch() {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == searchNumber) {
                return i;
            }       
        }
        return -1;
    }

    public void getIndex() {
        int index = linearSearch();
        if (index == -1) {
            System.out.println("Not found " + searchNumber);
        } else {
            System.out.println("Found " + searchNumber + " at index " + index);
        }
    }

}
