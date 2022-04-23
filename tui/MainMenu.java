package tui;

import controller.TryMe;
import java.util.Scanner;

/**
 * Write a description of class MainMenu here.
 *
 * @author Mogens Holm Iversen
 * @version 0.1.0 Initial draft version 
 */
public class MainMenu {
    // instance variables 
    private LoanMenu loanMenu;
    private TryMe testCode;

    /**
     * Constructor for objects of class MainMenu
     */
    public MainMenu() {
        // initialise instance variables
        loanMenu = new LoanMenu();
       
    }
    
    public void start() {
        mainMenu();
    }
    
    /**
     * The first terminal at the moment can start the loaning process
     */
    private void mainMenu() {
        boolean running = true;
        while (running) {
            int choice = writeMainMenu();
            switch (choice) {
                case 1:
                  System.out.println("Denne er ikke implementeret endnu");
                  break;
                case 2:
                  System.out.println("Denne er ikke implementeret endnu");
                  break;
                case 3:
                  loanMenu.start();
                  break;
                case 9:
                  //runTest();
                  break;
                case 0:
                  System.out.println("Tak for denne gang.");
                  running = false;
                  break;
                default:
                  System.out.println("Der er sket en uforklarlig fejl, choice = "+choice);
                  break;
            }
        }
    }
    
    /**
     * Writes to the user the possibilities that he has and returns the choice
     * The written part of the mainMenu
     */
    private int writeMainMenu() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("****** Hovedmenu ******");
        System.out.println(" (1) Find laaner");
        System.out.println(" (2) Find LP");
        System.out.println(" (3) Udlaansmenu");
        System.out.println(" (9) Generer testdata");// will generate testdata, delete in final version
        System.out.println(" (0) Afslut programmet");
        System.out.print("\n Valg:");
        
        while (!keyboard.hasNextInt()) {
            System.out.println("Input skal vaere et tal - proev igen");
            keyboard.nextLine();
        }
        int choice = keyboard.nextInt();
        return choice;
    }
    
    private void runTest() {
        //crasher
        testCode.setUp();
        testCode.testLoan();
    }

}
