/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelapp;

import java.io.Serializable;

/**
 *
 * @author robert
 */
public class Room implements Serializable {

    // Declare variables
    private String roomName;
    private String roomID;
    private String roomType;
    private String roomAddress;
    private String roomCity;
    private double roomPricePerNight;
    private int maxNumberGuests;
    private boolean hasBreakfastIncl;
    private boolean hasParkingSpace;
    private int kmFromCityCentre;

    // Superclass constructor
    public Room(String roomName, String roomID, String roomType, String roomAddress, String roomCity, double roomPricePerNight, int maxNumberGuests, boolean hasBreakfastIncl, 
            boolean hasParkingSpace, int kmFromCityCentre) {
        this.roomName = roomName;
        this.roomID = roomID;
        this.roomType = roomType;
        this.roomAddress = roomAddress;
        this.roomCity = roomCity;
        this.roomPricePerNight = roomPricePerNight;
        this.maxNumberGuests = maxNumberGuests;
        this.hasBreakfastIncl = hasBreakfastIncl;
        this.hasParkingSpace = hasParkingSpace;
        this.kmFromCityCentre = kmFromCityCentre;
    }
    
    // Superclass getters and setters
    
    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getRoomAddress() {
        return roomAddress;
    }

    public void setRoomAddress(String roomAddress) {
        this.roomAddress = roomAddress;
    }

    public String getRoomCity() {
        return roomCity;
    }

    public void setRoomCity(String roomCity) {
        this.roomCity = roomCity;
    }

    public double getRoomPricePerNight() {
        return roomPricePerNight;
    }

    public void setRoomPricePerNight(double roomPricePerNight) {
        this.roomPricePerNight = roomPricePerNight;
    }

    public int getMaxNumberGuests() {
        return maxNumberGuests;
    }

    public void setMaxNumberGuests(int maxNumberGuests) {
        this.maxNumberGuests = maxNumberGuests;
    }

    public boolean hasBreakfastIncl() {
        return hasBreakfastIncl;
    }

    public void setHasBreakfastIncl(boolean hasBreakfastIncl) {
        this.hasBreakfastIncl = hasBreakfastIncl;
    }

    public boolean hasParkingSpace() {
        return hasParkingSpace;
    }

    public void setHasParkingSpace(boolean hasParkingSpace) {
        this.hasParkingSpace = hasParkingSpace;
    }

    public int getKmFromCityCentre() {
        return kmFromCityCentre;
    }

    public void setKmFromCityCentre(int kmFromCityCentre) {
        this.kmFromCityCentre = kmFromCityCentre;
    }

    // Method to get all of Room details
    public String getDetails() {
        return "Name: " + this.roomName + 
        "\nType: " + this.roomType +        
        "\nID: " + this.roomID + 
        "\nAddress: " + this.roomAddress + 
        "\nCity: " + this.roomCity + 
        "\nPrice Per Night: " + this.roomPricePerNight + "€" + 
        "\nMax Number of Guests: " + this.maxNumberGuests + 
        "\nBreakfast Included: " + (this.hasBreakfastIncl ? "Yes" : "No")+ 
        "\nParking Available: " + (this.hasParkingSpace ? "Yes" : "No") + 
        "\nDistance from City Centre: " + this.kmFromCityCentre + "km";           
    }

}
