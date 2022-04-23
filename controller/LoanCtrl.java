package controller;
import model.*;
import java.util.Scanner;
import java.util.Date;

public class LoanCtrl {
    private PersonCtrl personCtrl;
    private LPCtrl lpCtrl;
    private LoanContainer loanContainer;
    private Loan currentLoan;
    private Date date;
    
    private Person person;
    /**
     * 
     */
    public LoanCtrl() {
        personCtrl = new PersonCtrl();
        lpCtrl = new LPCtrl();
        loanContainer = LoanContainer.getInstance();
        currentLoan = null;
        date = new Date();
    }
    
    public String getDate() {
        return date.toString();
    }
    
    public void setPerson(Person person){
        this.person = person;
    }
    
    public void createLoan() {
        //TODO få loanctrl til at adde copies (evt med kald til findBy...)
        Loan loan = new Loan();
        currentLoan = loan;
    }
    
    /**
     * Sets the person to the loan
     * @param phone finds the person with the phone connected with the person
     */
   
    public Person findPersonByPhone(String phone){
        currentLoan.setPerson(personCtrl.findPersonByPhone(phone));
        return personCtrl.findPersonByPhone(phone);
    }
    
    public Copy findCopyBySerialNumber(int serialNumber){
        currentLoan.addCopy(lpCtrl.findCopyBySerialNumber(serialNumber));
        return lpCtrl.findCopyBySerialNumber(serialNumber);
    }

    /**
     * Saves the loan in the loanContainer and gives feedback to user
     */
    public void finishLoan() {
        loanContainer.addLoan(currentLoan);
        System.out.println("Loan has been archived ");
        System.out.println("The renting period is 14 days from today: " + getDate());
    }
 
}