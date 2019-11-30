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
public class ManageHotel extends ManageRoom{
     
    private String bedType;
    private boolean has24HReception;
    private boolean hasGym;
    private boolean hasRestaurant;
    private boolean hasPool;
    private boolean hasRoomService;
    private boolean hasBalcony;
    private boolean hasBathtub;
    private boolean hasMinibar;

    public ManageHotel(String bedType, boolean has24HReception, boolean hasGym, boolean hasRestaurant, boolean hasPool, boolean hasRoomService, 
            boolean hasBalcony, boolean hasBathtub, boolean hasMinibar, String roomID, String roomType, String roomAddress, String roomCity, 
            double roomPricePerNight, int maxNumberGuests, boolean hasBreakfastIncl, int hasParkingSpace, int kmFromCityCentre) {
        super(roomID, roomType, roomAddress, roomCity, roomPricePerNight, maxNumberGuests, hasBreakfastIncl, hasParkingSpace, kmFromCityCentre);
        this.bedType = bedType;
        this.has24HReception = has24HReception;
        this.hasGym = hasGym;
        this.hasRestaurant = hasRestaurant;
        this.hasPool = hasPool;
        this.hasRoomService = hasRoomService;
        this.hasBalcony = hasBalcony;
        this.hasBathtub = hasBathtub;
        this.hasMinibar = hasMinibar;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public void setHas24HReception(boolean has24HReception) {
        this.has24HReception = has24HReception;
    }

    public void setHasGym(boolean hasGym) {
        this.hasGym = hasGym;
    }

    public void setHasRestaurant(boolean hasRestaurant) {
        this.hasRestaurant = hasRestaurant;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }

    public void setHasRoomService(boolean hasRoomService) {
        this.hasRoomService = hasRoomService;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public void setHasBathtub(boolean hasBathtub) {
        this.hasBathtub = hasBathtub;
    }

    public void setHasMinibar(boolean hasMinibar) {
        this.hasMinibar = hasMinibar;
    }

}
