/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Parkir;
import Model.ParkirInap;
import Model.ParkirPerJam;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kemal Crisannaufal
 */
public class Komponen {
    
    /**
     * Configures a text field to allow only alphanumeric input.
     *
     * @param textField The text field to configure.
     */
    static void setOnlyAlphaNumeric(java.awt.TextField textField) {
        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!(Character.isLetterOrDigit(c) || Character.isWhitespace(c))) {
                    e.consume(); 
                }
            }
            @Override
            public void keyPressed(KeyEvent e) {}
            @Override
            public void keyReleased(KeyEvent e) {}
        });
    }
    
    /** Configures a text field to allow only integer input.
     *
     * @param textField The text field to configure.
     */
    static void setOnlyInteger(java.awt.TextField textField) {
    textField.addKeyListener(new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if (!Character.isDigit(c)) {
                e.consume(); 
            }
        }
        @Override
        public void keyPressed(KeyEvent e) {}

        @Override
        public void keyReleased(KeyEvent e) {}
        });
    }
    
    /**
     * Adds a placeholder style to a text field, restoring the font type to normal and text color to gray.
     *
     * @param textField The text field to add the placeholder style to.
     */
    static void addPlaceholderStyle(java.awt.TextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.ITALIC);
        textField.setFont(font);
        textField.setForeground(Color.gray);
    }
    
    /** 
     * Removes the placeholder style from a text field, restoring the font type to italic and text color to gray.
     * @param textField The text field to remove the style from.
     */ 
    static void removePlaceholderStyle(java.awt.TextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN);
        textField.setFont(font);
        textField.setForeground(Color.black);
    }
    
    static DefaultTableModel CreateTableModelParkir(ArrayList<Parkir> listParkir) {
        
        // Create a new DefaultTableModel
        DefaultTableModel newModel = new DefaultTableModel();
        
        // Add columns to the table model
            newModel.addColumn("Tipe Parkir");
            newModel.addColumn("Plat Nomor");
            newModel.addColumn("Jenis Kendaraan");
            newModel.addColumn("Waktu Masuk");
            newModel.addColumn("Waktu Keluar");
            newModel.addColumn("Status Parkir");

            // Create a 2D array to store data for the table
            Object[][] objek = new Object[listParkir.size()][6];
            
            // Populate the array with data from the list of parking entries
                for (int i = 0; i < listParkir.size(); i++){
                        for (int j = 0; j <= 5; j++){
                            objek[i][0] = listParkir.get(i).getTipeParkir();
                            objek[i][1] = listParkir.get(i).getPlatNomor();
                            objek[i][2] = listParkir.get(i).getJenisKendaraan();
                            objek[i][5] = listParkir.get(i).getStatusParkir();
                            if (j == 3) {
                                // Handle formatting for "Waktu Masuk"
                                if (listParkir.get(i) instanceof ParkirPerJam) {
                                    objek[i][j] = ((ParkirPerJam) listParkir.get(i)).getWaktuMasuk().format(DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss"));
                                } else {
                                    objek[i][j] = ((ParkirInap) listParkir.get(i)).getTanggalMasuk();
                                }
                            } else if (j == 4) {
                                // Handle formatting for "Waktu Keluar"
                               if (listParkir.get(i).getStatusParkir().equalsIgnoreCase("SELESAI")) {
                                    if (listParkir.get(i) instanceof ParkirPerJam) {
                                        objek[i][j] = ((ParkirPerJam) listParkir.get(i)).getWaktuKeluar().format(DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss"));
                                    } else 
                                        objek[i][j] = ((ParkirInap) listParkir.get(i)).getTanggalKeluar();
                                } else {
                                    objek[i][j] = "--";
                                }
                            }

                        }
                    }
            
            // Add rows to the table model    
            int i = 0;
            for (Object[] rowData : objek) {
                newModel.addRow(rowData);
                i++;
            }
             
            // Add additional empty rows if needed to fill the table
            while (i < 18){
                newModel.addRow(new Object[]{null,null,null,null,null,null});
                    i++;
            }
            return newModel;
    }
    
    /**
     * Adds a placeholder style to a text field, restoring the font type to normal and text color to gray.
     *
     * @param textField The text field to add the placeholder style to.
     */
    static void addPlaceholderStyleJ(JTextField textField){
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
    static void removePlaceholderStyleJ(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN);
        textField.setFont(font);
        textField.setForeground(Color.gray);
    }
    
    /**
     * Configures a text field to allow only alphanumeric input.
     *
     * @param textField The text field to configure.
     */
    static void setOnlyAlphaNumericJ(JTextField textField) {
        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!(Character.isLetterOrDigit(c) || Character.isWhitespace(c))) {
                    e.consume(); 
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {}

            @Override
            public void keyReleased(KeyEvent e) {}
        });
    }
    
    /** Configures a text field to allow only integer input.
     *
     * @param textField The text field to configure.
     */
    static void setOnlyIntegerJ(JTextField textField) {
        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume(); 
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {}
            @Override
            public void keyReleased(KeyEvent e) {}
        });
    }
    
}
