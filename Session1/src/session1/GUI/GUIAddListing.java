/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package session1.GUI;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.UUID;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import session1.Entity.Amenities;
import session1.Entity.Areas;
import session1.Entity.Attractions;
import session1.Entity.Itemamenities;
import session1.Entity.Itemattractions;
import session1.Entity.Items;
import session1.Entity.Itemtypes;
import session1.SharedData;
import session1.dao.AmenitesDao;
import session1.dao.AreasDao;
import session1.dao.AttractionDao;
import session1.dao.ItemAmeDao;
import session1.dao.ItemAtractDao;
import session1.dao.ItemTypeDao;
import session1.dao.ItemsDao;
import session1.dao.UserDao;

/**
 *
 * @author tienk
 */
public class GUIAddListing extends javax.swing.JFrame {

    private SharedData sharedData;
    private ItemsDao itemsDao = new ItemsDao();
    private UserDao userDao = new UserDao();
    private ItemTypeDao itemTypeDao = new ItemTypeDao();
    private AmenitesDao amenitesDao = new AmenitesDao();
    private ItemAmeDao itemAmeDao = new ItemAmeDao();
    private AttractionDao attractionsDao = new AttractionDao();
    private ItemAtractDao itemattractionsDao = new ItemAtractDao();
    private AreasDao areasDao = new AreasDao();

    private DefaultTableModel defaut = new DefaultTableModel();

    /**
     * Creates new form GUIAddListing
     */
    public GUIAddListing() {
        sharedData = SharedData.getInstance();
        initComponents();
//        amenitiesTable.setModel(defaut);
        List<Itemtypes> its = itemTypeDao.getAll();
        for (Itemtypes it : its) {
            typeCbb.addItem(it.getName());
        }

        List<Amenities> amenitieses = amenitesDao.getAmenities();
        for (int i = 0; i < amenitieses.size(); i++) {
            amenitiesTable.setValueAt(amenitieses.get(i).getName(), i, 0);
        }

        List<Attractions> attractions = attractionsDao.getAttractions();
        for (int i = 0; i < attractions.size(); i++) {
            attractionTable.setValueAt(attractions.get(i).getName(), i, 0);
            attractionTable.setValueAt(attractions.get(i).getAreaID().getName(), i, 1);

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabPane = new javax.swing.JTabbedPane();
        listingPane = new javax.swing.JPanel();
        typeLb = new javax.swing.JLabel();
        typeCbb = new javax.swing.JComboBox<>();
        tittleLb = new javax.swing.JLabel();
        titleTf = new javax.swing.JTextField();
        capLb = new javax.swing.JLabel();
        capSpin = new javax.swing.JSpinner();
        bedsSpin = new javax.swing.JSpinner();
        bedsLb = new javax.swing.JLabel();
        bedroomSpin = new javax.swing.JSpinner();
        bedroomLb = new javax.swing.JLabel();
        badroomSpin = new javax.swing.JSpinner();
        badroomsLb = new javax.swing.JLabel();
        addressLb = new javax.swing.JLabel();
        addressTf = new javax.swing.JTextField();
        address2Lb = new javax.swing.JLabel();
        address2Tf = new javax.swing.JTextField();
        descriptionLb = new javax.swing.JLabel();
        descriptionTf = new javax.swing.JTextField();
        rulesLb = new javax.swing.JLabel();
        ruleTf = new javax.swing.JTextField();
        timeLb = new javax.swing.JLabel();
        minLb = new javax.swing.JLabel();
        minSpin = new javax.swing.JSpinner();
        maxLb = new javax.swing.JLabel();
        maxSpin = new javax.swing.JSpinner();
        amenitiesPane = new javax.swing.JPanel();
        chooseLb = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        amenitiesTable = new javax.swing.JTable();
        distancePane = new javax.swing.JPanel();
        noteLb = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        attractionTable = new javax.swing.JTable();
        nextBtn = new javax.swing.JButton();
        finishBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 600));

