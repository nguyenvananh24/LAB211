package week4.InformationManagement;

public class Person {

    protected String ID;
    protected String fullName;
    protected String phoneNumber;
    protected int yearOfBirth;
    protected String major;

    public Person() {
        this.ID = "";
        this.fullName = "";
        this.phoneNumber = "";
        this.yearOfBirth = 0;
        this.major = "";
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void inputAll() {
        Validator input = new Validator();
        
        this.ID = input.checkID("Enter ID: ");
        
        this.fullName = input.checkFullName("Enter Full Name: ");

        this.phoneNumber = input.checkPhoneNumber("Enter Phone Number: ");
        
        this.yearOfBirth = input.checkYearOfBirth("Enter Year of Birth: ");

        this.major = input.checkMajor("Enter Major: ");
    }

    @Override
    public String toString() {
        return ID + " -  " + fullName + " - " + phoneNumber + " - " + yearOfBirth + " - " + major;
    }  
    
    public String printPerson() {
        return ID + " -  " + fullName + " - " + phoneNumber + " - " + yearOfBirth + " - " + major;
    }  
}
