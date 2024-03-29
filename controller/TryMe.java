package controller;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class TryMe.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TryMe
{
    private controller.LoanCtrl loanCtrl1;
    private model.Loan loan1;
    private model.Person person1;
    private model.LP lp1;
    private model.Copy copy1;
    private model.Copy copy2;

    /**
     * Default constructor for test class TryMe
     */
    public TryMe()
    {
       //TODO to af hvers
       loanCtrl1 = new controller.LoanCtrl();
       loan1 = new model.Loan(person1, copy1);
       person1 = new model.Person("bob", "vej 3", 9000, "bykær", "1234");
       //person2 = new model.Person("bente", "gade 8", 8000, "metropolis", "9999");
       lp1 = new model.LP(888, "artist1", "album1", 2010);
       copy1 = new model.Copy(001, "fjong", 99.99);
       copy2 = new model.Copy(002, "ringe", 14.95);
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        // model.Person p = loanCtrl1.findPersonByPhone("1234");
        // model.Copy c = loanCtrl1.findCopyBySerialNo(001);
        lp1.addCopy(copy1);
        lp1.addCopy(copy2);
        loanCtrl1.createLoan(person1, copy1);
        loan1.addCopy(copy2);
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
    public void testLoan(){
        
    }
}
