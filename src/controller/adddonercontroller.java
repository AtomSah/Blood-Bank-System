///////*
////// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
////// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
////// */
////package controller;
////import DAO.connection;
////import view.adddonerview;
////import model.adddonermodel;
////import java.awt.event.*;
////import java.sql.*;
////
////
////
/////**
//// *
//// * @author SUJALA
//// */
////public class adddonercontroller {
////    adddonerview view;
////    adddonermodel model;
////    Connection conn;
////    
////    public adddonercontroller(adddonerview view){
////        this.view=view;
////        view.addButtonListerner(new ButtonListener());
////    }
////    class ButtonListener implements ActionListener{
////    {
////        @Override
////        public void actionPerformed(ActionEvent e)
////        {
////            try {
////                Model = View.getCUser();
////                if (doner(model)){
//////                if (validateUserData(Model)) {
////                    if (checkUser(Model)) {
////                        View.setMessage("Username already exists.");
////                    } else {
////                        if (insertUser(Model)) {
////                            View.setMessage("User registered successfully.");
////                            
////                        } else {
////                            View.setMessage("Failed to register user.");
////                        }
////                    }
////                } else {
////                    View.setMessage("Invalid user data.");
////                }
////            } catch (Exception e1) {
////                System.out.println(e1.getMessage());
////            }
////            
////        }
////    }
////    
////    public boolean validateUserData(adddonermodel user){
////        conn=connection.dbbb();
////        
////        String Fullname=user.getFullname();
////        String Mothername=user.getMothername();
////        String Fathername=user.getFathername();
////        String DOB=user.getDOB();
////        String Gender=user.getGender();
////        String Address=user.getAddress();
////        String Phone_number=user.getPhone_number();
////        String Email=user.getEmail();
////        String Blood_group=user.get.Blood_group();
////        String City=user.getCity();
//////          private String Fullname,Mothername,Fathername,DOB,Gender,Address,Phone_number,email,Blood_group,City;
////
////        String sql="INSERT INTO doner(Fullname,Mothername,Fathername,DOB,Gender,Address,Phone_number,Email,Blood_group,City),VALUE(?,?,?,?,?,?,?,?);
////               
////       try (PreparedStatement stmt = conn.prepareStatement(sql)) {
////           stmt.setString(1, Fullname);
////            stmt.setString(2, Mothername);
////            stmt.setString(3, Fathername);
////            stmt.setString(4, DOB);
////            stmt.setString(5, Gender);
////            stmt.setString(6, Address);
////            stmt.setString(7, Phone_number);
////            stmt.setString(8, Email);
////            stmt.setString(9, Blood_group);
////            stmt.setString(10, City);
////
////
////
////            int rowsAffected = stmt.executeUpdate();
////            return rowsAffected > 0;
////        } catch (SQLException e) {
////            System.out.println(e.getMessage());
////        } finally {
////            // Close the resources (stmt, conn) here if not closed already
////        }
////       
////        return false; 
////    }
////    
//////        @Override
//////        public void actionPerformed(ActionEvent e){
////////            try{
////////                model=view.doner();
////////                if (doner(model)){
////////                    if (checkUser(model)){view.setmessage("useralready exist");
////////                    
////////                    }
//////  String fullName = user.getFullName();
//////            String motherName = view.getMotherName();
//////            String fatherName = view.getFatherName();
//////            String dob = view.getDOB();
//////            String gender = view.getGender();
//////            String address = view.getAddress();
//////            String phoneNumber = view.getPhoneNumber();
//////            String email = view.getEmail();
//////            String bloodGroup = view.getBloodGroup();
//////            String city = view.getCity();
//////            
//////            adddonermodel model = new adddonermodel();
//////            model.setFullname(fullName);
//////            model.setMothername(motherName);
//////            model.setFathername(fatherName);
//////            model.setDOB(dob);
//////            model.setGender(gender);
//////            model.setAddress(address);
//////            model.setPhone_number(phoneNumber);
//////            model.setEmail(email);
//////            model.setBlood_group(bloodGroup);
//////            model.setCity(city);
//////                    
//////                }
//////            }
//////        }
//////    }
//////    
//////    
//////    
//////}
////
////
////
////
////
//////package controller;
//////
//////import java.awt.event.ActionEvent;
//////import java.awt.event.ActionListener;
//////import model.adddonermodel;
//////import DAO.connection;
//////import view.adddonerview;
//////
//////public class adddonercontroller {
//////    private adddonerview view;
//////    private connection conn;
//////    private adddonermodel model;
//////
//////    public adddonercontroller(adddonerview view, connection conn) {
//////        this.view = view;
//////        this.conn = conn;
//////
//////        view.AddadddonorListener(new adddonorListener());
//////    }
//////
//////    class adddonorListener implements ActionListener {
//////        public void actionPerformed(ActionEvent e) {
//////            String fullName = view.getFullName();
//////            String motherName = view.getMotherName();
//////            String fatherName = view.getFatherName();
//////            String dob = view.getDOB();
//////            String gender = view.getGender();
//////            String address = view.getAddress();
//////            String phoneNumber = view.getPhoneNumber();
//////            String email = view.getEmail();
//////            String bloodGroup = view.getBloodGroup();
//////            String city = view.getCity();
//////
//////            adddonermodel model = new adddonermodel();
//////            model.setFullname(fullName);
//////            model.setMothername(motherName);
//////            model.setFathername(fatherName);
//////            model.setDOB(dob);
//////            model.setGender(gender);
//////            model.setAddress(address);
//////            model.setPhone_number(phoneNumber);
//////            model.setEmail(email);
//////            model.setBlood_group(bloodGroup);
//////            model.setCity(city);
//////
//////            // Perform donor addition operations, such as storing the data in a database
//////            // You can use the 'conn' object to connect to the database and execute SQL queries
//////            // Example code for database insertion:
//////            // conn.insertDonor(model);
//////
//////            // Display success message or perform further actions
//////            view.showSuccessMessage("Donor added successfully!");
//////        }
//////    }
//////}
////    
//
//
//
//package controller;
//
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import DAO.connection;
//import view.adddonerview;
//import model.adddonermodel;
//
//public class adddonercontroller {
//    private adddonerview view;
//    private adddonermodel model;
//    private Connection conn;
//    
//    public adddonercontroller(adddonerview view){
//        this.view=view;
//        this.view.addButtonListener(new ButtonListener());
//    }
//    
//    class ButtonListener implements ActionListener{
//        @Override
//        public void actionPerformed(ActionEvent e){
//            try {
//                model = view.getadddonermodel();
//                if (validateUserData(model)){
//                    if (checkDonor(model)){
//                        view.setMessage("Donor already exists.");
//                    } else {
//                        if (insertDonor(model)){
//                            view.setMessage("Donor added successfully.");
//                        } else {
//                            view.setMessage("Failed to add donor.");
//                        }
//                    }
//                } else {
//                    view.setMessage("Invalid donor data.");
//                }
//            } catch (Exception ex) {
//                System.out.println(ex.getMessage());
//            }
//        }
//    }
//    
//    public boolean validateUserData(adddonermodel donor){
//        conn = connection.dbbb();
//        
//        String Fullname = donor.getFullname();
//        String Mothername = donor.getMothername();
//        String Fathername = donor.getFathername();
//        String DOB = donor.getDOB();
//        String Gender = donor.getGender();
//        String Address = donor.getAddress();
//        String Phone_number = donor.getPhone_number();
//        String Email = donor.getEmail();
//        String Blood_group = donor.getBlood_group();
//        String City = donor.getCity();
//        
//        String sql = "INSERT INTO donor(Fullname, Mothername, Fathername, DOB, Gender, Address, Phone_number, Email, Blood_group, City) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
//        
//        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
//            stmt.setString(1, Fullname);
//            stmt.setString(2, Mothername);
//            stmt.setString(3, Fathername);
//            stmt.setString(4, DOB);
//            stmt.setString(5, Gender);
//            stmt.setString(6, Address);
//            stmt.setString(7, Phone_number);
//            stmt.setString(8, Email);
//            stmt.setString(9, Blood_group);
//            stmt.setString(10, City);
//            
//            int rowsAffected = stmt.executeUpdate();
//            return rowsAffected > 0;
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            // Close the resources (stmt, conn) here if not closed already
//        }
//        
//        return false; 
//    }
//    
//    public boolean checkDonor(adddonermodel donor){
//        // Perform checking if donor already exists in the database
//        // Implement the logic to check if the donor exists using the donor information
//        // Return true if donor exists, false otherwise
//        return false; // Placeholder
//    }
//    
//    public boolean insertDonor(adddonermodel donor){
//        // Perform insertion of donor into the database
//        // Implement the logic to insert the donor data into the database
//        // Return true if insertion is successful, false otherwise
//        return false; // Placeholder
//    }
//}

















