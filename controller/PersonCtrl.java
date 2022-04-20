package controller;


/**
 * Write a description of class PersonCtrl here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PersonCtrl
{
    // instance variables - replace the example below with your own
    private int x;
    private PersonController personController;
    /**
     * Constructor for objects of class PersonCtrl
     */
    public PersonCtrl()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Person findPersonByName(String phone){
        boolean found = false;
        
        Items id = null;
        for(int i = 0 ; i < items.size() && !found ; i++){
            if(items.get(i).getName().equals(name)){
                id = items.get(i);
            }
            }
            return id;
        }
    }
    