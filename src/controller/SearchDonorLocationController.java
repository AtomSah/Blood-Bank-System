/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import dao.ConnectionProvider;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import view.SearchDonorLocationView;
import java.awt.event.KeyListener;

/**
 *
 * @author Dell
 */
public class SearchDonorLocationController {
    private  SearchDonorLocationView SearchLocation;

    public SearchDonorLocationController (SearchDonorLocationView SearchLocation) {
        this.SearchLocation=SearchLocation;
    
        this.SearchLocation.addSearchKeyListner(new addressKeys());
        
    }
    public class addressKeys implements KeyListener{

        @Override
        public void keyTyped(KeyEvent e) {
            System.out.println("Hello i am keytypes");
        }

        @Override
        public void keyPressed(KeyEvent e) {
            System.out.println("Hello u am keypressed");
        }

        @Override
        public void keyReleased(KeyEvent e) {
            System.out.println("Hello iam key relesase");
            String Location = SearchLocation.getAddress();
            try {
                Connection con =ConnectionProvider.getCon();
                if (con != null) {
                    Statement st = con.createStatement();
                    String query = "SELECT * FROM donor WHERE complete_address LIKE '%" + Location + "%'";
                    ResultSet rs = st.executeQuery(query);
                    SearchLocation.setTable(rs);
//        tblDonorBloodGroup.setModel(DbUtils.resultSetToTableModel(rs));
//        tblDonorBloodGroup.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                } else {
                    SearchLocation.showMessage("Failed to establish a database connection.");
                }
            }
            catch (Exception ek) {
                SearchLocation.showMessage(ek.getMessage());
            }
        }
        
    }
}
