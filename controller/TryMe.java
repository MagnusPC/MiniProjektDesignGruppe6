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
    private controller.PersonCtrl personCt1;
    private controller.LPCtrl lPCtrl1;

    /**
     * Default constructor for test class TryMe
     */
    public TryMe()
    {
       //TODO to af hvers
       personCt1 = new controller.PersonCtrl(); 
       lPCtrl1 = new controller.LPCtrl();
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        personCt1.createPerson("bob", "vej 3", 9000, "bykær", "1234");
        personCt1.createPerson("bente", "gade 8", 8000, "citycity", "9999");
        lPCtrl1.createLP(001, "album1", "artist1", 1999, "fjong", 99.99);
        lPCtrl1.createLP(002, "album2", "artist2", 2010, "ringe", 14.95);
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
}
