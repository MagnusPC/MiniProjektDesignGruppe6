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
    
    public Person findPersonByPhone(String phone){
        return personCtrl.findPersonByPhone(phone);
    }
    
    public Lp findLpByBarcode(int barcode){
        return lpCtrl.findLpByBarcode(barcode);
    }
    
    public void createLoan(Person person, Lp lp){
        Loan loan = new Loan(person, lp);
        loanContainer.addLoan(loan);
    }
    
    // public boolean finishLoan() {
        
    // }
}