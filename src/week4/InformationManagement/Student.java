package week4.InformationManagement;

public class Student extends Person {
    private int yearOfAdmission;
    private int score;
    
    public Student (){
        super();
        this.yearOfAdmission = 0;
        this.score = 0;
    }

    public int getYearOfAdmission() {
        return yearOfAdmission;
    }

    public void setYearOfAdmission(int yearOfAdmission) {
        this.yearOfAdmission = yearOfAdmission;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public void inputAll() {
        super.inputAll();
        Validator input = new Validator();
        this.yearOfAdmission = input.checkYearOfAdmission("Enter year of admission: ", yearOfBirth);
        this.score = input.checkScore("Enter score: ");
    }
    public String toString() {
        return ID + " -  " + fullName + " - " + phoneNumber + " - " + yearOfBirth + " - " + major + " - " + yearOfAdmission + " - " + score;
    }
}
