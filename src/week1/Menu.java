package week1;

public interface Menu {

    public void displayMenu();

    public class menuWeek1 implements Menu {

        @Override
        public void displayMenu() {
            System.out.println("\n----------Week 1-----------");
            System.out.println("1.Letter and Character count");
            System.out.println("2.Linear Search");
            System.out.println("3.Change base number system");
            System.out.println("4.Solving the equation");
            System.out.println("5.Exiting...");
            System.out.println("----------------------------");
            System.out.println("Enter your choice: ");
        }
    }

    public class menuEquationProgram implements Menu {
        @Override
        public void displayMenu() {
            System.out.println("\n----Equation Program--------");
            System.out.println("1. Calculate Superlative Equation");
            System.out.println("2. Calculate Quadratic Equation");
            System.out.println("3. Exit");
            System.out.println("Please choice one option: ");
        }       
    }
    
    public class menuChooseBaseNumber implements Menu {
        @Override
        public void displayMenu() {
            System.out.println("1. Binary \n2. Decimal \n3. Hexadecimal");
        }    
    }
    
    public class menuSolvingTheEquation implements Menu {
        @Override
        public void displayMenu() {
            System.out.println("----Equation Program-----");
            System.out.println("1. Calculate Superlative Equation");
            System.out.println("2. Calculate Quadratic Equation");
            System.out.println("3. Exit");
            System.out.println("Plz choice one option:");
        }
    }
    
}
