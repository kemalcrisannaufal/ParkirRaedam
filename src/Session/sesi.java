/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

/**
 * The class to save the user active login session
 * 
 * @author Kemal Crisannaufal
 */
import View.Welcome;
import Model.PetugasParkir;

public class sesi {
    /**
     * The username of the user active 
     */
    public static String username;
    
    /**
     * The object of PetugasParkir who active in application
     */
    public static PetugasParkir petugas;
    
    public static void main(String[] args){
        new Welcome().setVisible(true);
    }
}
