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
    
    public Copy findCopyBySerialNumber(int serialNumber){
        boolean found = false;
        Copy lpCopy = null;
        int index = 0;
        while(index < lps.size() && !found){
            LP lp = lps.get(index);
            lpCopy = lp.findCopyBySerialNo(serialNumber);
            if(lpCopy != null){
                found = true;
            }
            index++;
        }
        return lpCopy;
    }
}
