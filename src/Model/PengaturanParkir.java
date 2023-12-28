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
 * This is a clas that represents a PengaturanParkir (parking configuration) 
 * 
 */

import java.time.LocalDateTime;

public class PengaturanParkir {
    /**
     * The id of the PengaturanParkir (parking configuration) 
     */
    private int idPengaturan;
    
    /**
     * The motorcycle parking capacity
     */
    private int kuotaParkirMotor;
    
    /**
     * The car parking capacity
     */
    private int kuotaParkirMobil;
    
    /**
     * The motorcycle parking rate per hour
     */
    private int tarifParkirMotorPerJam;
    
    /**
     * The car parking rate per hour
     */
    private int tarifParkirMobilPerJam;
    
    /**
     * The motorcycle parking rate per day
     */
    private int tarifParkirMotorPerHari;
    
    /**
     * The car parking rate per day
     */
    private int tarifParkirMobilPerHari;
    
    /**
     * The performed configuration time
     */
    private LocalDateTime waktuAtur;
    
    /**
     * The PetugasParkir (parking officer) who sets the parking configuration
     */
    private PetugasParkir petugasParkir;

    
    /**
     * Constructs a new PengaturanParkir if the PengaturanParkir have the id generated from database
     * 
     * @param idPengaturan The id of the PengaturanParkir (parking configuration)
     * @param kuotaParkirMotor The parking capacity of the motorcycle 
     * @param kuotaParkirMobil The parking capacity of the car 
     * @param tarifParkirMotorPerJam The motorcycle parking rate per hour
     * @param tarifParkirMobilPerJam The car parking rate per hour
     * @param tarifParkirMotorPerHari The motorcycle parking rate per day
     * @param tarifParkirMobilPerHari The car parking rate per day
     * @param waktuAtur The performed configuration time
     * @param petugasParkir The PetugasParkir (parking officer) who sets the parking configuration
     */
    public PengaturanParkir(int idPengaturan, int kuotaParkirMotor, int kuotaParkirMobil, int tarifParkirMotorPerJam, int tarifParkirMobilPerJam, int tarifParkirMotorPerHari, int tarifParkirMobilPerHari, LocalDateTime waktuAtur, PetugasParkir petugasParkir) {
        this.idPengaturan = idPengaturan;
        this.kuotaParkirMotor = kuotaParkirMotor;
        this.kuotaParkirMobil = kuotaParkirMobil;
        this.tarifParkirMotorPerJam = tarifParkirMotorPerJam;
        this.tarifParkirMobilPerJam = tarifParkirMobilPerJam;
        this.tarifParkirMotorPerHari = tarifParkirMotorPerHari;
        this.tarifParkirMobilPerHari = tarifParkirMobilPerHari;
        this.waktuAtur = waktuAtur;
        this.petugasParkir = petugasParkir;
    }
    
    /**
     * Constructs a new PengaturanParkir if the PengaturanParkir have the id generated from database
     * 
     * 
     * @param kuotaParkirMotor The parking capacity of the motorcycle 
     * @param kuotaParkirMobil The parking capacity of the car 
     * @param tarifParkirMotorPerJam The motorcycle parking rate per hour
     * @param tarifParkirMobilPerJam The car parking rate per hour
     * @param tarifParkirMotorPerHari The motorcycle parking rate per day
     * @param tarifParkirMobilPerHari The car parking rate per day
     * @param waktuAtur The performed configuration time
     * @param petugasParkir The PetugasParkir (parking officer) who sets the parking configuration
     */
    public PengaturanParkir(int kuotaParkirMotor, int kuotaParkirMobil, int tarifParkirMotorPerJam, int tarifParkirMobilPerJam, int tarifParkirMotorPerHari, int tarifParkirMobilPerHari, LocalDateTime waktuAtur, PetugasParkir petugasParkir) {
        this.kuotaParkirMotor = kuotaParkirMotor;
        this.kuotaParkirMobil = kuotaParkirMobil;
        this.tarifParkirMotorPerJam = tarifParkirMotorPerJam;
        this.tarifParkirMobilPerJam = tarifParkirMobilPerJam;
        this.tarifParkirMotorPerHari = tarifParkirMotorPerHari;
        this.tarifParkirMobilPerHari = tarifParkirMobilPerHari;
        this.waktuAtur = waktuAtur;
        this.petugasParkir = petugasParkir;
    }
    
    /**
     * Sets the id of the PengaturanParkir (parking configuration) 
     * 
     * @param idPengaturan The id of the PengaturanParkir (parking configuration)
     */
    public void setIdPengaturan(int idPengaturan) {
        this.idPengaturan = idPengaturan;
    }

    /**
     * Sets the parking capacity of the motorcycle 
     * 
     * @param kuotaParkirMotor  The motorcycle parking capacity of the PengaturanParkir (parking configuration)
     */
    public void setKuotaParkirMotor(int kuotaParkirMotor) {
        this.kuotaParkirMotor = kuotaParkirMotor;
    }

