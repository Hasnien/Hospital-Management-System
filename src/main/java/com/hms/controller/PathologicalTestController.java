/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.controller;

import com.hms.model.PathologicalTest;

/**
 *
 * @author shahed
 */
public class PathologicalTestController {
    static PathologicalTest pTest;

    public void initializePathologicalTest(String title,double cost,boolean isAvailable, String reAgent){
        pTest = new PathologicalTest(title,cost,isAvailable, reAgent);
    }

    public String returnTestInfo(){
        String pTestInfo = pTest.returnLabTestInfo();
        return pTestInfo;
    }

}

