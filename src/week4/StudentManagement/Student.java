package week4.StudentManagement;

public class Student {
    private String IDStudent;
    private String studentName;
    private String semester;
    private String courseName;

    public Student(String IDStudent, String studentName, String semester, String courseName) {
        this.IDStudent = IDStudent;
        this.studentName = studentName;
        this.semester = semester;
        this.courseName = courseName;
    }

    public String getIDStudent() {
        return IDStudent;
    }

    public void setIDStudent(String IDStudent) {
        this.IDStudent = IDStudent;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return IDStudent + " | " + studentName + " | " + semester + " | " + courseName;
    }
}
