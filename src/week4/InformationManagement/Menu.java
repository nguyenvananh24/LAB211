package week4.InformationManagement;

interface Menu {
    public void displayMenu();
    
    public class menuInformation implements Menu {
        @Override
        public void displayMenu() {
            System.out.println("-------Information Management------- ");
            System.out.println("1. Teacher");
            System.out.println("2. Student");
            System.out.println("3. Person");
            System.out.println("4. Exit");
        }
    }
    
    public class menuManagement implements Menu{
        @Override
        public void displayMenu() {
            System.out.println("1. Input");
            System.out.println("2. Print");
            System.out.println("3. Exit");
        }
    }
    
    public class menuPerson implements Menu{
        @Override
        public void displayMenu() {
            System.out.println("-------Person Management-------");
            System.out.println("1. Search");
            System.out.println("2. Print all");
            System.out.println("3. Exit");
        }
    }
}


