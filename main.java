/*
 * To change frame license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Noman
 */
public class main implements ActionListener{
    JButton word;
    JButton whatsapp;
    JButton powerpoint;
    JButton excel;
    JButton outlook;
    JButton chrome;
    JButton micro;
    
    
    main(){
//        GUI myframe = new GUI();

        JFrame frame = new JFrame();
        frame.setTitle("Program Opener");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,500);
        frame.setResizable(false);
        frame.setVisible(true);
        ImageIcon image = new ImageIcon("icon.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(170,200,167));
        
//        Label
        Container con = new Container();
        con.setLayout(null);
        
        JLabel label = new JLabel();
        label.setText("PROGRAM OPENER");
        label.setBounds(260,20,230,30);
        label.setForeground(new Color(253, 255, 174));
        label.setFont(new Font("Serif",Font.BOLD,20));
        frame.add(label);
        
//        Buttons
        frame.setLayout(null);
        word = new JButton("Word");
        whatsapp = new JButton("Setting");
        powerpoint = new JButton("PowerPoint");
        excel = new JButton("Excel");
        outlook =new JButton("Outlook");
        chrome = new JButton("Chrome");
        micro = new JButton("Microsoft");
        
        word.setSize(100,30);
        word.setLocation(50,250);
        whatsapp.setSize(100,30);
        whatsapp.setLocation(200,250);
        powerpoint.setSize(100,30);
        powerpoint.setLocation(350,250);
        excel.setSize(100,30);
        excel.setLocation(500,250);
        outlook.setSize(100,30);
        outlook.setLocation(50,300);
        chrome.setSize(100,30);
        chrome.setLocation(200,300);
        micro.setSize(100,30);
        micro.setLocation(350,300);
        
        word.addActionListener(this);
        whatsapp.addActionListener(this);
        powerpoint.addActionListener(this);
        excel.addActionListener(this);
        outlook.addActionListener(this);
        chrome.addActionListener(this);
        micro.addActionListener(this);
        
        frame.add(word);
        frame.add(whatsapp);
        frame.add(powerpoint);
        frame.add(excel);
        frame.add(outlook);
        frame.add(chrome);
        frame.add(micro);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==word){
            WordOpener wordopener = new WordOpener();
        }
        if(e.getSource()==powerpoint){
            pptopener pptOpener = new pptopener();
        }
        if(e.getSource()==whatsapp){
            settingOpener settingopener = new settingOpener();
        }
        if(e.getSource()==excel){
            ExcelOpener excelopener = new ExcelOpener();
        }
        if(e.getSource()==outlook){
            OutlookOpener outluk = new OutlookOpener();
        }
        if(e.getSource()==chrome){
            chrome Chr = new chrome();
        }
        if(e.getSource()==micro){
            microsoftOpener mic = new microsoftOpener();
        }
    }
}
    

