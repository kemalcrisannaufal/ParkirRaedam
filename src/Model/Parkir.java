/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Kemal Crisannaufal
 * 
 * This is a class that represents a Parkir (parking)
 */

public abstract class Parkir 
{
    /**
     * The id of the Parkir (parking)
     */
    private int noParkir;
    
    /**
     * The type of the Parkir (parking) that is INAP (overnight) or PERJAM (per hour) 
     */
    private String tipeParkir;
    
   /**
     * The type of the Parkir (parking) that is MOTOR (motorcycle) or MOBIL (car) 
     */
    private String jenisKendaraan;
    
    /**
     * The vehicle registration number of the Parkir (parking)
     */
    private String platNomor;
    
    /**
     * The state of the Parkir (parking) that is PARKIR (parking) or SELESAI (finished)
     */
    private String statusParkir;
    
    /**
     * The parking configuration used of the Parkir (parking)
     */
    private PengaturanParkir pengaturan;
    
    /**
     * Construct new object of Perkir with id of the Parkir generated from database
     * 
     * @param noParkir The id of the Parkir (parking)
     * @param tipeParkir The type of the Parkir (parking) that is INAP (overnight) or PERJAM (per hour) 
     * @param statusParkir The state of the Parkir (parking) that is PARKIR (parking) or SELESAI (finished)
     * @param jenisKendaraan  The type of the Parkir (parking) that is MOTOR (motorcycle) or MOBIL (car)
     * @param platNomor The vehicle registration number of the Parkir (parking)
     * @param pengaturan The parking configuration used of the Parkir (parking)
     */
    public Parkir(int noParkir, String tipeParkir, String statusParkir, String jenisKendaraan, String platNomor, PengaturanParkir pengaturan) {
        this.tipeParkir = tipeParkir;
        this.statusParkir = statusParkir;
        this.noParkir = noParkir;
        this.jenisKendaraan = jenisKendaraan;
        this.platNomor = platNomor;
        this.pengaturan = pengaturan;
    }
    
    /**
     * Construct new object of Perkir without id of the Parkir for insert data to database
     * 
     * @param tipeParkir The type of the Parkir (parking) that is INAP (overnight) or PERJAM (per hour) 
     * @param statusParkir The state of the Parkir (parking) that is PARKIR (parking) or SELESAI (finished)
     * @param jenisKendaraan  The type of the Parkir (parking) that is MOTOR (motorcycle) or MOBIL (car)
     * @param platNomor The vehicle registration number of the Parkir (parking)
     * @param pengaturan The parking configuration used of the Parkir (parking)
     */
    public Parkir(String tipeParkir, String statusParkir, String jenisKendaraan, String platNomor, PengaturanParkir pengaturan) {
        this.tipeParkir = tipeParkir;
        this.statusParkir = statusParkir;
        this.jenisKendaraan = jenisKendaraan;
        this.platNomor = platNomor;
        this.pengaturan = pengaturan;
    }
    
    /**
     * Sets the id of the Parkir (parking)
     * 
     * @param noParkir The id of the Parkir (parking)
     */
    public void setNoParkir(int noParkir) {
        this.noParkir = noParkir;
    }
    
     /**
     * Sets the type of the Parkir (parking) that is INAP (overnight) or PERJAM (per hour) 
     * 
     * @param tipeParkir The type of the Parkir (parking) that is INAP (overnight) or PERJAM (per hour) 
     */
    public void setTipeParkir(String tipeParkir){
        this.tipeParkir = tipeParkir;
    }

    /**
     * Sets the type of the Parkir (parking) that is MOTOR (motorcycle) or MOBIL (car)
     * 
     * @param jenisKendaraan The type of the Parkir (parking) that is MOTOR (motorcycle) or MOBIL (car)
     */
    public void setJenisKendaraan(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    /**
     * Sets the vehicle registration number of the Parkir (parking)
     * 
     * @param platNomor The vehicle registration number of the Parkir (parking)
     */
    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    /**
     * Sets the state of the Parkir (parking) that is PARKIR (parking) or SELESAI (finished)
     * 
     * @param statusParkir The state of the Parkir (parking) that is PARKIR (parking) or SELESAI (finished)
     */
    public void setStatusParkir(String statusParkir) {
        this.statusParkir = statusParkir;
    }

    /**
     * Sets the parking configuration used of the Parkir (parking) 
     * 
     * @param pengaturan The parking configuration used of the Parkir (parking)
     */
    public void setPengaturan(PengaturanParkir pengaturan) {
        this.pengaturan = pengaturan;
    }

    /**
     * Gets The id of the Parkir (parking)
     * 
     * @return The id of the Parkir (parking)
     */
    public int getNoParkir() {
        return noParkir;
    }
    
     /**
     * Gets the type of the Parkir (parking) that is INAP (overnight) or PERJAM (per hour) 
     * 
     * @return The type of the Parkir (parking) that is INAP (overnight) or PERJAM (per hour) 
     */
    public String getTipeParkir(){
        return tipeParkir;
    }

    /**
     * Gets the type of the Parkir (parking) that is MOTOR (motorcycle) or MOBIL (car)
     * 
     * @return The type of the Parkir (parking) that is MOTOR (motorcycle) or MOBIL (car) 
     */
    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    /**
     * Gets the vehicle registration number of the Parkir (parking)
     * 
     * @return The vehicle registration number of the Parkir (parking) 
     */
    public String getPlatNomor() {
        return platNomor;
    }
    
    /**
     * Gets the state of the Parkir (parking) that is PARKIR (parking) or SELESAI (finished)
     * 
     * @return The state of the Parkir (parking) that is PARKIR (parking) or SELESAI (finished) 
     */
    public String getStatusParkir() {
        return statusParkir;
    }

    /**
     * Gets the parking configuration used of the Parkir (parking)
     * 
     * @return The parking configuration used of the Parkir (parking) 
     */
    public PengaturanParkir getPengaturan() {
        return pengaturan;
    }
    
    /**
     * Abstract method to be overridden in ParkirPerJam and ParkirInap
     * Calculates the parking duration and returns the duration value.
     * For ParkirPerJam, it calculates the number of hours parked.
     * For ParkirInap, it calculates the number of days parked.
     * 
     * @return an Integer representing the duration of the parking.
     */
    public abstract int hitungDurasiParkir();
}
