package za.ac.cput.Chapter2.ObjectIdentity;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-10
 */
public class ObjectIdentityTest extends TestCase {

    private ObjectIdentity objectIdentity1;
    private ObjectIdentity objectIdentity2;

    private String name;
    private String surname;
    private int age;

    @Before
    public void setUp() throws Exception
    {
        name = "John";
        surname = "Tucker";
        age = 35;
    }

    @After
    public void tearDown() throws Exception
    {
        objectIdentity1 = null;
        objectIdentity2 = null;
    }

    @Test
    public void testObjectIdentity() throws Exception
    {
        objectIdentity1 = new ObjectIdentity(name, surname, age);
        objectIdentity2 = new ObjectIdentity(name, surname, age);

        assertEquals(objectIdentity1.hashCode(), objectIdentity2.hashCode());

    }
}
