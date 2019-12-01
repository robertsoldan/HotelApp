package hotelapp;

import java.io.Serializable;

/**
 *
 * @author robert
 */
public class ManageBooking implements Serializable {

    private String bookingID;
    private String fName;
    private String lName;
    private String checkInDate;
    private String checkOutDate;
    private String hotelName;
    private int peopleNo;
    private int nights;
    private double totalPrice;
    private String roomID;

    public ManageBooking() {

        bookingID = new String();
        fName = new String();
        lName = new String();
        checkInDate = new String();
        checkOutDate = new String();
        hotelName = new String();
        peopleNo = 0;
        nights = 0;
        totalPrice = 0.0;
        roomID = new String();

    }

    public ManageBooking(String bookingID, String fName, String lName, String checkInDate, String checkOutDate, String hotelName, int peopleNo, int nights, double totalPrice, String roomID) {

        this.bookingID = bookingID;
        this.fName = fName;
        this.lName = lName;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.hotelName = hotelName;
        this.peopleNo = peopleNo;
        this.nights = nights;
        this.totalPrice = totalPrice;
        this.roomID = roomID;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getPeopleNo() {
        return peopleNo;
    }

    public void setPeopleNo(int peopleNo) {
        this.peopleNo = peopleNo;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }



}
