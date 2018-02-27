/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensorbackendprogram;

import database.DataBaseConnection;
import sensorconnections.ConnectionToSensor;
import datapackage.SensorData;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DL
 */
public class TimedRunner {

    public static void timedRun() {
        Timer maintainer = new Timer();
        
        maintainer.schedule(new TimerTask() {
            @Override
            public void run() {
                try {
                    ConnectionToSensor queryconstructor = new ConnectionToSensor();
                    SensorData sens1 = queryconstructor.constructSens(IDs.A81758FFFE03032A, URLholder.URL_FOR_3032A);
                    DataBaseConnection.insertToERSdb(sens1);
                    SensorData sens2 = queryconstructor.constructSens(IDs.A81758FFFE03032B, URLholder.URL_FOR_3032B);
                    DataBaseConnection.insertToERSdb(sens2);
                    SensorData sens3 = queryconstructor.constructSens(IDs.A81758FFFE03032C, URLholder.URL_FOR_3032C);
                    DataBaseConnection.insertToERSdb(sens3);
                    SensorData sens4 = queryconstructor.constructSens(IDs.A81758FFFE03032D, URLholder.URL_FOR_3032D);
                    DataBaseConnection.insertToERSdb(sens4);
                    SensorData sens5 = queryconstructor.constructSens(IDs.A81758FFFE03050A, URLholder.URL_FOR_3050A);
                    DataBaseConnection.insertToERSdb(sens5);
                    SensorData sens6 = queryconstructor.constructSens(IDs.A81758FFFE030509, URLholder.URL_FOR_30509);
                    DataBaseConnection.insertToESM5Kdb(sens6);
                    System.out.println("SQL queries sent!");
                } catch (IOException ex) {
                    Logger.getLogger(TimedRunner.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }, 0, 30 * 1000);
    }
}
