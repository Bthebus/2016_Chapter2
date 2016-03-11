package za.ac.cput.Chapter2.Integers;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-09
 */
public class IntegersTest extends TestCase {

    private Integers integers;

    private int value;

    @Before
    public void setUp() throws Exception
    {
        value = 100;
    }

    @Test
    public void testValue() throws Exception
    {
        integers = new Integers(value);
        assertEquals(value, integers.getValue());
    }

    @After
    public void tearDown() throws Exception
    {
        integers = null;
    }


}
