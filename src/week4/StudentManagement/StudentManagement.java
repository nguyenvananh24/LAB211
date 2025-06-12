package week4.StudentManagement;

import java.util.*;

public class StudentManagement {

    List<Student> students = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void create() {
        while (true) {
            addStudent();
            if (students.size() >= 3) {
                System.out.println("Do you want to continue (Y/N)?");
                String answer = sc.nextLine();
                if (answer.equalsIgnoreCase("N")) {
                    return;
                }
            }
        }
    }
    public void addStudent() {
        System.out.println("----Add a new student ----");
        System.out.println("Enter ID Student: ");
        String idStudent = sc.nextLine();
        System.out.println("Enter Student Name: ");
        String studentName = sc.nextLine();
        System.out.println("Enter Semester: ");
        String semester = sc.nextLine();
        System.out.println("Enter Course Name: ");
        String courseName = sc.nextLine();
        Student newStudent = new Student(idStudent, studentName, semester, courseName);
        students.add(newStudent);
    }

    public void deleteStudent(String IDStudent) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getIDStudent().equalsIgnoreCase(IDStudent)) {
                students.remove(i);
                System.out.println("Student Deleted Successfully!!");
                return;
            }
        }
        //students.removeIf(student -> student.getIDStudent().equalsIgnoreCase(IDStudent));
    }

    public void updateStudent(String id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getIDStudent().equalsIgnoreCase(id)) {
                System.out.println("Enter new Student Name: ");
                String newName = sc.nextLine();
                System.out.println("Enter new Semester: ");
                String newSemester = sc.nextLine();
                System.out.println("Enter new Course Name: ");
                String newCourseName = sc.nextLine();
                students.set(i, new Student(id, newName, newSemester, newCourseName));
            }
        }
    }

    public void findStudent(String name) {
        for (Student student : students) {
            if (student.getStudentName().contains(name)) {
                System.out.println("Found student: " + student);
                return;
            }
        }
        System.out.println("Not found student with name: " + name);
    }

    public void sortStudent() {
        students.sort((s1, s2) -> s1.getStudentName().compareTo(s2.getStudentName()));
        System.out.println("--- List after sorting ---");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void reportStudent() {
        Map<String, Integer> countCourse = new LinkedHashMap<>();

        if (students.isEmpty()) {
            System.out.println("No students to report");
        } else {
            System.out.println("The report as below:");
            for (Student student : students) {
                String key = student.getStudentName() + " - " + student.getCourseName();
                countCourse.put(key, countCourse.getOrDefault(key, 0) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : countCourse.entrySet()) {
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            System.out.println("List of Students:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    public Student findStudentById(String id) {
        for (Student student : students) {
            if (student.getIDStudent().equalsIgnoreCase(id)) {
                return student;
            }
        }
        return null;
    }
}
