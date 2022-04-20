package model;
import java.util.ArrayList;


/**
 * Write a description of class Loan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Loan
{
    // instance variables - replace the example below with your own
    private Person person;
    private Lp lp;

    /**
     * Constructor for objects of class Loan
     */
    public Loan()
    {
        // initialise instance variables
        person = null;
        lp = null;
    }

    /*
     * sørg for der ikke kan overskrives og person ikke er null
     */
    public void setPerson(Person person){
        this.person = person;
    }
    
    public void setLp(Lp lp){
        this.lp = lp;
    }
}
