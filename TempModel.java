/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author b00069477
 */
public class TempModel {
    private int temperature;
    private int maxTemp = 50;
    private int minTemp = 0;
    public TempModel()
    {
        temperature = 20;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    
    
    public void decTemp()
    {
        if ( temperature <= minTemp) return;
        this.temperature--;
        
    }
    
    
    public void incTemp()
    {
        if ( temperature >= maxTemp) return;
        this.temperature++;
        
    }
    
    
    
    
}
