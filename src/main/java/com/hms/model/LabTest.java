/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;

/**
 *
 * @author shahed
 */
public abstract class LabTest {
    protected String title;
    protected double cost;
    protected boolean isAvailable;
    
    public LabTest(){}
    public LabTest(String title,
            double cost,
            boolean isAvailable){
        this.title = title;
        this.cost = cost;
        this.isAvailable = isAvailable;
    }
    public String returnLabTestInfo(){
        String output = "Test name: "+this.title+"\r\n"+
                "cost: "+this.cost+"\r\n"+
                "Availability: "+this.isAvailable;
        return output;
    }
    
}

