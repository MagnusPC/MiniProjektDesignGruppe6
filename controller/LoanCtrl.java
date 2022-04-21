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
        return personCtrl.findPersonByPhone(phone);
    }
    //TODO f� den til at tilf�je til currentLoan
    public Copy findCopyBySerialNo(int serialNumber){
        return lpCtrl.findCopyBySerialNo(serialNumber);
    }

    
    // public void createLoan(Person person, LP lp){
        // Loan loan = new Loan(person, lp);
        // currentLoan = loan;
    // }
    
    public void createLoan(String phone, int serialNumber){
        Loan loan = new Loan(findPersonByPhone(phone), findCopyBySerialNo(serialNumber));
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
    
    /**
     * Returns the name connected to the loan
     */
    public void getPersonName(){
         if(currentLoan == null){
            System.out.println("There are no person connected to the loan");
        }
        String personName = currentLoan.getPersonName();
        System.out.println("To: " + personName);
    }
    
    /**
     * Returns the LP's title connected to the loan
     */
    public void getLPTitle(){
        if(currentLoan == null){
            System.out.println("There are no LP connected to the loan");
        }
        String lptitle = currentLoan.getLPTitle();
        System.out.println("You are trying to loan: " + lptitle);
    }
 
}