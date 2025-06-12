package week4.InformationManagement;

public class Teacher extends Person {

    private int yearIntheProfession;
    private String contractType;
    private String salary;

    public Teacher() {
        super();
        this.yearIntheProfession = 0;
        this.contractType = "";
        this.salary = "";
    }

    public int getYearIntheProfession() {
        return yearIntheProfession;
    }

    public void setYearIntheProfession(int yearIntheProfession) {
        this.yearIntheProfession = yearIntheProfession;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public void inputAll() {
        super.inputAll();
        Validator input = new Validator();
        this.yearIntheProfession = input.checkYearInTheProfession("Enter year in the profession: ", yearOfBirth);
        this.contractType = input.checkContractType("Enter contract type: ");
        this.salary = input.checkSalary("Enter salary: ");
    }

    @Override
    public String toString() {
        return ID + " -  " + fullName + " - " + phoneNumber + " - " + yearOfBirth + " - " + major + " - " + yearIntheProfession + " - " + contractType + " - " + salary;

    }
}
