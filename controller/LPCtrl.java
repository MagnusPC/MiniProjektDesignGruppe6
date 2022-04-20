package controller;
import model.LpContainer;
import model.Lp;


/**
 * Write a description of class LpCtrl here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LpCtrl
{
    // instance variables - replace the example below with your own
    private LpContainer lpContainer;
    
    /**
     * Constructor for objects of class PersonCtrl
     */
    public LpCtrl()
    {
        // initialise instance variables
        lpContainer = LpContainer.getInstance(); 
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Lp findLpByBarcode(int barcode){
        return lpContainer.findLpByBarcode(barcode);
    }
}
