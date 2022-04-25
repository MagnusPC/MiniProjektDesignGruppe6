package model;
import java.util.ArrayList;



public class LP{
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
    public LP(int barcode, String title, String artist, int publicationYear){
        // initialise instance variables
        this.barcode = barcode;
        this.title = title;
        this.artist = artist;
        this.publicationYear = publicationYear;
        copies = new ArrayList<>();
    }
    /**
     * Adds a copy to the copies arrayList
     * @Param copy to be added
     */
    public void addCopy(Copy copy){
        copies.add(copy);
    }
    
    public int getBarcode(){
        return barcode;
    }
    
    /**
     * Finds a Copy from a serialNumber
     * @param serialNumber 
     */
    public Copy findCopyBySerialNumber(int serialNumber){
        boolean found = false;
        Copy copy = null;
        int index = 0;
        while(index < copies.size() && !found){
            Copy element = copies.get(index);
            if(serialNumber == element.getSerialNumber()){
                found = true;
                copy = element;
            }
            index++;
        }
        return copy; 
    }
    
}
