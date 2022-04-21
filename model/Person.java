package model;


/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    // instance variables - replace the example below with your own
    private String name;
    private String address;
    private int zipCode;
    private String city;
    private int phone;

    /**
     * Constructor for objects of class Person
     */
    public Person(String name, String address, int zipCode, String city, int phone)
    {
        // initialise instance variables
        this.name = name;
        this.address = address;
        this.zipCode = zipCode;
        this.city = city;
        this.phone = phone;
    }

    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public int getZipCode(){
        return zipCode;
    }
    
    public String getCity(){
        return city;
    }
    
    public int getPhone(){
        return phone;
    }
    
    public void printPersonShort(){
        System.out.println("Personens navn: " + name);
        System.out.println(name + "s tlf nummer: " + phone);
    }
    
    public void printPersonLong(){
        printPersonShort();
        System.out.println(name + "s addresse: " + address + ", " + zipCode + " " + city);
    }
}
