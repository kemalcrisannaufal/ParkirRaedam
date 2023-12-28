/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Kemal Crisannaufal
 */

import Model.Parkir;
import java.util.ArrayList;
import Model.Pembayaran;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class PembayaranController {
    /**
     * get functions from PetugasController
     */
    private final PetugasController petugasC = new PetugasController();
    /**
     * get functions from ParkirController
     */
    private final ParkirController parkirC = new ParkirController();
    /**
     * get list of payment
     */
    private final ArrayList<Pembayaran> listPembayaran = getAllPembayaran();
    
    /**
     * add a new payment to list
     * @param pembayaran payment information
     */
    public void addPembayaran(Pembayaran pembayaran) {
        listPembayaran.add(pembayaran);
    }

    /**
     * Get list of payments
     * @return list of payments
     */
    public ArrayList<Pembayaran> getListPembayaran() {
        return listPembayaran;
    }
    
    /**
     * Add a new payment to database
     * @param pembayaran new payment
     */
    public void insertPembayaran(Pembayaran pembayaran) {
        String sql = "INSERT INTO PEMBAYARAN (idParkir, waktuPembayaran, totalBayar, idPetugas) VALUES (?, ?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(Database.URL, Database.USERNAME, Database.PASSWORD);
                PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            
            statement.setInt(1, pembayaran.getParkir().getNoParkir());
            statement.setString(2, pembayaran.getWaktuBayar().toString());
            statement.setInt(3, pembayaran.getTotalBayar());
            statement.setInt(4,pembayaran.getPetugasparkir().getIdPetugas());
            statement.executeUpdate();
            
            ResultSet generatedKeys = statement.getGeneratedKeys();
            if (generatedKeys.next()){
                int id = generatedKeys.getInt(1);
                pembayaran.setIdPembayaran(id);
                listPembayaran.add(pembayaran);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
    /**
     * Get all payment information available in database
     * @return list of all payment information
     */
    public ArrayList<Pembayaran> getAllPembayaran() {
        ArrayList<Pembayaran> listPembayaran = new ArrayList<Pembayaran>();
        String sql = "SELECT * FROM PEMBAYARAN";
        try (Connection connection = DriverManager.getConnection(Database.URL, Database.USERNAME, Database.PASSWORD);
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ResultSet resultSet = preparedStatement.executeQuery()
            ) 
        {
            while (resultSet.next()) {
                int idPembayaran = resultSet.getInt("idPembayaran");
                int idParkir = resultSet.getInt("idParkir");
                LocalDateTime waktuBayar = resultSet.getTimestamp("waktuPembayaran").toLocalDateTime();
                int totalBayar = resultSet.getInt("totalBayar");
                int idPetugas = resultSet.getInt("idPetugas");
                listPembayaran.add(new Pembayaran(idPembayaran, totalBayar, waktuBayar, parkirC.searchById(idParkir), petugasC.searchById(idPetugas)));        
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listPembayaran;
    }
    
    /**
     * Count payment needed for a particular vehicle
     * @param parkir vehicle information
     * @return payment's tariff
     */
    public int hitungTotalBayar(Parkir parkir) {
        int durasi = parkir.hitungDurasiParkir();
        int tarif = 0;
        if (parkir.getTipeParkir().equalsIgnoreCase("PERJAM")) {
            if (parkir.getJenisKendaraan().equalsIgnoreCase("MOTOR")) {
                tarif = durasi * parkir.getPengaturan().getTarifParkirMotorPerJam();
            } else {
                tarif = durasi * parkir.getPengaturan().getTarifParkirMobilPerJam();
            }
        } else {
            if (parkir.getJenisKendaraan().equalsIgnoreCase("MOTOR")) {
                tarif = durasi * parkir.getPengaturan().getTarifParkirMotorPerHari();
            } else {
                tarif = durasi * parkir.getPengaturan().getTarifParkirMobilPerHari();
            }
        }
        return tarif;
    }
    
    /**
     * Count payments received total to the day
     * @param perTanggal to get all data or a particular date
     * @param tanggal date to be searched
     * @return payment total
     */
    public int hitungTotalPendapatan(boolean perTanggal, Date tanggal){
        int totalPendapatan = 0;
        SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy");
        String strTanggal = formater.format(tanggal);
        
        for (Pembayaran p : listPembayaran) {  
            if (perTanggal &&
                p.getWaktuBayar().getDayOfMonth() == Integer.parseInt(strTanggal.substring(0, 2)) &&
                p.getWaktuBayar().getMonthValue()== Integer.parseInt(strTanggal.substring(3, 5)) &&
                p.getWaktuBayar().getYear() == Integer.parseInt(strTanggal.substring(6, 10))) {
                totalPendapatan = totalPendapatan + p.getTotalBayar();
            } else if (!perTanggal) {
                totalPendapatan = totalPendapatan + p.getTotalBayar();
            }
        } 
        return totalPendapatan;
    }
    


}
