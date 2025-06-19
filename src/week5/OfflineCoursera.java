package week5;

import java.time.LocalDate;

public class OfflineCoursera extends Coursera {
    private LocalDate begin;
    private LocalDate end;
    private String campus;

    public OfflineCoursera() {
        super();
        this.begin = LocalDate.now();
        this.end = LocalDate.now();
        this.campus = "";
    }

    public LocalDate getBegin() {
        return begin;
    }

    public void setBegin(LocalDate begin) {
        this.begin = begin;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    @Override
    public void inputAll() {
        Validator validator = new Validator();
        super.inputAll();
        begin = validator.checkBegin("Enter Begin Date (YYYY-MM-DD): ");
        end = validator.checkEnd("Enter End Date (YYYY-MM-DD): ", begin);
        campus = validator.checkEmpty("Enter Campus: ");
    }
}
