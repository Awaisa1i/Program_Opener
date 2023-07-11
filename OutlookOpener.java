/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/**
 *     C:\Program Files\Microsoft Office\root\Office16\OUTLOOK.EXE
 * @author Noman
 */
public class OutlookOpener {
    OutlookOpener(){
        try {
            Runtime.getRuntime().exec(" C:\\Program Files\\Microsoft Office\\root\\Office16\\OUTLOOK.EXE");
        } catch (IOException e) {
            e.printStackTrace();
        }
}
}
