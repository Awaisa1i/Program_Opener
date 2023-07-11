/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/**   C:\Program Files\Microsoft OneDrive\OneDrive.exe
 *
 * @author Noman
 */
public class onedriveOpener {
              public static void main(String[] args) {
        try {
            Runtime.getRuntime().exec("C:\\Program Files\\Microsoft OneDrive\\OneDrive.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
}
}
