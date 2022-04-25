package tui;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tui.*;
import controller.*;
import model.*;

/**
 * The test class TryMe.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TryMe
{
    private LoanMenu loanMenu;
    /**
     * Default constructor for test class TryMe
     */
    public TryMe()
    {
        loanMenu = new LoanMenu();
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    @Test
    public void possitiveTestCreateLoan(){
        loanMenu.createLoan();
        Copy copy = new Copy(12345678, "good", 3.99);
        Person person = new Person("Mads", "Astrupvej", 9800, "Astrup", "12345678");
        loanMenu.getLoanCtrl().setCopy(copy);
        loanMenu.getLoanCtrl().setPerson(person);
        assertNotNull(loanMenu.getLoanCtrl().getLoan());
    }
    
    
    @Test
    public void possitiveTestAll(){
        //Creates Data
        LP lp1 = new LP(4321, "Dark Vibrations", "Saveus", 2022);
        LP lp2 = new LP(1234,"Shotgun Blues","Volbeat", 2021);
        Copy copy1 = new Copy(12345678, "good", 3.99);
        Copy copy2 = new Copy(87654321, "Bad", 4.99);
        LPContainer lpContainer = LPContainer.getInstance();
        PersonContainer personContainer = PersonContainer.getInstance();
        LoanContainer loanContainer = LoanContainer.getInstance();
        Person person = new Person("Mads", "Astrupvej", 9800, "Astrup", "12345678");
        //Adds Data to containers
        lpContainer.addLP(lp1);
        lp1.addCopy(copy1);
        lpContainer.addLP(lp2);
        lp2.addCopy(copy2);
        personContainer.addPerson(person);
        //Testing
        loanMenu.createLoan();
        loanMenu.getLoanCtrl().setCopy(loanMenu.getLoanCtrl().findCopyBySerialNumber(87654321));
        loanMenu.getLoanCtrl().setPerson(loanMenu.getLoanCtrl().findPersonByPhone("12345678"));
        loanMenu.getLoanCtrl().finishLoan();
        assertNotNull(loanContainer.getLoans().get(0));
    }
    
    @Test
    public void possitiveTestFindCopyBySerialNumber(){
         LP lp1 = new LP(4321, "Dark Vibrations", "Saveus", 2022);
        LP lp2 = new LP(1234,"Shotgun Blues","Volbeat", 2021);
        Copy copy1 = new Copy(12345678, "good", 3.99);
        Copy copy2 = new Copy(87654321, "Bad", 4.99);
        LPContainer lpContainer = LPContainer.getInstance();
        PersonContainer personContainer = PersonContainer.getInstance();
        Person person = new Person("Mads", "Astrupvej", 9800, "Astrup", "12345678");
        //Adds Data to containers
        lpContainer.addLP(lp1);
        lp1.addCopy(copy1);
        lpContainer.addLP(lp2);
        lp2.addCopy(copy2);
        personContainer.addPerson(person);
        
        loanMenu.createLoan();
        loanMenu.getLoanCtrl().setCopy(loanMenu.getLoanCtrl().findCopyBySerialNumber(87654321));
        assertEquals(loanMenu.getLoanCtrl().getLoan().getCopy().getSerialNumber() ,87654321);
    }

}
