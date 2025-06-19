package week5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseraManagement {
    List<Coursera> courses = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addCourse() {
        System.out.print("Online (O) or Offline (F) course:  ");
        char choice = sc.nextLine().charAt(0);
        if (choice == 'O' || choice == 'o') {
            Coursera onlineCourse = new OnlineCourse();
            onlineCourse.inputAll();
            courses.add(onlineCourse);
        } else if (choice == 'F' || choice == 'f') {
            Coursera offlineCourse = new OfflineCoursera();
            offlineCourse.inputAll();
            courses.add(offlineCourse);
        }
    }

    public void updateCourse() {
        System.out.print("Course ID: ");
        String courseID = sc.nextLine().trim();
        for (Coursera course : courses) {
            if (course.getCourseID().equalsIgnoreCase(courseID)) {
                course.inputAll();
                return;
            }
        }
        System.out.print("No data found, do you want to find again? (Y/N): ");
        char choice = sc.nextLine().charAt(0);
        if (choice == 'Y' || choice == 'y') {
            updateCourse();
        }
    }

    public void deleteCourse() {
        System.out.print("Course ID: ");
        String courseID = sc.nextLine().trim();
        for (Coursera course : courses) {
            if (course.getCourseID().equalsIgnoreCase(courseID)) {
                courses.remove(course);
                return;
            }
        }
        System.out.print("No data found, do you want to find again? (Y/N): ");
        char choice = sc.nextLine().charAt(0);
        if (choice == 'Y' || choice == 'y') {
            deleteCourse();
        }
    }

    public void printAll() {
        if (courses.isEmpty()) {
            System.out.println("No courses available");
            return;
        }
        for (Coursera course : courses) {
            System.out.println(course);
        }
    }

    public void printOnlineCoursera() {
        boolean found = false;
        for (Coursera course : courses) {
            if (course instanceof OnlineCourse) {
                System.out.println(course);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No online courses available");
        }
    }

    public void printOfflineCoursera() {
        boolean found = false;
        for (Coursera course : courses) {
            if (course instanceof OfflineCoursera) {
                System.out.println(course);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No offline courses available");
        }
    }

    public void displayCourses() {
        System.out.print("Do you want to display all courses (A), online courses (O), or offline courses (F): ");
        char choice = sc.nextLine().charAt(0);
        if (choice == 'A' || choice == 'a') {
            printAll();
        } else if (choice == 'O' || choice == 'o') {
            printOnlineCoursera();
        } else if (choice == 'F' || choice == 'f') {
            printOfflineCoursera();
        }
    }

    public void searchCourseByName() {
        System.out.print("Course name:");
        String courseName = sc.nextLine().trim();
        boolean found = false;
        for (Coursera course : courses) {
            if (course.getCourseName().equalsIgnoreCase(courseName)) {
                System.out.println(course);
                found = true;
            }
        }
        if (!found) {
            System.out.print("No data found, do you want to find again? (Y/N): ");
            char choice = sc.nextLine().charAt(0);
            if (choice == 'Y' || choice == 'y') {
                searchCourseByName();
            }
        }
    }

}
