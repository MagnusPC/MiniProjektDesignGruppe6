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
    private LP lp;

    /**
     * Constructor for objects of class Loan
     */
    public Loan(Person person, LP lp)
    {
        // initialise instance variables
        this.person = person;
        this.lp = lp;
    }

    /*
     * sørg for der ikke kan overskrives og person ikke er null
     */
    public void setPerson(Person person){
        this.person = person;
    }
    
    public void setLp(LP lp){
        this.lp = lp;
    }
    
    public Person getPerson(){
        return person;
    }
    
    public LP getLP(){
        return lp;
    }
    
    public String getPersonName(){
        Person person = getPerson();
        return person.getName();
    }
    
    public String getLPTitle(){
        LP lp = getLP();
        return lp.getTitle();
    }
}
