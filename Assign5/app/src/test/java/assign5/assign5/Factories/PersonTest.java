package assign5.assign5.Factories;

import assign5.assign5.EntityObjects.Person;
import assign5.assign5.EntityObjectsFactories.PersonFactory;
import assign5.assign5.EntityObjectsFactories.PersonFactoryImp.PersonFactoryImp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by 211014486 on 4/17/2016.
 */
public class PersonTest {
    private PersonFactory factory;

    @Before
    public void setUp() throws Exception {
        factory = PersonFactoryImp.getInstance();
    }

    @Test
    public void studenttestRoleCreation() throws Exception {
        Person person = factory.createPerson(211L, "mandisi", 32);
        Assert.assertEquals(211L, person.getId(),4.4);
    }


    @Test
    public void testStudentUpdate() throws Exception {
        Person person = factory.createPerson(213L, "Blou", 24);
        Assert.assertEquals(213L, person.getId(),4.4);

        // Updated Name
        Person updatePerson = new Person.Builder()
                .copy(person)
                .name("Ntobs")
                .build();

        Assert.assertEquals("Ntobs", updatePerson.getName());
    }
}