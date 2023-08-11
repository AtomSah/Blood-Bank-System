/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import dao.ConnectionProvider;
//import dao.ConnectionProvider;
import java.sql.*;
import java.awt.event.ComponentEvent;
import view.StockDetailsView;
import java.awt.event.ComponentListener;
/**
 *
 * @author Dell
 */
public class StockDetailsController {
    private StockDetailsView detailsView;
    
    public StockDetailsController(StockDetailsView detailsView){
        this.detailsView=detailsView;
        
        this.detailsView.addTableListner(new formListener());
    }
    
    public class formListener implements ComponentListener{

        @Override
        public void componentResized(ComponentEvent e) {
            System.out.println("Resize");
        }

        @Override
        public void componentMoved(ComponentEvent e) {
            System.out.println("Move");
        }

        @Override
        public void componentShown(ComponentEvent e) {
            System.out.println("SEE");
            try {
//            Connection con = ConnectionProvider.getCon();
//            Statement st = con.createStatement();

                Connection con = ConnectionProvider.getCon();
                Statement st = con.createStatement();
                    
                ResultSet rs = st.executeQuery("SELECT * FROM stock");
                detailsView.setStockDetails(rs);
            } 
            catch (Exception e2k) {
//                 JOptionPane.showMessageDialog(null, e);
                    System.out.println(e2k.getMessage());
                    
            }
        }

        @Override
        public void componentHidden(ComponentEvent e) {
            System.out.println("Hide");
            
//            
        }
        
    }
}
