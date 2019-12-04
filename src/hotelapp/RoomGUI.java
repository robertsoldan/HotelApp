/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author robert
 */
public class RoomGUI extends javax.swing.JFrame {
    
    // Declare array lists to store Room objects
    private ArrayList<Hotel> hotelList = new ArrayList<>(); 
    private ArrayList<Hostel> hostelList = new ArrayList<>();
    private ArrayList<BedAndBreakfast> bbList = new ArrayList<>();

    public RoomGUI() {
        initLists();
        initComponents();
    }
    
    // Clear all fields in the form
    private void clearForm() {
        roomID_Tf.setText("");
        name_Tf.setText("");
        address_Tf.setText("");
        city_Tf.setText("");
        price_Tf.setText("");
        maxGuests_Tf.setText("");
        kmCityCentre_Tf.setText("");
        breakfast_Check.setSelected(false);
        parking_Check.setSelected(false);
        optionRadio.clearSelection();
        option1_Check.setSelected(false);
        option2_Check.setSelected(false);
        option3_Check.setSelected(false);
        option4_Check.setSelected(false);
        option5_Check.setSelected(false);
        option6_Check.setSelected(false);
        option7_Check.setSelected(false);
        option8_Check.setSelected(false);
    }
    
    // Fetch Hotel objects from hotels.data file and store them into an array list
    private ArrayList<Hotel> generateHotelList() {
        try {
            File inFile = new File("hotels.data");
            FileInputStream fStream = new FileInputStream(inFile);
            ObjectInputStream oStream = new ObjectInputStream(fStream);
            hotelList = (ArrayList<Hotel>)oStream.readObject();
            oStream.close();
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException: " + e);
        }
        return hotelList;
    }

    // Fetch Hostel objects from hostels.data file and store them into an array list
    private ArrayList<Hostel> generateHostelList() {
        try {
            File inFile = new File("hostels.data");
            FileInputStream fStream = new FileInputStream(inFile);
            ObjectInputStream oStream = new ObjectInputStream(fStream);
            hostelList = (ArrayList<Hostel>)oStream.readObject();
            oStream.close();
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException: " + e);
        }
        return hostelList;
    }

    // Fetch BedAndBreakfast objects from bedandbreakfasts.data file and store them into an array list
    private ArrayList<BedAndBreakfast> generateBBList() {
        try {
            File inFile = new File("bedandbreakfasts.data");
            FileInputStream fStream = new FileInputStream(inFile);
            ObjectInputStream oStream = new ObjectInputStream(fStream);
            bbList = (ArrayList<BedAndBreakfast>)oStream.readObject();
            oStream.close();
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException: " + e);
        }
        return bbList;
    }
    
    // Initialize the 3 array lists using the 3 previous methodes
    private void initLists() {
        hotelList = generateHotelList();
        hostelList = generateHostelList();
        bbList = generateBBList();
    }
    
    // Create object of type Hotel from the input form
    // Radio buttons must be specifically set up
    private Hotel createHotel() {
        optionRadio1_Rb.setActionCommand("Single");
        optionRadio2_Rb.setActionCommand("Double");
        optionRadio3_Rb.setActionCommand("King Size");
        Hotel hotel = new Hotel(optionRadio.getSelection().getActionCommand(), option1_Check.isSelected(), option2_Check.isSelected(), option3_Check.isSelected(),
            option4_Check.isSelected(), option5_Check.isSelected(), option6_Check.isSelected(), option7_Check.isSelected(), option8_Check.isSelected(), name_Tf.getText(),
            roomID_Tf.getText(), roomType_Combo.getSelectedItem().toString(), address_Tf.getText(), city_Tf.getText(), Double.parseDouble(price_Tf.getText()),
            Integer.parseInt(maxGuests_Tf.getText()), breakfast_Check.isSelected(), parking_Check.isSelected(), Integer.parseInt(kmCityCentre_Tf.getText()));
        return hotel;
    }
    
    // Create object of type Hostel from the input form
    // Radio buttons must be specifically set up
    private Hostel createHostel() {
        optionRadio1_Rb.setActionCommand("Female");
        optionRadio2_Rb.setActionCommand("Male");
        optionRadio3_Rb.setActionCommand("Mixed");
        Hostel hostel = new Hostel(optionRadio.getSelection().getActionCommand(), option1_Check.isSelected(), option2_Check.isSelected(), option3_Check.isSelected(),
            option4_Check.isSelected(), option5_Check.isSelected(), option6_Check.isSelected(), option7_Check.isSelected(), option8_Check.isSelected(), name_Tf.getText(), 
            roomID_Tf.getText(), roomType_Combo.getSelectedItem().toString(), address_Tf.getText(), city_Tf.getText(), Double.parseDouble(price_Tf.getText()),
            Integer.parseInt(maxGuests_Tf.getText()), breakfast_Check.isSelected(), parking_Check.isSelected(), Integer.parseInt(kmCityCentre_Tf.getText()));
        return hostel;
    }
    
