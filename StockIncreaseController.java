/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.StockModel;
import view.StockIncreaseView;
import dao.ConnectionProvider;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.sql.*;
/**
 *
 * @author Dell
 */
public class StockIncreaseController {
    private StockIncreaseView increaseView;
    private StockModel increaseModel;
    public StockIncreaseController(StockIncreaseView increaseView,StockModel increaseModel){
        this.increaseModel=increaseModel;
        this.increaseView=increaseView;
        
        this.increaseView.addUpdateListner(new UpdateListner());
        this.increaseView.addTableListner(new FrameListner());
    }
    
    class UpdateListner implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            try{
                increaseModel.getStock(increaseView.getBloodGroup(), increaseView.getUnits());
                Connection con = ConnectionProvider.getCon();
                String sql="UPDATE stock SET units = units + ? WHERE blood_group =?";
                System.out.println("Hello i am actionlistener");
                PreparedStatement pst = con.prepareStatement(sql);
            
                pst.setDouble(1, increaseModel.getUnits());
                pst.setString(2,increaseModel.getBlood_group());
            
                pst.executeUpdate();
                increaseView.showMessage("Updated stock");
                Statement st=con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM stock");
                increaseView.setStockDetails(rs);
                increaseView.resetAllFields();
            }
            catch(Exception updatee){
                increaseView.showMessage(updatee.getMessage());
            }
        }
        
    }
    
    class FrameListner implements ComponentListener{

        @Override
        public void componentResized(ComponentEvent e) {
            System.out.println("resize");
        }

        @Override
        public void componentMoved(ComponentEvent e) {
            System.out.println("move");
        }

        @Override
        public void componentShown(ComponentEvent e) {
            try{
                Connection con = ConnectionProvider.getCon();
                System.out.println("see");
                Statement st=con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM stock");
                increaseView.setStockDetails(rs);
            }
            catch(Exception e2){
                increaseView.showMessage(e2.getMessage());
            }
        }

        @Override
        public void componentHidden(ComponentEvent e) {
            System.out.println("hide");
        }
        
    }
}
