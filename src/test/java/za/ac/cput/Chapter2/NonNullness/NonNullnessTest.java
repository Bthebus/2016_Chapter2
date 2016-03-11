package za.ac.cput.Chapter2.NonNullness;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-09
 */
public class NonNullnessTest extends TestCase {

    private NonNullness nonNull;

    private String name;
    private String surname;

    @Before
    public void setUp() throws Exception
    {
        name = "Braedy";
        surname = "Thebus";
    }

    @Test
    public void testName() throws Exception
    {
        nonNull = new NonNullness(name, surname);
        assertEquals(name, nonNull.getName());
    }

    @Test
    public void testSurname() throws Exception
    {
        nonNull = new NonNullness(name, surname);
        assertEquals(surname, nonNull.getSurname());
    }

    @Test
    public void testNonNullness() throws Exception
    {
        nonNull = new NonNullness(name, surname);
        assertNotNull(nonNull);
    }

    @After
    public void tearDown() throws Exception
    {
        nonNull = null;
    }


}
