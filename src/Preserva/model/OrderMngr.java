/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Preserva.model;

import java.util.ArrayList;

/**
 *
 * @author Per
 */
public class OrderMngr {
    private String startDatum;
    private String Kommentar;
    private ArrayList insamlingsdoman = new ArrayList<String>();
    private String[] status = new String[]{"Pågående", "Ej startad", "Klar", "Levererad"};
    private String insamlingsprofil;
    private String insamladWebbplats;
    private String insamlingsRapport;
    
    public OrderMngr(){
        
        
    }

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
    public String[] getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String[] status) {
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
    
    
    
}