    /**
     * Sets the parking capacity of the car
     * 
     * @param kuotaParkirMobil The car parking capacity of the PengaturanParkir (parking configuration)
     */
    public void setKuotaParkirMobil(int kuotaParkirMobil) {
        this.kuotaParkirMobil = kuotaParkirMobil;
    }

    /**
     * Sets the motorcycle parking rate per hour of the PengaturanParkir (parking configuration)
     * 
     * @param tarifParkirMotorPerJam The motorcycle parking rate per hour of the PengaturanParkir (parking configuration)
     */
    public void setTarifParkirMotorPerJam(int tarifParkirMotorPerJam) {
        this.tarifParkirMotorPerJam = tarifParkirMotorPerJam;
    }

    /**
     * Sets the car parking rate per hour of the PengaturanParkir (parking configuration)
     * 
     * @param tarifParkirMobilPerJam The car parking rate per hour of the PengaturanParkir (parking configuration)
     */
    public void setTarifParkirMobilPerJam(int tarifParkirMobilPerJam) {
        this.tarifParkirMobilPerJam = tarifParkirMobilPerJam;
    }

    /**
     * Sets the motorcycle parking rate per day of the PengaturanParkir (parking configuration)
     * 
     * @param tarifParkirMotorPerHari The motorcycle parking rate per day of the PengaturanParkir (parking configuration)
     */
    public void setTarifParkirMotorPerHari(int tarifParkirMotorPerHari) {
        this.tarifParkirMotorPerHari = tarifParkirMotorPerHari;
    }

    /**
     * Sets the car parking rate per day of the PengaturanParkir (parking configuration)
     * 
     * @param tarifParkirMobilPerHari  The car parking rate per day of the PengaturanParkir (parking configuration)
     */
    public void setTarifParkirMobilPerHari(int tarifParkirMobilPerHari) {
        this.tarifParkirMobilPerHari = tarifParkirMobilPerHari;
    }
    
    /**
     * Sets the performed configuration time of the PengaturanParkir (parking configuration)
     * 
     * @param waktuAtur the performed configuration time of the PengaturanParkir (parking configuration)
     */
    public void setWaktuAtur(LocalDateTime waktuAtur) {
        this.waktuAtur = waktuAtur;
    }

    /**
     * Sets the PetugasParkir (parking officer) who sets the parking configuration
     * 
     * @param petugasParkir The PetugasParkir (parking officer) who sets the parking configuration
     */
    public void setPetugasParkir(PetugasParkir petugasParkir) {
        this.petugasParkir = petugasParkir;
    }

    /**
     * Gets the PetugasParkir (parking officer) who sets the parking configuration
     * 
     * @return the PetugasParkir (parking officer) who sets the parking configuration
     */
    public PetugasParkir getPetugasParkir() {
        return petugasParkir;
    }
    
    /**
     * Gets the performed configuration time of the PengaturanParkir (parking configuration)
     * 
     * @return the performed configuration time  of the PengaturanParkir (parking configuration)
     */
    public LocalDateTime getWaktuAtur() {
        return waktuAtur;
    }

    /**
     * Gets the id of the PengaturanParkir (parking configuration)
     * 
     * @return The id of the PengaturanParkir (parking configuration)
     */
    public int getIdPengaturan() {
        return idPengaturan;
    }

    /**
     * Gets the motorcycle parking capacity of the PengaturanParkir (parking configuration)
     * 
     * @return The motorcycle parking capacity of the PengaturanParkir (parking configuration)
     */
    public int getKuotaParkirMotor() {
        return kuotaParkirMotor;
    }

    /**
     * Gets the car parking capacity of the PengaturanParkir (parking configuration)
     * 
     * @return The car parking capacity of the PengaturanParkir (parking configuration)
     */

    public int getKuotaParkirMobil() {
        return kuotaParkirMobil;
    }

    /**
     * Gets the motorcycle parking rate per hour of the PengaturanParkir (parking configuration)
     * 
     * @return The motorcycle parking rate per hour of the PengaturanParkir (parking configuration)
     */
    public int getTarifParkirMotorPerJam() {
        return tarifParkirMotorPerJam;
    }

    /**
     * Gets the car parking rate per hour of the PengaturanParkir (parking configuration)
     * 
     * @return the car parking rate per hour of the PengaturanParkir (parking configuration)
     */
    public int getTarifParkirMobilPerJam() {
        return tarifParkirMobilPerJam;
    }

    /**
     * Gets the motorcycle parking rate per day of the PengaturanParkir (parking configuration)
     *  
     * @return The motorcycle parking rate per day of the PengaturanParkir (parking configuration)
     */
    public int getTarifParkirMotorPerHari() {
        return tarifParkirMotorPerHari;
    }

    /**
     * Gets the car parking rate per day of the PengaturanParkir (parking configuration)
     * 
     * @return The car parking rate per day of the PengaturanParkir (parking configuration)
     */
    public int getTarifParkirMobilPerHari() {
        return tarifParkirMobilPerHari;
    }
   
}
