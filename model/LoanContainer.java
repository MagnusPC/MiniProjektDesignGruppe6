package model;
import java.util.ArrayList;


/**
 * Write a description of class LoanContainer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoanContainer
{
    // instance variables - replace the example below with your own
    private Loan loan;
    private static LoanContainer instance;
    private ArrayList<Loan> loans;
    
    /**
     * Constructor for objects of class LoanContainer
     */
    public LoanContainer()
    {
        // initialise instance variables
        loans = new ArrayList<>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean addLoan(Loan loan){
        return loans.add(loan);
    }
    
    public static LoanContainer getInstance(){
        if (instance == null){
            instance = new LoanContainer();
        }
        return instance;
    }



}
