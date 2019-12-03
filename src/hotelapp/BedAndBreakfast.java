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
public class BedAndBreakfast extends Room implements Serializable {
    
    private int numberBedrooms;
    private boolean isOwnerOccupied;
    private boolean isPetFriendly;
    private boolean hasKitchen;
    private boolean hasCleaningOption;
    private boolean hasTowels;
    private boolean hasLinen;
    private boolean hasWashingMachine;
    private boolean hasGarden;

    public BedAndBreakfast(int numberBedrooms, boolean isOwnerOccupied, boolean isPetFriendly, boolean hasKitchen, boolean hasCleaningOption, boolean hasTowels, boolean hasLinen, boolean hasWashingMachine, boolean hasGarden, String roomID, String roomType, String roomAddress, String roomCity, double roomPricePerNight, int maxNumberGuests, boolean hasBreakfastIncl, boolean hasParkingSpace, int kmFromCityCentre) {
        super(roomID, roomType, roomAddress, roomCity, roomPricePerNight, maxNumberGuests, hasBreakfastIncl, hasParkingSpace, kmFromCityCentre);
        this.numberBedrooms = numberBedrooms;
        this.isOwnerOccupied = isOwnerOccupied;
        this.isPetFriendly = isPetFriendly;
        this.hasKitchen = hasKitchen;
        this.hasCleaningOption = hasCleaningOption;
        this.hasTowels = hasTowels;
        this.hasLinen = hasLinen;
        this.hasWashingMachine = hasWashingMachine;
        this.hasGarden = hasGarden;
    }

    public void setNumberBedrooms(int numberBedrooms) {
        this.numberBedrooms = numberBedrooms;
    }

    public void setIsOwnerOccupied(boolean isOwnerOccupied) {
        this.isOwnerOccupied = isOwnerOccupied;
    }

    public void setIsPetFriendly(boolean isPetFriendly) {
        this.isPetFriendly = isPetFriendly;
    }

    public void setHasKitchen(boolean hasKitchen) {
        this.hasKitchen = hasKitchen;
    }

    public void setHasCleaningOption(boolean hasCleaningOption) {
        this.hasCleaningOption = hasCleaningOption;
    }

    public void setHasTowels(boolean hasTowels) {
        this.hasTowels = hasTowels;
    }

    public void setHasLinen(boolean hasLinen) {
        this.hasLinen = hasLinen;
    }

    public void setHasWashingMachine(boolean hasWashingMachine) {
        this.hasWashingMachine = hasWashingMachine;
    }

    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    public int getNumberBedrooms() {
        return numberBedrooms;
    }

    public boolean isOwnerOccupied() {
        return isOwnerOccupied;
    }

    public boolean isPetFriendly() {
        return isPetFriendly;
    }

    public boolean hasKitchen() {
        return hasKitchen;
    }

    public boolean hasCleaningOption() {
        return hasCleaningOption;
    }

    public boolean hasTowels() {
        return hasTowels;
    }

    public boolean hasLinen() {
        return hasLinen;
    }

    public boolean hasWashingMachine() {
        return hasWashingMachine;
    }

    public boolean hasGarden() {
        return hasGarden;
    }

    

    @Override
    public String getDetails() {
        return super.getDetails() + "\nDetails:" + 
        "\n- Number Bedrooms: " + this.numberBedrooms + 
        "\n- Owner Occupied: " + (this.isOwnerOccupied ? "Yes" : "No")+ 
        "\n- Pet Friendly: " + (this.isPetFriendly ? "Yes" : "No")+ 
        "\n- Kitchen Area: " + (this.hasKitchen ? "Yes" : "No")+ 
        "\n- Cleaning Option: " + (this.hasCleaningOption ? "Yes" : "No")+ 
        "\n- Towels Provided: " + (this.hasTowels ? "Yes" : "No")+ 
        "\n- Linen Provided: " + (this.hasLinen ? "Yes" : "No")+ 
        "\n- Washing Machine: " + (this.hasWashingMachine ? "Yes" : "No")+ 
        "\n- Garden: " + (this.hasGarden ? "Yes" : "No");
    }

}