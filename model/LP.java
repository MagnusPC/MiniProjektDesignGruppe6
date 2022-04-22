package model;
import java.util.ArrayList;


/**
 * Write a description of class Lp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LP {
    // instance variables - replace the example below with your own
    private int barcode;
    private String title;
    private String artist;
    private int publicationYear;
    //TODO: Condition, check i loops.
    private ArrayList<Copy> copies;
    private Copy copy; //failsave til print commands, bør ændres

    /**
     * Constructor for objects of class Lp
     */
    public LP(int barcode, String title, String artist, int publicationYear) {
        // initialise instance variables
        this.barcode = barcode;
        this.title = title;
        this.artist = artist;
        this.publicationYear = publicationYear;
        copies = new ArrayList<>();
    }

    public Copy findCopyBySerialNumber(int serialNumber) {
        boolean found = false;
        Copy copyToGet = null;
        int index = 0;
        while(index < copies.size() && !found){
            Copy copy = copies.get(index);
            if(serialNumber == copy.getSerialNo()){
                found = true;
                copyToGet = copy;
            }
            index++;
        }
        return copyToGet; 
    }
}