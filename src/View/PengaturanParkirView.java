package View;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Kemal Crisannaufal
 */

/**
 * Import.
 */
import Controller.PengaturanParkirController;
import Model.PengaturanParkir;
import java.awt.Color;
import java.awt.Font;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * Main Pengaturan Parkir window of the application.
 */
public class PengaturanParkirView extends javax.swing.JFrame {

    private final PengaturanParkirController pengaturanC = new PengaturanParkirController(); //An instance of PengaturanParkirController used to manage parking configuration logic.
    
    /**
     * Variables storing the parking configuration values for motorcycles and cars,
     * They are initialized with default values from the PengaturanParkir object if the object is not null.
     */
    private int kuotaMotor = (pengaturanC.getPengaturanParkir() != null) ? pengaturanC.getPengaturanParkir().getKuotaParkirMotor() : 0;
    private int kuotaMobil = (pengaturanC.getPengaturanParkir() != null) ? pengaturanC.getPengaturanParkir().getKuotaParkirMobil() : 0;
    private int motorPerJam = (pengaturanC.getPengaturanParkir() != null) ? pengaturanC.getPengaturanParkir().getTarifParkirMotorPerJam() : 0;
    private int motorPerHari = (pengaturanC.getPengaturanParkir() != null) ? pengaturanC.getPengaturanParkir().getTarifParkirMotorPerHari() : 0;
    private int mobilPerJam = (pengaturanC.getPengaturanParkir() != null) ? pengaturanC.getPengaturanParkir().getTarifParkirMobilPerJam() : 0;
    private int mobilPerHari = (pengaturanC.getPengaturanParkir() != null) ? pengaturanC.getPengaturanParkir().getTarifParkirMobilPerHari() : 0;
    
     /**
     * Creates new form PengaturanParkir
     */
    public PengaturanParkirView() {
        initComponents();
        setLocationRelativeTo(null);
        Komponen.setOnlyIntegerJ(kuotaMobilTextField);
        Komponen.setOnlyIntegerJ(kuotaMotorTextField);
        Komponen.setOnlyIntegerJ(motorPerJamTextField);
        Komponen.setOnlyIntegerJ(motorPerHariTextField);
        Komponen.setOnlyIntegerJ(mobilPerJamTextField);
        Komponen.setOnlyIntegerJ(mobilPerHariTextField);
    }
    
