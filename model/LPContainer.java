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

    public static LPContainer getInstance(){
        if(instance == null){
            instance = new LPContainer();
        }
        return instance;
    }
    
    public void addLP(LP lp){
        lps.add(lp);
    }
    
    public LP findLpByBarcode(int barcode){
        boolean found = false;
        LP lp = null;
        int index = 0;
        while(index < lps.size() && !found){
            LP element = lps.get(index);
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
