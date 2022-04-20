package controller;
import model.Lp;
import model.LpContainer;

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
     * Constructor for objects of class LpCtrl
     */
    public LpCtrl()
    {
        // initialise instance variables
        lpContainer = LpContainer.getInstance();
    }

    public Lp findLpByBarcode(int barcode){
        return lpContainer.findLpByBarcode(barcode);
    }
}