//package Controller;
//import DAO.connection;
//import View.*;
//import Model.*;
//import java.awt.event.*;
//import java.sql.*;
//////import view.adddonerview;
//////import model.adddonermodel;
//
//public class adddonercontroller {
//    adddonerview View;
//    adddonermodel Model;
//    Connection conn;
//    
//    public adddonercontroller(adddoner View)
//    {
//        this.View = View;
//        View.addButtonListener(new ButtonListener());
//    }
//    
//    
//    class ButtonListener implements ActionListener
//    {
//        @Override
//        public void actionPerformed(ActionEvent e)
//        {
//            try {
//                Model = View.getCUser();
//                if (validateUserData(Model)) {
//                    if (checkUser(Model)) {
//                        View.setMessage("Username already exists.");
//                    } else {
//                        if (insertUser(Model)) {
//                            View.setMessage("User registered successfully.");
//                            
//                        } else {
//                            View.setMessage("Failed to register user.");
//                        }
//                    }
//                } else {
//                    View.setMessage("Invalid user data.");
//                }
//            } catch (Exception e1) {
//                System.out.println(e1.getMessage());
//            }
//            
//        }
//    }
//    
//    public boolean validateUserData(adddonermodel user) {
//        // Perform validation checks on user data
//        String Fullname = user.getFullname();
//        String Mothername = user.getMothername();
//        String Fathername = user.getFathername();
//        String DOB=user.getDOB();
//        String Gender=user.getGender();
//        String Address=user.getAddress();
//        String Phone_number=user.getPhone_number();
//        String email = user.getEmail();
//        String Blood_group=user.getBlood_group();
//        String City = user.getCity();
//
//        if (Fullname.isEmpty() || Blood_group.isEmpty() || Phone_number.isEmpty() || 
//            email.isEmpty() || City.isEmpty()) {
//            View.setMessage("Some Field are missing");
//            return false; // Empty fields not allowed
//        }
//        
//        if ( 8 > password.length()){
//            View.setMessage("Password is too short");
//            return false;
//        }
//        
//        return true;
//    }
//        
//    public boolean checkUser(adddonermodel user) throws Exception
//       {
//           conn = connection.dbbb();
//           String username = user.getUsername();
//
//           String sql = "SELECT * FROM customer WHERE username = ?";
//
//           try (PreparedStatement stmt = conn.prepareStatement(sql)) {
//               stmt.setString(1, username);
//               ResultSet rs = stmt.executeQuery();
//
//               return rs.next(); // Returns true if user exists, false otherwise
//           } catch (SQLException e) {
//               System.out.println(e.getMessage());
//           } finally {
//               // Close the resources (stmt, conn) here if not closed already
//           }
//
//           return false;
//       }
//    
//
//    
//    public boolean insertUser(adddonermodel user) throws Exception 
//    {
//        conn = connection.dbbb();
//        
//        String Fullname = user.getFullname();
//        String Mothername = user.Mothername();
//        String Fathername = user.Fathername();
//        String DOB=user.getDOB();
//        String Gender=user.getGender();
//        String Address=user.getAddress();
//        String Phone_number = user.getPhone_number();
//        String Email = user.getEmail();
//        String Blood_group=user.getBlood_group();
//        String City = user.getCity();
//        
//        String sql = "INSERT INTO customer (username, fname, lname, email, phone, password) VALUES (?, ?, ?, ?, ?, ?)";
//
//        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
//           stmt.setString(1, Fullname);
//            stmt.setString(2, Mothername);
//            stmt.setString(3, Fathername);
//            stmt.setString(4, DOB);
//            stmt.setString(5, Gender);
//            stmt.setString(6, Address);
//            stmt.setString(7, Phone_number);
//            stmt.setString(8,Email);
//            stmt.setString(9, Blood_group);
//            stmt.setString(10, City);
//
//            int rowsAffected = stmt.executeUpdate();
//            return rowsAffected > 0;
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            // Close the resources (stmt, conn) here if not closed already
//        }
//       
//        return false;
//    }
//}
//  


