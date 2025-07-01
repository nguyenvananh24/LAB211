package week5.RoomManagement;

import java.time.LocalDateTime;

class Reservation {
    private String bookingID;
    private String customerName;
    private String phoneNumber;
    private String roomNumber;
    private LocalDateTime bookingDate;
    private FlightInformation flightInfo;

    public Reservation(String bookingID, String customerName, String phoneNumber,
                       String roomNumber, LocalDateTime bookingDate, FlightInformation flightInfo) {
        this.bookingID = bookingID;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.roomNumber = roomNumber;
        this.bookingDate = bookingDate;
        this.flightInfo = flightInfo;
    }

    public Reservation() {
        this.bookingID = "";
        this.customerName = "";
        this.phoneNumber = "";
        this.roomNumber = "";
        this.bookingDate = LocalDateTime.now();
        this.flightInfo = new FlightInformation();
    }

    public String getBookingID() { return bookingID; }
    public String getCustomerName() { return customerName; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getRoomNumber() { return roomNumber; }
    public LocalDateTime getBookingDate() { return bookingDate; }
    public FlightInformation getFlightInfo() { return flightInfo; }

    public void setBookingID(String bookingID) { this.bookingID = bookingID; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setRoomNumber(String roomNumber) { this.roomNumber = roomNumber; }
    public void setBookingDate(LocalDateTime bookingDate) { this.bookingDate = bookingDate; }
    public void setFlightInfo(FlightInformation flightInfo) { this.flightInfo = flightInfo; }
}
