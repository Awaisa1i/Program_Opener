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
 *
 * @author Noman
 */
public class settingOpener {
    settingOpener(){
        try {
            Runtime.getRuntime().exec("cmd /c start ms-settings:");
        } catch (IOException e) {
            e.printStackTrace();
        }
}
}