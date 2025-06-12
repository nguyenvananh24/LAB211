package week4.InformationManagement;

import java.time.LocalDate;
import java.util.Scanner;

public class Validator {

    Scanner sc = new Scanner(System.in);

    public int checkChoice(String msg) {
        int choice;
        while (true) {
            try {
                System.out.println(msg);
                choice = Integer.parseInt(sc.nextLine());
                return choice;
            } catch (Exception e) {
                System.out.println("Invalid Input. Pls enter again!");
            }
        }
    }

    public String checkID(String msg) {
        String id;
        while (true) {
            System.out.print(msg);
            id = sc.nextLine();
            if (id.matches("\\d{6}")) {
                return id;
            } else {
                System.out.println("Invalid ID. Please enter again");
            }
        }
    }

    public String checkFullName(String msg) {
        String fullName;
        while (true) {
            System.out.println(msg);
            fullName = sc.nextLine();
            if (fullName.matches("[a-zA-Z\\s]+")) {
                return fullName;
            } else {
                System.out.println("Invalid full name. Please enter again");
            }

        }
    }

    public String checkPhoneNumber(String msg) {
        String phoneNumber;
        while (true) {
            System.out.println(msg);
            phoneNumber = sc.nextLine();
            if (phoneNumber.matches("\\d{12}")) {
                return phoneNumber;
            } else {
                System.out.println("Invalid phone number. Please enter again");
            }

        }
    }

    public int checkYearOfBirth(String msg) {
        int yearOfBirth;
        while (true) {
            try {
                System.out.println(msg);
                yearOfBirth = Integer.parseInt(sc.nextLine());
                if (yearOfBirth > LocalDate.now().getYear()) {
                    throw new IllegalArgumentException();
                }
                return yearOfBirth;
            } catch (Exception e) {
                System.out.println("Invalid Year Of Birth. Please enter again");
            }
        }
    }

    public String checkMajor(String msg) {
        String major;
        while (true) {
            System.out.println(msg);
            major = sc.nextLine();
            if (major.length() <= 30) {
                return major;
            } else {
                System.out.println("Invalid major. Please enter again");
            }
        }
    }

    public int checkYearOfAdmission(String msg, int yearOfBirth) {
        int yearOfAdmission;
        while (true) {
            try {
                System.out.println(msg);
                yearOfAdmission = Integer.parseInt(sc.nextLine());
                if (yearOfAdmission > LocalDate.now().getYear() || yearOfAdmission <= yearOfBirth) {
                    throw new IllegalArgumentException();
                }
                return yearOfAdmission;
            } catch (Exception e) {
                System.out.println("Invalid Year Of Admission. Please enter again");
            }

        }
    }

    public int checkScore(String msg) {
        int score;
        while (true) {
            try {
                System.out.println(msg);
                score = Integer.parseInt(sc.nextLine());
                if (score > 100 || score < 0) {
                    throw new IllegalArgumentException();
                }
                return score;
            } catch (Exception e) {
                System.out.println("Invalid Score. Please enter again");
            }
        }
    }

    public int checkYearInTheProfession(String msg, int yearOfBirth) {
        int yearInTheProfession;
        while (true) {
            try {
                System.out.println(msg);
                yearInTheProfession = Integer.parseInt(sc.nextLine());
                if (yearInTheProfession > LocalDate.now().getYear() || yearInTheProfession <= yearOfBirth) {
                    throw new IllegalArgumentException();
                }
                return yearInTheProfession;
            } catch (Exception e) {
                System.out.println("Invalid Year In The Profession. Please enter again");
            }
        }
    }

    public String checkContractType(String msg) {
        String contractType;
        while (true) {
            System.out.println(msg);
            contractType = sc.nextLine();
            if (contractType.equalsIgnoreCase("Long") || contractType.equalsIgnoreCase("Short")) {
                return contractType;
            } else {
                System.out.println("Invalid contract type. Please enter again");
            }
        }
    }

    public String checkSalary(String msg) {
        String salary;
        while (true) {
            System.out.println(msg);
            salary = sc.nextLine();
            if (salary.matches("\\d+")) {
                return salary;
            } else {
                System.out.println("Invalid salary. Please enter again");
            }
        }
    }
}
