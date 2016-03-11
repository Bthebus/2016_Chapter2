package za.ac.cput.Chapter2.ObjectEquality;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-10
 */
public class ObjectEqualityTest extends TestCase {

    private ObjectEquality objectEquality1;
    private ObjectEquality objectEquality2;

    private String name;
    private String surname;
    private int age;

    @Before
    public void setUp() throws Exception {

        name = "Braedy";
        surname = "Thebus";
        age = 23;
    }

    @After
    public void tearDown() throws Exception
    {
        objectEquality1 = null;
        objectEquality2 = null;
    }

    @Test
    public void testObjectEquality() throws Exception{
        objectEquality1 = new ObjectEquality(name, surname, age);
        objectEquality2 = objectEquality1;

        assertSame(objectEquality1, objectEquality2);
    }
}
