/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensorconnections;

import datapackage.SensorData;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sensorbackendprogram.IDs;

/**
 *
 * @author svph1527
 */
public class ConnectionToSensorTest {
    ConnectionToSensor instance;
    
    public ConnectionToSensorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
            instance = new ConnectionToSensor();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of constructSens method, of class ConnectionToSensor.
     * @throws java.lang.Exception
     */
    @Test
    public void testConstructSens() throws Exception {
        System.out.println("constructSens");
        IDs Id = IDs.A81758FFFE03032A;
        String URL = "mockurl";
        SensorData expResult = null;
        SensorData result = instance.constructSens(Id, URL);
        assertEquals(expResult, result);

    }
    
}
