package week5.RoomManagement;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class RoomManagement {
    private static final Scanner sc = new Scanner(System.in);
    private static final List<Reservation> list = new ArrayList<>();
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mma");
    private static final DateTimeFormatter dmy = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void start() {
        while (true) {
            System.out.println("\n*** Reservation Management ***");
            System.out.println("1. Create new reservation");
            System.out.println("2. Update reservation");
            System.out.println("3. Delete reservation");
            System.out.println("4. Print Flight Information");
            System.out.println("5. Print all");
            System.out.println("6. Exit");
            System.out.print("You choose: ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1": 
                    create(); 
                    break;
                case "2": 
                    update(); 
                    break;
                case "3":       
                    delete(); 
                    break;
                case "4": 
                    printFlight(); 
                    break;
                case "5": 
                    printAll(); 
                    break;
                case "6": 
                    System.out.println("BYE AND SEE YOU NEXT TIME"); 
                    return;
                default: 
                    System.out.println("Invalid choice");
            }
        }
    }

    private static void create() {
        System.out.println("*** Create new reservation ***");
        String id;
        while (true) {
            System.out.print("ID: ");
            id = sc.nextLine();
            if (!Validator.isValidID(id) || findById(id) != null)
                System.out.println("Data input is  invalid");
            else break;
        }

        String name;
        while (true) {
            System.out.print("Name: ");
            name = sc.nextLine();
            if (!Validator.isValidName(name))
                System.out.println("Data input is  invalid");
            else break;
        }

        String phone;
        while (true) {
            System.out.print("Phone: ");
            phone = sc.nextLine();
            if (!Validator.isValidPhone(phone))
                System.out.println("Data input is  invalid");
            else break;
        }

        String room;
        while (true) {
            System.out.print("RoomNumbers: ");
            room = sc.nextLine();
            if (!Validator.isValidRoom(room))
                System.out.println("Data input is  invalid");
            else break;
        }

        LocalDateTime bookingDate;
        while (true) {
            try {
                System.out.print("BookingDate: ");
                String date = sc.nextLine();
                bookingDate = LocalDate.parse(date, dmy).atStartOfDay();
                if (!Validator.isFutureDate(bookingDate)) throw new Exception();
                break;
            } catch (Exception e) {
                System.out.println("Data input is  invalid");
            }
        }

        FlightInformation fi = new FlightInformation();
        System.out.print("Need airport pick up? (Y/N): ");
        String pick = sc.nextLine();
        if (pick.equalsIgnoreCase("Y")) {
            System.out.print("Flight: ");
            String f = sc.nextLine();
            System.out.print("Seat: ");
            String s = sc.nextLine();
            LocalDateTime tp;
            while (true) {
                try {
                    System.out.print("TimePickUp: ");
                    String t = sc.nextLine();
                    tp = LocalDateTime.parse(t, dtf);
                    if (!Validator.isPickupTimeValid(tp, bookingDate)) throw new Exception();
                    break;
                } catch (Exception e) {
                    System.out.println("Data input is  invalid");
                }
            }
            fi = new FlightInformation(f, s, tp);
        }

        list.add(new Reservation(id, name, phone, room, bookingDate, fi));
        System.out.println("Information saved successfully.");
    }

    private static void update() {
        System.out.println("*** Update reservation ***");
        Reservation r = findReservationByPrompt();
        if (r == null) return;

        System.out.print("Name: ");
        String name = sc.nextLine();
        if (!name.isEmpty() && Validator.isValidName(name)) r.setCustomerName(name);

        System.out.print("Phone: ");
        String phone = sc.nextLine();
        if (!phone.isEmpty() && Validator.isValidPhone(phone)) r.setPhoneNumber(phone);

        System.out.print("RoomNumbers: ");
        String room = sc.nextLine();
        if (!room.isEmpty() && Validator.isValidRoom(room)) r.setRoomNumber(room);

        System.out.print("BookingDate: ");
        String date = sc.nextLine();
        if (!date.isEmpty()) {
            try {
                LocalDateTime d = LocalDate.parse(date, dmy).atStartOfDay();
                if (Validator.isFutureDate(d)) r.setBookingDate(d);
            } catch (Exception ignored) {}
        }

        System.out.print("Need airport pick up? (Y/N): ");
        String pick = sc.nextLine();
        if (pick.equalsIgnoreCase("Y")) {
            FlightInformation f = r.getFlightInfo();
            System.out.print("Flight: ");
            f.setFlightNumber(sc.nextLine());
            System.out.print("Seat: ");
            f.setSeatNumber(sc.nextLine());
            System.out.print("TimePickUp: ");
            try {
                String t = sc.nextLine();
                if (!t.isEmpty()) {
                    LocalDateTime tp = LocalDateTime.parse(t, dtf);
                    if (Validator.isPickupTimeValid(tp, r.getBookingDate()))
                        f.setTimePickUp(tp);
                }
            } catch (Exception ignored) {}
        }

        System.out.println("Information saved successfully.");
    }

    private static void delete() {
        System.out.println("*** Delete reservation ***");
        Reservation r = findReservationByPrompt();
        if (r == null) return;
        System.out.print("Are you sure you want to delete this information? (Y/N): ");
        if (sc.nextLine().equalsIgnoreCase("Y")) {
            list.remove(r);
            System.out.println("Information deleted successfully.");
        }
    }

    private static void printFlight() {
        System.out.println("*** Flight Information ***");
        for (Reservation r : list) {
            if (!r.getFlightInfo().getFlightNumber().isEmpty()) {
                System.out.printf("%s - %s - %s - %s - %s - %s\n",
                        r.getBookingID(), r.getCustomerName(), r.getPhoneNumber(),
                        r.getFlightInfo().getFlightNumber(), r.getFlightInfo().getSeatNumber(),
                        r.getFlightInfo().getTimePickUp().format(dtf));
            }
        }
    }

    private static void printAll() {
        System.out.println("*** Reservation Information ***");
        if (list.isEmpty()) {
            System.out.println("No information to view");
            return;
        }
        for (Reservation r : list) printOne(r);
    }

    private static void printOne(Reservation r) {
        String flight = r.getFlightInfo().getFlightNumber().isEmpty() ? "" :
                String.format("%s - %s - %s",
                        r.getFlightInfo().getFlightNumber(),
                        r.getFlightInfo().getSeatNumber(),
                        r.getFlightInfo().getTimePickUp().format(dtf));
        System.out.printf("%s - %s - %s - %s - %s - %s\n",
                r.getBookingID(), r.getCustomerName(), r.getPhoneNumber(),
                r.getRoomNumber(), r.getBookingDate().format(dmy), flight);
    }

    private static Reservation findById(String id) {
        for (Reservation r : list) {
            if (r.getBookingID().equals(id)) return r;
        }
        return null;
    }

    private static Reservation findReservationByPrompt() {
        Reservation r = null;
        while (r == null) {
            System.out.print("ID: ");
            String id = sc.nextLine();
            r = findById(id);
            if (r == null) {
                System.out.println("No information found");
                System.out.print("You want to find again? (Y/N): ");
                if (!sc.nextLine().equalsIgnoreCase("Y")) return null;
            }
        }
        printOne(r);
        return r;
    }
}

