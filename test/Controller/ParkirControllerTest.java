/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Parkir;
import java.util.ArrayList;
import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kemal Crisannaufal
 */
public class ParkirControllerTest {
    
    public ParkirControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getListParkir method, of class ParkirController.
     */
    @Test
    public void testGetListParkir() {
        System.out.println("getListParkir");
        ParkirController instance = new ParkirController();
        ArrayList<Parkir> expResult = null;
        ArrayList<Parkir> result = instance.getListParkir();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getListParkirParkir method, of class ParkirController.
     */
    @Test
    public void testGetListParkirParkir() {
        System.out.println("getListParkirParkir");
        ParkirController instance = new ParkirController();
        ArrayList<Parkir> expResult = null;
        ArrayList<Parkir> result = instance.getListParkirParkir();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getnMotor method, of class ParkirController.
     */
    @Test
    public void testGetnMotor() {
        System.out.println("getnMotor");
        ParkirController instance = new ParkirController();
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getnMobil method, of class ParkirController.
     */
    @Test
    public void testGetnMobil() {
        System.out.println("getnMobil");
        ParkirController instance = new ParkirController();
        int expResult = 0;
        int result = instance.getnMobil();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchByPlateNum method, of class ParkirController.
     */
    @Test
    public void testSearchByPlateNum() {
        System.out.println("searchByPlateNum");
        String nomor = "";
        ParkirController instance = new ParkirController();
        Parkir expResult = null;
        Parkir result = instance.searchByPlateNum(nomor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchById method, of class ParkirController.
     */
    @Test
    public void testSearchById() {
        System.out.println("searchById");
        int id = 0;
        ParkirController instance = new ParkirController();
        Parkir expResult = null;
        Parkir result = instance.searchById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllParkirData method, of class ParkirController.
     */
    @Test
    public void testGetAllParkirData() {
        System.out.println("getAllParkirData");
        ParkirController instance = new ParkirController();
        ArrayList<Parkir> expResult = null;
        ArrayList<Parkir> result = instance.getAllParkirData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertParkir method, of class ParkirController.
     */
    @Test
    public void testInsertParkir() {
        System.out.println("insertParkir");
        Parkir parkir = null;
        ParkirController instance = new ParkirController();
        instance.insertParkir(parkir);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateParkir method, of class ParkirController.
     */
    @Test
    public void testUpdateParkir() {
        System.out.println("updateParkir");
        Parkir parkir = null;
        ParkirController instance = new ParkirController();
        instance.updateParkir(parkir);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createObjekMasukParkir method, of class ParkirController.
     */
    @Test
    public void testCreateObjekMasukParkir() {
        System.out.println("createObjekMasukParkir");
        String nomorKendaraan = "";
        String jenisKendaraan = "";
        String tipeParkir = "";
        ParkirController instance = new ParkirController();
        Parkir expResult = null;
        Parkir result = instance.createObjekMasukParkir(nomorKendaraan, jenisKendaraan, tipeParkir);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchParkirByTanggal method, of class ParkirController.
     */
    @Test
    public void testSearchParkirByTanggal() {
        System.out.println("searchParkirByTanggal");
        Date tanggal = null;
        ParkirController instance = new ParkirController();
        ArrayList<Parkir> expResult = null;
        ArrayList<Parkir> result = instance.searchParkirByTanggal(tanggal);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isParkirKosong method, of class ParkirController.
     */
    @Test
    public void testIsParkirKosong() {
        System.out.println("isParkirKosong");
        String jenisKendaraan = "";
        ParkirController instance = new ParkirController();
        boolean expResult = false;
        boolean result = instance.isParkirKosong(jenisKendaraan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteData method, of class ParkirController.
     */
    @Test
    public void testDeleteData() {
        System.out.println("deleteData");
        Parkir parkir = null;
        ParkirController instance = new ParkirController();
        int expResult = 0;
        int result = instance.deleteData(parkir);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteParkirPerJam method, of class ParkirController.
     */
    @Test
    public void testDeleteParkirPerJam() {
        System.out.println("deleteParkirPerJam");
        int idParkirPerJam = 0;
        ParkirController instance = new ParkirController();
        instance.deleteParkirPerJam(idParkirPerJam);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteParkirInap method, of class ParkirController.
     */
    @Test
    public void testDeleteParkirInap() {
        System.out.println("deleteParkirInap");
        int idParkirInap = 0;
        ParkirController instance = new ParkirController();
        instance.deleteParkirInap(idParkirInap);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateDataParkir method, of class ParkirController.
     */
    @Test
    public void testUpdateDataParkir() {
        System.out.println("updateDataParkir");
        Parkir parkir = null;
        String platNomor = "";
        String tipeParkir = "";
        String jenisKendaraan = "";
        String waktuMasuk = "";
        ParkirController instance = new ParkirController();
        instance.updateDataParkir(parkir, platNomor, tipeParkir, jenisKendaraan, waktuMasuk);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
