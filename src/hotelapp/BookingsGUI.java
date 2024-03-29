/*
 * Author: Dejan Mijakovac
 * Student number: 18144861
 */
package hotelapp;

// imports for different reading and writing from file, calendar, array lists and GUI items like JOptionPane
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Properties;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.UtilDateModel;

public class BookingsGUI extends javax.swing.JFrame {

    private ArrayList<ManageBooking> aList;
    private String bookingID, fName, lName, checkInDate, checkOutDate, hotelName, roomID;
    private int peopleNo, nights;
    private double totalPrice;
    private int count;
    private UtilDateModel model;
    private DatePicker checkInDatePicker;
    private DatePicker checkOutDatePicker;
    private boolean checkInCalendarState;
    private boolean checkOutCalendarState;

    public BookingsGUI() {
        initComponents();
        aList = new ArrayList<>();
        bookingID = new String();
        fName = new String();
        lName = new String();
        checkInDate = new String();
        checkOutDate = new String();
        hotelName = new String();
        peopleNo = 0;
        nights = 0;
        totalPrice = 0.0;
        roomID = new String();
        count = 0;

        // setting up calendar for picking dates when changing previous booking
        model = new UtilDateModel();
        checkInDatePicker = new DatePicker();
        checkOutDatePicker = new DatePicker();
        checkInCalendarState = false;
        checkOutCalendarState = false;
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
        backgroundPanel.add(datePanel);
        backgroundPanel.revalidate();
        backgroundPanel.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                checkInCalendarState = false;
                checkInDatePicker.dispose();
                checkOutCalendarState = false;
                checkOutDatePicker.dispose();
            }

        });
    }

    public BookingsGUI(String checkInDate, String checkOutDate, String hotelName, int peopleNo, int nights, double totalPrice, String roomID) {
        this();
        this.checkInDate = checkInDate;
        checkInDateInputLbl.setText(checkInDate);
        checkOutDateInputLbl.setText(checkOutDate);
        this.checkOutDate = checkOutDate;
        this.hotelName = hotelName;
        hotelInputLbl.setText(hotelName);
        this.peopleNo = peopleNo;
        peopleInputLbl.setText(String.valueOf(peopleNo));
        this.nights = nights;
        nightsInputLbl.setText(String.valueOf(nights));
        this.totalPrice = totalPrice;
        priceInputLbl.setText(String.valueOf(totalPrice));
        this.roomID = roomID;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        backgroundPanel = new javax.swing.JPanel();
        heaherPanel = new javax.swing.JPanel();
        manageRoomBtn = new javax.swing.JLabel();
        splitter1 = new javax.swing.JLabel();
        bookingsBtn = new javax.swing.JLabel();
        splitter2 = new javax.swing.JLabel();
        searchBtn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ManageBookingLbl = new javax.swing.JLabel();
        fNameLbl = new javax.swing.JLabel();
        lNameLbl = new javax.swing.JLabel();
        hotelNameLbl = new javax.swing.JLabel();
        peopleNoLbl = new javax.swing.JLabel();
        nightsLbl = new javax.swing.JLabel();
        checkInDateLbl = new javax.swing.JLabel();
        checkOutDateLbl = new javax.swing.JLabel();
        totalPriceLbl = new javax.swing.JLabel();
        BookBtn = new javax.swing.JButton();
        fNameTf = new javax.swing.JTextField();
        lNameTf = new javax.swing.JTextField();
        retrieveLbl = new javax.swing.JLabel();
        bookingIDLbl = new javax.swing.JLabel();
        bookingIDTf = new javax.swing.JTextField();
        checkLastNameLbl = new javax.swing.JLabel();
        checkLastNameTf = new javax.swing.JTextField();
        fName2Tf = new javax.swing.JTextField();
        fName2Lbl = new javax.swing.JLabel();
        hotelNameLbl2 = new javax.swing.JLabel();
        peopleNo2Lbl = new javax.swing.JLabel();
        nights2Lbl = new javax.swing.JLabel();
        checkOutDateTf = new javax.swing.JTextField();
        totalPrice2Lbl = new javax.swing.JLabel();
        hotelNameTf = new javax.swing.JTextField();
        peopleNoTf = new javax.swing.JTextField();
        nightsTf = new javax.swing.JTextField();
        checkInDateTf = new javax.swing.JTextField();
        getBookingBtn = new javax.swing.JButton();
        amendBookingBtn = new javax.swing.JButton();
        delBookingBtn = new javax.swing.JButton();
        euro1Lbl = new javax.swing.JLabel();
        euro2Lbl = new javax.swing.JLabel();
        date1Btn = new javax.swing.JButton();
        date2Btn = new javax.swing.JButton();
        hotelInputLbl = new javax.swing.JLabel();
        peopleInputLbl = new javax.swing.JLabel();
        nightsInputLbl = new javax.swing.JLabel();
        checkInDateInputLbl = new javax.swing.JLabel();
        checkOutDateInputLbl = new javax.swing.JLabel();
        priceInputLbl = new javax.swing.JLabel();
        priceInput2Lbl = new javax.swing.JLabel();

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

        heaherPanel.setBackground(new java.awt.Color(153, 0, 51));
        heaherPanel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        manageRoomBtn.setFont(new java.awt.Font("FreeSans", 0, 24)); // NOI18N
        manageRoomBtn.setForeground(new java.awt.Color(255, 255, 204));
        manageRoomBtn.setText("Manage Room");
        manageRoomBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageRoomBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageRoomBtnMouseClicked(evt);
            }
        });

        splitter1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        splitter1.setForeground(new java.awt.Color(255, 255, 204));
        splitter1.setText("|");

        bookingsBtn.setFont(new java.awt.Font("FreeSans", 0, 24)); // NOI18N
        bookingsBtn.setForeground(new java.awt.Color(250, 250, 250));
        bookingsBtn.setText("Bookings");
        bookingsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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

        javax.swing.GroupLayout heaherPanelLayout = new javax.swing.GroupLayout(heaherPanel);
        heaherPanel.setLayout(heaherPanelLayout);
        heaherPanelLayout.setHorizontalGroup(
            heaherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(heaherPanelLayout.createSequentialGroup()
                .addGroup(heaherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(heaherPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(heaherPanelLayout.createSequentialGroup()
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
        heaherPanelLayout.setVerticalGroup(
            heaherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, heaherPanelLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(heaherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manageRoomBtn)
                    .addComponent(splitter1)
                    .addComponent(bookingsBtn)
                    .addComponent(splitter2)
                    .addComponent(searchBtn))
                .addContainerGap())
            .addGroup(heaherPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ManageBookingLbl.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ManageBookingLbl.setText("Fill in your first and last name and review your booking");

        fNameLbl.setText("First name:");

        lNameLbl.setText("Last name:");

        hotelNameLbl.setText("Hotel:");

        peopleNoLbl.setText("Number of people:");

        nightsLbl.setText("Number of nights:");

        checkInDateLbl.setText("Check in date:");

        checkOutDateLbl.setText("Check out date:");

        totalPriceLbl.setText("Price:");

        BookBtn.setText("Book");
        BookBtn.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder())));
        BookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookBtnActionPerformed(evt);
            }
        });

        retrieveLbl.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        retrieveLbl.setText("Retrieve your booking");

        bookingIDLbl.setText("Booking ID:");

        checkLastNameLbl.setText("Last name:");

        fName2Lbl.setText("First Name:");

        hotelNameLbl2.setText("Hotel:");

        peopleNo2Lbl.setText("Number of People:");

        nights2Lbl.setText("Number of nights:");

        totalPrice2Lbl.setText("Price: ");

        getBookingBtn.setText("Get booking info");
        getBookingBtn.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        getBookingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getBookingBtnActionPerformed(evt);
            }
        });

        amendBookingBtn.setText("Amend booking");
        amendBookingBtn.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        amendBookingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amendBookingBtnActionPerformed(evt);
            }
        });

        delBookingBtn.setText("Delete booking");
        delBookingBtn.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        delBookingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBookingBtnActionPerformed(evt);
            }
        });

        euro1Lbl.setText("€");

        euro2Lbl.setText("€");

        date1Btn.setText("Check in date");
        date1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date1BtnActionPerformed(evt);
            }
        });

        date2Btn.setText("Checkout date");
        date2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date2BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(heaherPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ManageBookingLbl)
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(hotelNameLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lNameLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(fNameLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                                    .addComponent(peopleNoLbl)
                                    .addComponent(nightsLbl)
                                    .addComponent(checkInDateLbl)
                                    .addComponent(checkOutDateLbl)
                                    .addComponent(totalPriceLbl))
                                .addGap(21, 21, 21)
                                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fNameTf, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                    .addComponent(lNameTf)
                                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                                        .addComponent(priceInputLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(euro1Lbl))
                                    .addComponent(hotelInputLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(peopleInputLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nightsInputLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(checkInDateInputLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(checkOutDateInputLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(BookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(retrieveLbl)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookingIDLbl)
                            .addComponent(checkLastNameLbl)
                            .addComponent(fName2Lbl)
                            .addComponent(hotelNameLbl2)
                            .addComponent(peopleNo2Lbl)
                            .addComponent(nights2Lbl))
                        .addGap(30, 30, 30)
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(checkInDateTf, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(checkOutDateTf)
                            .addComponent(nightsTf)
                            .addComponent(checkLastNameTf)
                            .addComponent(peopleNoTf)
                            .addComponent(hotelNameTf)
                            .addComponent(fName2Tf)
                            .addComponent(bookingIDTf)))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addComponent(totalPrice2Lbl)
                        .addGap(94, 94, 94)
                        .addComponent(priceInput2Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(euro2Lbl))
                    .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(date2Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(date1Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(28, 28, 28)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(delBookingBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getBookingBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amendBookingBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 272, Short.MAX_VALUE))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addComponent(heaherPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ManageBookingLbl)
                    .addComponent(retrieveLbl))
                .addGap(18, 18, 18)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookingIDTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookingIDLbl))
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lNameLbl)
                            .addComponent(lNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkLastNameLbl)
                            .addComponent(checkLastNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hotelNameLbl)
                            .addComponent(fName2Tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fName2Lbl)
                            .addComponent(hotelInputLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(getBookingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(peopleInputLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(peopleNoLbl)
                                .addComponent(hotelNameLbl2)
                                .addComponent(hotelNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nightsInputLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nightsLbl)
                                .addComponent(peopleNo2Lbl)
                                .addComponent(peopleNoTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(delBookingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkInDateLbl)
                            .addComponent(nights2Lbl)
                            .addComponent(nightsTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkInDateInputLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkOutDateLbl)
                            .addComponent(checkInDateTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date1Btn)
                            .addComponent(checkOutDateInputLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(amendBookingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalPriceLbl)
                    .addComponent(checkOutDateTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(euro1Lbl)
                    .addComponent(date2Btn)
                    .addComponent(priceInputLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalPrice2Lbl)
                    .addComponent(euro2Lbl)
                    .addComponent(BookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceInput2Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
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

    private void manageRoomBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageRoomBtnMouseClicked

        //switch to the Manage Rooms tab
        RoomGUI r = new RoomGUI();

        // Get the size of the active window
        int sizeH = this.getSize().height;
        int sizeW = this.getSize().width;

        // Get the location of the active window
        int currX = this.getLocation().x;
        int currY = this.getLocation().y;

        // Set the size of the new window
        r.setSize(sizeW, sizeH);

        // Set the location of the new window
        r.setLocation(currX, currY);

        // Hide the active window, show the new window
        this.dispose();

        // Set the window icon
        ImageIcon img = new ImageIcon("img/logo.png");
        r.setIconImage(img.getImage());

        r.setVisible(true);

    }//GEN-LAST:event_manageRoomBtnMouseClicked

    private void searchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnMouseClicked

        // switches to the search tab
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

    private void BookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookBtnActionPerformed

        // checks that the user does not submit and empty form
        if (fNameTf.getText().equals("") || lNameTf.getText().equals("") || checkInDateInputLbl.getText().equals("") || checkOutDateInputLbl.getText().equals("")
                || hotelInputLbl.getText().equals("") || peopleInputLbl.getText().equals("") || nightsInputLbl.getText().equals("") || priceInputLbl.getText().equals("")) {
            System.out.println(peopleInputLbl.getText().equals(""));
            JOptionPane.showMessageDialog(null, "You need to enter all the details in order to confirm booking");
        } else {

            // gets the text from the text fields (for the first and last name) and labels for the items passed from the search part of the app
            bookingID = Integer.toString((int) (Math.random() * 1000000));
            fName = fNameTf.getText();
            lName = lNameTf.getText();
            checkInDate = checkInDateInputLbl.getText();
            checkOutDate = checkOutDateInputLbl.getText();
            hotelName = hotelInputLbl.getText();
            peopleNo = Integer.parseInt(peopleInputLbl.getText());
            nights = Integer.parseInt(nightsInputLbl.getText());
            totalPrice = Double.parseDouble(priceInputLbl.getText());
            roomID = Integer.toString((int) (Math.random() * 1000000));

            // sets up the array and saves the information into an array list
            ManageBooking mb = new ManageBooking();

            mb.setBookingID(bookingID);
            mb.setfName(fName);
            mb.setlName(lName);
            mb.setCheckInDate(checkInDate);
            mb.setCheckOutDate(checkOutDate);
            mb.setHotelName(hotelName);
            mb.setPeopleNo(peopleNo);
            mb.setNights(nights);
            mb.setTotalPrice(totalPrice);
            mb.setRoomID(roomID);

            // passing the booking information into the file - booking.data
            File outFile;
            FileOutputStream fStream;
            ObjectOutputStream oStream;
            aList.add(mb);
            count++;

            try {

                outFile = new File("booking.data");
                fStream = new FileOutputStream(outFile);
                oStream = new ObjectOutputStream(fStream);

                oStream.writeObject(aList);

                JOptionPane.showMessageDialog(null, "Yout booking ID is " + mb.getBookingID());

                oStream.close();

            } catch (IOException e) {
                System.out.println("Error while booking" + e);
            }

    }//GEN-LAST:event_BookBtnActionPerformed
    }
    private void getBookingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getBookingBtnActionPerformed

        // checks that the user submits both last name and the booking ID
        if (bookingIDTf.getText().equals("") || checkLastNameTf.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "You need to enter booking ID and last name to get the result");
        } else {

            // placing the information from the text box into variables
            String checkBookingID = bookingIDTf.getText();
            String checkLastName = checkLastNameTf.getText();

            // fetching the information from the file
            File inFile;
            FileInputStream fStream;
            ObjectInputStream oStream;

            try {
                inFile = new File("booking.data");
                fStream = new FileInputStream(inFile);
                oStream = new ObjectInputStream(fStream);

                // setting up array list so it can be looped through
                ArrayList<ManageBooking> xList;

                xList = (ArrayList<ManageBooking>) oStream.readObject();

                // setting up boolean to check for false / true values
                boolean found = false;

                // looping through the list to match booking id and last name and setting the values found in the file to show in text fields
                for (ManageBooking x : xList) {
                    for (int i = 0; i < xList.size(); i++) {
                        if (checkBookingID.equalsIgnoreCase(x.getBookingID()) && checkLastName.equalsIgnoreCase(x.getlName())) {

                            found = true;

                            fName2Tf.setText(x.getfName());
                            checkInDateTf.setText(x.getCheckInDate());
                            checkOutDateTf.setText(x.getCheckOutDate());
                            hotelNameTf.setText(x.getHotelName());
                            peopleNoTf.setText(Integer.toString(x.getPeopleNo()));
                            nightsTf.setText(Integer.toString(x.getNights()));
                            priceInput2Lbl.setText(Double.toString(x.getTotalPrice()));
                            break;
                        }
                    }
                }

                // in case there are no matching details, this message displays
                if (!found) {

                    JOptionPane.showMessageDialog(null, "Booking not found.");

                }

                oStream.close();

            } catch (IOException e) {
                System.out.println(e);
            } catch (ClassNotFoundException x) {
                System.out.println(x);
            }

        }
    }//GEN-LAST:event_getBookingBtnActionPerformed

    private void amendBookingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amendBookingBtnActionPerformed

        ArrayList<ManageBooking> aList = new ArrayList<>();

        // placing the information from the text box into variables
        String checkBookingID = bookingIDTf.getText();
        String checkLastName = checkLastNameTf.getText();
        boolean found1 = false;                 // setting up boolean to check for false / true values

        // checks that the user submits both last name and the booking ID
        if (bookingIDTf.getText().equals("") || checkLastNameTf.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "You need to enter booking ID and last name to get the result");
        } else {

            //reads from the file 
            File inFile;
            FileInputStream fStream;
            ObjectInputStream oStream;

            try {
                inFile = new File("booking.data");
                fStream = new FileInputStream(inFile);
                oStream = new ObjectInputStream(fStream);

                aList = (ArrayList<ManageBooking>) oStream.readObject();

                // loops through the array in order to match the booking according to booking id and last name
                for (int i = 0; i < aList.size(); i++) {
                    if (checkBookingID.equalsIgnoreCase(aList.get(i).getBookingID()) && checkLastName.equalsIgnoreCase(aList.get(i).getlName())) {

                        // once booking found, that booking is deleted from the system
                        found1 = true;
                        aList.remove(i);

                        // new booking information generated by pulling information from the text fields
                        fName = fName2Tf.getText();
                        lName = checkLastNameTf.getText();
                        checkInDate = checkInDateTf.getText();
                        checkOutDate = checkOutDateTf.getText();
                        hotelName = hotelNameTf.getText();
                        peopleNo = Integer.parseInt(peopleNoTf.getText());
                        nights = Integer.parseInt(nightsTf.getText());
                        bookingID = Integer.toString((int) (Math.random() * 1000000));

                        // sets up the array and saves the information into an array list
                        ManageBooking mb = new ManageBooking();
                        mb.setfName(fName);
                        mb.setlName(lName);
                        mb.setCheckInDate(checkInDate);
                        mb.setCheckOutDate(checkOutDate);
                        mb.setHotelName(hotelName);
                        mb.setPeopleNo(peopleNo);
                        mb.setNights(nights);
                        mb.setBookingID(bookingID);
                        aList.add(mb);
                        JOptionPane.showMessageDialog(null, "Your booking was amended. Refunds or additional payments are made whecn checking in. Your new booking ID is: " + bookingID);

                    }
                }

                // in case there are no matching details, this message displays
                if (!found1) {

                    JOptionPane.showMessageDialog(null, "Booking not found.");

                }

            } catch (IOException e) {
                System.out.println(e);
            } catch (ClassNotFoundException x) {
                System.out.println(x);
            }

            // passing the new booking information into the file - booking.data
            File outFile;
            FileOutputStream ffStream;
            ObjectOutputStream ooStream;

            try {

                outFile = new File("booking.data");
                ffStream = new FileOutputStream(outFile);
                ooStream = new ObjectOutputStream(ffStream);

                ooStream.writeObject(aList);

                ooStream.close();

            } catch (IOException e) {
                System.out.println("Error while amending booking" + e);
            }
    }//GEN-LAST:event_amendBookingBtnActionPerformed
    }
    private void delBookingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBookingBtnActionPerformed

        // checks that the user submits both last name and the booking ID
        boolean found2 = false;                // setting up boolean to check for false / true values

        if (bookingIDTf.getText().equals("") || checkLastNameTf.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "You need to enter booking ID and last name to get the result");
        } else {
            ArrayList<ManageBooking> aList = new ArrayList<>();

            // placing the information from the text box into variables
            String checkBookingID = bookingIDTf.getText();
            String checkLastName = checkLastNameTf.getText();

            //reading from the file
            File inFile;
            FileInputStream fStream;
            ObjectInputStream oStream;

            try {
                inFile = new File("booking.data");
                fStream = new FileInputStream(inFile);
                oStream = new ObjectInputStream(fStream);

                // looping through the array and removing the targetted item
                aList = (ArrayList<ManageBooking>) oStream.readObject();

                for (int i = 0; i < aList.size(); i++) {
                    if (checkBookingID.equalsIgnoreCase(aList.get(i).getBookingID()) && checkLastName.equalsIgnoreCase(aList.get(i).getlName())) {
                        found2 = true;
                        aList.remove(i);
                        JOptionPane.showMessageDialog(null, "Your booking was deleted");

                    }
                }

                // in case there are no matching details, this message displays
                if (!found2) {

                    JOptionPane.showMessageDialog(null, "Booking not found.");

                }

            } catch (IOException e) {
                System.out.println(e);
            } catch (ClassNotFoundException x) {
                System.out.println(x);
            }

            // saving changes to the file
            File outFile;
            FileOutputStream ffStream;
            ObjectOutputStream ooStream;

            try {

                outFile = new File("booking.data");
                ffStream = new FileOutputStream(outFile);
                ooStream = new ObjectOutputStream(ffStream);

                ooStream.writeObject(aList); //aList for the arraylist

                ooStream.close();

            } catch (IOException e) {
                System.out.println("Error while amending booking" + e);
            }

        }

    }//GEN-LAST:event_delBookingBtnActionPerformed

    private void date1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date1BtnActionPerformed

        checkInDatePicker.dispose();
        checkOutDatePicker.dispose();
        if (!checkInCalendarState || checkOutCalendarState) {
            checkInCalendarState = true;
            checkOutCalendarState = false;
            checkInDatePicker.setUndecorated(true);
            checkInDatePicker.setLocation(date1Btn.getLocation().x + this.getLocation().x - 250, date1Btn.getLocation().y + this.getLocation().y);
            checkInDatePicker.setVisible(true);
            checkInDatePicker.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                    checkInDateTf.setText(checkInDatePicker.getSelectedDate());
                    checkInDateTf.revalidate();
                }

            });
        } else {
            checkInCalendarState = false;
            checkInDatePicker.dispose();
        }


    }//GEN-LAST:event_date1BtnActionPerformed

    private void date2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date2BtnActionPerformed

        checkOutDatePicker.dispose();
        checkInDatePicker.dispose();
        if (checkInCalendarState || !checkOutCalendarState) {
            checkOutCalendarState = true;
            checkInCalendarState = false;
            checkOutDatePicker.setUndecorated(true);
            checkOutDatePicker.setLocation(date2Btn.getLocation().x + this.getLocation().x - 250, date2Btn.getLocation().y + this.getLocation().y);
            checkOutDatePicker.setVisible(true);
            checkOutDatePicker.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                    checkOutDateTf.setText(checkOutDatePicker.getSelectedDate());
                    checkOutDateTf.revalidate();
                }

            });
        } else {
            checkOutCalendarState = false;
            checkOutDatePicker.dispose();
        }


    }//GEN-LAST:event_date2BtnActionPerformed

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
            java.util.logging.Logger.getLogger(BookingsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BookBtn;
    private javax.swing.JLabel ManageBookingLbl;
    private javax.swing.JButton amendBookingBtn;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel bookingIDLbl;
    private javax.swing.JTextField bookingIDTf;
    private javax.swing.JLabel bookingsBtn;
    private javax.swing.JLabel checkInDateInputLbl;
    private javax.swing.JLabel checkInDateLbl;
    private javax.swing.JTextField checkInDateTf;
    private javax.swing.JLabel checkLastNameLbl;
    private javax.swing.JTextField checkLastNameTf;
    private javax.swing.JLabel checkOutDateInputLbl;
    private javax.swing.JLabel checkOutDateLbl;
    private javax.swing.JTextField checkOutDateTf;
    private javax.swing.JButton date1Btn;
    private javax.swing.JButton date2Btn;
    private javax.swing.JButton delBookingBtn;
    private javax.swing.JLabel euro1Lbl;
    private javax.swing.JLabel euro2Lbl;
    private javax.swing.JLabel fName2Lbl;
    private javax.swing.JTextField fName2Tf;
    private javax.swing.JLabel fNameLbl;
    private javax.swing.JTextField fNameTf;
    private javax.swing.JButton getBookingBtn;
    private javax.swing.JPanel heaherPanel;
    private javax.swing.JLabel hotelInputLbl;
    private javax.swing.JLabel hotelNameLbl;
    private javax.swing.JLabel hotelNameLbl2;
    private javax.swing.JTextField hotelNameTf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lNameLbl;
    private javax.swing.JTextField lNameTf;
    private javax.swing.JLabel manageRoomBtn;
    private javax.swing.JLabel nights2Lbl;
    private javax.swing.JLabel nightsInputLbl;
    private javax.swing.JLabel nightsLbl;
    private javax.swing.JTextField nightsTf;
    private javax.swing.JLabel peopleInputLbl;
    private javax.swing.JLabel peopleNo2Lbl;
    private javax.swing.JLabel peopleNoLbl;
    private javax.swing.JTextField peopleNoTf;
    private javax.swing.JLabel priceInput2Lbl;
    private javax.swing.JLabel priceInputLbl;
    private javax.swing.JLabel retrieveLbl;
    private javax.swing.JLabel searchBtn;
    private javax.swing.JLabel splitter1;
    private javax.swing.JLabel splitter2;
    private javax.swing.JLabel totalPrice2Lbl;
    private javax.swing.JLabel totalPriceLbl;
    // End of variables declaration//GEN-END:variables
}
