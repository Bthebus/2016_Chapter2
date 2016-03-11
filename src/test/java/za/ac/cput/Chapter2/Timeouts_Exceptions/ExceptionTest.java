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
public class ExceptionTest extends TestCase{

    private Exceptions exceptions;

    private boolean value;

    @Before
    public void setUp() throws Exception
    {
        value = false;
    }

    @After
    public void tearDown() throws Exception
    {
        exceptions = null;
    }

    @Test (expected = Exception.class)
    public void testExceptions()
    {
        exceptions = new Exceptions(value);
        assertFalse(exceptions.isValue());
    }
}
