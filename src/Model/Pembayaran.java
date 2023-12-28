/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * This is a class that represents a Pembayaran (payment)
 * 
 * @author Kemal Crisannaufal
 */
import java.time.LocalDateTime;

public class Pembayaran {
     /**
     * The id of the Pembayaran (payment)
     */
    private int idPembayaran;
    
    /**
     * The total amount of the Pembayaran (payment)
     */
    private int totalBayar;
    
    /**
     * The payment time of the Pembayaran (payment)
     */
    private LocalDateTime waktuBayar;
    
    /**
    * The paid object parking of the Pembayaran (payment)
    */
    private Parkir parkir;
    
    /**
     * The paid object PetugasParkir (parking officer) of the Pembayaran (payment)
     */
    private PetugasParkir petugasparkir;
    
    
    /**
     * Construct new object of Pembayaran with id of the Pembayaran generated from database
     * 
     * @param idPembayaran The id of the Pembayaran (payment)
     * @param totalBayar The total amount of the Pembayaran (payment)
     * @param waktuBayar The payment time of the Pembayaran (payment)
     * @param parkir The paid object of the Pembayaran (payment)
     * @param petugasParkir The paid object PetugasParkir (parking officer) of the Pembayaran (payment)
     */
    public Pembayaran(int idPembayaran, int totalBayar, LocalDateTime waktuBayar, Parkir parkir, PetugasParkir petugasParkir) {
        this.idPembayaran = idPembayaran;
        this.totalBayar = totalBayar;
        this.waktuBayar = waktuBayar;
        this.parkir = parkir;
        this.petugasparkir = petugasParkir;
    }
    
    /**
     * Construct new object of Pembayaran without id of the Pembayaran for insert to database
     * 
     * @param totalBayar The total amount of the Pembayaran (payment)
     * @param waktuBayar The payment time of the Pembayaran (payment)
     * @param parkir The paid object of the Pembayaran (payment)
     * @param petugasParkir The paid object PetugasParkir (parking officer) of the Pembayaran (payment) 
     */
    public Pembayaran(int totalBayar, LocalDateTime waktuBayar, Parkir parkir, PetugasParkir petugasParkir) {
        this.totalBayar = totalBayar;
        this.waktuBayar = waktuBayar;
        this.parkir = parkir;
        this.petugasparkir = petugasParkir;
    }
    
    /**
     * Gets the id of the Pembayaran (payment)
     * 
     * @return The id of the Pembayaran (payment)
     */
    public int getIdPembayaran() {
        return this.idPembayaran;
    }

    /**
    * Sets the id of the Pembayaran (payment)
    * 
    * @param idPembayaran The id of the Pembayaran (payment)
    */
    public void setIdPembayaran(int idPembayaran) {
        this.idPembayaran = idPembayaran;
    }

    /**
     * Gets the total amount of the Pembayaran (payment)
     * 
     * @return the total amount of the Pembayaran (payment)
     */
    public int getTotalBayar() {
        return this.totalBayar;
    }

    /**
     * Sets the total amount of the Pembayaran (payment)
     * 
     * @param totalBayar the total amount of the Pembayaran (payment)
     */
    public void setTotalBayar(int totalBayar) {
        this.totalBayar = totalBayar;
    }

    /**
     * Gets the payment time of the Pembayaran (payment)
     * 
     * @return the payment time of the Pembayaran (payment)
     */
    public LocalDateTime getWaktuBayar() {
        return this.waktuBayar;
    }

    /**
     * Sets the payment time of the Pembayaran (payment)
     * 
     * @param waktuBayar the payment time of the Pembayaran (payment)
     */
    public void setWaktuBayar(LocalDateTime waktuBayar) {
        this.waktuBayar = waktuBayar;
    }

    /**
     * Gets the paid object of the Pembayaran (payment)
     * 
     * @return The paid object of the Pembayaran (payment) 
     */
    public Parkir getParkir() {
        return parkir;
    }

    /**
     * Sets the paid object of the Pembayaran (payment)
     * 
     * @param Parkir The paid object of the Pembayaran (payment) 
     */
    public void setParkir(Parkir Parkir) {
        this.parkir = Parkir;
    }

    /**
     * Gets the PetugasParkir object of the Pembayaran (payment)
     * 
     * @return The PetugasParkir object of the Pembayaran (payment)
     */
    public PetugasParkir getPetugasparkir() {
        return petugasparkir;
    }

    /**
     * Sets the PetugasParkir object of the Pembayaran (payment)
     * 
     * @param petugasparkir The PetugasParkir object of the Pembayaran (payment)
     */
    public void setPetugasparkir(PetugasParkir petugasparkir) {
        this.petugasparkir = petugasparkir;
    }
   

}
