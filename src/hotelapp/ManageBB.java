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
public class ManageBB extends ManageRoom{
    
    private boolean hasKitchen;
    private boolean hasWashingMachine;
    private boolean isOwnerOccupied;
    private int numberBedrooms;
    private boolean hasGarden;
    private boolean isPetFriendly;
    private boolean hasTowels;
    private boolean hasLinen;
    private boolean hasCleaningOption;

    public ManageBB(boolean hasKitchen, boolean hasWashingMachine, boolean isOwnerOccupied, int numberBedrooms, boolean hasGarden, boolean isPetFriendly, 
            boolean hasTowels, boolean hasLinen, boolean hasCleaningOption, String roomID, String roomType, String roomAddress, String roomCity, 
            double roomPricePerNight, int maxNumberGuests, boolean hasBreakfastIncl, int hasParkingSpace, int kmFromCityCentre) {
        super(roomID, roomType, roomAddress, roomCity, roomPricePerNight, maxNumberGuests, hasBreakfastIncl, hasParkingSpace, kmFromCityCentre);
        this.hasKitchen = hasKitchen;
        this.hasWashingMachine = hasWashingMachine;
        this.isOwnerOccupied = isOwnerOccupied;
        this.numberBedrooms = numberBedrooms;
        this.hasGarden = hasGarden;
        this.isPetFriendly = isPetFriendly;
        this.hasTowels = hasTowels;
        this.hasLinen = hasLinen;
        this.hasCleaningOption = hasCleaningOption;
    }

    public void setHasKitchen(boolean hasKitchen) {
        this.hasKitchen = hasKitchen;
    }

    public void setHasWashingMachine(boolean hasWashingMachine) {
        this.hasWashingMachine = hasWashingMachine;
    }

    public void setIsOwnerOccupied(boolean isOwnerOccupied) {
        this.isOwnerOccupied = isOwnerOccupied;
    }

    public void setNumberBedrooms(int numberBedrooms) {
        this.numberBedrooms = numberBedrooms;
    }

    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    public void setIsPetFriendly(boolean isPetFriendly) {
        this.isPetFriendly = isPetFriendly;
    }

    public void setHasTowels(boolean hasTowels) {
        this.hasTowels = hasTowels;
    }

    public void setHasLinen(boolean hasLinen) {
        this.hasLinen = hasLinen;
    }

    public void setHasCleaningOption(boolean hasCleaningOption) {
        this.hasCleaningOption = hasCleaningOption;
    }


}
