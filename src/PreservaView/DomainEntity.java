/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PreservaView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Patrik
 */
public class DomainEntity 
{

private String domain;
private int domainListID;
private int insamlingsID;


public String createDomain() throws SQLException
{
    String sRet = "failure";
        if (addDomain().equals("success") && addDomainList().equals("success")) sRet = "success";                    
            
            return sRet;    
}

public String addDomainList() throws SQLException
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
            PreparedStatement stmt = cn.prepareStatement("INSERT INTO domainlist (insamlingsID, domain)"
                            + "VALUES (?,?)");
            //Värden som skickas med i SQL-satsen. 
            //1:an står för vilket at frågetecknen värdet ska ersätta.
            //Sedan metoden för att hämta värdet.            
            stmt.setInt(1, getInsamlingsID());
            stmt.setString(2, getDomain());
            
            
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

public String addDomain() throws SQLException 
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
            
            PreparedStatement stmt = cn.prepareStatement("INSERT INTO domain (domain) VALUES (?)");
            stmt.setString(1, getDomain());
            
                       
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

public int getNrOfDomains() throws SQLException
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
            PreparedStatement stmt = cn.prepareStatement("SELECT domainListID FROM domainlist");
            //Resultatet från SQL-satsen sparas i ett ResultSet                
            ResultSet rs = stmt.executeQuery();
            stmt.executeQuery();          
            while (rs.next()){
                //Skapar ett nytt objekt och fyller i variablerna
                DomainEntity d = new DomainEntity();
                d.setDomainListID(rs.getInt("domainListID"));
                
            }        
            
            //Kör SQL-uttrycket
            //stmt.executeUpdate();
            //Kontrollerar så SQL-satsen gick in:
            
            return this.domainListID;
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

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public int getDomainListID() {
        return domainListID;
    }

    public void setDomainListID(int domainListID) {
        this.domainListID = domainListID;
    }

    public int getInsamlingsID() {
        return insamlingsID;
    }

    public void setInsamlingsID(int insamlingsID) {
        this.insamlingsID = insamlingsID;
    }

    
}
