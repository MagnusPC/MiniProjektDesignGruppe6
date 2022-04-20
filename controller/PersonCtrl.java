package controller;
import java.util.ArrayList;
import model.*;

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
    private ArrayList personList;
    /**
     * Constructor for objects of class PersonCtrl
     */
    public PersonCtrl()
    {
        // initialise instance variables
        personContainer = new PersonContainer(); 
        personList = new ArrayList<>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Person findPersonByPhone(String phone){
        return personContainer.findPersonByPhone(phone);
    }
    }
    