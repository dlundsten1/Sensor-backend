/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import datapackage.SensorData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author DL
 */
public class DataBaseConnection extends SensorData {

    /**
     *
     * Skriver sensordata till databas.
     * För sensorer av typen ERS
     * @param sens
     */
    public static void insertToERSdb(SensorData sens) {
        PreparedStatement insertqueryforERS;

        try (final Connection conn = DriverManager.getConnection(DBdata.DBURL, DBdata.USERNAME, DBdata.PASSWORD)) {
            insertqueryforERS = conn.prepareStatement(DBdata.QUERY_FOR_ERS);
            insertqueryforERS.setString(1, sens.getTime());
            insertqueryforERS.setFloat(2, sens.dd.getTemperature());
            insertqueryforERS.setString(3, sens.dd.getHumidity());
            insertqueryforERS.setString(4, sens.dd.getLight());
            insertqueryforERS.setString(5, sens.dd.getPir());
            insertqueryforERS.setFloat(6, sens.dd.getVdd());
            insertqueryforERS.setString(7, sens.dd.getRssi());
            insertqueryforERS.setFloat(8, sens.dd.getSnr());
            insertqueryforERS.setString(9, sens.dd.getSf());
            insertqueryforERS.setString(10, sens.getId());


            insertqueryforERS.executeUpdate();
            insertqueryforERS.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Cannot connect the database because of " + e);
        } catch (IllegalStateException ie) {
            System.out.println("Issues arose when commiting INSERT, was caused by " + ie);
        }
    }
    
    /**
     *
     * Skriver sensordata till databas.
     * För sensorerna av typ ESM5K.
     *
     * @param sens
     */
    public static void insertToESM5Kdb(SensorData sens) {
        PreparedStatement insertqueryforESM5K;

        try (final Connection conn = DriverManager.getConnection(DBdata.DBURL, DBdata.USERNAME, DBdata.PASSWORD)) {

            insertqueryforESM5K = conn.prepareStatement(DBdata.QUERY_FOR_ESM5K);
            insertqueryforESM5K.setString(1, sens.getTime());
            insertqueryforESM5K.setString(2, sens.getId());
            insertqueryforESM5K.setFloat(3, sens.dd.getTemperature());
            insertqueryforESM5K.setString(4, sens.dd.getHumidity());
            insertqueryforESM5K.setString(5, sens.dd.getLevelling());
            insertqueryforESM5K.setFloat(6, sens.dd.getRotation());
            insertqueryforESM5K.setString(7, sens.dd.getX());
            insertqueryforESM5K.setString(8, sens.dd.getY());
            insertqueryforESM5K.setString(9, sens.dd.getZ());
            insertqueryforESM5K.setString(10, sens.dd.getAccmotion());
            insertqueryforESM5K.setString(11, sens.dd.getLight());
            insertqueryforESM5K.setFloat(12, sens.dd.getVdd());
            insertqueryforESM5K.setString(13, sens.dd.getRssi());
            insertqueryforESM5K.setFloat(14, sens.dd.getSnr());
            insertqueryforESM5K.setString(15, sens.dd.getSf());
            
            insertqueryforESM5K.executeUpdate();
            insertqueryforESM5K.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Cannot connect the database because of " + e);
        } catch (IllegalStateException ie) {
            System.out.println("Issues arose when commiting INSERT, was caused by " + ie);
        }

    }
}