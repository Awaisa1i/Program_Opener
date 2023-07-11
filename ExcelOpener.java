/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.io.IOException;
import java.awt.Desktop;
import java.io.File;
/**    
 *    ""
 * @author Noman
 */
public class ExcelOpener {
    ExcelOpener(){
        try {
            Runtime.getRuntime().exec("C:\\Program Files\\Microsoft Office\\root\\Office16\\EXCEL.EXE");
        } catch (IOException e) {
            e.printStackTrace();
        }
}
}
