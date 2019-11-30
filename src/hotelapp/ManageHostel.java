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
public class ManageHostel extends ManageRoom{

        
    private String bedroomType;
    private String dormType;
    private boolean has24HReception;
    private boolean hasSharedKitchen;
    private boolean hasPrivateBathroom;
    private boolean hasLockers;
    private boolean hasWashingMachine;
    private boolean hasLongStayOption;
    private boolean hasBar;

    public ManageHostel(String bedroomType, String dormType, boolean has24HReception, boolean hasSharedKitchen, boolean hasPrivateBathroom, boolean hasLockers, 
            boolean hasWashingMachine, boolean hasLongStayOption, boolean hasBar, String roomID, String roomType, String roomAddress, String roomCity, 
            double roomPricePerNight, int maxNumberGuests, boolean hasBreakfastIncl, int hasParkingSpace, int kmFromCityCentre) {
        super(roomID, roomType, roomAddress, roomCity, roomPricePerNight, maxNumberGuests, hasBreakfastIncl, hasParkingSpace, kmFromCityCentre);
        this.bedroomType = bedroomType;
        this.dormType = dormType;
        this.has24HReception = has24HReception;
        this.hasSharedKitchen = hasSharedKitchen;
        this.hasPrivateBathroom = hasPrivateBathroom;
        this.hasLockers = hasLockers;
        this.hasWashingMachine = hasWashingMachine;
        this.hasLongStayOption = hasLongStayOption;
        this.hasBar = hasBar;
    }

    public void setBedroomType(String bedroomType) {
        this.bedroomType = bedroomType;
    }

    public void setDormType(String dormType) {
        this.dormType = dormType;
    }

    public void setHas24HReception(boolean has24HReception) {
        this.has24HReception = has24HReception;
    }

    public void setHasSharedKitchen(boolean hasSharedKitchen) {
        this.hasSharedKitchen = hasSharedKitchen;
    }

    public void setHasPrivateBathroom(boolean hasPrivateBathroom) {
        this.hasPrivateBathroom = hasPrivateBathroom;
    }

    public void setHasLockers(boolean hasLockers) {
        this.hasLockers = hasLockers;
    }

    public void setHasWashimgMachine(boolean hasWashimgMachine) {
        this.hasWashingMachine = hasWashimgMachine;
    }

    public void setHasLongStayOption(boolean hasLongStayOption) {
        this.hasLongStayOption = hasLongStayOption;
    }

    public void setHasBar(boolean hasBar) {
        this.hasBar = hasBar;
    }

}
    

