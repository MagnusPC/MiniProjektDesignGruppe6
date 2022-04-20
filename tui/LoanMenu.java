package tui;
import java.util.Scanner;
import controller.*;
import model.Person;
import model.Lp;


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
    private LpCtrl lpCtrl;

    /**
     * Constructor for objects of class LoanMenu
     */
    public LoanMenu() {
        // initialise instance variables
        loanCtrl = new LoanCtrl();
        personCtrl = new PersonCtrl();
        lpCtrl = new LpCtrl();
    }

    public void start() {
        loanMenu();
    }

    private void loanMenu() {
        boolean running = true;
        while (running) {
            int choice = writeLoanMenu();
            switch (choice) {
                case 1:
                  createLoan();
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
    
    private int writeLoanMenu() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("****** Udlånsmenu ******");
        System.out.println(" (1) Opret lån");
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
    
    private String inputPerson(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Indtast personens telefonnummer: ");
        String phone = keyboard.nextLine();
        return phone;
    }
    
    private int inputLp(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Indtast pladens stregkode: ");
        int barcode = keyboard.nextInt();
        return barcode;
    }
    
    /*private Person findPersonByPhone(){
        String name = inputPerson();
        Person p = loanCtrl.findPersonByPhone(name);
    }*/
    
    private void createLoan(){
        loanCtrl.findPersonByPhone(inputPerson());
        loanCtrl.findLpByBarcode(inputLp());
        loanCtrl.createLoan(person, lp);
    }
}

