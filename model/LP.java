package model;
import java.util.ArrayList;


/**
 * Write a description of class Lp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LP
{
    // instance variables - replace the example below with your own
    private int barcode;
    private String title;
    private String artist;
    private int publicationYear;
    //TODO: Condition, check i loops.
    private ArrayList<Copy> copies;

    /**
     * Constructor for objects of class Lp
     */
    public LP(int barcode, String title, String artist, int publicationYear)
    {
        // initialise instance variables
        this.barcode = barcode;
        this.title = title;
        this.artist = artist;
        this.publicationYear = publicationYear;
        copies = new ArrayList<>();
    }

    public void addCopy(Copy copy){
        copies.add(copy);
    }
    
    public int getBarcode(){
        return barcode;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getArtist(){
        return artist;
    }
    
    public int getPubYear(){
        return publicationYear;
    }
    
    // public int findCopyBySerialNumber(){
        // boolean found = false;
        // while(index < copies.size() && !found){
            
        // }
    // }
    
    // public void printLPShort(){
        // System.out.println("Pladens titel: " + title);
        // System.out.println("Kunstneren: " + artist);
        // copy.printCopyShort();
    // }
    
    // public void printLPLong(){
        // copy.printCopyLong();
        // System.out.println("Pladens stregkode: " + barcode);
        // System.out.println("Pladens udgivelsesår: " + publicationYear);
    // }
}
