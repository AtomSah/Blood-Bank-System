/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import view.StockDetailsView;
import Controller.StockDetailsController;
/**
 *
 * @author Dell
 */
public class StockDetails {
    public static void main(String[] args) {
        displayStockDetails();
    }
    public static void displayStockDetails(){
        StockDetailsView theView=new StockDetailsView();
        StockDetailsController theController=new StockDetailsController(theView);
        
        theView.setVisible(true);
    }
}
