package week3;

public class test {
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("---------Week 3----------");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Quick Sort");
            System.out.println("3. Binary Search");
            System.out.println("4. Stack");
            System.out.println("5. Exit");

            choice = Validator.checkChoiceMenu("Enter your choice: ");

            switch (choice) {
                case 1 -> {
                    BubbleSort bubbleSort = new BubbleSort();
                    System.out.println("Enter the size of the array: ");
                    int size = Validator.checkIntNumber();
                    bubbleSort.generateArray(size);
                    bubbleSort.bubbleSort();
                    bubbleSort.printArray();
                }
                case 2 -> {
                    QuickSort quickSort = new QuickSort();
                    System.out.println("Enter the size of the array: ");
                    int size = Validator.checkIntNumber();
                    quickSort.generateArray(size);
                    quickSort.quickSort(0, size - 1);
                    quickSort.printArray(); 
                }
                case 3 -> {
                    System.out.println("Enter the size of the array: ");
                    int size = Validator.checkIntNumber();
                    BinarySearch binarySearch = new BinarySearch();
                    binarySearch.setSize(size);
                    binarySearch.generateArray();
                    System.out.println("Enter the number to search: ");
                    int number = Validator.checkIntNumber();
                    binarySearch.setSearchNumber(number);
                    binarySearch.printResult();

                }
                case 4 -> {
                    Stack stack = new Stack();
                    stack.push(10);
                    stack.push(20);
                    System.out.println("Top value: " + stack.get());
                    stack.pop();
                    System.out.println("Top value after pop: " + stack.get());
                    stack.pop();
                    stack.pop();

                }
            }
        } while (choice != 5);
    }
}
