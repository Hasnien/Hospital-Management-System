/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;

/**
 *
 * @author shahed
 */
public class RadiologicalTest extends LabTest implements TestReport,CostCalculation {
    private String plateDimention;
    public RadiologicalTest(String title,double cost,boolean isAvailable,String plateDimention){
        super(title,cost,isAvailable);
        this.plateDimention = plateDimention;
    }
    
    @Override
    public String returnLabTestInfo(){
        String output = "Test name: "+this.title + "\n"
                +"Cost: "+this.cost+"\n"
                +"PlateDimention: "+this.plateDimention+"\n"
                +"Availability: "+this.isAvailable+"\n";
        return output;
    }

    @Override
    public double calCost() {
        return 0;
    }

    @Override
    public boolean deliverReport() {
        return false;
    }
}
