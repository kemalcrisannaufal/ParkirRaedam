
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Kemal Crisannaufal
 * This is a class that represents a ParkirInap (Overnight/Daily Parking)
 * This class is subclass from superclass Parkir
 */
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ParkirInap extends Parkir implements BisaParkir {
    /**
     * The id of the ParkirInap (overnight/daily parking)
     */
    private int idParkirInap;
    
    /**
     * The parking entry date of the ParkirInap (overnight/daily parking)
     */
    private LocalDate tanggalMasuk;
    
    /**
     * The parking exit date of the ParkirInap (overnight/daily parking)
     */
    private LocalDate tanggalKeluar;
    
     /**
     * Construct new object of ParkirInap without id of the Parkir and ParkirInap for insert data to database
     * 
     * @param tipeParkir The type of the Parkir (parking) that is INAP (overnight) or PERJAM (per hour) 
     * @param statusParkir The state of the Parkir (parking) that is PARKIR (parking) or SELESAI (finished)
     * @param jenisKendaraan The type of the Parkir (parking) that is MOTOR (motorcycle) or MOBIL (car)
     * @param platNomor The vehicle registration number of the Parkir (parking)
     * @param pengaturan The parking configuration used of the Parkir (parking)
     */
    public ParkirInap(String tipeParkir, String statusParkir, String jenisKendaraan, String platNomor, PengaturanParkir pengaturan){
        super(tipeParkir, statusParkir, jenisKendaraan, platNomor, pengaturan);
    }
    
   /**
     * Construct new object of PerkirPerJam with id of the Parkir and  ParkirPerJam for parking with state parking
     * hasn't parking exit time
     * 
     * @param noParkir The id of the Parkir (parking)
     * @param tipeParkir The type of the Parkir (parking) that is INAP (overnight) or PERJAM (per hour) 
     * @param statusParkir The state of the Parkir (parking) that is PARKIR (parking) or SELESAI (finished)
     * @param tanggalMasuk The parking entry date of the ParkirInap (overnight/daily parking)
     * @param jenisKendaraan The type of the Parkir (parking) that is MOTOR (motorcycle) or MOBIL (car)
     * @param platNomor The vehicle registration number of the Parkir (parking)
     * @param pengaturan The parking configuration used of the Parkir (parking)
     * @param idParkirInap The id of the ParkirInap
     */ 
    public ParkirInap(int noParkir, String tipeParkir, String statusParkir, LocalDate tanggalMasuk, String jenisKendaraan, String platNomor, PengaturanParkir pengaturan, int idParkirInap) {
        super(noParkir, tipeParkir, statusParkir, jenisKendaraan, platNomor, pengaturan);
        this.tanggalMasuk = tanggalMasuk;
        this.idParkirInap = idParkirInap;
    }
    
    /**
     * Construct new object of PerkirPerJam with id of the Parkir and  ParkirPerJam for finished parking
     * has parking exit time
     * 
     * @param noParkir The id of the Parkir (parking)
     * @param tipeParkir The type of the Parkir (parking) that is INAP (overnight) or PERJAM (per hour) 
     * @param statusParkir The state of the Parkir (parking) that is PARKIR (parking) or SELESAI (finished)
     * @param tanggalMasuk The parking entry date of the ParkirInap (overnight/daily parking)
     * @param tanggalKeluar The parking exit date of the ParkirInap (overnight/daily parking)
     * @param jenisKendaraan The type of the Parkir (parking) that is MOTOR (motorcycle) or MOBIL (car)
     * @param platNomor The vehicle registration number of the Parkir (parking)
     * @param pengaturan The parking configuration used of the Parkir (parking)
     * @param idParkirInap The id of the ParkirInap
     */ 
    public ParkirInap(int noParkir, String tipeParkir, String statusParkir, LocalDate tanggalMasuk, LocalDate tanggalKeluar, String jenisKendaraan, String platNomor, PengaturanParkir pengaturan, int idParkirInap) {
        super(noParkir, tipeParkir, statusParkir, jenisKendaraan, platNomor, pengaturan);
        this.tanggalMasuk = tanggalMasuk;
        this.tanggalKeluar = tanggalKeluar;
        this.idParkirInap = idParkirInap;
    }
    
    /**
     * Sets the parking entry date of the ParkirInap (overnight/daily parking)
     * 
     * @param tanggalMasuk The parking entry date of the ParkirInap (overnight/daily parking)
     */
    public void setTanggalMasuk(LocalDate tanggalMasuk){
        this.tanggalMasuk = tanggalMasuk;
    }
    
    /**
     * Sets the parking exit date of the ParkirInap (overnight/daily parking)
     * 
     * @param tanggalKeluar The parking exit date of the ParkirInap (overnight/daily parking)
     */
    public void setTanggalKeluar(LocalDate tanggalKeluar){
        this.tanggalKeluar = tanggalKeluar;
    }
    
    /**
     * Gets the parking entry date of the ParkirInap (overnight/daily parking)
     * 
     * @return The parking entry date of the ParkirInap (overnight/daily parking)
     */
    public LocalDate getTanggalMasuk(){
        return tanggalMasuk;
    }
    
    /**
     * Gets the parking exit date of the ParkirInap (overnight/daily parking)
     * 
     * @return The parking exit date of the ParkirInap (overnight/daily parking)
     */
    public LocalDate getTanggalKeluar(){
        return tanggalKeluar;
    }

    /**
     * Gets the id of the ParkirInap
     * 
     * @return The id of the ParkirInap
     */
    public int getIdParkirInap() {
        return idParkirInap;
    }

    /**
     * Sets the id of the ParkirInap
     * 
     * @param idParkirInap The id of the ParkirInap
     */
    public void setIdParkirInap(int idParkirInap) {
        this.idParkirInap = idParkirInap;
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
        if (tanggalMasuk.compareTo(tanggalKeluar) == 0){
            return 1;
        } else {
            int durasiParkir = (int)(ChronoUnit.DAYS.between(tanggalMasuk, tanggalKeluar));
            return durasiParkir;
        }  
    }
    
     /**
     * Implementation of the method from the BisaParkir interface
     * This method sets the parking entry date to the current date
     * and updates the parking status to "PARKIR"
     * @param tipeParkir 
     */
    @Override
    public void masukParkir(String tipeParkir){
        this.tanggalMasuk = LocalDate.now();
        this.tanggalKeluar = null;
        setStatusParkir("PARKIR");
        setTipeParkir(tipeParkir);
    }
    
     /**
     * Implementation of the method from the BisaParkir interface
     * This method sets the parking exit date to the current date
     * and updates the parking status to "SELESAI"
     */
    @Override
    public void keluarParkir(){
        this.tanggalKeluar = LocalDate.now();
        setStatusParkir("SELESAI");
    }
    
}
