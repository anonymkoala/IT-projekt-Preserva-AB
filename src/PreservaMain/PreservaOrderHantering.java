package PreservaMain;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



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
        // Starts the MainWindowUI 
        MainWindowUI myFrame = new MainWindowUI();
        myFrame.setTitle("Preserva Orderhantering");
        myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        myFrame.setLocationRelativeTo(null); //centrerad
        myFrame.pack(); //anpassar JFrame dialogen till kontrollernas storlek
        myFrame.setVisible(true);
    }
    
}
