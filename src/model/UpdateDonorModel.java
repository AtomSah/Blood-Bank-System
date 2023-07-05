/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import database.BBConnection;
import java.sql.*;
import java.sql.PreparedStatement;
/**
 *
 * @author Dell
 */
public class UpdateDonorModel {
    int donorid;
    String Fullname,Mothername,Fathername,DOB,Gender,Address,Phone_number,Blood_group,email,City;

    public int getDonorid() {
        return donorid;
    }

    public void setDonorid(int donorid) {
        this.donorid = donorid;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public String getMothername() {
        return Mothername;
    }

    public void setMothername(String Mothername) {
        this.Mothername = Mothername;
    }

    public String getFathername() {
        return Fathername;
    }

    public void setFathername(String Fathername) {
        this.Fathername = Fathername;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhone_number() {
        return Phone_number;
    }

    public void setPhone_number(String Phone_number) {
        this.Phone_number = Phone_number;
    }

    public String getBlood_group() {
        return Blood_group;
    }

    public void setBlood_group(String Blood_group) {
        this.Blood_group = Blood_group;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }
    
    public void collectDonor(int Donorid,String Fullname,String Mothername,String Fathername,String DOB,String Gender,String Address,String Phone_number,String Blood_group,String email,String City){
        this.donorid=Donorid;
        this.Fullname=Fullname;
        this.Mothername=Mothername;
        this.Fathername=Fathername;
        this.DOB=DOB;
        this.Gender=Gender;
        this.Address=Address;
        this.Phone_number=Phone_number;
        this.Blood_group=Blood_group;
        this.email=email;
        this.City=City;
    }
    
    
    
}
