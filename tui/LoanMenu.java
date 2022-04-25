package tui;
import java.util.Scanner;
import controller.*;
import model.Person;
import model.Copy;

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
                  addPersonByPhone();
                  addCopyBySerialNumber();
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
    /**
     * Checks if input from keyboard is a int
     */
    private int getIntegerFromUser(Scanner keyboard) {
        while (!keyboard.hasNextInt()) {
            System.out.println("Input skal være et tal - prøv igen");
            keyboard.nextLine();
        }
        return keyboard.nextInt();
    }
    
    /**
     * Takes input from keyboard and returns a String
     * Input must be with ""
     */
    private String inputPerson(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Indtast personens telefonnummer: ");
        String phone = keyboard.nextLine();
        return phone;
    }
    
    /**
     * Takes input from keyboard and returns an int
     */
    private int inputCopy(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Indtast pladens serienummer: ");
        int serialNumber = keyboard.nextInt();
        return serialNumber;
    }
    
    /**
     * Creates a loan
     */    
    public void createLoan(){
        loanCtrl.createLoan();
    }
    /**
     * Adds a copy by serialNumber given from User's input
     */
    public void addCopyBySerialNumber(){
        Copy copy = loanCtrl.findCopyBySerialNumber(inputCopy());
        loanCtrl.setCopy(copy);
    }
    /**
     * Adds a person by phone given from User's input
     */
    public void addPersonByPhone(){
        Person person = loanCtrl.findPersonByPhone(inputPerson());
        loanCtrl.setPerson(person);
    }
    /**
     * Finishes Loan
     */
    public void finishLoan(){
        loanCtrl.finishLoan();
    }
    /**
     * Test Method
     * Returns LoanCtrl
     */
    public LoanCtrl getLoanCtrl(){
        return loanCtrl;
    }
}

