package controller;
import model.LPContainer;
import model.LP;
import model.Copy;
import java.util.Date;



public class LPCtrl{
    // instance variables - replace the example below with your own
    private LPContainer lpContainer;

    /**
     * Constructor for objects of class PersonCtrl
     */
    public LPCtrl(){
        // initialise instance variables
        lpContainer = LPContainer.getInstance(); 

    }
    
    /**
     * finds a LP from the barcode
     */
    public Copy findCopyBySerialNumber(int serialNumber){
        return lpContainer.findCopyBySerialNumber(serialNumber);
    }
}
