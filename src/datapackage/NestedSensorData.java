/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datapackage;

/**
 *
 * @author DL
 */
public class NestedSensorData {
    
    float temperature;
    String humidity;
    String light;
    String pir;
    float vdd;
    String RSSI;
    float SNR;
    String SF;
    String levelling;
    float rotation;
    String x;
    String y;
    String z;
    String accmotion;

    //For ERS sensor
    public float getTemperature() {
        return this.temperature;
    }

    public String getHumidity() {
        return this.humidity;
    }

    public String getLight() {
        return this.light;
    }
    
    public String getPir() {
        return this.pir;
    }

    public float getVdd() {
        return this.vdd;
    }

    public String getRssi() {
        return this.RSSI;
    }

    public float getSnr() {
        return this.SNR;
    }

    public String getSf() {
        return this.SF;
    }

    //For ESM5K sensor
        
    public String getLevelling() {
        return this.levelling;
    }

    public float getRotation() {
        return this.rotation;
    }
    
    public String getX() {
        return this.x;
    }
    
    public String getY() {
        return this.y;
    }
    
    public String getZ() {
        return this.z;
    }
    
    public String getAccmotion() {
        return this.accmotion;
    }
}
