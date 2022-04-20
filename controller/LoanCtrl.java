package controller;
import model.*;

public class LoanCtrl {
    private PersonCtrl personCtrl;
    private LpCtrl lpCtrl;
    //private Loan loan;
    //private Person person;
    private LoanContainer loanContainer;
    
    /**
     * 
     */
    public LoanCtrl() {
        personCtrl = new PersonCtrl();
        lpCtrl = new LpCtrl();
        loanContainer = LoanContainer.getInstance();
    }
    
    public void createLoan(Person person, Lp lp){
        Loan loan = new Loan(person, lp);
        loanContainer.addLoan(loan);
    }
    
    // public boolean finishLoan() {
        
    // }
}