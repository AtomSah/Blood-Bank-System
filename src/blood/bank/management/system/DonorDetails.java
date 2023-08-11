/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import view.DonorDetailsView;
import Controller.DonorDetailsController;
/**
 *
 * @author Dell
 */
public class DonorDetails {
    public static void main(String[] args) {
        displayDonorDetails();
    }
    public static void displayDonorDetails(){
        DonorDetailsView theView=new DonorDetailsView();
        DonorDetailsController theController=new DonorDetailsController(theView);
        
        theView.setVisible(true);
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
