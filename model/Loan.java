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
    private ArrayList<Copy> copies;
    
    /**
     * Constructor for objects of class Loan
     */
    public Loan()
    {
        // initialise instance variables
        person = null;
        copies = new ArrayList<>();
    }
    
    /*
     * sørg for der ikke kan overskrives og person ikke er null
     */
    
    
    public void addCopy(Copy copy){
        copies.add(copy);
    }
    
    // public Person getPerson(){
        // return person;
    // }
    
    // public Copy getCopy(){
        // return copy;
    // }
    public void setPerson(Person person){
        this.person = person;
    }
    
    /**
     * gets the name of the person connected to the loan
     */
    public String getPersonName(){
        return person.getName();
    }
    
    /**
     * gets the title of the LP connected to the loan
     */
    public String getLPTitle(){
        String title = "";
        //TODO foreach loop eller
        return title;
    }
}
