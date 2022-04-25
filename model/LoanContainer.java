package model;
import java.util.ArrayList;



public class LoanContainer{
    // instance variables - replace the example below with your own
    private static LoanContainer instance;
    private ArrayList<Loan> loans;
    
    /**
     * Constructor for objects of class LoanContainer
     */
    private LoanContainer(){
        // initialise instance variables
        loans = new ArrayList<>();
    }

    /**
     * Adds a loan to the loanContainer
     */
    public boolean addLoan(Loan loan){
        return loans.add(loan);
    }
    
    /**
     * Test Method for testing
     */
    public ArrayList getLoans(){
        return loans;
    }
    
    /**
     * Static method because its a simpleton
     * So it doesn't make a new instance of LoanContainer
     */
    public static LoanContainer getInstance(){
        if (instance == null){
            instance = new LoanContainer();
        }
        return instance;
    }



}
