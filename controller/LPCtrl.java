package controller;
import model.LPContainer;
import model.LP;
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

    public void createLP(int barcode, String title, String artist, int publicationYear, String condition, double purchasePrice){
        LP lp = new LP(barcode, title, artist, publicationYear, condition, purchasePrice);
        addLP(lp);
    }
    
    public void addLP(LP lp){
        lpContainer.addLP(lp);
    }
    
    public LP findLpByBarcode(int barcode){
        return lpContainer.findLpByBarcode(barcode);
    }
}
