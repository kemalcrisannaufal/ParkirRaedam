/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * @author Kemal Crisannaufal
 * 
 * This is a class that represents a ParkirPerJam (Hourly Parking)
 * This class is subclass from superclass Parkir
 * 
 */
import java.time.LocalDateTime;
import java.time.Duration;

public class ParkirPerJam extends Parkir implements BisaParkir {
    /**
     * The id of the ParkirPerJam (hourly parking)
     */
    private int idParkirPerJam;
    
    /**
     * The parking entry time of the ParkirPerJam (hourly parking)
     */
    private LocalDateTime waktuMasuk;
    
     /**
     * The parking exit time of the ParkirPerJam (hourly parking)
     */
    private LocalDateTime waktuKeluar;
    
    /**
     * Construct new object of PerkirPerJam without id of the Parkir and ParkirPerJam for insert data to database
     * 
     * @param tipeParkir The type of the Parkir (parking) that is INAP (overnight) or PERJAM (per hour) 
     * @param statusParkir The state of the Parkir (parking) that is PARKIR (parking) or SELESAI (finished)
     * @param jenisKendaraan The type of the Parkir (parking) that is MOTOR (motorcycle) or MOBIL (car)
     * @param platNomor The vehicle registration number of the Parkir (parking)
     * @param pengaturan The parking configuration used of the Parkir (parking)
     */
    public ParkirPerJam(String tipeParkir, String statusParkir, String jenisKendaraan, String platNomor, PengaturanParkir pengaturan){
        super(tipeParkir, statusParkir, jenisKendaraan, platNomor, pengaturan);
    }
    
    /**
     * Construct new object of PerkirPerJam with id of the Parkir and  ParkirPerJam for finished parking
     * has parking exit time
     * 
     * @param noParkir The id of the Parkir (parking)
     * @param tipeParkir The type of the Parkir (parking) that is INAP (overnight) or PERJAM (per hour) 
     * @param statusParkir The state of the Parkir (parking) that is PARKIR (parking) or SELESAI (finished)
     * @param waktuMasuk The parking entry time of the ParkirPerJam (hourly parking)
     * @param waktuKeluar The parking exit time of the ParkirPerJam (hourly parking)
     * @param jenisKendaraan The type of the Parkir (parking) that is MOTOR (motorcycle) or MOBIL (car)
     * @param platNomor The vehicle registration number of the Parkir (parking)
     * @param pengaturan The parking configuration used of the Parkir (parking)
     * @param idParkirPerJam The id of the ParkirPerJam 
     */
    public ParkirPerJam(int noParkir, String tipeParkir, String statusParkir, LocalDateTime waktuMasuk, LocalDateTime waktuKeluar, String jenisKendaraan, String platNomor, PengaturanParkir pengaturan, int idParkirPerJam) {
        super(noParkir, tipeParkir, statusParkir, jenisKendaraan, platNomor, pengaturan);
        this.waktuMasuk = waktuMasuk;
        this.waktuKeluar = waktuKeluar;
        this.idParkirPerJam = idParkirPerJam;
    }
    
     /**
     * Construct new object of PerkirPerJam with id of the Parkir and  ParkirPerJam for parking with state PARKIR
     * doesn't have parking exit time
     * 
     * @param noParkir The id of the Parkir (parking)
     * @param tipeParkir The type of the Parkir (parking) that is INAP (overnight) or PERJAM (per hour) 
     * @param statusParkir The state of the Parkir (parking) that is PARKIR (parking) or SELESAI (finished)
     * @param waktuMasuk The parking entry time of the ParkirPerJam (hourly parking)
     * @param jenisKendaraan The type of the Parkir (parking) that is MOTOR (motorcycle) or MOBIL (car)
     * @param platNomor The vehicle registration number of the Parkir (parking)
     * @param pengaturan The parking configuration used of the Parkir (parking)
     * @param idParkirPerJam The id of the ParkirPerJam 
     */
    public ParkirPerJam(int noParkir, String tipeParkir, String statusParkir, LocalDateTime waktuMasuk, String jenisKendaraan, String platNomor, PengaturanParkir pengaturan, int idParkirPerJam) {
        super(noParkir, tipeParkir, statusParkir, jenisKendaraan, platNomor, pengaturan);
        this.waktuMasuk = waktuMasuk;
        this.idParkirPerJam = idParkirPerJam;
    }
    
     /**
     * Gets the id of the ParkirPerJam 
     * @return The id of the ParkirPerJam  
     */
    public int getIdParkirPerJam() {
        return idParkirPerJam;
    }

    /**
     * Sets the id of the ParkirPerJam 
     * 
     * @param idParkirPerJam The id of the ParkirPerJam 
     */
    public void setIdParkirPerJam(int idParkirPerJam) {
        this.idParkirPerJam = idParkirPerJam;
    }
    
    /**
     * Sets the parking entry time of the ParkirPerJam (hourly parking)
     * 
     * @param waktuMasuk The parking entry time of the ParkirPerJam (hourly parking)
     */
    public void setWaktuMasuk(LocalDateTime waktuMasuk){
        this.waktuMasuk = waktuMasuk;
    }
    
    /**
     * Sets the parking exit time of the ParkirPerJam (hourly parking)
     * 
     * @param waktuKeluar The parking exit time of the ParkirPerJam (hourly parking)
     */
    public void setWaktuKeluar(LocalDateTime waktuKeluar){
        this.waktuKeluar = waktuKeluar;
    }
    
     /**
     * Gets the parking entry time of the ParkirPerJam (hourly parking)     *
     * 
     * @return The parking entry time of the ParkirPerJam (hourly parking)
     */
    public LocalDateTime getWaktuMasuk(){
        return waktuMasuk;
    }
    
    /**
     * Gets the parking exit time of the ParkirPerJam (hourly parking)
     * 
     * @return The parking exit time of the ParkirPerJam (hourly parking) 
     */
    public LocalDateTime getWaktuKeluar(){
        return waktuKeluar;
    }
    
    /**
     * Implementation of the method from the BisaParkir interface
     * This method sets the parking entry time to the current time
     * and updates the parking status to "PARKIR"
     * @param tipeParkir 
     */
    @Override
    public void masukParkir(String tipeParkir){
        this.waktuMasuk = LocalDateTime.now();
        this.waktuKeluar = null;
        setStatusParkir("PARKIR");
        setTipeParkir(tipeParkir);
    }
    
    /**
     * Implementation of the method from the BisaParkir interface
     * This method sets the parking exit time to the current time
     * and updates the parking status to "SELESAI"
     */
    @Override
    public void keluarParkir(){
        this.waktuKeluar = LocalDateTime.now();
        setStatusParkir("SELESAI");
    }
    
    /**
     * Override method from superclass Parkir
     * Calculates the parking duration and returns the duration value.
     * For ParkirPerJam, it calculates the number of hours parked.
     * 
     * @return an Integer representing the duration of the parking.
     */
    @Override
    public int hitungDurasiParkir(){
        Duration durasi = Duration.between(waktuMasuk, waktuKeluar);
        int detikParkir = (int) durasi.getSeconds();
        int jamParkir = detikParkir / 3600;
        if (detikParkir % 3600 != 0) {
            jamParkir++;
        }
        return jamParkir; 
    }
    
}
