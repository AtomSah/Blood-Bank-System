/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.DeleteDonorView;
import model.UpdateDonorModel;
import java.sql.ResultSet;
import database.DonorDAO;
/**
 *
 * @author Dell
 */
public class DeleteDonorController {
    private UpdateDonorModel deleteModel;
    // yaha data same bhako le maile updatedonor model kai object banae
    private DeleteDonorView deleteView;
    private boolean ifSearched;
//    DonorDAO sql;
    
    public DeleteDonorController(DeleteDonorView deleteView,UpdateDonorModel deleteModel){
        //construcor ma pass garne view ra model
        this.deleteView=deleteView;
        this.deleteModel=deleteModel;
        
        //view ma actionlistner banae duita
        //yaha call gare nita function
        //ani eta chahi tyo actionlistner ko object banae
        this.deleteView.addSearchListner(new SearchListner());
        this.deleteView.addDeleteListner(new DeleteListner());
    }
    
    //jaba tyo button press hunxa actionlistner le yaha actionperformed ma lagcha
    class SearchListner implements ActionListener{
        //yo actionlistner ta youtube ma hereko kei thahachaina yo bhanda badhi
        @Override
        public void actionPerformed(ActionEvent e) {
            //yo sout haru chahi code kaha pugyo bhanna herna lagi matra ho
            System.out.println("Hello i am search");
            //yo chahi search paxi matra delete garne bhane try gare bhaye chaina
            ifSearched=true;
            try{
                //agina dao ko function ma integer bhako le parse garnu paryo string lai
                //huh ali loud  ma bhako textfield ma bhako lai integer datatype ko id ma store gare
                int id=Integer.parseInt(deleteView.getdonorID());
                deleteModel.setDonorid(id);
            }
            catch(Exception ee2){
                System.out.println("Invalid input");
            }
            
            System.out.println("Before try "+deleteModel.getDonorid());
            try{
                //yaha chahi agina ko dao ma bhako code le resultset return garxa
                //ani tyo result set ma bhako data haru chahi maile model ma pathauchu
                System.out.println("Donor id=  "+deleteModel.getDonorid());
                //yo rs bhanne result set ma dao bata ayo ani 
                ResultSet rs=DonorDAO.getDonor(deleteModel.getDonorid());
                System.out.println(rs.getString("Fullname"));
                //yo tala ko ma pathae yeat gayo
                deleteModel.collectDonor(deleteModel.getDonorid(), rs.getString(2),rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11));
                //model ma gaye paxichai maile view ma pathae i.e textfield haru
                //tesko lagi maile setter banae thiye
                deleteView.setAddress(deleteModel.getAddress());
                deleteView.setfullname(deleteModel.getFullname());
                deleteView.setMothername(deleteModel.getMothername());
                deleteView.setFathername(deleteModel.getFathername());
                deleteView.setPhonenum(deleteModel.getPhone_number());
                
                deleteView.setDOB(deleteModel.getDOB());
                deleteView.setGender(deleteModel.getGender());
                deleteView.setBloodgroup(deleteModel.getBlood_group());
                deleteView.setEmail(deleteModel.getEmail());
                deleteView.setCity(deleteModel.getCity());
                //hai aba yo search ko bho
            }
            catch(Exception a){
                System.out.println(a.getMessage());
            }
            
//                deleteView.setdonorID(deleteModel.getDonorid()+"");
                
//            if (rs.next())
//            {
//                    return rs;
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

//            }
        }
        
    }
    
    class DeleteListner implements ActionListener{
        //delete ko chahi choto cha
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Hello i am delete listner");
            
            try{
                //yo if chahinna maile search paxi matra delete hos bhanne try gare (bhayena)
                if(ifSearched){
                    int id=Integer.parseInt(deleteView.getdonorID());
                    //agina jastai maile view bata donorid lai liye
                    deleteModel.setDonorid(id);
                    //model ma pathae
                    DonorDAO.deleteDonor(id);
                    //ani deleteDonor bhanne static method bata run gare
                    deleteView.clearAllDeleteView();
                    //ani last ma gayera view ma bhako data empty gare
                }
                else{
                    throw new Exception("SEarch first");
                    //message box errror etc yahe halne hola?
                }
            }
            catch(Exception ee2){
                System.out.println(ee2.getMessage());
            }
        }
        
    }
}


