/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.*;
import DAO.connection;

/**
 *
 * @author SUJALA
 */
public class adddonermodel {
//    Connection conn=null;
//    Statement stmt=null;
//    ResultSet=null;
    private String Fullname,Mothername,Fathername,DOB,Gender,Address,Phone_number,email,Blood_group,City;
// your name
        public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }
   // mother name 
        public String getMothername() {
        return Mothername;
    }

    public void setMothername(String Mothername) {
        this.Mothername = Mothername;
    }
// geet father name
    public String getFathername(){
        return Fathername;
        
    }
    public void setFathername(String Fathername){
        this.Fathername=Fathername;
    }
    // date of birth
    public String getDOB(String DOB){
        return DOB;
    }
    public void setDOB(String DOB){
        this.DOB=DOB;
}
    //Gender
    public String getGender(String Gender){
        return Gender;
    }
    public void setGender(String Gender){
        this.Gender=Gender;
    }
    //address
    public String getAddress(String Address){
        return Address;
    }
    public void setAddress(String Address){
        this.Address=Address;
    }
    //phone number
    public String getPhone_number() {
        return Phone_number;
    }

    public void setPhone_number(String Phone_number) {
        this.Phone_number = Phone_number;
    }
    // email
     public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
//    ?? blood group
    public String getBlood_group(String Blood_group){
        return Blood_group;
        
    }
    public void setBlood_group(String Blood_group){
    this.Blood_group=Blood_group;
    }
    //city
    public String getCity(String City){
        return City;   
    } 
    public void setCity(String City){
        this.City=City;

    
    
    
}

    public String getDOB() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getGender() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getAddress() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getBlood_group() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getCity() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
