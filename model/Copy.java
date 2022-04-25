package model;


/**
 * Write a description of class Copy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Copy
{
    // instance variables - replace the example below with your own
    private int serialNumber;
    private String condition; //kan også vælges fra array
    private double purchasePrice;

    /**
     * Constructor for objects of class Lp
     */
    public Copy(int serialNumber, String condition, double purchasePrice)
    {
        // initialise instance variables
        this.serialNumber = serialNumber;
        this.condition = condition;
        this.purchasePrice = purchasePrice;
    }

    public int getSerialNumber(){
        return serialNumber;
    }
    
    
}