    /**
     * Adds a placeholder style to a text field, restoring the font type to normal and text color to gray.
     *
     * @param textField The text field to add the placeholder style to.
     */
    public void addPlaceholderStyle(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN);
        textField.setFont(font);
        textField.setForeground(Color.gray);
    }
    
    /**
     * Removes the placeholder style from a text field, restoring the font type to normal and text color to gray.
     *
     * @param textField The text field to remove the style from.
     */  
    public void removePlaceholderStyle(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN);
        textField.setFont(font);
        textField.setForeground(Color.gray);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        parkingSettingPanel = new javax.swing.JPanel();
        motorcycleParkingCapacityLabel = new javax.swing.JLabel();
        kuotaMotorTextField = new javax.swing.JTextField();
        kuotaMobilTextField = new javax.swing.JTextField();
        motorPerJamTextField = new javax.swing.JTextField();
        motorPerHariTextField = new javax.swing.JTextField();
        mobilPerJamTextField = new javax.swing.JTextField();
        mobilPerHariTextField = new javax.swing.JTextField();
        carParkingCapacityLabel = new javax.swing.JLabel();
        hourlyMotorcycleParkingCharge = new javax.swing.JLabel();
        dailyMotorcycleParkingCharge = new javax.swing.JLabel();
        hourlyCarParkingCharge = new javax.swing.JLabel();
        dailyCarParkingCharge = new javax.swing.JLabel();
        applyButton = new java.awt.Button();
        pengaturanParkirTitleLabel = new javax.swing.JLabel();
        leftPanel = new javax.swing.JPanel();
        leftRaedamLogo = new javax.swing.JLabel();
        leftRaedamTextLabel = new javax.swing.JLabel();
        dashboardNavButton = new java.awt.Button();
        masukParkirNavButton = new java.awt.Button();
        keluarParkirNavButton = new java.awt.Button();
        pengaturanParkirNavButton = new java.awt.Button();
        laporanParkirNavButton = new java.awt.Button();
        DetailPengaturanSubtitlePanel = new javax.swing.JPanel();
        subtitleLabel = new javax.swing.JLabel();
        rightRaedamLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        parkingSettingPanel.setBackground(new java.awt.Color(255, 255, 255));

        motorcycleParkingCapacityLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        motorcycleParkingCapacityLabel.setText("Kuota Parkir Motor  ");

        kuotaMotorTextField.setText(String.valueOf(kuotaMotor));

        kuotaMobilTextField.setText(String.valueOf(kuotaMobil));

        motorPerJamTextField.setText(String.valueOf(motorPerJam));

        motorPerHariTextField.setText(String.valueOf(motorPerHari));

        mobilPerJamTextField.setText(String.valueOf(mobilPerJam));

        mobilPerHariTextField.setText(String.valueOf(mobilPerHari));

        carParkingCapacityLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        carParkingCapacityLabel.setText("Kuota Parkir Mobil  ");

        hourlyMotorcycleParkingCharge.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hourlyMotorcycleParkingCharge.setText("Tarif Parkir Motor Per Jam  ");

        dailyMotorcycleParkingCharge.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dailyMotorcycleParkingCharge.setText("Tarif Parkir Motor Per Hari");

        hourlyCarParkingCharge.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hourlyCarParkingCharge.setText("Tarif Parkir Mobil Per Jam");

        dailyCarParkingCharge.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dailyCarParkingCharge.setText("Tarif Parkir Mobil Per Hari");

        javax.swing.GroupLayout parkingSettingPanelLayout = new javax.swing.GroupLayout(parkingSettingPanel);
        parkingSettingPanel.setLayout(parkingSettingPanelLayout);
        parkingSettingPanelLayout.setHorizontalGroup(
            parkingSettingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parkingSettingPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(parkingSettingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(parkingSettingPanelLayout.createSequentialGroup()
                        .addComponent(carParkingCapacityLabel)
                        .addGap(81, 81, 81)
                        .addComponent(kuotaMobilTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(parkingSettingPanelLayout.createSequentialGroup()
                        .addComponent(motorcycleParkingCapacityLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kuotaMotorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(parkingSettingPanelLayout.createSequentialGroup()
                        .addComponent(dailyCarParkingCharge)
                        .addGap(35, 35, 35)
                        .addComponent(mobilPerHariTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(parkingSettingPanelLayout.createSequentialGroup()
                        .addComponent(hourlyCarParkingCharge)
                        .addGap(34, 34, 34)
                        .addComponent(mobilPerJamTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(parkingSettingPanelLayout.createSequentialGroup()
                        .addComponent(dailyMotorcycleParkingCharge)
                        .addGap(31, 31, 31)
                        .addComponent(motorPerHariTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(parkingSettingPanelLayout.createSequentialGroup()
                        .addComponent(hourlyMotorcycleParkingCharge)
                        .addGap(18, 18, 18)
                        .addComponent(motorPerJamTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        parkingSettingPanelLayout.setVerticalGroup(
            parkingSettingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parkingSettingPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(parkingSettingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(motorcycleParkingCapacityLabel)
                    .addComponent(kuotaMotorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(parkingSettingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kuotaMobilTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carParkingCapacityLabel))
                .addGap(21, 21, 21)
                .addGroup(parkingSettingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(motorPerJamTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hourlyMotorcycleParkingCharge))
                .addGap(21, 21, 21)
                .addGroup(parkingSettingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(motorPerHariTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dailyMotorcycleParkingCharge))
                .addGap(21, 21, 21)
                .addGroup(parkingSettingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobilPerJamTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hourlyCarParkingCharge))
                .addGap(21, 21, 21)
                .addGroup(parkingSettingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobilPerHariTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dailyCarParkingCharge))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        applyButton.setBackground(new java.awt.Color(102, 204, 255));
        applyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        applyButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        applyButton.setForeground(new java.awt.Color(255, 255, 255));
        applyButton.setLabel("Terapkan");
        applyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(parkingSettingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(applyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(parkingSettingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(applyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pengaturanParkirTitleLabel.setBackground(new java.awt.Color(102, 204, 255));
        pengaturanParkirTitleLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        pengaturanParkirTitleLabel.setForeground(new java.awt.Color(102, 204, 255));
        pengaturanParkirTitleLabel.setText("PENGATURAN PARKIR");

        leftPanel.setBackground(new java.awt.Color(102, 204, 255));

        leftRaedamLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/WhatsApp_Image_2023-10-17_at_12.55.56-removebg-preview.png"))); // NOI18N

        leftRaedamTextLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        leftRaedamTextLabel.setForeground(new java.awt.Color(255, 255, 255));
        leftRaedamTextLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        leftRaedamTextLabel.setText("Raedam");

        dashboardNavButton.setActionCommand("beranda");
        dashboardNavButton.setBackground(new java.awt.Color(102, 204, 255));
        dashboardNavButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboardNavButton.setFont(new java.awt.Font("Dialog", 1, 25)); // NOI18N
        dashboardNavButton.setForeground(new java.awt.Color(255, 255, 255));
        dashboardNavButton.setLabel("Beranda");
        dashboardNavButton.setPreferredSize(new java.awt.Dimension(116, 41));
        dashboardNavButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardNavButtonActionPerformed(evt);
            }
        });

        masukParkirNavButton.setActionCommand("masukParkir");
        masukParkirNavButton.setBackground(new java.awt.Color(102, 204, 255));
        masukParkirNavButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        masukParkirNavButton.setFont(new java.awt.Font("Dialog", 1, 25)); // NOI18N
        masukParkirNavButton.setForeground(new java.awt.Color(255, 255, 255));
        masukParkirNavButton.setLabel("Masuk Parkir");
        masukParkirNavButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masukParkirNavButtonActionPerformed(evt);
            }
        });

        keluarParkirNavButton.setActionCommand("keluarParkir");
        keluarParkirNavButton.setBackground(new java.awt.Color(102, 204, 255));
        keluarParkirNavButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        keluarParkirNavButton.setFont(new java.awt.Font("Dialog", 1, 25)); // NOI18N
        keluarParkirNavButton.setForeground(new java.awt.Color(255, 255, 255));
        keluarParkirNavButton.setLabel("Keluar Parkir");
        keluarParkirNavButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarParkirNavButtonActionPerformed(evt);
            }
        });

        pengaturanParkirNavButton.setActionCommand("pengaturanParkir");
        pengaturanParkirNavButton.setBackground(new java.awt.Color(102, 204, 255));
        pengaturanParkirNavButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pengaturanParkirNavButton.setFont(new java.awt.Font("Dialog", 1, 25)); // NOI18N
        pengaturanParkirNavButton.setForeground(new java.awt.Color(255, 255, 255));
        pengaturanParkirNavButton.setLabel("Pengaturan Parkir");
        pengaturanParkirNavButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pengaturanParkirNavButtonActionPerformed(evt);
            }
        });

        laporanParkirNavButton.setActionCommand("laporanParkir");
        laporanParkirNavButton.setBackground(new java.awt.Color(102, 204, 255));
        laporanParkirNavButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        laporanParkirNavButton.setFont(new java.awt.Font("Dialog", 1, 25)); // NOI18N
        laporanParkirNavButton.setForeground(new java.awt.Color(255, 255, 255));
        laporanParkirNavButton.setLabel("Laporan Parkir");
        laporanParkirNavButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laporanParkirNavButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(leftRaedamLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(leftRaedamTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dashboardNavButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(masukParkirNavButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(keluarParkirNavButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pengaturanParkirNavButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(laporanParkirNavButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(leftRaedamLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(leftRaedamTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(dashboardNavButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(masukParkirNavButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(keluarParkirNavButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(pengaturanParkirNavButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(laporanParkirNavButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 208, Short.MAX_VALUE))
        );

        DetailPengaturanSubtitlePanel.setBackground(new java.awt.Color(102, 204, 255));

        subtitleLabel.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        subtitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        subtitleLabel.setText("Detail Pengaturan");
        subtitleLabel.setToolTipText("");

        javax.swing.GroupLayout DetailPengaturanSubtitlePanelLayout = new javax.swing.GroupLayout(DetailPengaturanSubtitlePanel);
        DetailPengaturanSubtitlePanel.setLayout(DetailPengaturanSubtitlePanelLayout);
        DetailPengaturanSubtitlePanelLayout.setHorizontalGroup(
            DetailPengaturanSubtitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DetailPengaturanSubtitlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DetailPengaturanSubtitlePanelLayout.setVerticalGroup(
            DetailPengaturanSubtitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DetailPengaturanSubtitlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtitleLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rightRaedamLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Logo Kanan Atas.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rightRaedamLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pengaturanParkirTitleLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(DetailPengaturanSubtitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(224, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rightRaedamLogo)
                .addGap(15, 15, 15)
                .addComponent(pengaturanParkirTitleLabel)
                .addGap(18, 18, 18)
                .addComponent(DetailPengaturanSubtitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Handles the action when the "Beranda" button is clicked.
     */
    private void dashboardNavButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardNavButtonActionPerformed
        // TODO add your handling code here:
        new Dashboard().setVisible(true);
        dispose();
    }//GEN-LAST:event_dashboardNavButtonActionPerformed
    
    /**
     * Handles the action when the "Masuk Parkir" button is clicked.
     */
    private void masukParkirNavButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masukParkirNavButtonActionPerformed
        // TODO add your handling code here:
        new MasukParkir().setVisible(true);
        dispose();
    }//GEN-LAST:event_masukParkirNavButtonActionPerformed

    /**
     * Handles the action when the "Keluar Parkir" button is clicked.
     */
    private void keluarParkirNavButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarParkirNavButtonActionPerformed
        // TODO add your handling code here:
        new KeluarParkir().setVisible(true);
        dispose();
    }//GEN-LAST:event_keluarParkirNavButtonActionPerformed

    /**
     * Handles the action when the "Pengaturan Parkir" button is clicked.
     */
    private void pengaturanParkirNavButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pengaturanParkirNavButtonActionPerformed
        // TODO add your handling code here:
        new PengaturanParkirView().setVisible(true);
        dispose();
    }//GEN-LAST:event_pengaturanParkirNavButtonActionPerformed
    
    /**
     * Handles the action when the "Laporan Parkir" button is clicked.
     */
    private void laporanParkirNavButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporanParkirNavButtonActionPerformed
        // TODO add your handling code here:
        new TampilData().setVisible(true);
        dispose();
    }//GEN-LAST:event_laporanParkirNavButtonActionPerformed
    
    /**
     * This method ensures that valid parking configuration values are entered, updates the system configuration, and provides feedback to the user through pop-up messages,  If any errors occur during the process, appropriate error messages are displayed.
     * @param evt object that provides information about the occurred event.
     */
    private void applyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyButtonActionPerformed
        try {
            kuotaMotor = Integer.parseInt(kuotaMotorTextField.getText());
            kuotaMobil = Integer.parseInt(kuotaMobilTextField.getText());
            motorPerJam = Integer.parseInt(motorPerJamTextField.getText());
            motorPerHari = Integer.parseInt(motorPerHariTextField.getText());
            mobilPerJam = Integer.parseInt(mobilPerJamTextField.getText());
            mobilPerHari = Integer.parseInt(mobilPerHariTextField.getText());
            
            
            if (kuotaMotor > 0 && kuotaMobil > 0 && motorPerJam > 0 && motorPerHari > 0 && mobilPerJam > 0 && mobilPerHari > 0){
                pengaturanC.insertPengaturan(new PengaturanParkir(kuotaMotor, kuotaMobil, motorPerJam, mobilPerJam, motorPerHari, mobilPerHari, LocalDateTime.now(), Session.sesi.petugas));
                JOptionPane.showMessageDialog(this, "Pengaturan parkir berhasil diterapkan");
                new Dashboard().setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Semua pengaturan tidak boleh bernilai 0 atau kurang dari 0");
            }
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(PengaturanParkirView.this, "Semua data harus diisi");
        }  
    }//GEN-LAST:event_applyButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PengaturanParkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PengaturanParkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PengaturanParkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PengaturanParkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PengaturanParkirView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DetailPengaturanSubtitlePanel;
    private java.awt.Button applyButton;
    private javax.swing.JLabel carParkingCapacityLabel;
    private javax.swing.JLabel dailyCarParkingCharge;
    private javax.swing.JLabel dailyMotorcycleParkingCharge;
    private java.awt.Button dashboardNavButton;
    private javax.swing.JLabel hourlyCarParkingCharge;
    private javax.swing.JLabel hourlyMotorcycleParkingCharge;
    private java.awt.Button keluarParkirNavButton;
    private javax.swing.JTextField kuotaMobilTextField;
    private javax.swing.JTextField kuotaMotorTextField;
    private java.awt.Button laporanParkirNavButton;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JLabel leftRaedamLogo;
    private javax.swing.JLabel leftRaedamTextLabel;
    private javax.swing.JPanel mainPanel;
    private java.awt.Button masukParkirNavButton;
    private javax.swing.JTextField mobilPerHariTextField;
    private javax.swing.JTextField mobilPerJamTextField;
    private javax.swing.JTextField motorPerHariTextField;
    private javax.swing.JTextField motorPerJamTextField;
    private javax.swing.JLabel motorcycleParkingCapacityLabel;
    private javax.swing.JPanel parkingSettingPanel;
    private java.awt.Button pengaturanParkirNavButton;
    private javax.swing.JLabel pengaturanParkirTitleLabel;
    private javax.swing.JLabel rightRaedamLogo;
    private javax.swing.JLabel subtitleLabel;
    // End of variables declaration//GEN-END:variables
}