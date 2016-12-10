package assign5.assign5.Factories;

import assign5.assign5.EntityObjects.Students;
import assign5.assign5.EntityObjectsFactories.StudentFactory;
import assign5.assign5.EntityObjectsFactories.StudentFactoryImp.StudentFactoryImp;

import org.junit.Before;
import org.junit.Test;
import junit.framework.Assert;

public class StudentTest {
    private StudentFactory factory;

    @Before
    public void setUp() throws Exception {
        factory = StudentFactoryImp.getInstance();
    }

    @Test
    public void studenttestRoleCreation() throws Exception {
        Students student = factory.createStudents(211L, 16, "mandisi");
        Assert.assertEquals(211L, student.getSID(),4.4);
    }

    @Test
    public void testStudentUpdate() throws Exception {
        Students students = factory.createStudents(213L, 12, "Blou");

        // Updated Name
        Students updateStudent = new Students.Builder()
                .copy(students)
                .name("Ntobs")
                .build();

        Assert.assertEquals("Ntobs", updateStudent.getName());
    }
}
