/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PreservaView;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import java.util.Random;

/**
 *
 * @author Patrik
 */
public class CustomerEntity 
{
    
    private String name;
    private String phoneNr;
    private String eMail;
    private String city;
    private String street;
    private String postCode;
    private String orgNr;
    private int customerNr;
    
            
    public int getNrOfCustomers() throws SQLException
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
            PreparedStatement stmt = cn.prepareStatement("SELECT kundID FROM kund");
            //Resultatet från SQL-satsen sparas i ett ResultSet                
            ResultSet rs = stmt.executeQuery();
            stmt.executeQuery();          
            while (rs.next()){
                //Skapar ett nytt objekt och fyller i variablerna
                CustomerEntity c = new CustomerEntity();
                c.setCustomerNR(rs.getInt("kundID"));
                
            }        
            
            //Kör SQL-uttrycket
            //stmt.executeUpdate();
            //Kontrollerar så SQL-satsen gick in:
            
            return this.customerNr;
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
    
    public int generateRandomCustomerNr()
    {
        Random randomGenerator = new Random();
        
        int randomNumber = randomGenerator.nextInt(10000);
        
        return randomNumber;
        
    }
    
    
    
    
    public String addCustomer() throws SQLException 
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
            PreparedStatement stmt = cn.prepareStatement("INSERT INTO kund (kundID,namn,telefonnr,email,gatuadress,postnr,stad)"
                            + "VALUES (?,?,?,?,?,?,?)");
            //Värden som skickas med i SQL-satsen. 
            //1:an står för vilket at frågetecknen värdet ska ersätta.
            //Sedan metoden för att hämta värdet.
            stmt.setInt(1, getCustomerNr());
            stmt.setString(2, getName());
            stmt.setString(3, getPhoneNr());
            stmt.setString(4, getEmail());
            stmt.setString(7, getCity());
            stmt.setString(5, getStreet());
            stmt.setString(6, getPostCode());
                       
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNr() {
        return phoneNr;
    }

    public void setPhoneNr(String phoneNr) {
        this.phoneNr = phoneNr;
    }

    public String getEmail() {
        return eMail;
    }

    public void setEmail(String eMail) {
        this.eMail = eMail;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getOrgNr() {
        return orgNr;
    }

    public void setOrgNr(String orgNr) {
        this.orgNr = orgNr;
    }
    
    public int getCustomerNr(){
        return customerNr;
    }
    
    public void setCustomerNR(int customerNr){
        this.customerNr = customerNr;
    }


    }
    
     
    
        
        

