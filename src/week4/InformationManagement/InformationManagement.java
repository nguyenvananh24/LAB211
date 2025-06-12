package week4.InformationManagement;

import java.util.ArrayList;
import java.util.List;

public class InformationManagement {

    List<Student> students = new ArrayList<>();
    List<Teacher> teachers = new ArrayList<>();
    List<Person> persons = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void personList() {
        persons.addAll(students);
        persons.addAll(teachers);
    }

    public void printStudent() {
        if (students.isEmpty()) {
            System.out.println("List Student is Empty!");
        } else {
            int count = 1;
            System.out.println("#  - ID  - Fullname -  Phone number  - Year of birth  - Major  - Year of admission  - Score");
            for (Student student : students) {
                System.out.println(count + " - " + student);
                count++;
            }
        }
    }

    public void printTeacher() {
        if (teachers.isEmpty()) {
            System.out.println("List Teacher is Empty!");
        } else {
            int count = 1;
            System.out.println("#  - ID  - Fullname -  Phone number  - Year of birth  - Major  - Year in the \n"
                    + "profession  - Contract type  - Salary coefficient");
            for (Teacher teacher : teachers) {
                System.out.println(count + " - " + teacher);
            }
        }
    }

    public void searchByName(String Name) {
        for (Person p : persons) {
            if (p.fullName.contains(Name)) {
                System.out.println(p);
                return;
            }

        }
    }

    public void printPerson() {
        if (persons.isEmpty()) {
            System.out.println("List Person is Empty!");
        } else {
            int count = 1;
            System.out.println("#  - ID  - Fullname -  Phone number  - Year of birth  - Major");
            persons.sort((a, b) -> Integer.compare(a.getYearOfBirth(), b.getYearOfBirth()));
            for (Person p : persons) {
                System.out.println(count + " " + p.printPerson());
                count++;
            }
        }
    }

}
