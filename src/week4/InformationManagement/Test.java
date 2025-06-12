package week4.InformationManagement;

import java.util.Scanner;

public class Test {

    Validator validator = new Validator();
    InformationManagement manager = new InformationManagement();

    public static void main(String[] args) {
        Test test = new Test();
        test.run();
    }

    public void teacherManagement() {
        Menu menuST = new Menu.menuManagement();
        int choice;
        while (true) {
            System.out.println("-----Teacher Management--------");
            menuST.displayMenu();
            choice = validator.checkChoice("Enter your choice: ");
            switch (choice) {
                case 1 -> {
                    Teacher teacher = new Teacher();
                    teacher.inputAll();
                    manager.addTeacher(teacher);
                }
                case 2 -> {
                    manager.printTeacher();
                }
            }
            if (choice == 3) {
                break;
            }
        }
    }

    public void studentrManagement() {
        Menu menuST = new Menu.menuManagement();
        int choice;
        while (true) {
            System.out.println("-----Student Management--------");
            menuST.displayMenu();
            choice = validator.checkChoice("Enter your choice: ");
            switch (choice) {
                case 1 -> {
                    Student student = new Student();
                    student.inputAll();
                    manager.addStudent(student);
                }
                case 2 -> {
                    manager.printStudent();
                }
            }
            if (choice == 3) {
                break;
            }
        }
    }

    public void personManagement() {
        Menu menuP = new Menu.menuPerson();
        int choice;
        while (true) {
            menuP.displayMenu();
            choice = validator.checkChoice("Enter your choice: ");
            switch (choice) {
                case 1 -> {
                    Scanner sc = new Scanner(System.in);
                    manager.personList();
                    System.out.println("Enter Name to Search ");
                    String searchName = sc.nextLine();
                    manager.searchByName(searchName);
                }
                case 2 -> {
                    manager.personList();
                    manager.printPerson();
                }
            }
            if (choice == 3) {
                break;
            }
        }

    }

    public void run() {
        Menu menu = new Menu.menuInformation();

        int choice;
        while (true) {
            menu.displayMenu();
            choice = validator.checkChoice("Enter your choice: ");

            switch (choice) {
                case 1 -> {
                    teacherManagement();
                }
                case 2 -> {
                    studentrManagement();
                }
                case 3 -> {
                    personManagement();
                }
            }
            if (choice == 4) {
                return;
            }
        }
    }
}
