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
import view.SearchDonorBloodGroupView;
import java.awt.event.KeyListener;
/**
 *
 * @author Dell
 */
public class SearchDonorBloodGroupController {
    private  SearchDonorBloodGroupView SearchBG;

    public SearchDonorBloodGroupController(SearchDonorBloodGroupView SearchBG) {
        this.SearchBG=SearchBG;
    
        this.SearchBG.addSearchKeyListner(new bloodgroupKeys());
        
    }
    public class bloodgroupKeys implements KeyListener{

        @Override
        public void keyTyped(KeyEvent e) {
            System.out.println("hello key typed");
        }

        @Override
        public void keyPressed(KeyEvent e) {
            System.out.println("Hello key pressed");
        }

        @Override
        public void keyReleased(KeyEvent e) {
            System.out.println("Hello key release");
            String BloodGroup = SearchBG.getBloodGroup();
            try {
                Connection con =ConnectionProvider.getCon();
                if (con != null) {
                    Statement st = con.createStatement();
                    String query = "SELECT * FROM donor WHERE blood_group LIKE '%" + BloodGroup + "%'";
                    ResultSet rs = st.executeQuery(query);
                    SearchBG.setTable(rs);
//        tblDonorBloodGroup.setModel(DbUtils.resultSetToTableModel(rs));
//        tblDonorBloodGroup.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                } else {
                    SearchBG.showMessage("Failed to establish a database connection.");
                }
            }
            catch (Exception ek) {
                SearchBG.showMessage(ek.getMessage());
            }
        }
    }
    
    
}
    


