package model;
import java.util.ArrayList;


/**
 * Write a description of class LpContainer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LpContainer
{
    // instance variables - replace the example below with your own
    private static LpContainer instance;
    private ArrayList<Lp> lps;

    /**
     * Constructor for objects of class LpContainer
     */
    private LpContainer()
    {
        // initialise instance variables
        lps = new ArrayList<>();
    }

    public static LpContainer getInstance(){
        if(instance == null){
            instance = new LpContainer();
        }
        return instance;
    }
}
