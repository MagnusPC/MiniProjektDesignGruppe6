package model;
import java.util.ArrayList;


/**
 * Write a description of class PersonContainer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PersonContainer {
    private ArrayList<Person> persons;
    private static PersonContainer instance;
    
    /**
     * Constructor for objects of class PersonContainer
     */
    private PersonContainer() {
        persons = new ArrayList<>();
    }
    
    public static PersonContainer getInstance() {
        if (instance == null) {
            instance = new PersonContainer();
        }
        return instance;
    }
    
}
