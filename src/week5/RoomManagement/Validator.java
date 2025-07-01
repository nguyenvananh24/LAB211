package week5.RoomManagement;

import java.time.LocalDateTime;

public class Validator {
    public static boolean isValidID(String id) {
        return id.matches("\\d{6}");
    }
    public static boolean isValidName(String name) {
        return name.matches("[a-zA-Z ]+");
    }
    public static boolean isValidPhone(String phone) {
        return phone.matches("\\d{12}");
    }
    public static boolean isValidRoom(String room) {
        return room.matches("\\d{4}");
    }
    public static boolean isFutureDate(LocalDateTime date) {
        return date.isAfter(LocalDateTime.now());
    }
    public static boolean isPickupTimeValid(LocalDateTime pickup, LocalDateTime booking) {
        return pickup.isAfter(LocalDateTime.now()) && pickup.isBefore(booking);
    }
}
