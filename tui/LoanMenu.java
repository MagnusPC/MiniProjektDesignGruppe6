package tui;
import java.util.Scanner;
import controller.*;
import model.Person;
import model.Copy;


/**
 * Write a description of class LoanMenu here.
 *
 * @author Mogens Holm Iversen
 * @version 0.1.0 Initial draft version 
 */
public class LoanMenu {
    // instance variables
    private LoanCtrl loanCtrl;
    private PersonCtrl personCtrl;
    private LPCtrl lpCtrl;

    /**
     * Constructor for objects of class LoanMenu
     */
    public LoanMenu() {
        // initialise instance variables
        loanCtrl = new LoanCtrl();
        personCtrl = new PersonCtrl();
        lpCtrl = new LPCtrl();
    }

    public void start() {
        loanCtrl.createPerson("Mads", "Aalborgvej", 9000,"Aalborg", "12345678");
        loanCtrl.createPerson("Lasse", "Nibevej", 1234, "Nibe","87654321");
        loanCtrl.createPerson("Magnus", "Horsensvej", 4321, "Horsens", "56784321");
        loanCtrl.createLP(4321, "Dark Vibrations", "Saveus", 2022);
        loanCtrl.createLP(1234,"Shotgun Blues","Volbeat", 2021);
        
        Copy copy1 = new Copy(12345678, "good", 3.99);
        Copy copy2 = new Copy(87654321, "Bad", 4.99);
        
        loanCtrl.addCopyToLPByTitle(1234, copy1);
        loanCtrl.addCopyToLPByTitle(4321, copy2);
        
        
        
        loanMenu();
    }
    
    /**
     * The functionality of the loan menu
     */
    private void loanMenu() {
        boolean running = true;
        while (running) {
            int choice = writeLoanMenu();
            switch (choice) {
                case 1:
                  createLoan();
                  findPersonByPhone();
                  findCopyBySerialNumber();
                  finishLoan();
                  break;
                case 0:
                  running = false;
                  break;
                default:
                  System.out.println("En uforklarlig fejl er sket med choice = " + choice);
                  break;
            }
        }
    }
    
    /**
     * the visual from the loan menu
     * Takes input form keyboard
     */
    private int writeLoanMenu() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("****** Udlaensmenu ******");
        System.out.println(" (1) Opret laen");
        System.out.println(" (0) Tilbage");
        System.out.print("\n Vælg:");
        int choice = getIntegerFromUser(keyboard);
        return choice;
    }
    
    private int getIntegerFromUser(Scanner keyboard) {
        while (!keyboard.hasNextInt()) {
            System.out.println("Input skal være et tal - prøv igen");
            keyboard.nextLine();
        }
        return keyboard.nextInt();
    }
    
    private String getStringFromUser(Scanner keyboard) {
        while (!keyboard.hasNext()) {
            System.out.println("Input skal vaere en String - proev igen");
            keyboard.nextLine();
        }
        return keyboard.next();
    }
    
    private void finishLoan(){
        loanCtrl.finishLoan();
    }
    
    /**
     * Takes input from keyboard and returns a String
     * Input must be with ""
     */
    
    private void findPersonByPhone(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Indtast personens telefonnummer: ");
        loanCtrl.findPersonByPhone(getStringFromUser(keyboard));
        
    }
    
    private void findCopyBySerialNumber(){
        Scanner keyboard = new Scanner(System.in);
        loanCtrl.findCopyBySerialNumber(getIntegerFromUser(keyboard));
    }
    
    /**
     * Takes input from keyboard and returns an int
     */

    private void inputCopy(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Indtast pladens serienummer: ");
        loanCtrl.findCopyBySerialNumber(getIntegerFromUser(keyboard));
        
    }
      
    private void createLoan(){
        loanCtrl.createLoan();
        
    }
    
    // private void createLoan(){
        // Person person = loanCtrl.findPersonByPhone(inputPerson());
        // Copy copy = loanCtrl.findCopyBySerialNo(inputCopy());
        // loanCtrl.createLoan(person, copy);
        // verifyLoan();
    // }
    
    
}

