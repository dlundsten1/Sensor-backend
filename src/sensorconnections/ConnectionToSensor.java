/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensorconnections;

import datapackage.SensorData;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import sensorbackendprogram.IDs;


/**
 *
 * @author DL
 */
public class ConnectionToSensor {
       
    public SensorData constructSens(IDs Id, String URL) throws MalformedURLException, IOException {         
        String response = getSensorData(URL);
        Gson gson = new Gson();
        SensorData[] sens = gson.fromJson(response, SensorData[].class);
        sens[0].setId(Id);
        return sens[0];
    }

    private String getSensorData(String URL) throws MalformedURLException, IOException {
        URL url = new URL(URL);
        //make connection
        URLConnection urlc = url.openConnection();
        InputStream is = urlc.getInputStream();
        Scanner reader = new Scanner(is);
        String response = reader.nextLine();
        return response;
    }
    
}
