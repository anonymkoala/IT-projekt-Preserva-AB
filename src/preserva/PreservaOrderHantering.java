/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preserva;


import PreservaView.MainWindowUI;
import javax.swing.JFrame;

/**
 *
 * @author P
 */
public class PreservaOrderHantering {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainWindowUI myFrame = new MainWindowUI();
        myFrame.setTitle("Administrera jobb");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLocationRelativeTo(null); //centrerad
        myFrame.pack(); //anpassar JFrame dialogen till kontrollernas storlek
        myFrame.setVisible(true);
    }
    
}
