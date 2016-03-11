package za.ac.cput.Chapter2.False;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-09
 */
public class FalseTest extends TestCase{
    private False falseObject;

    private boolean value;

    @Before
    public void setUp() throws Exception
    {
        value = false;
    }

    @Test
    public void testValue() throws Exception
    {
        falseObject = new False(value);
        assertFalse(falseObject.isValue());
    }
    @After
    public void tearDown() throws Exception{
        falseObject = null;
    }
}
