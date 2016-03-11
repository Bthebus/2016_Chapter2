package za.ac.cput.Chapter2.Failing;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-10
 */
public class FailingTest extends TestCase {

    private Failing fail;

    private String name;

    @Before
    public void setUp() throws Exception
    {
        name = "Braedy";
    }

    @After
    public void tearDown() throws Exception{
        fail = null;
    }



    /*

    Test fails purposefully, commented out to ensure that all tests will run. remove this message and the comment
    to test if the method fails successfully.

    @Test
    public void testGetName() throws Exception{
        fail = new Failing(name);

        //purposefully failing test
        assertEquals("Bob", fail.getName());
    }
    */
}
