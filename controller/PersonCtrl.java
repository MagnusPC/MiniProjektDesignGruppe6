package controller;
import java.util.ArrayList;
import model.PersonContainer;
import model.Person;

/**
 * Write a description of class PersonCtrl here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PersonCtrl
{
    // instance variables - replace the example below with your own
    
    private PersonContainer personContainer;
    
    /**
     * Constructor for objects of class PersonCtrl
     */
    public PersonCtrl()
    {
        // initialise instance variables
        personContainer = new PersonContainer(); 
    }
    
    
    /**
     * Creates a person with input form user
     */
    /*public void createPerson(String name, String address, int zipCode, String city, String phone){
        Person person = new Person(name, address, zipCode, city, phone);
        addPerson(person);
    }*/
    
    /**
     * add person to the personContainer
     */
    private void addPerson(Person person){
        personContainer.addPerson(person);
    }
    
    /**
     * Finds a person from a phone
     */
    public Person findPersonByPhone(int phone){
        return personContainer.findPersonByPhone(phone);
    }
    }
    