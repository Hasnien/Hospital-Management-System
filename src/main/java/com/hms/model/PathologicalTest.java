/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;

/**
 *
 * @author Nazmul
 */
public class PathologicalTest extends LabTest implements TestReport,CostCalculation{
    private String reagent;
    public PathologicalTest(String title,
            double cost,
            boolean isAvailable,
            String reagent){
        super(title,cost,isAvailable);
        this.reagent = reagent;
    }
    public PathologicalTest(String title,
            double cost,
            boolean isAvailable){
        super(title,cost,isAvailable);
    }
    
    @Override
    public String returnLabTestInfo(){
        String output = super.returnLabTestInfo()+"\r\n"
                +"Reagent: "+this.reagent;
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