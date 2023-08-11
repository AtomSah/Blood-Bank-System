/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import dao.ConnectionProvider;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Date;
import view.UpdateDonorView;
import model.UpdateDonorModel;
/**
 *
 * @author Dell
 */
public class UpdateDonorController {
    private UpdateDonorView updateView;
    private UpdateDonorModel updateModel;

    public UpdateDonorController(UpdateDonorView updateView, UpdateDonorModel updateModel) {
        this.updateView = updateView;
        this.updateModel = updateModel;
        
        this.updateView.addUpdateListner(new UpdateListner());
        this.updateView.addViewListner(new ViewListner());
        
    }
    

    class UpdateListner implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("hello ia m actionliss");
            try{        
                int id=Integer.parseInt(updateView.getdonorID());
                updateModel.collectDonor(id, updateView.getFullname(), updateView.getMothername(), updateView.getFathername(), updateView.getDOB(), updateView.getGender(), updateView.getAddress(), updateView.getPhonenum(), updateView.getBloodgroup(), updateView.getEmail(), updateView.getCity());
                Connection conn=ConnectionProvider.getCon();
                String sql = "UPDATE donor SET Fullname=?, Mothername=?, Fathername=?, dob=?, mobile_no=?, gender=?, address=?, blood_group=?, email=?, city=? WHERE donorID=?";
                
        // Create a PreparedStatement object
                PreparedStatement pst = conn.prepareStatement(sql);

        // Set the parameter values for the prepared statement
                pst.setString(1, updateModel.getFullname());
                pst.setString(2, updateModel.getMothername());
                pst.setString(3, updateModel.getFathername());
                pst.setString(4, updateModel.getDOB());
                pst.setString(5, updateModel.getPhone_number());
                pst.setString(6, updateModel.getGender());
                pst.setString(7, updateModel.getAddress());
                pst.setString(8, updateModel.getBlood_group());
                pst.setString(9, updateModel.getEmail());
                pst.setString(10, updateModel.getCity());
                    
                pst.setInt(11, updateModel.getDonorid());
                System.out.println("Before execute");
                pst.executeUpdate();
                System.out.println("After execute");
                }
                catch(Exception a3){
                    System.out.println(a3.getMessage());
                }   
        }
    }
    
 
    
    class ViewListner implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e) {
            ResultSet rs=null;
            System.out.println("Hello this is View listner");
            try{
                Connection conn=ConnectionProvider.getCon();
                String sql=" SELECT Fullname,Mothername,Fathername,dob,mobile_no,gender,address,blood_group,email,city FROM donor WHERE donorID=?;";
                PreparedStatement pst=conn.prepareStatement(sql);
                System.out.println();
                String IDstring=updateView.getdonorID();
                System.out.println(IDstring);
                int ID=Integer.parseInt(IDstring);
                updateView.clearAll();
                pst.setInt(1,ID);
                rs=pst.executeQuery();
                while(rs.next())
                {
                    updateView.setdonorID(IDstring);
                updateView.setAddress(rs.getString("address"));
                updateView.setFullname(rs.getString("Fullname"));
                updateView.setMothername(rs.getString("Mothername"));
                updateView.setFathername(rs.getString("Fathername"));
                updateView.setPhonenum(rs.getString("mobile_no"));
                
                updateView.setDOB(rs.getDate("dob"));
                updateView.setGender(rs.getString("gender"));
                updateView.setBloodgroup(rs.getString("blood_group"));
                updateView.setEmail(rs.getString("email"));
                updateView.setCity(rs.getString("city"));
                    System.out.println("Hello end of set");
                }
            }
            catch(Exception e11){
                System.out.println(e11.getMessage());
            }
            
            
        }
        
    }
}
