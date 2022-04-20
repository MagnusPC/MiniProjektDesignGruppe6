package controller;
import model.LPContainer;
import model.LP;


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
    public LPCtrl()
    {
        // initialise instance variables
        lpContainer = LPContainer.getInstance(); 
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public LP findLpByBarcode(int barcode){
        return lpContainer.findLpByBarcode(barcode);
    }
}
