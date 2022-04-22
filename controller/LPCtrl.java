package controller;
import model.LPContainer;
import model.LP;
import model.Copy;
import java.util.Date;


/**
 * Write a description of class LpCtrl here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LPCtrl
{
    // instance variables - replace the example below with your own
    private LPContainer lpContainer;

    /**
     * Constructor for objects of class PersonCtrl
     */
    public LPCtrl(){
        // initialise instance variables
        lpContainer = LPContainer.getInstance(); 

    }

    // public void createCopy(int serialNumber, String condition, double purchasePrice){
        // Copy copy = new Copy(serialNumber, condition, purchasePrice);
        // addCopy(copy);
    // }
    
    // public void createLP(int barcode, String title, String artist, int publicationYear){
        // LP lp = new LP(barcode, title, artist, publicationYear);
        // addLP(lp);
    // }
    
    // private void addCopy(Copy copy){
        // lpContainer.addCopy(copy);
    // }
    
    // private void addLP(LP lp){
        // lpContainer.addLP(lp);
    // }
    
    /**
     * finds a LP from the serialnumber
     */
    public Copy findLPBySerialNo(int serialNumber){
        return lpContainer.findLPBySerialNo(serialNumber);
    }
}
