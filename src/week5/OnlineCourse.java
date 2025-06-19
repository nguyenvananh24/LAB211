package week5;

public class OnlineCourse extends Coursera{
    private String platform;
    private String instructor;
    private String note;

    public OnlineCourse() {
        super();
        this.platform = "";
        this.instructor = "";
        this.note = "";
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void inputAll() {
        Validator validator = new Validator();
        super.inputAll();
        platform = validator.checkEmpty("Enter Platform: ");
        instructor = validator.checkEmpty("Enter Instructor: ");
        note = validator.checkEmpty("Enter Note: ");
    }

    public String toString(){
        return super.toString() + ", Platform: " + platform + ", Instructor: " + instructor + ", Note: " + note;
    }
}
