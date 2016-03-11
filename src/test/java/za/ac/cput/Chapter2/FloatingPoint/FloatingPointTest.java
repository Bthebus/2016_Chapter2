package za.ac.cput.Chapter2.FloatingPoint;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-09
 */

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FloatingPointTest extends TestCase {

    private FloatingPoint floatingPoint;

    private double value;

    @Before
    public void setUp() throws Exception
    {
        value = 2.5;
    }

    @Test
    public void testValue() throws Exception
    {
        floatingPoint = new FloatingPoint(value);
        assertEquals(value, floatingPoint.getValue());
    }
    @After
    public void tearDown() throws Exception{
        floatingPoint = null;
    }
}
