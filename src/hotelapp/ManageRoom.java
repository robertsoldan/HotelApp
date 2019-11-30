/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelapp;

/**
 *
 * @author robert
 */
public class ManageRoom {

    private String roomID;
    private String roomType;
    private String roomAddress;
    private String roomCity;
    private double roomPricePerNight;
    private int maxNumberGuests;
    private boolean hasBreakfastIncl;
    private int hasParkingSpace;
    private int kmFromCityCentre;

    public ManageRoom(String roomID, String roomType, String roomAddress, String roomCity, double roomPricePerNight, int maxNumberGuests, 
            boolean hasBreakfastIncl, int hasParkingSpace, int kmFromCityCentre) {
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

    public void setHasParkingSpace(int hasParkingSpace) {
        this.hasParkingSpace = hasParkingSpace;
    }

    public void setKmFromCityCentre(int kmFromCityCentre) {
        this.kmFromCityCentre = kmFromCityCentre;
    }

    
}
