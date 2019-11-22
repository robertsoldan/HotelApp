/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelapp;

import javax.swing.ImageIcon;





/**
 *
 * @author robert
 */
public class HotelApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SearchGUI hotelAppGUI = new SearchGUI();
        ImageIcon img = new ImageIcon("img/logo.png");
        hotelAppGUI.setIconImage(img.getImage());
        
        hotelAppGUI.setVisible(true);
        

    }
    
}
