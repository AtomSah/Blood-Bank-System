/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class ConnectionProvider {
    public static Connection  getCon(){
        try{ Class.forName("com.mysql.cj.jdbc.Driver");
        //change database name in .getConnection
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalBB?useSSL=false","root","database");
        return con;
                
        }
    
        catch(Exception e){
            return null;
        }
        
     
    }
    
    
}
