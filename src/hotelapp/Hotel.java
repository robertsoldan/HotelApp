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
public class Hotel extends Room implements Serializable {
    
    // Declare variables
    private String bedType;
    private boolean has24HReception;
    private boolean hasRoomService;
    private boolean hasBalcony;
    private boolean hasMinibar;
    private boolean hasBathtub;
    private boolean hasRestaurant;
    private boolean hasPool;
    private boolean hasGym;

    // Constructor using superclass Room
    public Hotel(String bedType, boolean has24HReception, boolean hasRoomService, boolean hasBalcony, boolean hasMinibar, boolean hasBathtub, boolean hasRestaurant, boolean hasPool, 
            boolean hasGym, String roomName, String roomID, String roomType, String roomAddress, String roomCity, double roomPricePerNight, int maxNumberGuests, boolean hasBreakfastIncl, 
            boolean hasParkingSpace, int kmFromCityCentre) {
        super(roomName, roomID, roomType, roomAddress, roomCity, roomPricePerNight, maxNumberGuests, hasBreakfastIncl, hasParkingSpace, kmFromCityCentre);
        this.bedType = bedType;
        this.has24HReception = has24HReception;
        this.hasRoomService = hasRoomService;
        this.hasBalcony = hasBalcony;
        this.hasMinibar = hasMinibar;
        this.hasBathtub = hasBathtub;
        this.hasRestaurant = hasRestaurant;
        this.hasPool = hasPool;
        this.hasGym = hasGym;
    }

    // Getters and Setters
    
    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public void setHas24HReception(boolean has24HReception) {
        this.has24HReception = has24HReception;
    }

    public void setHasRoomService(boolean hasRoomService) {
        this.hasRoomService = hasRoomService;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public void setHasMinibar(boolean hasMinibar) {
        this.hasMinibar = hasMinibar;
    }

    public void setHasBathtub(boolean hasBathtub) {
        this.hasBathtub = hasBathtub;
    }

    public void setHasRestaurant(boolean hasRestaurant) {
        this.hasRestaurant = hasRestaurant;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }

    public void setHasGym(boolean hasGym) {
        this.hasGym = hasGym;
    }

    public String getBedType() {
        return bedType;
    }

    public boolean has24HReception() {
        return has24HReception;
    }

    public boolean hasRoomService() {
        return hasRoomService;
    }

    public boolean hasBalcony() {
        return hasBalcony;
    }

    public boolean hasMinibar() {
        return hasMinibar;
    }

    public boolean hasBathtub() {
        return hasBathtub;
    }

    public boolean hasRestaurant() {
        return hasRestaurant;
    }

    public boolean hasPool() {
        return hasPool;
    }

    public boolean hasGym() {
        return hasGym;
    }

    // Method partially inherited from superclass Room
    @Override
    public String getDetails() {
        return super.getDetails() + "\nDetails:" + 
        "\n- Bed Type: " + this.bedType + 
        "\n- 24/7 Reception: " + (this.has24HReception ? "Yes" : "No")+ 
        "\n- Room Service: " + (this.hasRoomService ? "Yes" : "No")+ 
        "\n- Balcony: " + (this.hasBalcony ? "Yes" : "No")+ 
        "\n- Minibar: " + (this.hasMinibar ? "Yes" : "No")+ 
        "\n- Bathtub: " + (this.hasBathtub ? "Yes" : "No")+ 
        "\n- Restaurant: " + (this.hasRestaurant ? "Yes" : "No")+ 
        "\n- Swimming Pool: " + (this.hasPool ? "Yes" : "No")+ 
        "\n- Gym: " + (this.hasGym ? "Yes" : "No");
    }
}
