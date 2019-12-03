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
public class Hostel extends Room implements Serializable {

    private String dormType;
    private boolean has24HReception;
    private boolean hasPrivateRooms;
    private boolean hasLockers;
    private boolean hasBar;
    private boolean hasPrivateBathroom;
    private boolean hasSharedKitchen;
    private boolean hasWashingMachine;
    private boolean hasLongStayOption;

    public Hostel(String dormType, boolean has24HReception, boolean hasPrivateRooms, boolean hasLockers, boolean hasBar, boolean hasPrivateBathroom, boolean hasSharedKitchen, boolean hasWashingMachine, boolean hasLongStayOption, String roomID, String roomType, String roomAddress, String roomCity, double roomPricePerNight, int maxNumberGuests, boolean hasBreakfastIncl, boolean hasParkingSpace, int kmFromCityCentre) {
        super(roomID, roomType, roomAddress, roomCity, roomPricePerNight, maxNumberGuests, hasBreakfastIncl, hasParkingSpace, kmFromCityCentre);
        this.dormType = dormType;
        this.has24HReception = has24HReception;
        this.hasPrivateRooms = hasPrivateRooms;
        this.hasLockers = hasLockers;
        this.hasBar = hasBar;
        this.hasPrivateBathroom = hasPrivateBathroom;
        this.hasSharedKitchen = hasSharedKitchen;
        this.hasWashingMachine = hasWashingMachine;
        this.hasLongStayOption = hasLongStayOption;
    }

    public void setDormType(String dormType) {
        this.dormType = dormType;
    }

    public void setHas24HReception(boolean has24HReception) {
        this.has24HReception = has24HReception;
    }

    public void setHasPrivateRooms(boolean hasPrivateRooms) {
        this.hasPrivateRooms = hasPrivateRooms;
    }

    public void setHasLockers(boolean hasLockers) {
        this.hasLockers = hasLockers;
    }

    public void setHasBar(boolean hasBar) {
        this.hasBar = hasBar;
    }

    public void setHasPrivateBathroom(boolean hasPrivateBathroom) {
        this.hasPrivateBathroom = hasPrivateBathroom;
    }

    public void setHasSharedKitchen(boolean hasSharedKitchen) {
        this.hasSharedKitchen = hasSharedKitchen;
    }

    public void setHasWashingMachine(boolean hasWashingMachine) {
        this.hasWashingMachine = hasWashingMachine;
    }

    public void setHasLongStayOption(boolean hasLongStayOption) {
        this.hasLongStayOption = hasLongStayOption;
    }

    public String getDormType() {
        return dormType;
    }

    public boolean has24HReception() {
        return has24HReception;
    }

    public boolean hasPrivateRooms() {
        return hasPrivateRooms;
    }

    public boolean hasLockers() {
        return hasLockers;
    }

    public boolean hasBar() {
        return hasBar;
    }

    public boolean hasPrivateBathroom() {
        return hasPrivateBathroom;
    }

    public boolean hasSharedKitchen() {
        return hasSharedKitchen;
    }

    public boolean hasWashingMachine() {
        return hasWashingMachine;
    }

    public boolean hasLongStayOption() {
        return hasLongStayOption;
    }



    @Override
    public String getDetails() {
        return super.getDetails() + "\nDetails:" + 
        "\n- Dormitory Type: " + this.dormType + 
        "\n- 24/7 Reception: " + (this.has24HReception ? "Yes" : "No")+ 
        "\n- Private Rooms: " + (this.hasPrivateRooms ? "Yes" : "No")+ 
        "\n- Lockers: " + (this.hasLockers ? "Yes" : "No")+ 
        "\n- Bar: " + (this.hasBar ? "Yes" : "No")+ 
        "\n- Private Bathroom: " + (this.hasPrivateBathroom ? "Yes" : "No")+ 
        "\n- Shared Kitchen: " + (this.hasSharedKitchen ? "Yes" : "No")+ 
        "\n- Washing Machine: " + (this.hasWashingMachine ? "Yes" : "No")+ 
        "\n- Long Stay Option: " + (this.hasLongStayOption ? "Yes" : "No");
    }
}
    

