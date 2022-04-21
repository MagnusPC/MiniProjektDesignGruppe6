package controller;
import model.*;

public class LoanCtrl {
    private PersonCtrl personCtrl;
    private LPCtrl lpCtrl;
    private LoanContainer loanContainer;
    private Loan currentLoan;
    /**
     * 
     */
    public LoanCtrl() {
        personCtrl = new PersonCtrl();
        lpCtrl = new LPCtrl();
        loanContainer = LoanContainer.getInstance();
        currentLoan = null;
    }
    
    public Person findPersonByPhone(String phone){
        return personCtrl.findPersonByPhone(phone);
    }
    
    public LP findLpByBarcode(int barcode){
        return lpCtrl.findLpByBarcode(barcode);
    }
    
    public void createLoan(Person person, LP lp){
        Loan loan = new Loan(person, lp);
        currentLoan = loan;
    }
    
    public void finishLoan(){
        loanContainer.addLoan(currentLoan);
        System.out.println("Loan has been archived ");
        System.out.println("The renting period is: ");
        
    }
    
 
}