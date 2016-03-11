package za.ac.cput.Chapter2.Nullness;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-09
 */
public class NullnessTest extends TestCase{

    //will not be set to anything to ensure it stays null
    private Nullness nullness;


    @Before
    public void setUp() throws Exception{
    }


    //test illustrates the use of the assertNull() method.
    @Test
    public void testValue() throws Exception
    {
        assertNull(nullness);
    }
}