        tabPane.setPreferredSize(new java.awt.Dimension(1000, 400));

        listingPane.setPreferredSize(new java.awt.Dimension(1000, 500));

        typeLb.setText("Type:");

        tittleLb.setText("Tittle:");

        titleTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleTfActionPerformed(evt);
            }
        });

        capLb.setText("Capacity");

        bedsLb.setText("Number of Beds");

        bedroomLb.setText("Number of Bedrooms");

        badroomsLb.setText("Number of Badrooms");

        addressLb.setText("Approximate Address:");

        addressTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTfActionPerformed(evt);
            }
        });

        address2Lb.setText("Exact Address:");

        address2Tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address2TfActionPerformed(evt);
            }
        });

        descriptionLb.setText("Description");

        descriptionTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionTfActionPerformed(evt);
            }
        });

        rulesLb.setText("Host Rules");

        timeLb.setText("Reservation Time (Nights):");

        minLb.setText("Minium");

        maxLb.setText("Maximum");

        javax.swing.GroupLayout listingPaneLayout = new javax.swing.GroupLayout(listingPane);
        listingPane.setLayout(listingPaneLayout);
        listingPaneLayout.setHorizontalGroup(
            listingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listingPaneLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(listingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, listingPaneLayout.createSequentialGroup()
                        .addGroup(listingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(typeLb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(capLb))
                        .addGap(48, 48, 48)
                        .addGroup(listingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(listingPaneLayout.createSequentialGroup()
                                .addComponent(capSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(bedsLb)
                                .addGap(18, 18, 18)
                                .addComponent(bedsSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(bedroomLb)
                                .addGap(29, 29, 29)
                                .addComponent(bedroomSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57))
                            .addGroup(listingPaneLayout.createSequentialGroup()
                                .addComponent(typeCbb, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tittleLb, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)))
                        .addGroup(listingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(listingPaneLayout.createSequentialGroup()
                                .addComponent(badroomsLb)
                                .addGap(34, 34, 34)
                                .addComponent(badroomSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(titleTf, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, listingPaneLayout.createSequentialGroup()
                        .addGroup(listingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(listingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(listingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(listingPaneLayout.createSequentialGroup()
                                        .addGroup(listingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(address2Lb)
                                            .addComponent(descriptionLb))
                                        .addGap(149, 149, 149))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listingPaneLayout.createSequentialGroup()
                                        .addComponent(rulesLb)
                                        .addGap(188, 188, 188)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listingPaneLayout.createSequentialGroup()
                                    .addComponent(timeLb)
                                    .addGap(105, 105, 105)))
                            .addGroup(listingPaneLayout.createSequentialGroup()
                                .addComponent(addressLb)
                                .addGap(127, 127, 127)))
                        .addGroup(listingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressTf)
                            .addGroup(listingPaneLayout.createSequentialGroup()
                                .addComponent(minLb)
                                .addGap(51, 51, 51)
                                .addComponent(minSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)
                                .addComponent(maxLb)
                                .addGap(51, 51, 51)
                                .addComponent(maxSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(address2Tf)
                            .addComponent(descriptionTf)
                            .addComponent(ruleTf))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        listingPaneLayout.setVerticalGroup(
            listingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listingPaneLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(listingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeLb)
                    .addComponent(typeCbb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tittleLb)
                    .addComponent(titleTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(listingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capLb)
                    .addComponent(capSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(badroomsLb)
                    .addComponent(badroomSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bedroomLb)
                    .addComponent(bedroomSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bedsLb)
                    .addComponent(bedsSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(listingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLb)
                    .addComponent(addressTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(listingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address2Lb)
                    .addComponent(address2Tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(listingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descriptionLb)
                    .addComponent(descriptionTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(listingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rulesLb)
                    .addComponent(ruleTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(listingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(maxLb)
                        .addComponent(maxSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(listingPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(timeLb)
                        .addComponent(minLb)
                        .addComponent(minSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        tabPane.addTab("Listing Details", listingPane);

        chooseLb.setText("Choose Available Amenities:");

        amenitiesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null,  new Boolean(false)},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Amenity", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(amenitiesTable);

        javax.swing.GroupLayout amenitiesPaneLayout = new javax.swing.GroupLayout(amenitiesPane);
        amenitiesPane.setLayout(amenitiesPaneLayout);
        amenitiesPaneLayout.setHorizontalGroup(
            amenitiesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(amenitiesPaneLayout.createSequentialGroup()
                .addGroup(amenitiesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(amenitiesPaneLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(chooseLb))
                    .addGroup(amenitiesPaneLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(519, Short.MAX_VALUE))
        );
        amenitiesPaneLayout.setVerticalGroup(
            amenitiesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(amenitiesPaneLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(chooseLb)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        tabPane.addTab("Amenites", amenitiesPane);

        noteLb.setText("Specify the distance from each close by attraction and the time it takes to get to them: ");

        attractionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Attraction", "Area", "Distance (km)", "On Foot (minutes)", "By Car (minutes)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(attractionTable);

        javax.swing.GroupLayout distancePaneLayout = new javax.swing.GroupLayout(distancePane);
        distancePane.setLayout(distancePaneLayout);
        distancePaneLayout.setHorizontalGroup(
            distancePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(distancePaneLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(distancePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(noteLb, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(295, Short.MAX_VALUE))
        );
        distancePaneLayout.setVerticalGroup(
            distancePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(distancePaneLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(noteLb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        tabPane.addTab("Distance to Attraction", distancePane);

        nextBtn.setText("Next");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        finishBtn.setText("Finish");
        finishBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nextBtn)
                .addGap(30, 30, 30)
                .addComponent(finishBtn)
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabPane, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextBtn)
                    .addComponent(finishBtn))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void titleTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleTfActionPerformed

    private void addressTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTfActionPerformed

    private void address2TfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_address2TfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_address2TfActionPerformed

    private void descriptionTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionTfActionPerformed

    private void finishBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishBtnActionPerformed
        List<Items> items = itemsDao.findAll();

        Items item = new Items();
        item.setId(items.get(items.size() - 1).getId() + 1);
        item.setGuid(UUID.randomUUID().toString());
        item.setUserID(userDao.getUser(sharedData.getUsername()));
        item.setItemTypeID(itemTypeDao.getItemtypes(typeCbb.getSelectedItem().toString()));

        int rowCount2 = attractionTable.getRowCount();
        double minDistance = Double.MAX_VALUE;
        for (int row = 0; row < rowCount2; row++) {
            boolean checked = (attractionTable.getValueAt(row, 2) != null);
            if (checked) {
                Double value1 = (Double) attractionTable.getValueAt(row, 2);

                if (value1 <= minDistance) {
                    minDistance = value1;
                }
            }
        }
        
        for (int row = 0; row < rowCount2; row++) {
            boolean checked = (attractionTable.getValueAt(row, 2) != null);
            if (checked && (Double) attractionTable.getValueAt(row, 2) == minDistance) {
                item.setAreaID(areasDao.getArea((String) attractionTable.getValueAt(row, 1)));
                break;
            }
        }
        item.setTitle(titleTf.getText());
        item.setCapacity((int) capSpin.getValue());
        item.setNumberOfBeds((int) bedsSpin.getValue());
        item.setNumberOfBedrooms((int) bedroomSpin.getValue());
        item.setNumberOfBathrooms((int) badroomSpin.getValue());
        item.setExactAddress(addressTf.getText());
        item.setApproximateAddress(address2Tf.getText());
        item.setDescription(descriptionTf.getText());
        item.setHostRules(ruleTf.getText());
        item.setMinimumNights((int) minSpin.getValue());
        item.setMaximumNights((int) maxSpin.getValue());

        itemsDao.addItems(item);
        int rowCount = amenitiesTable.getRowCount();
        for (int row = 0; row < rowCount; row++) {
            boolean checked = (amenitiesTable.getValueAt(row, 1) != null);

            if (checked) {
                List<Itemamenities> itemamenitieses = itemAmeDao.getItemamenitieses();

                String value = (String) amenitiesTable.getValueAt(row, 0);
                Itemamenities ia = new Itemamenities();
                ia.setId(itemamenitieses.get(itemamenitieses.size() - 1).getId() + 1);
                ia.setGuid(UUID.randomUUID().toString());
                ia.setItemID(item);
                ia.setAmenityID(amenitesDao.getAmenity(value));
                itemAmeDao.add(ia);
            }
        }

        for (int row = 0; row < rowCount2; row++) {
            boolean checked = (attractionTable.getValueAt(row, 2) != null || attractionTable.getValueAt(row, 3) != null || attractionTable.getValueAt(row, 4) != null);
            if (checked) {
                Double value1 = (Double) attractionTable.getValueAt(row, 2);
                Integer value2 = (Integer) attractionTable.getValueAt(row, 3);
                Integer value3 = (Integer) attractionTable.getValueAt(row, 4);
                List<Itemattractions> itemattractions = this.itemattractionsDao.getItemAttractions();

                Itemattractions iat = new Itemattractions();
                iat.setId(itemattractions.get(itemattractions.size() - 1).getId() + 1);
                iat.setGuid(UUID.randomUUID().toString());
                iat.setItemID(item);
                iat.setAttractionID(attractionsDao.getAttraction(attractionTable.getValueAt(row, 0).toString()));
                iat.setDistance(value1 == null ? null : BigDecimal.valueOf(value1));
                iat.setDurationOnFoot(value2 == null ? null : BigInteger.valueOf(value2));
                iat.setDurationByCar(value3 == null ? null : BigInteger.valueOf(value3));

                itemattractionsDao.addItemAtract(iat);
            }

        }

        JOptionPane.showMessageDialog(null, "Success!", "ADD SUCCESS", JOptionPane.INFORMATION_MESSAGE);


    }//GEN-LAST:event_finishBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        int next = (tabPane.getSelectedIndex() + 1) % tabPane.getTabCount();
        tabPane.setSelectedIndex(next);
    }//GEN-LAST:event_nextBtnActionPerformed

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
            java.util.logging.Logger.getLogger(GUIAddListing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIAddListing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIAddListing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIAddListing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIAddListing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address2Lb;
    private javax.swing.JTextField address2Tf;
    private javax.swing.JLabel addressLb;
    private javax.swing.JTextField addressTf;
    private javax.swing.JPanel amenitiesPane;
    private javax.swing.JTable amenitiesTable;
    private javax.swing.JTable attractionTable;
    private javax.swing.JSpinner badroomSpin;
    private javax.swing.JLabel badroomsLb;
    private javax.swing.JLabel bedroomLb;
    private javax.swing.JSpinner bedroomSpin;
    private javax.swing.JLabel bedsLb;
    private javax.swing.JSpinner bedsSpin;
    private javax.swing.JLabel capLb;
    private javax.swing.JSpinner capSpin;
    private javax.swing.JLabel chooseLb;
    private javax.swing.JLabel descriptionLb;
    private javax.swing.JTextField descriptionTf;
    private javax.swing.JPanel distancePane;
    private javax.swing.JButton finishBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel listingPane;
    private javax.swing.JLabel maxLb;
    private javax.swing.JSpinner maxSpin;
    private javax.swing.JLabel minLb;
    private javax.swing.JSpinner minSpin;
    private javax.swing.JButton nextBtn;
    private javax.swing.JLabel noteLb;
    private javax.swing.JTextField ruleTf;
    private javax.swing.JLabel rulesLb;
    private javax.swing.JTabbedPane tabPane;
    private javax.swing.JLabel timeLb;
    private javax.swing.JTextField titleTf;
    private javax.swing.JLabel tittleLb;
    private javax.swing.JComboBox<String> typeCbb;
    private javax.swing.JLabel typeLb;
    // End of variables declaration//GEN-END:variables
}
