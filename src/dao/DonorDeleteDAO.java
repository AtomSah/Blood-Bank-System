/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import dao.ConnectionProvider;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import Model.UpdateDonorModel;

/**
 *
 * @author Dell
 */
public class DonorDeleteDAO extends ConnectionProvider{
//    private UpdateDonorModel Donor;
    
    
    public static void deleteDonor(int donor_id){
        try{
            //mathi parameter chahi donor id
            
            
            Connection con = ConnectionProvider.getCon();
//            Donor.collectDonor(0, donor_id, donor_id, donor_id, donor_id, donor_id, donor_id, donor_id, donor_id, donor_id, donor_id);
            //yo chahi delete ko bho
            PreparedStatement pst = con.prepareStatement("DELETE FROM donor WHERE donor_id =?;");
//            int donor_id=Donor.getDonorid();
            pst.setInt(1, donor_id);
            int rowsAffected=pst.executeUpdate();
            System.out.println("The nummber of rows deleted are: "+rowsAffected);
            
            
        }
        catch(Exception ee1){
            System.out.println(ee1.getMessage());
        }
    }
    
        public static ResultSet getDonor(int donor_id){
            ResultSet rs=null;
        try{

            Connection con = ConnectionProvider.getCon();
            //Yo sql ko dao ma bho
//            Donor.collectDonor(0, donor_id, donor_id, donor_id, donor_id, donor_id, donor_id, donor_id, donor_id, donor_id, donor_id);
            PreparedStatement pst = con.prepareStatement("Select * from donor where donor_id =?;");
//            int donor_id=Donor.getDonorid();
            pst.setInt(1, donor_id);
            rs = pst.executeQuery();
            if (rs.next())
            {
                System.out.println(rs.getString(1));
                    return rs;
//                txtfullname.setText(rs.getString(2));
//                txtfathername.setText(rs.getString(3));
//                txtmothername.setText(rs.getString(4));
//                txtdob.setText(rs.getString(5));
//                txtphone.setText(rs.getString(6));
//                txtgender.setText(rs.getString(7));
//                txtemail.setText(rs.getString(8));
//                txtbgroup.setText(rs.getString(9));
//                txtcity.setText(rs.getString(10));
//                txtcarea.setText(rs.getString(11));
//                txtDonorID.setEditable(true);

            }
            else{
                //            JOptionPane.showMessageDialog(null,"Donor ID does not exit!");
                System.out.println("DonorId not exist");
                return rs;
            }


        }
        catch(Exception e){
            System.out.println("Hello this is catch of getdonor");
            return rs;
        }
    }
}


