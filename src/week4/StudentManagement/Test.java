package week4.StudentManagement;

import java.util.Scanner;

public class Test {
    StudentManagement s = new StudentManagement();
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Test t = new Test();
        t.run();
    }

    public void run() {
        while (true) {
            System.out.println(" --- Welcome to Student Management System ---");
            System.out.println("1. Create");
            System.out.println("2. Find and Sort");
            System.out.println("3. Update or Delete");
            System.out.println("4. Report");
            System.out.println("5. Exit");

            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> create();
                case 2 -> findAndSort();
                case 3 -> updateAndelete();
                case 4 -> report();
                case 5 -> System.out.println("Exiting...");
            }
            if (choice == 5) {
                return;
            }
        }
    }

    public void create() {
        s.create();
    }

    public void findAndSort() {
        System.out.println("Enter student name to search: ");
        String name = sc.nextLine();
        s.findStudent(name);
        s.sortStudent();
    }

    public void updateAndelete() {
        System.out.println("Enter ID of student to update: ");
        String id = sc.nextLine();
        Student student = s.findStudentById(id);
        if (student == null) {
            System.out.println("Student not found.");
        } else {
            System.out.println("Do you want to update or delete this student? (U/D)");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("U")) {
                s.updateStudent(id);
            } else if (choice.equalsIgnoreCase("D")) {
                s.deleteStudent(id);
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }

    public void report() {
        s.reportStudent();
    }

}
