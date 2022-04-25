package controller;
import java.util.ArrayList;
import model.PersonContainer;
import model.Person;


public class PersonCtrl{
    // instance variables - replace the example below with your own
    
    private PersonContainer personContainer;
    
    /**
     * Constructor for objects of class PersonCtrl
     */
    public PersonCtrl(){
        // initialise instance variables
        personContainer = new PersonContainer(); 
    }
    
    /**
     * add person to the personContainer
     */
    public void addPerson(Person person){
        personContainer.addPerson(person);
    }
    
    /**
     * Finds a person from a phone
     */
    public Person findPersonByPhone(String phone){
        return personContainer.findPersonByPhone(phone);
    }
    }
    