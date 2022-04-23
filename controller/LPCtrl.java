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
public class LPCtrl {
    // instance variables - replace the example below with your own
    private LPContainer lpContainer;

    /**
     * Constructor for objects of class PersonCtrl
     */
    public LPCtrl() {
        // initialise instance variables
        lpContainer = LPContainer.getInstance(); 

    }

    // public void createCopy(int serialNumber, String condition, double purchasePrice){
        // Copy copy = new Copy(serialNumber, condition, purchasePrice);
        // addCopy(copy);
    // }
    
     public void createLP(int barcode, String title, String artist, int publicationYear){
        lpContainer.addLP(barcode, title, artist, publicationYear);
     }
    
    // private void addCopy(Copy copy){
        // lpContainer.addCopy(copy);
    // }
    
    public void addCopyToLPByBarcode(int barcode, Copy c){
        lpContainer.addCopyToLPByBarcode(barcode, c);
    }
    
    /**
     * finds a LP from the serialnumber
     */
    public Copy findCopyBySerialNumber(int serialNumber) {
        return lpContainer.findCopyBySerialNumber(serialNumber);
    }
}
