package model;
import java.util.ArrayList;



public class PersonContainer{
    // instance variables - replace the example below with your own
    private static PersonContainer instance;
    private ArrayList<Person> persons;

    /**
     * Constructor for objects of class PersonContainer
     */
    public PersonContainer(){
        // initialise instance variables
        persons = new ArrayList<>();
    }
    
    /**
     * Static method because its a simpleton
     * So it doesn't make a new instance of personContainer
     */
    public static PersonContainer getInstance(){
        if (instance == null){
            instance = new PersonContainer();
        }
        return instance; 
    }
    
    /**
     * adds a person to the Personcontainer
     */
    public void addPerson(Person person){
        persons.add(person);
    }
    
    /**
     * Finds a person from a phone
     * Returns person
     */
    public Person findPersonByPhone(String phone){
        boolean found = false;
        Person person = null;
        int index = 0;
        while(index < persons.size() && !found){
            Person element = persons.get(index);
            if(element.getPhone().equals(phone)){
                found = true;
                person = element;
            }
            else {
                index++;
            }
        }
        return person;
    }
    
    
}
