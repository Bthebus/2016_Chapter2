package za.ac.cput.Chapter2.Timeouts_Exceptions;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-10
 */
public class TimeoutTest extends TestCase {

    private Timeout timeout;

    private double height;
    private double width;


    @Before
    public void setUp() throws Exception
    {
        height=2.14;
        width=100.23;
    }

    @After
    public void tearDown() throws Exception
    {
        timeout = null;
    }


    //fails if test takes longer than 100 milliseconds
    @Test(timeout = 100)
    public void testTimeout() throws Exception{
        timeout = new Timeout(height, width);

        assertEquals(2.14, timeout.getHeight());
        assertEquals(100.23, timeout.getWidth());
    }
}
