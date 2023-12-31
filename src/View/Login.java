package View;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author achmadfahriza
 */

/**
 * Import.
 */
import javax.swing.*;
import Controller.PetugasController;

/**
 * Main login window of the application.
 */
public final class Login extends javax.swing.JFrame {

    private boolean showPassword = false; // Variable for password visibility
    private final PetugasController petugasC = new PetugasController(); // Controller variable for Petugas
    
    /**
     * Creates a new Login form.
     */
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        Komponen.addPlaceholderStyle(usernameTextField);
        Komponen.addPlaceholderStyle(passwordtextField);   
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        leftPanel = new javax.swing.JPanel();
        leftRaedamLogo = new javax.swing.JLabel();
        leftTextRaedamLabel = new javax.swing.JLabel();
        rightRaedamLogo = new javax.swing.JLabel();
        carImageLabel = new javax.swing.JLabel();
        usernameTextField = new java.awt.TextField();
        passwordtextField = new java.awt.TextField();
        loginButton = new java.awt.Button();
        dontHaveAccountLabel = new javax.swing.JLabel();
        registrationLabel = new javax.swing.JLabel();
        eyeIcon = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        leftPanel.setBackground(new java.awt.Color(102, 204, 255));

        leftRaedamLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/WhatsApp_Image_2023-10-17_at_12.55.56-removebg-preview.png"))); // NOI18N
        leftRaedamLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        leftRaedamLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leftRaedamLogoMouseClicked(evt);
            }
        });

        leftTextRaedamLabel.setBackground(new java.awt.Color(255, 255, 255));
        leftTextRaedamLabel.setFont(new java.awt.Font("Al Bayan", 3, 24)); // NOI18N
        leftTextRaedamLabel.setForeground(new java.awt.Color(255, 255, 255));
        leftTextRaedamLabel.setText("Raedam.. Permudah Parkirmu!!!");

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(leftRaedamLogo))
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(leftTextRaedamLabel)))
                .addContainerGap(215, Short.MAX_VALUE))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(384, 384, 384)
                .addComponent(leftRaedamLogo)
                .addGap(31, 31, 31)
                .addComponent(leftTextRaedamLabel)
                .addContainerGap(432, Short.MAX_VALUE))
        );

        rightRaedamLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Untitled-removebg-preview (1).png"))); // NOI18N

        carImageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        carImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/news 1.png"))); // NOI18N

        usernameTextField.setBackground(new java.awt.Color(255, 255, 255));
        usernameTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        usernameTextField.setText("Username");
        usernameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameTextFieldFocusLost(evt);
            }
        });

        passwordtextField.setBackground(new java.awt.Color(255, 255, 255));
        passwordtextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        passwordtextField.setText("Kata Sandi");
        passwordtextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordtextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordtextFieldFocusLost(evt);
            }
        });

        loginButton.setBackground(new java.awt.Color(102, 204, 255));
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setLabel("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        dontHaveAccountLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        dontHaveAccountLabel.setText("Belum punya akun?");

        registrationLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        registrationLabel.setForeground(new java.awt.Color(0, 0, 204));
        registrationLabel.setText("<html><u>Daftar</u></html>");
        registrationLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrationLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrationLabelMouseClicked(evt);
            }
        });

        eyeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/eye_pw2-removebg-preview (1).png"))); // NOI18N
        eyeIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eyeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eyeIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(rightRaedamLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(272, 272, 272)
                                .addComponent(carImageLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(278, 278, 278)
                                .addComponent(dontHaveAccountLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(registrationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(258, 258, 258)
                                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(223, 223, 223)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(passwordtextField, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eyeIcon)))
                        .addGap(0, 209, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rightRaedamLogo)
                .addGap(89, 89, 89)
                .addComponent(carImageLabel)
                .addGap(26, 26, 26)
                .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(eyeIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordtextField, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dontHaveAccountLabel)
                    .addComponent(registrationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Defines a method to handle clicks on the login button, simultaneously validating the entered username and password.
     */
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String username = usernameTextField.getText();
        String password = passwordtextField.getText();
        
        boolean isLoginValid = petugasC.validasiLogin(username, password);
        
        if (isLoginValid) {
            Session.sesi.username = username;
            Session.sesi.petugas = petugasC.searchByUsername(username);
            new Dashboard().setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(Login.this, "Username dan Password Salah");
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    /**
     * Defines a method called when the username field is focused, removing the placeholder and preparing the field for data entry.
     */
    private void usernameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTextFieldFocusGained
        if(usernameTextField.getText().equals("Username")){
            usernameTextField.setText(null);
            Komponen.removePlaceholderStyle(usernameTextField);
        }
    }//GEN-LAST:event_usernameTextFieldFocusGained

    /**
     * Defines a method called when the password field is focused, removing the placeholder, masking displayed characters with "*", and preparing the field for data entry.
     */
    private void passwordtextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordtextFieldFocusGained
        if(passwordtextField.getText().equals("Kata Sandi")){
            passwordtextField.setText(null);
             passwordtextField.setEchoChar('*');
            Komponen.removePlaceholderStyle(passwordtextField);
        } 
    }//GEN-LAST:event_passwordtextFieldFocusGained

    /**
     * Defines a method called when focus is lost from the username field, adding back the placeholder if no data is entered.
     */
    private void usernameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTextFieldFocusLost
        if (usernameTextField.getText().length()==0){
            Komponen.addPlaceholderStyle(usernameTextField);
            usernameTextField.setText("Username");
        } 
    }//GEN-LAST:event_usernameTextFieldFocusLost

    /**
     * Defines a method called when focus is lost from the password field, adding back the placeholder and restoring the original character display.
     */
    private void passwordtextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordtextFieldFocusLost
        if (passwordtextField.getText().length()==0){
            Komponen.addPlaceholderStyle(passwordtextField);
            passwordtextField.setText("Kata Sandi");
            passwordtextField.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_passwordtextFieldFocusLost

    /**
     * Ensures that the window remains focused.
     */
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus

    /**
     * Opens the registration window and closes the current login window.
     */
    private void registrationLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrationLabelMouseClicked
        // TODO add your handling code here:
        new Registrasi().setVisible(true);
        dispose();
    }//GEN-LAST:event_registrationLabelMouseClicked

    /**
     * Opens the welcome window and closes the current login window.
     */
    private void leftRaedamLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftRaedamLogoMouseClicked
        // TODO add your handling code here:
        new Welcome().setVisible(true);
        dispose();
    }//GEN-LAST:event_leftRaedamLogoMouseClicked

    /**
     * Defines a method called when the eye icon (for showing or hiding the password) is clicked, toggling the visibility of characters in the password field.
     */
    private void eyeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eyeIconMouseClicked
        if (!showPassword){
            passwordtextField.setEchoChar((char) 0); 
            passwordtextField.setText(passwordtextField.getText());
            eyeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/eye_pw-removebg-preview (1).png"))); 
        } else {
            passwordtextField.setEchoChar('*'); 
            passwordtextField.setText(passwordtextField.getText());
            eyeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/eye_pw2-removebg-preview (1).png"))); 
        }
        showPassword = !showPassword;
    }//GEN-LAST:event_eyeIconMouseClicked

    /**
     * Main method to run the application.
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel carImageLabel;
    private javax.swing.JLabel dontHaveAccountLabel;
    private javax.swing.JLabel eyeIcon;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JLabel leftRaedamLogo;
    private javax.swing.JLabel leftTextRaedamLabel;
    private java.awt.Button loginButton;
    private java.awt.TextField passwordtextField;
    private javax.swing.JLabel registrationLabel;
    private javax.swing.JLabel rightRaedamLogo;
    private java.awt.TextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
