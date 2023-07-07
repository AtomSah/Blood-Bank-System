/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blood.bank.management;
import view.DeleteDonorView;
import model.UpdateDonorModel;
import controller.DeleteDonorController;
/**
 *
 * @author Dell
 */
public class DeleteDonor {
    public static void main(String[] args) {
        //yaha chahi controller view ra model lai call gare object banaye 
        DeleteDonorView theView=new DeleteDonorView();
        UpdateDonorModel theModel=new UpdateDonorModel();
        
        
        DeleteDonorController theController=new DeleteDonorController(theView, theModel);
        //kaha bata?
        theView.setVisible(true);//run garu??
        //maile agina delete hanne thiye
        
    }
 
}
