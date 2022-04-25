package model;
import java.util.ArrayList;


public class Loan{
    // instance variables - replace the example below with your own
    private Person person;
    private Copy copy;

    /**
     * Constructor for objects of class Loan
     */
    public Loan(){
        // initialise instance variables
        person = null;
        copy = null;
    }

    public void setPerson(Person person){
        this.person = person;
    }

    public void setCopy(Copy copy){
        this.copy = copy;
    }

    public Person getPerson(){
        return person;
    }

    public Copy getCopy(){
        return copy;
    }

}
