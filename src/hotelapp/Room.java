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

    private String roomID;
    private String roomType;
    private String roomAddress;
    private String roomCity;
    private double roomPricePerNight;
    private int maxNumberGuests;
    private boolean hasBreakfastIncl;
    private boolean hasParkingSpace;
    private int kmFromCityCentre;

    public Room(String roomID, String roomType, String roomAddress, String roomCity, double roomPricePerNight, int maxNumberGuests, 
            boolean hasBreakfastIncl, boolean hasParkingSpace, int kmFromCityCentre) {
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

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setRoomAddress(String roomAddress) {
        this.roomAddress = roomAddress;
    }

    public void setRoomCity(String roomCity) {
        this.roomCity = roomCity;
    }

    public void setRoomPricePerNight(double roomPricePerNight) {
        this.roomPricePerNight = roomPricePerNight;
    }

    public void setMaxNumberGuests(int maxNumberGuests) {
        this.maxNumberGuests = maxNumberGuests;
    }

    public void setHasBreakfastIncl(boolean hasBreakfastIncl) {
        this.hasBreakfastIncl = hasBreakfastIncl;
    }

    public void setHasParkingSpace(boolean hasParkingSpace) {
        this.hasParkingSpace = hasParkingSpace;
    }

    public void setKmFromCityCentre(int kmFromCityCentre) {
        this.kmFromCityCentre = kmFromCityCentre;
    }

    public String getRoomID() {
        return roomID;
    }

    public String getRoomType() {
        return roomType;
    }

    public String getRoomAddress() {
        return roomAddress;
    }

    public String getRoomCity() {
        return roomCity;
    }

    public double getRoomPricePerNight() {
        return roomPricePerNight;
    }

    public int getMaxNumberGuests() {
        return maxNumberGuests;
    }

    public boolean hasBreakfastIncl() {
        return hasBreakfastIncl;
    }

    public boolean hasParkingSpace() {
        return hasParkingSpace;
    }

    public int getKmFromCityCentre() {
        return kmFromCityCentre;
    }

    

    public String getDetails() {
        return "Type: " + this.roomType + 
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