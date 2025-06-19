package week5;

public class Coursera {
    protected String courseID;
    protected String courseName;
    protected int credits;

    public Coursera() {
        this.courseID = "";
        this.courseName = "";
        this.credits = 0;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }


    public void inputAll() {
        Validator validator = new Validator();
        courseID = validator.checkEmpty("Enter Course ID: ");
        courseName = validator.checkEmpty("Enter Course Name: ");
        credits = validator.checkCredits("Enter Credits: ");
    }

    @Override
    public String toString() {
        return "Course ID: " + courseID + ", Course Name: " + courseName + ", Credits: " + credits;
    }
}