    // Create object of type BedAndBreakfast from the input form
    // Radio buttons must be specifically set up
    private BedAndBreakfast createBB() {
        optionRadio1_Rb.setActionCommand("1");
        optionRadio2_Rb.setActionCommand("2");
        optionRadio3_Rb.setActionCommand("3");
        BedAndBreakfast bb = new BedAndBreakfast(Integer.parseInt(optionRadio.getSelection().getActionCommand().toString()), option1_Check.isSelected(), option2_Check.isSelected(),
            option3_Check.isSelected(), option4_Check.isSelected(), option5_Check.isSelected(), option6_Check.isSelected(), option7_Check.isSelected(), option8_Check.isSelected(),
            name_Tf.getText(), roomID_Tf.getText(), roomType_Combo.getSelectedItem().toString(), address_Tf.getText(), city_Tf.getText(), Double.parseDouble(price_Tf.getText()),
            Integer.parseInt(maxGuests_Tf.getText()), breakfast_Check.isSelected(), parking_Check.isSelected(), Integer.parseInt(kmCityCentre_Tf.getText()));
        return bb;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        optionRadio = new javax.swing.ButtonGroup();
        backgroundPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        manageRoomBtn = new javax.swing.JLabel();
        splitter1 = new javax.swing.JLabel();
        bookingsBtn = new javax.swing.JLabel();
        splitter2 = new javax.swing.JLabel();
        searchBtn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mngRoomHeader_Lbl = new javax.swing.JLabel();
        roomType_Lbl = new javax.swing.JLabel();
        roomType_Combo = new javax.swing.JComboBox<>();
        roomID_Tf = new javax.swing.JTextField();
        roomID_Lbl = new javax.swing.JLabel();
        address_Lbl = new javax.swing.JLabel();
        address_Tf = new javax.swing.JTextField();
        city_Lbl = new javax.swing.JLabel();
        city_Tf = new javax.swing.JTextField();
        price_Lbl = new javax.swing.JLabel();
        price_Tf = new javax.swing.JTextField();
        maxGuests_Lbl = new javax.swing.JLabel();
        maxGuests_Tf = new javax.swing.JTextField();
        breakfast_Lbl = new javax.swing.JLabel();
        breakfast_Check = new javax.swing.JCheckBox();
        parking_Lbl = new javax.swing.JLabel();
        parking_Check = new javax.swing.JCheckBox();
        kmCityCentre_Lbl = new javax.swing.JLabel();
        kmCityCentre_Tf = new javax.swing.JTextField();
        facilitiesHeader_Lbl = new javax.swing.JLabel();
        euroSymbol_Lbl = new javax.swing.JLabel();
        option1_Check = new javax.swing.JCheckBox();
        option4_Check = new javax.swing.JCheckBox();
        option3_Check = new javax.swing.JCheckBox();
        option2_Check = new javax.swing.JCheckBox();
        option5_Check = new javax.swing.JCheckBox();
        option8_Check = new javax.swing.JCheckBox();
        option7_Check = new javax.swing.JCheckBox();
        option6_Check = new javax.swing.JCheckBox();
        optionRadio_Lbl = new javax.swing.JLabel();
        optionRadio1_Rb = new javax.swing.JRadioButton();
        optionRadio2_Rb = new javax.swing.JRadioButton();
        optionRadio3_Rb = new javax.swing.JRadioButton();
        add_Btn = new javax.swing.JButton();
        viewHotel_Btn = new javax.swing.JButton();
        viewHostel_Btn = new javax.swing.JButton();
        viewBB_Btn = new javax.swing.JButton();
        search_Btn = new javax.swing.JButton();
        createHeader_Lbl = new javax.swing.JLabel();
        save_Btn = new javax.swing.JButton();
        viewHeader_Lbl = new javax.swing.JLabel();
        delete_Btn = new javax.swing.JButton();
        amend_Btn = new javax.swing.JButton();
        manageHeader_Lbl = new javax.swing.JLabel();
        clear_Btn = new javax.swing.JButton();
        name_Tf = new javax.swing.JTextField();
        name_Lbl = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 504, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 204));
        backgroundPanel.setMaximumSize(new java.awt.Dimension(50, 50));

        headerPanel.setBackground(new java.awt.Color(153, 0, 51));
        headerPanel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        manageRoomBtn.setFont(new java.awt.Font("FreeSans", 0, 24)); // NOI18N
        manageRoomBtn.setForeground(new java.awt.Color(250, 250, 250));
        manageRoomBtn.setText("Manage Room");
        manageRoomBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        splitter1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        splitter1.setForeground(new java.awt.Color(255, 255, 204));
        splitter1.setText("|");

        bookingsBtn.setFont(new java.awt.Font("FreeSans", 0, 24)); // NOI18N
        bookingsBtn.setForeground(new java.awt.Color(255, 255, 204));
        bookingsBtn.setText("Bookings");
        bookingsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bookingsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookingsBtnMouseClicked(evt);
            }
        });

        splitter2.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        splitter2.setForeground(new java.awt.Color(255, 255, 204));
        splitter2.setText("|");

        searchBtn.setFont(new java.awt.Font("FreeSans", 0, 24)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(255, 255, 204));
        searchBtn.setText("Search");
        searchBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBtnMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setText("Look, book, manage");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(splitter2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookingsBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(splitter1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageRoomBtn)
                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manageRoomBtn)
                    .addComponent(splitter1)
                    .addComponent(bookingsBtn)
                    .addComponent(splitter2)
                    .addComponent(searchBtn))
                .addContainerGap())
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mngRoomHeader_Lbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        mngRoomHeader_Lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mngRoomHeader_Lbl.setText("Manage Rooms");
        mngRoomHeader_Lbl.setToolTipText("");
        mngRoomHeader_Lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 51), 2));

        roomType_Lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        roomType_Lbl.setText("Room Type:");

        roomType_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hotel Room", "Hostel Room", "Bed & Breakfast" }));
        roomType_Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomType_ComboActionPerformed(evt);
            }
        });

        roomID_Tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomID_TfActionPerformed(evt);
            }
        });

        roomID_Lbl.setText("ID:");

        address_Lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        address_Lbl.setText("Address:");

        city_Lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        city_Lbl.setText("City:");

        price_Lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        price_Lbl.setText("Price per Night:");

        maxGuests_Lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        maxGuests_Lbl.setText("Maximum Guests:");

        breakfast_Lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        breakfast_Lbl.setText("Breakfast Included:");

        breakfast_Check.setBackground(new java.awt.Color(255, 255, 204));

        parking_Lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        parking_Lbl.setText("Parking Space Available:");

        parking_Check.setBackground(new java.awt.Color(255, 255, 204));
        parking_Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parking_CheckActionPerformed(evt);
            }
        });

        kmCityCentre_Lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        kmCityCentre_Lbl.setText("Km from City Centre:");

        kmCityCentre_Tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kmCityCentre_TfActionPerformed(evt);
            }
        });

        facilitiesHeader_Lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        facilitiesHeader_Lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        facilitiesHeader_Lbl.setText("Options - Hotel");

        euroSymbol_Lbl.setText("€");

        option1_Check.setBackground(new java.awt.Color(255, 255, 204));
        option1_Check.setText("24/7 Reception");
        option1_Check.setMaximumSize(new java.awt.Dimension(50, 50));
        option1_Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option1_CheckActionPerformed(evt);
            }
        });

        option4_Check.setBackground(new java.awt.Color(255, 255, 204));
        option4_Check.setText("Minibar");
        option4_Check.setMaximumSize(new java.awt.Dimension(50, 50));

        option3_Check.setBackground(new java.awt.Color(255, 255, 204));
        option3_Check.setText("Balcony");
        option3_Check.setMaximumSize(new java.awt.Dimension(50, 50));

        option2_Check.setBackground(new java.awt.Color(255, 255, 204));
        option2_Check.setText("Room Service");
        option2_Check.setMaximumSize(new java.awt.Dimension(50, 50));

        option5_Check.setBackground(new java.awt.Color(255, 255, 204));
        option5_Check.setText("Bathtub");
        option5_Check.setMaximumSize(new java.awt.Dimension(50, 50));
        option5_Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option5_CheckActionPerformed(evt);
            }
        });

        option8_Check.setBackground(new java.awt.Color(255, 255, 204));
        option8_Check.setText("Gym");
        option8_Check.setMaximumSize(new java.awt.Dimension(50, 50));

        option7_Check.setBackground(new java.awt.Color(255, 255, 204));
        option7_Check.setText("Swimming Pool");
        option7_Check.setMaximumSize(new java.awt.Dimension(50, 50));
        option7_Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option7_CheckActionPerformed(evt);
            }
        });

        option6_Check.setBackground(new java.awt.Color(255, 255, 204));
        option6_Check.setText("Restaurant");
        option6_Check.setMaximumSize(new java.awt.Dimension(50, 50));

        optionRadio_Lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        optionRadio_Lbl.setText("Bed Type:");

        optionRadio1_Rb.setBackground(new java.awt.Color(255, 255, 204));
        optionRadio.add(optionRadio1_Rb);
        optionRadio1_Rb.setText("Simple");

        optionRadio2_Rb.setBackground(new java.awt.Color(255, 255, 204));
        optionRadio.add(optionRadio2_Rb);
        optionRadio2_Rb.setText("Double");

        optionRadio3_Rb.setBackground(new java.awt.Color(255, 255, 204));
        optionRadio.add(optionRadio3_Rb);
        optionRadio3_Rb.setText("King Size");

        add_Btn.setText("Add Room");
        add_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_BtnActionPerformed(evt);
            }
        });

        viewHotel_Btn.setText("Hotel Rooms");
        viewHotel_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewHotel_BtnActionPerformed(evt);
            }
        });

        viewHostel_Btn.setText("Hostel Rooms");
        viewHostel_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewHostel_BtnActionPerformed(evt);
            }
        });

        viewBB_Btn.setText("Bed & Breakfasts");
        viewBB_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBB_BtnActionPerformed(evt);
            }
        });

        search_Btn.setText("Search By ID");
        search_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_BtnActionPerformed(evt);
            }
        });

        createHeader_Lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        createHeader_Lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createHeader_Lbl.setText("Create / Edit");
        createHeader_Lbl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 51), 1, true));

        save_Btn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        save_Btn.setText("Save");
        save_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_BtnActionPerformed(evt);
            }
        });

        viewHeader_Lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewHeader_Lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewHeader_Lbl.setText("View");
        viewHeader_Lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 51)));

        delete_Btn.setText("Delete Room");
        delete_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_BtnActionPerformed(evt);
            }
        });

        amend_Btn.setText("Amend Room");
        amend_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amend_BtnActionPerformed(evt);
            }
        });

        manageHeader_Lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manageHeader_Lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageHeader_Lbl.setText("Manage");
        manageHeader_Lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 51)));

        clear_Btn.setText("Clear");
        clear_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_BtnActionPerformed(evt);
            }
        });

        name_Lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        name_Lbl.setText("Name:");

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mngRoomHeader_Lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(createHeader_Lbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(facilitiesHeader_Lbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backgroundPanelLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(backgroundPanelLayout.createSequentialGroup()
                                            .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(city_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(roomType_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(price_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(backgroundPanelLayout.createSequentialGroup()
                                                    .addComponent(roomType_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(roomID_Lbl)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(roomID_Tf, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backgroundPanelLayout.createSequentialGroup()
                                                    .addComponent(price_Tf, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(euroSymbol_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(city_Tf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(backgroundPanelLayout.createSequentialGroup()
                                            .addComponent(name_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(name_Tf)))
                                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                                        .addComponent(address_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(address_Tf, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(43, 43, 43)
                                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(maxGuests_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(breakfast_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(parking_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(breakfast_Check)
                                                    .addComponent(parking_Check))
                                                .addGap(10, 10, 10))
                                            .addComponent(maxGuests_Tf)))
                                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                                        .addComponent(kmCityCentre_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(kmCityCentre_Tf))))
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(option2_Check, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(option1_Check, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(optionRadio_Lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, Short.MAX_VALUE)
                                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                                .addComponent(optionRadio1_Rb, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 25, Short.MAX_VALUE))
                                            .addComponent(option4_Check, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(option3_Check, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(clear_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(optionRadio2_Rb, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(option5_Check, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(option6_Check, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(option8_Check, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(option7_Check, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                            .addComponent(optionRadio3_Rb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(save_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(add_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(delete_Btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(amend_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(manageHeader_Lbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(search_Btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(viewHeader_Lbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(viewHotel_Btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(viewBB_Btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                            .addComponent(viewHostel_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(100, 100, 100))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(mngRoomHeader_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createHeader_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageHeader_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomType_Lbl)
                    .addComponent(roomID_Tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomType_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomID_Lbl)
                    .addComponent(maxGuests_Lbl)
                    .addComponent(maxGuests_Tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_Btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(breakfast_Check)
                    .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(breakfast_Lbl)
                        .addComponent(name_Lbl)
                        .addComponent(name_Tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(search_Btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(parking_Lbl)
                        .addComponent(parking_Check)
                        .addComponent(amend_Btn))
                    .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(address_Lbl)
                        .addComponent(address_Tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kmCityCentre_Lbl)
                            .addComponent(kmCityCentre_Tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(city_Lbl)
                            .addComponent(city_Tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(price_Lbl)
                            .addComponent(price_Tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(euroSymbol_Lbl)))
                    .addComponent(delete_Btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(facilitiesHeader_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewHeader_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewHotel_Btn)
                    .addComponent(optionRadio3_Rb)
                    .addComponent(optionRadio2_Rb)
                    .addComponent(optionRadio1_Rb)
                    .addComponent(optionRadio_Lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(option7_Check, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(option5_Check, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(option3_Check, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(option1_Check, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewHostel_Btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(option4_Check, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(option6_Check, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(option8_Check, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(viewBB_Btn))
                    .addComponent(option2_Check, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(save_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void amend_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amend_BtnActionPerformed
        // Verify the ID field is not empty
        int count = 0;
        if (roomID_Tf.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please select type and enter ID.");
        // If type = hotel room, loop through hotel array list to find matching ID
        } else if (roomType_Combo.getSelectedItem().toString().equals("Hotel Room")) {
            for (Hotel h : hotelList) {
                // Match found: delete object from array, create a new object from the input form and add the array, confirm with message dialog and exit loop
                if (roomID_Tf.getText().equalsIgnoreCase(h.getRoomID())) {
                    hotelList.remove(h);
                    Hotel hotel = createHotel();
                    hotelList.add(hotel);
                    JOptionPane.showMessageDialog(null, hotel.getRoomType() + " #" + hotel.getRoomID() + " successfully updated.");
                    clearForm();
                    break;
                // No match found: message dialog displays after the last object in the array is evaluated
                } else {
                    count++;
                    if (count == hotelList.size()) {
                        JOptionPane.showMessageDialog(null, h.getRoomType() + " does not exist.");
                        clearForm();
                    }
                }
            }
        // If type = hostel room, loop through hostel array list to find matching ID
        } else if (roomType_Combo.getSelectedItem().toString().equals("Hostel Room")) {
            for (Hostel h : hostelList) {
                // Match found: delete object from array, create a new object from the input form and add the array, confirm with message dialog and exit loop
                if (roomID_Tf.getText().equalsIgnoreCase(h.getRoomID())) {
                    Hostel hostel = createHostel();
                    hostelList.add(hostel);
                    hostelList.remove(h);
                    JOptionPane.showMessageDialog(null, hostel.getRoomType() + " #" + hostel.getRoomID() + " successfully deleted.");
                    clearForm();
                    break;
                // No match found: message dialog displays after the last object in the array is evaluated
                } else {
                    count++;
                    if (count == hostelList.size()) {
                        JOptionPane.showMessageDialog(null, h.getRoomType() + " does not exist.");
                        clearForm();
                    }
                }
            }
        // If type = B&B room, loop through B&B array list to find matching ID
        } else {
            for (BedAndBreakfast bb : bbList) {
                // Match found: delete object from array, create a new object from the input form and add the array, confirm with message dialog and exit loop
                if (roomID_Tf.getText().equalsIgnoreCase(bb.getRoomID())) {
                    BedAndBreakfast bAndB = createBB();
                    bbList.add(bAndB);
                    bbList.remove(bb);
                    JOptionPane.showMessageDialog(null, bAndB.getRoomType() + " #" + bAndB.getRoomID() + " successfully deleted.");
                    clearForm();
                    break;
                // No match found: message dialog displays after the last object in the array is evaluated
                } else {
                    count++;
                    if (count == bbList.size()) {
                        JOptionPane.showMessageDialog(null, bb.getRoomType() + " does not exist.");
                        clearForm();
                    }
                }
            }
        }      
    }//GEN-LAST:event_amend_BtnActionPerformed

    private void delete_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_BtnActionPerformed
        // Set count to 0 and verify ID field is not empty
        int count = 0;
        if (roomID_Tf.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please select type and enter ID.");
        // If type = hotel room, loop through hotel array list to find matching ID
        } else if (roomType_Combo.getSelectedItem().toString().equals("Hotel Room")) {
            for (Hotel h : hotelList) {
                // Match found: fill form with remaining details, delete object from array, confirm with message dialog and exit loop
                if (roomID_Tf.getText().equalsIgnoreCase(h.getRoomID())) {
                    name_Tf.setText(h.getRoomName());
                    address_Tf.setText(h.getRoomAddress());
                    city_Tf.setText(h.getRoomCity());
                    breakfast_Check.setSelected(h.hasBreakfastIncl());
                    parking_Check.setSelected(h.hasParkingSpace());
                    price_Tf.setText(Double.toString(h.getRoomPricePerNight()));
                    maxGuests_Tf.setText(Integer.toString(h.getMaxNumberGuests()));
                    kmCityCentre_Tf.setText(Integer.toString(h.getKmFromCityCentre()));
                    option1_Check.setSelected(h.has24HReception());
                    option2_Check.setSelected(h.hasRoomService());
                    option3_Check.setSelected(h.hasBalcony());
                    option4_Check.setSelected(h.hasMinibar());
                    option5_Check.setSelected(h.hasBathtub());
                    option6_Check.setSelected(h.hasRestaurant());
                    option7_Check.setSelected(h.hasPool());
                    option8_Check.setSelected(h.hasGym());
                    // Select one radio button based on the option value from getter
                    if (h.getBedType().equals("Single")) {
                        optionRadio1_Rb.setSelected(true);
                    } else if (h.getBedType().equals("Double")) {
                        optionRadio2_Rb.setSelected(true);
                    } else {
                        optionRadio3_Rb.setSelected(true);
                    }
                    hotelList.remove(h);
                    JOptionPane.showMessageDialog(null, h.getRoomType() + " #" + h.getRoomID() + " successfully deleted.");
                    clearForm();
                    break;
                // No match found: message dialog displays after the last object in the array is evaluated
                } else {
                    count++;
                    if (count == hotelList.size()) {
                        JOptionPane.showMessageDialog(null, h.getRoomType() + " does not exist.");
                        clearForm();
                    }
                }
            }
        // If type = hostel room, loop through hostel array list to find matching ID
        } else if (roomType_Combo.getSelectedItem().toString().equals("Hostel Room")) {
            for (Hostel h : hostelList) {
                // Match found: fill form with remaining details, delete object from array, confirm with message dialog and exit loop
                if (roomID_Tf.getText().equalsIgnoreCase(h.getRoomID())) {
                    name_Tf.setText(h.getRoomName());
                    address_Tf.setText(h.getRoomAddress());
                    city_Tf.setText(h.getRoomCity());
                    breakfast_Check.setSelected(h.hasBreakfastIncl());
                    parking_Check.setSelected(h.hasParkingSpace());
                    price_Tf.setText(Double.toString(h.getRoomPricePerNight()));
                    maxGuests_Tf.setText(Integer.toString(h.getMaxNumberGuests()));
                    kmCityCentre_Tf.setText(Integer.toString(h.getKmFromCityCentre()));
                    option1_Check.setSelected(h.has24HReception());
                    option2_Check.setSelected(h.hasPrivateRooms());
                    option3_Check.setSelected(h.hasLockers());
                    option4_Check.setSelected(h.hasBar());
                    option5_Check.setSelected(h.hasPrivateBathroom());
                    option6_Check.setSelected(h.hasSharedKitchen());
                    option7_Check.setSelected(h.hasWashingMachine());
                    option8_Check.setSelected(h.hasLongStayOption());
                    // Select one radio button based on the option value from getter
                    if (h.getDormType().equals("Female")) {
                        optionRadio1_Rb.setSelected(true);
                    } else if (h.getDormType().equals("Male")) {
                        optionRadio2_Rb.setSelected(true);
                    } else {
                        optionRadio3_Rb.setSelected(true);
                    }
                    hostelList.remove(h);
                    JOptionPane.showMessageDialog(null, h.getRoomType() + " #" + h.getRoomID() + " successfully deleted.");
                    clearForm();
                    break;
                // No match found: message dialog displays after the last object in the array is evaluated
                } else {
                    count++;
                    if (count == hostelList.size()) {
                        JOptionPane.showMessageDialog(null, h.getRoomType() + " does not exist.");
                        clearForm();
                    }
                }
            }
        // If type = B&B room, loop through B&B array list to find matching ID
        } else {
            for (BedAndBreakfast bb : bbList) {
                // Match found: fill form with remaining details, delete object from array, confirm with message dialog and exit loop
                if (roomID_Tf.getText().equalsIgnoreCase(bb.getRoomID())) {
                    name_Tf.setText(bb.getRoomName());
                    address_Tf.setText(bb.getRoomAddress());
                    city_Tf.setText(bb.getRoomCity());
                    breakfast_Check.setSelected(bb.hasBreakfastIncl());
                    parking_Check.setSelected(bb.hasParkingSpace());
                    price_Tf.setText(Double.toString(bb.getRoomPricePerNight()));
                    maxGuests_Tf.setText(Integer.toString(bb.getMaxNumberGuests()));
                    kmCityCentre_Tf.setText(Integer.toString(bb.getKmFromCityCentre()));
                    option1_Check.setSelected(bb.isOwnerOccupied());
                    option2_Check.setSelected(bb.isPetFriendly());
                    option3_Check.setSelected(bb.hasKitchen());
                    option4_Check.setSelected(bb.hasCleaningOption());
                    option5_Check.setSelected(bb.hasTowels());
                    option6_Check.setSelected(bb.hasLinen());
                    option7_Check.setSelected(bb.hasWashingMachine());
                    option8_Check.setSelected(bb.hasGarden());
                    // Select one radio button based on the option value from getter
                    if (bb.getNumberBedrooms() == 1) {
                        optionRadio1_Rb.setSelected(true);
                    } else if (bb.getNumberBedrooms() == 2) {
                        optionRadio2_Rb.setSelected(true);
                    } else {
                        optionRadio3_Rb.setSelected(true);
                    }
                    bbList.remove(bb);
                    JOptionPane.showMessageDialog(null, bb.getRoomType() + " #" + bb.getRoomID() + " successfully deleted.");
                    clearForm();
                    break;
                // No match found: message dialog displays after the last object in the array is evaluated
                } else {
                    count++;
                    if (count == bbList.size()) {
                        JOptionPane.showMessageDialog(null, bb.getRoomType() + " does not exist.");
                        clearForm();
                    }
                }
            }
        }        
    }//GEN-LAST:event_delete_BtnActionPerformed

    private void save_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_BtnActionPerformed
        // Verify the array list of objects Hotel is not empty
        if (hotelList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No Hotel room found.");
        } else {
            // Write Hotel objects to hotels.data file and confirm to user
            try {
                File outFile = new File("hotels.data");
                FileOutputStream fStream = new FileOutputStream(outFile);
                ObjectOutputStream oStream = new ObjectOutputStream(fStream);
                oStream.writeObject(hotelList);
                oStream.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, e);
            }
            JOptionPane.showMessageDialog(null, "Hotel rooms saved successfully.");
        }

        // Verify the array list of objects Hostel is not empty
        if (hostelList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No Hostel room found.");
        } else {
            // Write Hostel objects to hostels.data file and confirm to user
            try {
                File outFile = new File("hostels.data");
                FileOutputStream fStream = new FileOutputStream(outFile);
                ObjectOutputStream oStream = new ObjectOutputStream(fStream);
                oStream.writeObject(hostelList);
                oStream.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, e);
            }
            JOptionPane.showMessageDialog(null, "Hostel rooms saved successfully.");
        }

        // Verify the array list of objects B&B is not empty
        if (bbList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No Bed & Breakfast room found.");
        } else {
            // Write B&B objects to bedandbreakfasts.data file and confirm to user
            try {
                File outFile = new File("bedandbreakfasts.data");
                FileOutputStream fStream = new FileOutputStream(outFile);
                ObjectOutputStream oStream = new ObjectOutputStream(fStream);
                oStream.writeObject(bbList);
                oStream.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, e);
            }
            JOptionPane.showMessageDialog(null, "Bed & Breakfast rooms saved successfully.");
        }
    }//GEN-LAST:event_save_BtnActionPerformed

    private void search_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_BtnActionPerformed
        // Set count to 0 and verify ID field is not empty
        int count = 0;
        if (roomID_Tf.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please select type and enter ID.");
        // If type = Hotel room, loop through Hotel array list to find matching ID  
        } else if (roomType_Combo.getSelectedItem().toString().equals("Hotel Room")) {
            for (Hotel h : hotelList) {
                // Match found: fill form with Hotel details from stored object and exit loop
                if (roomID_Tf.getText().equalsIgnoreCase(h.getRoomID())) {
                    name_Tf.setText(h.getRoomName());
                    address_Tf.setText(h.getRoomAddress());
                    city_Tf.setText(h.getRoomCity());
                    breakfast_Check.setSelected(h.hasBreakfastIncl());
                    parking_Check.setSelected(h.hasParkingSpace());
                    price_Tf.setText(Double.toString(h.getRoomPricePerNight()));
                    maxGuests_Tf.setText(Integer.toString(h.getMaxNumberGuests()));
                    kmCityCentre_Tf.setText(Integer.toString(h.getKmFromCityCentre()));
                    option1_Check.setSelected(h.has24HReception());
                    option2_Check.setSelected(h.hasRoomService());
                    option3_Check.setSelected(h.hasBalcony());
                    option4_Check.setSelected(h.hasMinibar());
                    option5_Check.setSelected(h.hasBathtub());
                    option6_Check.setSelected(h.hasRestaurant());
                    option7_Check.setSelected(h.hasPool());
                    option8_Check.setSelected(h.hasGym());
                    if (h.getBedType().equals("Single")) {
                        optionRadio1_Rb.setSelected(true);
                    } else if (h.getBedType().equals("Double")) {
                        optionRadio2_Rb.setSelected(true);
                    } else {
                        optionRadio3_Rb.setSelected(true);
                    }
                    break;
                // No match found: message dialog displays after the last object in the array is evaluated
                } else {
                    count++;
                    if (count == hotelList.size()) {
                        JOptionPane.showMessageDialog(null, h.getRoomType() + " does not exist.");
                        clearForm();
                    }
                }
            }
        // If type = Hostel room, loop through Hostel array list to find matching ID  
        } else if (roomType_Combo.getSelectedItem().toString().equals("Hostel Room")) {
            for (Hostel h : hostelList) {
                // Match found: fill form with Hostel details from stored object and exit loop
                if (roomID_Tf.getText().equalsIgnoreCase(h.getRoomID())) {
                    name_Tf.setText(h.getRoomName());
                    address_Tf.setText(h.getRoomAddress());
                    city_Tf.setText(h.getRoomCity());
                    breakfast_Check.setSelected(h.hasBreakfastIncl());
                    parking_Check.setSelected(h.hasParkingSpace());
                    price_Tf.setText(Double.toString(h.getRoomPricePerNight()));
                    maxGuests_Tf.setText(Integer.toString(h.getMaxNumberGuests()));
                    kmCityCentre_Tf.setText(Integer.toString(h.getKmFromCityCentre()));
                    option1_Check.setSelected(h.has24HReception());
                    option2_Check.setSelected(h.hasPrivateRooms());
                    option3_Check.setSelected(h.hasLockers());
                    option4_Check.setSelected(h.hasBar());
                    option5_Check.setSelected(h.hasPrivateBathroom());
                    option6_Check.setSelected(h.hasSharedKitchen());
                    option7_Check.setSelected(h.hasWashingMachine());
                    option8_Check.setSelected(h.hasLongStayOption());
                    if (h.getDormType().equals("Female")) {
                        optionRadio1_Rb.setSelected(true);
                    } else if (h.getDormType().equals("Male")) {
                        optionRadio2_Rb.setSelected(true);
                    } else {
                        optionRadio3_Rb.setSelected(true);
                    }
                    break;
                // No match found: message dialog displays after the last object in the array is evaluated
                } else {
                    count++;
                    if (count == hostelList.size()) {
                        JOptionPane.showMessageDialog(null, h.getRoomType() + " does not exist.");
                        clearForm();
                    }
                }
            }
        // If type = B&B room, loop through B&B array list to find matching ID  
        } else {
            for (BedAndBreakfast bb : bbList) {
                // Match found: fill form with B&B details from stored object and exit loop
                if (roomID_Tf.getText().equalsIgnoreCase(bb.getRoomID())) {
                    name_Tf.setText(bb.getRoomName());
                    address_Tf.setText(bb.getRoomAddress());
                    city_Tf.setText(bb.getRoomCity());
                    breakfast_Check.setSelected(bb.hasBreakfastIncl());
                    parking_Check.setSelected(bb.hasParkingSpace());
                    price_Tf.setText(Double.toString(bb.getRoomPricePerNight()));
                    maxGuests_Tf.setText(Integer.toString(bb.getMaxNumberGuests()));
                    kmCityCentre_Tf.setText(Integer.toString(bb.getKmFromCityCentre()));
                    option1_Check.setSelected(bb.isOwnerOccupied());
                    option2_Check.setSelected(bb.isPetFriendly());
                    option3_Check.setSelected(bb.hasKitchen());
                    option4_Check.setSelected(bb.hasCleaningOption());
                    option5_Check.setSelected(bb.hasTowels());
                    option6_Check.setSelected(bb.hasLinen());
                    option7_Check.setSelected(bb.hasWashingMachine());
                    option8_Check.setSelected(bb.hasGarden());
                    if (bb.getNumberBedrooms() == 1) {
                        optionRadio1_Rb.setSelected(true);
                    } else if (bb.getNumberBedrooms() == 2) {
                        optionRadio2_Rb.setSelected(true);
                    } else {
                        optionRadio3_Rb.setSelected(true);
                    }
                    break;
                // No match found: message dialog displays after the last object in the array is evaluated
                } else {
                    count++;
                    if (count == bbList.size()) {
                        JOptionPane.showMessageDialog(null, bb.getRoomType() + " does not exist.");
                        clearForm();
                    }
                }
            }
        }
    }//GEN-LAST:event_search_BtnActionPerformed

    private void viewBB_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBB_BtnActionPerformed
        // Verify that the array list is not empty and display object details for each B&B in the array list
        if (bbList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No Bed & Breakfast room recorded.");
        } else {
            for (BedAndBreakfast bb : bbList) {
                JOptionPane.showMessageDialog(null, bb.getDetails());
            }            
        }
    }//GEN-LAST:event_viewBB_BtnActionPerformed

    private void viewHostel_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewHostel_BtnActionPerformed
        // Verify that the array list is not empty and display object details for each Hostel in the array list
        if (hostelList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No Hostel room recorded.");
        } else {
            for (Hostel h : hostelList) {
                JOptionPane.showMessageDialog(null, h.getDetails());
            }            
        }
    }//GEN-LAST:event_viewHostel_BtnActionPerformed

    private void viewHotel_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewHotel_BtnActionPerformed
        // Verify that the array list is not empty and display object details for each Hotel in the array list
        if (hotelList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No Hotel room recorded.");
        } else {
            for (Hotel h : hotelList) {
                JOptionPane.showMessageDialog(null, h.getDetails());
            }            
        }
    }//GEN-LAST:event_viewHotel_BtnActionPerformed

    private void add_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_BtnActionPerformed
        // Verify that all mandatory fields have been filled
        if (roomID_Tf.getText().equals("") || address_Tf.getText().equals("") || city_Tf.getText().equals("") || price_Tf.getText().equals("") || maxGuests_Tf.getText().equals("") ||
            (optionRadio1_Rb.isSelected() == false && optionRadio2_Rb.isSelected() == false && optionRadio3_Rb.isSelected() == false)) {
            JOptionPane.showMessageDialog(null, "All fields must be filled.");
        // If type = Hotel room, create new object of type Hotel, add it to the array, confirm and clear form
        } else if (roomType_Combo.getSelectedItem().toString().equals("Hotel Room")) {
            Hotel hotel = createHotel();
            JOptionPane.showMessageDialog(null, "***NEW HOTEL ROOM ADDED***\n" + hotel.getDetails());
            hotelList.add(hotel);
            clearForm();
        // If type = Hostel room, create new object of type Hostel, add it to the array, confirm and clear form
        } else if (roomType_Combo.getSelectedItem().toString().equals("Hostel Room")) {
            Hostel hostel = createHostel();
            JOptionPane.showMessageDialog(null, "***NEW HOSTEL ROOM ADDED***\n" + hostel.getDetails());
            hostelList.add(hostel);
            clearForm();
        // If type = B&B room, create new object of type B&B, add it to the array, confirm and clear form
        } else {
            BedAndBreakfast bb = createBB();
            JOptionPane.showMessageDialog(null, "***NEW BED AND BREAKFAST ROOM ADDED***\n" + bb.getDetails());
            bbList.add(bb);
            clearForm();
        }
    }//GEN-LAST:event_add_BtnActionPerformed

    private void option7_CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option7_CheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_option7_CheckActionPerformed

    private void option5_CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option5_CheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_option5_CheckActionPerformed

    private void option1_CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option1_CheckActionPerformed

    }//GEN-LAST:event_option1_CheckActionPerformed

    private void kmCityCentre_TfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kmCityCentre_TfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kmCityCentre_TfActionPerformed

    private void parking_CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parking_CheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parking_CheckActionPerformed

    private void roomID_TfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomID_TfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomID_TfActionPerformed

    private void roomType_ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomType_ComboActionPerformed
        // Set up all form labels if Hotel is selected from combo box
        if (roomType_Combo.getSelectedItem().equals("Hotel Room")) {
            facilitiesHeader_Lbl.setText("Options - Hotel");
            option1_Check.setText("24/7 Reception");
            option2_Check.setText("Room Service");
            option3_Check.setText("Balcony");
            option4_Check.setText("Minibar");
            option5_Check.setText("Bathtub");
            option6_Check.setText("Restaurant");
            option7_Check.setText("Swimming pool");
            option8_Check.setText("Gym");
            optionRadio_Lbl.setText("Bed Type:");
            optionRadio1_Rb.setText("Simple");
            optionRadio2_Rb.setText("Double");
            optionRadio3_Rb.setText("King Size");
        // Set up all form labels if Hostel is selected from combo box
        } else if (roomType_Combo.getSelectedItem().equals("Hostel Room")){
            facilitiesHeader_Lbl.setText("Options - Hostel");
            option1_Check.setText("24/7 Reception");
            option2_Check.setText("Private Rooms");
            option3_Check.setText("Lockers");
            option4_Check.setText("Bar");
            option5_Check.setText("Private Bathroom");
            option6_Check.setText("Shared Kitchen");
            option7_Check.setText("Washing Machine");
            option8_Check.setText("Long Stay Option");
            optionRadio_Lbl.setText("Dormitory Type:");
            optionRadio1_Rb.setText("Female");
            optionRadio2_Rb.setText("Male");
            optionRadio3_Rb.setText("Mixed");
        // Set up all form labels if B&B is selected from combo box
        } else {
            facilitiesHeader_Lbl.setText("Options - Bed & Breakfast");
            option1_Check.setText("Owner Occupied");
            option2_Check.setText("Pet Friendly");
            option3_Check.setText("Kitchen Area");
            option4_Check.setText("Cleaning Option");
            option5_Check.setText("Towels Provided");
            option6_Check.setText("Linen Provided");
            option7_Check.setText("Washing Machine");
            option8_Check.setText("Garden");
            optionRadio_Lbl.setText("Bedrooms:");
            optionRadio1_Rb.setText("1");
            optionRadio2_Rb.setText("2");
            optionRadio3_Rb.setText("3");
        }
    }//GEN-LAST:event_roomType_ComboActionPerformed

    private void searchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnMouseClicked

        SearchGUI s = new SearchGUI();

        // Get the size of the active window
        int sizeH = this.getSize().height;
        int sizeW = this.getSize().width;

        // Get the location of the active window
        int currX = this.getLocation().x;
        int currY = this.getLocation().y;

        // Set the size of the new window
        s.setSize(sizeW, sizeH);

        // Set the location of the new window
        s.setLocation(currX, currY);

        // Hide the active window, show the new window
        this.dispose();

        // Set the window icon
        ImageIcon img = new ImageIcon("img/logo.png");
        s.setIconImage(img.getImage());

        s.setVisible(true);
    }//GEN-LAST:event_searchBtnMouseClicked

    private void bookingsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingsBtnMouseClicked

        BookingsGUI b = new BookingsGUI();

        // Get the size of the active window
        int sizeH = this.getSize().height;
        int sizeW = this.getSize().width;

        // Get the location of the active window
        int currX = this.getLocation().x;
        int currY = this.getLocation().y;

        // Set the size of the new window
        b.setSize(sizeW, sizeH);

        // Set the location of the new window
        b.setLocation(currX, currY);

        // Hide the active window, show the new window
        this.dispose();

        // Set the window icon
        ImageIcon img = new ImageIcon("img/logo.png");
        b.setIconImage(img.getImage());

        b.setVisible(true);
    }//GEN-LAST:event_bookingsBtnMouseClicked

    private void clear_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_BtnActionPerformed
        clearForm();
    }//GEN-LAST:event_clear_BtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RoomGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoomGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_Btn;
    private javax.swing.JLabel address_Lbl;
    private javax.swing.JTextField address_Tf;
    private javax.swing.JButton amend_Btn;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel bookingsBtn;
    private javax.swing.JCheckBox breakfast_Check;
    private javax.swing.JLabel breakfast_Lbl;
    private javax.swing.JLabel city_Lbl;
    private javax.swing.JTextField city_Tf;
    private javax.swing.JButton clear_Btn;
    private javax.swing.JLabel createHeader_Lbl;
    private javax.swing.JButton delete_Btn;
    private javax.swing.JLabel euroSymbol_Lbl;
    private javax.swing.JLabel facilitiesHeader_Lbl;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel kmCityCentre_Lbl;
    private javax.swing.JTextField kmCityCentre_Tf;
    private javax.swing.JLabel manageHeader_Lbl;
    private javax.swing.JLabel manageRoomBtn;
    private javax.swing.JLabel maxGuests_Lbl;
    private javax.swing.JTextField maxGuests_Tf;
    private javax.swing.JLabel mngRoomHeader_Lbl;
    private javax.swing.JLabel name_Lbl;
    private javax.swing.JTextField name_Tf;
    private javax.swing.JCheckBox option1_Check;
    private javax.swing.JCheckBox option2_Check;
    private javax.swing.JCheckBox option3_Check;
    private javax.swing.JCheckBox option4_Check;
    private javax.swing.JCheckBox option5_Check;
    private javax.swing.JCheckBox option6_Check;
    private javax.swing.JCheckBox option7_Check;
    private javax.swing.JCheckBox option8_Check;
    private javax.swing.ButtonGroup optionRadio;
    private javax.swing.JRadioButton optionRadio1_Rb;
    private javax.swing.JRadioButton optionRadio2_Rb;
    private javax.swing.JRadioButton optionRadio3_Rb;
    private javax.swing.JLabel optionRadio_Lbl;
    private javax.swing.JCheckBox parking_Check;
    private javax.swing.JLabel parking_Lbl;
    private javax.swing.JLabel price_Lbl;
    private javax.swing.JTextField price_Tf;
    private javax.swing.JLabel roomID_Lbl;
    private javax.swing.JTextField roomID_Tf;
    private javax.swing.JComboBox<String> roomType_Combo;
    private javax.swing.JLabel roomType_Lbl;
    private javax.swing.JButton save_Btn;
    private javax.swing.JLabel searchBtn;
    private javax.swing.JButton search_Btn;
    private javax.swing.JLabel splitter1;
    private javax.swing.JLabel splitter2;
    private javax.swing.JButton viewBB_Btn;
    private javax.swing.JLabel viewHeader_Lbl;
    private javax.swing.JButton viewHostel_Btn;
    private javax.swing.JButton viewHotel_Btn;
    // End of variables declaration//GEN-END:variables
}
