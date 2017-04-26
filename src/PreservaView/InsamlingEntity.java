/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PreservaView;

import PreservaView.MainWindowUI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Per
 */
public class InsamlingEntity {
    private String startDatum;
    private String Kommentar;
    private ArrayList doman = new ArrayList<String>();
    private String status;
    private String insamlingsprofil;
    private String insamlingsURL;
    private String insamlingsRapport;
    private String kundnamn;
    private int insamlingsNr;
    
    public InsamlingEntity(String kundnamn, String startDatum, String insamlingsprofil, String kommentar) {
     this.kundnamn = kundnamn;
     this.startDatum = startDatum;
     this.insamlingsprofil = insamlingsprofil;
     this.Kommentar = kommentar;
    }
    
    public InsamlingEntity() {
   
    }
public String addInsamling() throws SQLException 
    {        
        //konrollera status på SQL-exekveringen
        String sRet = "failure";
        Connection cn = null;
        try 
        {
            //Uppkoppling mot databasen
            Class.forName("com.mysql.jdbc.Driver");            
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/preservaDB","root","skola");                        
            if (cn == null){
                throw new SQLException("No connection to target database!");
            }
                       
            //SQL-statement som skickas till databasen:
            PreparedStatement stmt = cn.prepareStatement("INSERT INTO insamling (InsamlingsID ,startdatum,status,insamlingsprofilURL,startaInsamlingURL,rapportURL, kommentar, kundID)"
                            + "VALUES (?,?,?,?,?,?,?,?)" );
            //Värden som skickas med i SQL-satsen. 
            //1:an står för vilket at frågetecknen värdet ska ersätta.
            //Sedan metoden för att hämta värdet.
            stmt.setInt(1, getInsamlingsNr());
            stmt.setString(2, getStartDatum());
            stmt.setString(3, getStatus());
            stmt.setString(7, getKommentar());
            stmt.setString(4, getInsamlingsprofil());
            stmt.setString(5, getInsamlingsRapport());
            stmt.setString(6, getInsamlingsRapport());
            stmt.setInt(8, 2);
                       
            //Kör SQL-uttrycket
            int i = stmt.executeUpdate();
            //Kontrollerar så SQL-satsen gick in:
            if (i > 0) sRet = "success";
            return sRet; //returnera status från SQL-exekvering (failure/success)
        }
        //Fångar fel:
        catch (ClassNotFoundException | SQLException ex) {
            throw new SQLException("Problem with db:" + ex.getMessage());
        }
        finally //Stänger anslutningen mot databasen:
        {
            if (cn!=null) 
                cn.close();
        }
    }
 
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
     * @return the insamlingsURL
     */
    public String getInsamlingsURL() {
        return insamlingsURL;
    }

    /**
     * @param insamlingsURL the insamlingsURL to set
     */
    public void setInsamlingsURL(String insamlingsURL) {
        this.insamlingsURL = insamlingsURL;
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
     * @return the doman
     */
    public ArrayList getDoman() {
        return doman;
    }

    /**
     * @param doman the doman to set
     */
    public void setDoman(ArrayList doman) {
        this.doman = doman;
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
