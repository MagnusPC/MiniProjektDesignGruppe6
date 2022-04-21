package model;
import java.util.ArrayList;


/**
 * Write a description of class LpContainer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LPContainer
{
    // instance variables - replace the example below with your own
    private static LPContainer instance;
    private ArrayList<LP> lps;


    /**
     * Constructor for objects of class LpContainer
     */
    private LPContainer()
    {
        // initialise instance variables
        lps = new ArrayList<>();
    }
    /**
     * Static method because its a simpleton
     * So it doesn't make a new instance of LPContainer
     */
    public static LPContainer getInstance(){
        if(instance == null){
            instance = new LPContainer();
        }
        return instance;
    }
    
    /**
     * Adds a LP to the LPContainer
     */
    public void addLP(LP lp){
        lps.add(lp);
    }
    
    public LP findLpBySerialNumber(int serialNumber){
        boolean found = false;
        LP lp = null;
        int lpIndex = 0;
        int copyIndex = 0;
        while(lpIndex < lps.size() && !found){
            LP element = lps.get(index);
            while(copyIndex < lps.size() && !found)
            
            if(element.getBarcode() == barcode){
                found = true;
                lp = element;
            }
            else {
                index++;
            }
        }
        return lp;
    }
}
