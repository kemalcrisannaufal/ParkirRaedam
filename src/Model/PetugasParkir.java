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
 * This is a code the represents a PetugasParkir (parking officer).
 *  * 
 */

public class PetugasParkir {
    /**
     * The id of the PetugasParkir 
     */
    private int idPetugas;
    
    /**
    * The name of the PetugasParkir
    */
    private String namaPetugas;
    
    /**
     * The username of the PetugasParkir
     */
    private String username;
    
    /**
     * The password of the PetugasParkir
     */
    private String password;
    
    /**
     * The phone number of the PetugasParkir
     */
    private String nomorHandphone;
    
    /**
     * The email of the PetugasParkir
     */
    private String emailPetugas;

    /**
     * Constructs a new PetugasParkir object with the given name, phone number, email, username, and password.
     * 
     * @param namaPetugas The name of the PetugasParkir (parking officer).
     * @param nomorHandphone The phone number of the PetugasParkir (parking officer).
     * @param emailPetugas The email of the PetugasParkir (parking officer).
     * @param username The username of the PetugasParkir (parking officer).
     * @param password The password of the PetugasParkir (parking officer).
     */
    public PetugasParkir(String namaPetugas, String nomorHandphone, String emailPetugas, String username, String password){
        this.namaPetugas = namaPetugas;
        this.nomorHandphone = nomorHandphone;
        this.emailPetugas = emailPetugas;
        this.username = username;
        this.password = password;
    }
    
    /**
     * Constructs a new PetugasParkir object with the given name, phone number, email, username, and password.
     * 
     * @param idPetugas The id of the PetugasParkir 
     * @param namaPetugas The name of the PetugasParkir (parking officer).
     * @param nomorHandphone The phone number of the PetugasParkir (parking officer).
     * @param emailPetugas The email of the PetugasParkir (parking officer).
     * @param username The username of the PetugasParkir (parking officer).
     * @param password The password of the PetugasParkir (parking officer).
     */
    public PetugasParkir(int idPetugas, String namaPetugas, String nomorHandphone, String emailPetugas, String username, String password){
        this.idPetugas = idPetugas;
        this.namaPetugas = namaPetugas;
        this.nomorHandphone = nomorHandphone;
        this.emailPetugas = emailPetugas;
        this.username = username;
        this.password = password;
    }

    /**
     * Gets the username of the PetugasParkir (parking officer).
     * 
     * @return the username of the PetugasParkir (parking officer).
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the username of the PetugasParkir (parking officer).
     * 
     * @param username The username of the PetugasParkir (parking officer).
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets the password of the PetugasParkir (parking officer).
     * 
     * @return The password of the PetugasParkir (parking officer).
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password of the PetugasParkir (parking officer).
     * 
     * @param password The password of the PetugasParkir (parking officer).
     */
    public void setPassword(String password) {
        this.password = password;
    }
      
    /**
     * Sets the id of the PetugasParkir (parking officer).
     * 
     * @param idPetugas The id of the PetugasParkir (parking officer).
     */
    public void setIdPetugas(int idPetugas){
        this.idPetugas = idPetugas;
    }
    
    /**
     * Sets the name of the PetugasParkir (parking officer).
     * 
     * @param namaPetugas The name of PetugasParkir (parking officer).
     */
    public void setNamaPetugas(String namaPetugas) {
        this.namaPetugas = namaPetugas;
    }

    /**
     * Sets the phone number of the PetugasParkir (parking officer).
     * 
     * @param nomorHandphone The phone number of the PetugasParkir (parking officer).
     */
    public void setNomorHandphone(String nomorHandphone) {
        this.nomorHandphone = nomorHandphone;
    }

    /**
     * Sets the email of the PetugasParkir (parking officer).
     * 
     * @param emailPetugas The email of the PetugasParkir (parking officer).
     */
    public void setEmailPetugas(String emailPetugas) {
        this.emailPetugas = emailPetugas;
    }
    
    /**
     * Gets the id of the PetugasParkir (parking officer).
     * 
     * @return The id of the PetugasParkir (parking officer).
     */
    public int getIdPetugas() {
        return idPetugas;
    }

    /**
      * Gets the name of the PetugasParkir (parking officer).
      * 
      * @return The name of the PetugasParkir (parking officer).
      */
    public String getNamaPetugas() {
        return namaPetugas;
    }

    /**
     * Gets the phone number of the PetugasParkir (parking officer).
     * 
     * @return The phone number of the PetugasParkir (parking officer).
     */
    public String getNomorHandphone() {
        return nomorHandphone;
    }

    /**
     * Gets the email of the PetugasParkir (parking officer).
     * 
     * @return The email of the PetugasParkir (parking officer).
     */
    public String getEmailPetugas() {
        return emailPetugas;
    }
    
}
