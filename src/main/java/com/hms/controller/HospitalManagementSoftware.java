/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.hms.controller;

import com.hms.model.PathologicalTest;
import com.hms.model.RadiologicalTest;
import com.hms.view.Home;

/**
 *
 * @author Nazmul
 */
public class HospitalManagementSoftware {

    public static void main(String[] args) {
        new Home().setVisible(true);
        PathologicalTest pTest = new PathologicalTest("CBC",400,true,"Chemical");
               System.out.println(pTest.returnLabTestInfo());

        RadiologicalTest rTest = new RadiologicalTest("X-ray",400,true,"2+2");
        System.out.println(rTest.returnLabTestInfo());
    }
}
