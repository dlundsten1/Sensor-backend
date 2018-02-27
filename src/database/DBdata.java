/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author DL
 */
public class DBdata {
    
    protected static final String QUERY_FOR_ERS = "INSERT INTO ERS_sensor_DB (TIME, TEMPERATURE, "
            + "HUMIDITY, LIGHT, PIR, VDD, RSSI, SNR, SF, ID) "
        + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    protected static final String QUERY_FOR_ESM5K = "INSERT INTO ESM5K_sensor_DB (TIME, ID,"
            + "TEMPERATURE, HUMIDITY, LEVELLING, ROTATION, X, Y, Z, ACCMOTION,"
            + "LIGHT, VDD, RSSI, SNR, SF) "
        + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    protected static final String DBURL = "jdbc:mysql://atlantis.informatik.umu.se:3306/svph1518_db_ht2016";
    protected static final String USERNAME = "svph1518_2016264";
    protected static final String PASSWORD = "zumenyhyb";

}
