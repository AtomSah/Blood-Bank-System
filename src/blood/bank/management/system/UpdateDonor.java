/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blood.bank.management;
import view.UpdateDonorView;
import model.UpdateDonorModel;
import controller.UpdateDonorController;
/**
 *
 * @author Dell
 */
public class UpdateDonor {
    public static void main(String[] args) {
        
        UpdateDonorView theView= new UpdateDonorView();
        UpdateDonorModel theModel= new UpdateDonorModel();
//        theModel.collectDonor(theView, Fullname, Mothername, Fathername, DOB, Gender, Address, Phone_number, Blood_group, email, City);
        UpdateDonorController theController=new UpdateDonorController(theView, theModel);
        
        theView.setVisible(true);
    }
}
