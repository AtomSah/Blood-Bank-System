
package Controller;

import view.SignUp;
import view.LoginView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JOptionPane;
import Model.*;


/**
 *
 * @author Atom
 */
public class SignUpController {
    SignUpModel model;
    SignUp view;
    ResultSet rs;
    PreparedStatement pst=null;
    public SignUpController(SignUp view)
        {
            this.view=view;
             view.addSignUpListner(new SignUpListener());
        }
    
    class SignUpListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            try
            {
                model=view.getUser();
                if(getUser(model))
                {
                    view.setMessage("Registered Successfully");
                }
                else
                {
                    view.setMessage("Invalid username or password");
                    
                }
            }
            catch(Exception e1)
            {
                
            }
            

        }
        
        public boolean getUser(SignUpModel user) throws Exception
        {
           
            try
            {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms","root","gundey@122.");
            String sql="insert into user(name,email,address,mobile , password) values(?,?,?,?,?)";
            pst = conn.prepareStatement(sql);

            
            pst.setString(1,user.getName());
            pst.setString(2,user.getEmail());
            pst.setString(3,user.getAddress());
            pst.setString(4,user.getMobileNumber());
            pst.setString(5,user.getPassword());


            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"user Registered Successfully");
            view.dispose();
            new LoginView().setVisible(true);
            
          }
          catch(Exception e2)
          {
              System.out.println(e2.getMessage());
          }         
            
            return false;
        }

    }
}