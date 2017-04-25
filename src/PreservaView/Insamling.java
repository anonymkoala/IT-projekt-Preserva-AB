/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PreservaView;

import PreservaView.MainWindowUI;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Per
 */
public class Insamling {
    private String startDatum;
    private String Kommentar;
    private ArrayList insamlingsdoman = new ArrayList<String>();
    private String status;
    private String insamlingsprofil;
    private String insamladWebbplats;
    private String insamlingsRapport;
    private String kundnamn;
    private int insamlingsNr;
    
    public Insamling(String kundnamn, String startDatum, String insamlingsprofil, String kommentar) {
     this.kundnamn = kundnamn;
     this.startDatum = startDatum;
     this.insamlingsprofil = insamlingsprofil;
     this.Kommentar = kommentar;
    }
    
    public Insamling() {
   
    }

    /*
    private String addToDB(){
        
        try{
            //Anropa metod i StudentMngr (control-klassen) för att lägga till student
            ArendeMngr emgr = new ArendeMngr();
            if (emgr.addArendeToDb(arende).equals("success")){
                JOptionPane.showMessageDialog(this, "Ärendet lades till i databasen");
            }else{
                JOptionPane.showMessageDialog(this, "Kunde inte lägga till Ärende!");
            }
        //Fånga eventuella run-time fel: vanligast i detta fall är försök att lägga till poster
        //med samma PK    
        } catch (RollbackException ex) {
            JOptionPane.showMessageDialog(this, "Databasfel!\r "
                    + "Exekvering mot db avbröts eftersom det skulle ha orsakat en dubblettnyckel i tabellen Ärende ");   
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "FEL! " + ex.getMessage());
        
        }
        
        
        return "";
        
    }
    */
    /**
     * @return the startDatum
     */
    public String getStartDatum() {
        return startDatum;
    }

    /**
     * @param startDatum the startDatum to set
     */
    public void setStartDatum(String startDatum) {
        this.startDatum = startDatum;
    }

    /**
     * @return the Kommentar
     */
    public String getKommentar() {
        return Kommentar;
    }

    /**
     * @param Kommentar the Kommentar to set
     */
    public void setKommentar(String Kommentar) {
        this.Kommentar = Kommentar;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the insamlingsprofil
     */
    public String getInsamlingsprofil() {
        return insamlingsprofil;
    }

    /**
     * @param insamlingsprofil the insamlingsprofil to set
     */
    public void setInsamlingsprofil(String insamlingsprofil) {
        this.insamlingsprofil = insamlingsprofil;
    }

    /**
     * @return the insamladWebbplats
     */
    public String getInsamladWebbplats() {
        return insamladWebbplats;
    }

    /**
     * @param insamladWebbplats the insamladWebbplats to set
     */
    public void setInsamladWebbplats(String insamladWebbplats) {
        this.insamladWebbplats = insamladWebbplats;
    }

    /**
     * @return the insamlingsRapport
     */
    public String getInsamlingsRapport() {
        return insamlingsRapport;
    }

    /**
     * @param insamlingsRapport the insamlingsRapport to set
     */
    public void setInsamlingsRapport(String insamlingsRapport) {
        this.insamlingsRapport = insamlingsRapport;
    }

    /**
     * @return the insamlingsdoman
     */
    public ArrayList getInsamlingsdoman() {
        return insamlingsdoman;
    }

    /**
     * @param insamlingsdoman the insamlingsdoman to set
     */
    public void setInsamlingsdoman(ArrayList insamlingsdoman) {
        this.insamlingsdoman = insamlingsdoman;
    }

    /**
     * @return the kundnamn
     */
    public String getKundnamn() {
        return kundnamn;
    }

    /**
     * @param kundnamn the kundnamn to set
     */
    public void setKundnamn(String kundnamn) {
        this.kundnamn = kundnamn;
    }

    /**
     * @return the insamlingsNr
     */
    public int getInsamlingsNr() {
        return insamlingsNr;
    }

    /**
     * @param insamlingsNr the insamlingsNr to set
     */
    public void setInsamlingsNr(int insamlingsNr) {
        this.insamlingsNr = insamlingsNr;
    }
    
}