package Controller;

import DAO.connection;
import view.adddonerview;
import model.adddonermodel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class adddonercontroller {
    private adddonerview view;
    private adddonermodel model;
    private Connection conn;
    
    public adddonercontroller(adddonerview view) {
        this.view = view;
        view.addButtonListener(new ButtonListener());
    }
    
    public class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                model = view.getUser();
                if (validateUserData(model)) {
                    if (checkUser(model)) {
                        view.setMessage("Username already exists.");
                    } else {
                        if (insertUser(model)) {
                            view.setMessage("User registered successfully.");
                        } else {
                            view.setMessage("Failed to register user.");
                        }
                    }
                } else {
                    view.setMessage("Invalid user data.");
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    
    public boolean validateUserData(adddonermodel user) {
        String Fullname = user.getFullname();
        String Mothername = user.getMothername();
        String Fathername = user.getFathername();
        String DOB = user.getDOB();
        String Gender = user.getGender();
        String Address = user.getAddress();
        String Phone_number = user.getPhone_number();
        String Email = user.getEmail();
        String Blood_group = user.getBlood_group();
        String City = user.getCity();
        
        if (Fullname.isEmpty() || Blood_group.isEmpty() || Phone_number.isEmpty() || 
            Email.isEmpty() || City.isEmpty()) {
            view.setMessage("Some fields are missing.");
            return false; // Empty fields not allowed
        }
        return true;
    }
    
    public boolean checkUser(adddonermodel user) throws SQLException {
        conn = connection.dbbb();
        String Fullname = user.getFullname();
        
        String sql = "SELECT * FROM doner WHERE Fullname = ?";
        
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, Fullname);
            ResultSet rs = stmt.executeQuery();
            
            return rs.next(); // Returns true if user exists, false otherwise
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            // Close the resources (stmt, conn) here if not closed already
        }
        
        return false;
    }
    
    public boolean insertUser(adddonermodel user) throws SQLException {
        conn = connection.dbbb();
        
        String Fullname = user.getFullname();
        String Mothername = user.getMothername();
        String Fathername = user.getFathername();
        String DOB = user.getDOB();
        String Gender = user.getGender();
        String Address = user.getAddress();
        String Phone_number = user.getPhone_number();
        String Email = user.getEmail();
        String Blood_group = user.getBlood_group();
        String City = user.getCity();
                String sql = "INSERT INTO donor(Fullname, Mothername, Fathername, DOB, Gender, Address, Phone_number, Email, Blood_group, City) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, Fullname);
            stmt.setString(2, Mothername);
            stmt.setString(3, Fathername);
            stmt.setString(4, DOB);
            stmt.setString(5, Gender);
            stmt.setString(6, Address);
            stmt.setString(7, Phone_number);
            stmt.setString(8,Email);
            stmt.setString(9, Blood_group);
            stmt.setString(10, City);

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            // Close the resources (stmt, conn) here if not closed already
        }
       
        return false;
    }
}
