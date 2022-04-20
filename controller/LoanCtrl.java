package controller;
import model.*;

public class LoanCtrl {
    private PersonCtrl personCtrl;
    private LPCtrl lpCtrl;
    private LoanContainer loanContainer;
    
    /**
     * 
     */
    public LoanCtrl() {
        personCtrl = new PersonCtrl();
        lpCtrl = new LPCtrl();
        loanContainer = LoanContainer.getInstance();
    }
    
    public Person findPersonByPhone(String phone){
        return personCtrl.findPersonByPhone(phone);
    }
    
    public LP findLpByBarcode(int barcode){
        return lpCtrl.findLpByBarcode(barcode);
    }
    
    public void createLoan(Person person, LP lp){
        Loan loan = new Loan(person, lp);
        loanContainer.addLoan(loan);
    }
    
    // public boolean finishLoan() {
        
    // }
}