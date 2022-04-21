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
    
    public void createPerson(String name, String address, int zipCode, String city, String phone){
        Person person = new Person(name, address, zipCode, city, phone);
        addPerson(person);
    }

    private void addPerson(Person person){
        personContainer.addPerson(person);
    }
    
    public Person findPersonByPhone(String phone){
        return personContainer.findPersonByPhone(phone);
    }
    }
    