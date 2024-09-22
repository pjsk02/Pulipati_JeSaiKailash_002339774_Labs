/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author KAILASH
 */
public class VitalSigns {

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getBloodPressure() {
        return BloodPressure;
    }

    public void setBloodPressure(Double BloodPressure) {
        this.BloodPressure = BloodPressure;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }
    String date;
    Double BloodPressure;
    Double temperature;
    int pulse;
    
    
}
