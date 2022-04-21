package model;


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
    private String condition; //kan også vælges fra array
    private double purchasePrice;

    /**
     * Constructor for objects of class Lp
     */
    public LP(int barcode, String title, String artist, int publicationYear, String condition, double purchasePrice)
    {
        // initialise instance variables
        this.barcode = barcode;
        this.title = title;
        this.artist = artist;
        this.publicationYear = publicationYear;
        this.condition = condition;
        this.purchasePrice = purchasePrice;
    }

    public int getBarcode(){
        return barcode;
    }
}
