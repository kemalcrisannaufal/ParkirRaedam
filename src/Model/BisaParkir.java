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
 * This is a Interface BisaParkir represents objects that can be parked
 * Objects implementing this interface should provide methods
 * for entering the parking and exiting the parking. 
 * 
 */

public interface BisaParkir {
    /**
     * Enters the parking with the specified parking type.
     * Implements in class ParkirPerJam and ParkirInap
     * @param tipeParkir The type of parking.
     */
    public void masukParkir(String tipeParkir);
    
    /**
     * Implements in class ParkirPerJam and ParkirInap
     * Exits the parking.
     */
    public void keluarParkir();
}
