package assign5.assign5.Factories;

/**
 * Created by 211014486 on 4/17/2016.
 */
import assign5.assign5.ValuesObjectFactories.DepartmentFactory;
import assign5.assign5.ValuesObjectFactories.DepartmentFactoryImp.DepartmentFactoryImp;
import assign5.assign5.ValuesObjects.Department;

import org.junit.Before;
import org.junit.Test;
import junit.framework.Assert;

public class DepartmentTest {
    private DepartmentFactory factory;

    @Before
    public void setUp() throws Exception {
        factory = DepartmentFactoryImp.getInstance();
    }

    @Test
    public void studenttestRoleCreation() throws Exception {
        Department department = factory.createDepartment(211L, "A");
        Assert.assertEquals(211L, department.getSID(),4.4);
    }

    @Test
    public void testResultsUpdate() throws Exception {
        Department department = factory.createDepartment(210L, "B");
        Assert.assertEquals(210L, department.getSID(),4.4);

        // Updated Name
        Department updateDepartment = new Department.Builder()
                .copy(department)
                .SID(211L)
                .build();

        Assert.assertEquals(211L, updateDepartment.getSID(),4.4);
    }
}
