package model;
import java.util.ArrayList;


/**
 * Write a description of class LpContainer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LPContainer {
    // instance variables - replace the example below with your own
    private static LPContainer instance;
    private ArrayList<LP> lps;


    /**
     * Constructor for objects of class LpContainer
     */
    private LPContainer() {
        // initialise instance variables
        lps = new ArrayList<>();
    }
    
    /**
     * Static method because its a simpleton
     * So it doesn't make a new instance of LPContainer
     */
    public static LPContainer getInstance() {
        if(instance == null){
            instance = new LPContainer();
        }
        return instance;
    }
    
    public void addLP(int barcode, String title, String artist, int publicationYear){
        lps.add(new LP(barcode, title, artist, publicationYear));
    }
    
    public void addCopyToLPByBarcode(int barcode, Copy copy){
        LP lp = findLP(barcode);
        if(!lp.copies.contains(copy)){
            copy.setLP(lp);
            lp.copies.add(copy);
        }
    }
    
    public LP findLP(int barcode){
        boolean found = false;
        LP returnLP = null;
        for(int i = 0; i < lps.size() && !found; i++){
            if(lps.get(i).getBarcode() == barcode){
                returnLP = lps.get(i);
                found = true;
            }
        }
        return returnLP;
    }
    
     public Copy findCopyBySerialNumber(int serialNumber) {
        boolean found = false;
        Copy copyToGet = null;
        int i = 0;
        ArrayList<Copy> copies = null;
        LP getLP = null;
        while(i < copies.size() && !found){
            getLP = lps.get(i);
            copies = getLP.getCopies();
            if(copies.get(i).getSerialNo() == serialNumber){
                copyToGet = copies.get(i);
                found = true;
            }
            i++;
        }
        return copyToGet; 
    }
}
