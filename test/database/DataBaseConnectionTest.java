/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import datapackage.SensorData;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author svph1527
 */
public class DataBaseConnectionTest {
    
    public DataBaseConnectionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of insertToERSdb method, of class DataBaseConnection.
     */
    @Test
    public void testInsertToERSdb() {
        System.out.println("insertToERSdb");
        SensorData sens = null;
        DataBaseConnection.insertToERSdb(sens);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertToESM5Kdb method, of class DataBaseConnection.
     */
    @Test
    public void testInsertToESM5Kdb() {
        System.out.println("insertToESM5Kdb");
        SensorData sens = null;
        DataBaseConnection.insertToESM5Kdb(sens);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
