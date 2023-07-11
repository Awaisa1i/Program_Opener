/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author Noman
 */
public class chrome {
    chrome(){
        try {
            // Open a webpage in Chrome
            URI webpageURI = new URI("https://www.google.com");
            
            // Specify the Chrome browser path
            String chromePath = "C:/Program Files/Google/Chrome/Application/chrome.exe";
            System.setProperty("webdriver.chrome.driver", chromePath);
            
            // Open the webpage in Chrome
            Desktop.getDesktop().browse(webpageURI);
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
