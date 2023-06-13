/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blood.bank.management.system;
import java.sql.*;

/**
 *
 * @author User
 */
public class MyConnection {
    public static Connection dbConnect()
    {
//        Connection conn=null;
    try{
        
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","onepiece#987");
        System.out.println("connected to database");
            return conn;
    
    }
    catch(Exception e)
    {
        System.out.println(e.getMessage());
    }
    return null;
        
    } 
    
}
/**
 *
 * @author SUJALA
 */