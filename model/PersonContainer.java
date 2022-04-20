package model;
import java.util.ArrayList;


/**
 * Write a description of class PersonContainer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PersonContainer
{
    // instance variables - replace the example below with your own
    private static PersonContainer instance;
    private ArrayList<Person> persons;

    /**
     * Constructor for objects of class PersonContainer
     */
    public PersonContainer()
    {
        // initialise instance variables
        persons = new ArrayList<>();
    }
    
    public static PersonContainer getInstance(){
        if (instance == null){
            instance = new PersonContainer();
        }
        return instance;    
    }
    
    public ArrayList getPersons(){
        return persons;
    }
}
