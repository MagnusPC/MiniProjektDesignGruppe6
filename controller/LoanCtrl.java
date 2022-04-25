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
    
    public String getDate(){
        return date.toString();
    }
    
    /**
     * Finds a person in our personContainer with the phone attribute
     */
    public Person findPersonByPhone(String phone){
        Person p = personCtrl.findPersonByPhone(phone);
        return p;
    }
    
    public Copy findCopyBySerialNumber(int serialNumber){
        return lpCtrl.findCopyBySerialNumber(serialNumber);
    }
    
    public void createLoan(){
        Loan loan = new Loan();
        currentLoan = loan;
    }
    
    /**
     * Saves the loan in the loanContainer and gives feedback to user
     */
    public void finishLoan(){
        loanContainer.addLoan(currentLoan);
        System.out.println("Loan has been archived ");
        System.out.println("The renting period is 14 days from today: " + getDate());
    }
    
    public void setPerson(Person person){
        currentLoan.setPerson(person);
    }
    
    public void setCopy(Copy copy){
        currentLoan.setCopy(copy);
    }
    
    public Loan getLoan(){
        return currentLoan;
    }
    
}