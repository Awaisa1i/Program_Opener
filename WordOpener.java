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
public class WordOpener {
    WordOpener(){
        try {
            // Open a Word document using the default application
            File wordDocument = new File("C:\\Program Files\\Microsoft Office\\root\\Office16\\WINWORD.EXE");
            Desktop.getDesktop().open(wordDocument);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}