/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UppdragsarkivMain;

import Uppdragsarkiv.View.MainWindowUI;
import javax.swing.JFrame;

/**
 *
 * @author P
 */
public class UppdragshanteringApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainWindowUI jFrame = new MainWindowUI();
        jFrame.setTitle("Uppdragshantering");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    
}
