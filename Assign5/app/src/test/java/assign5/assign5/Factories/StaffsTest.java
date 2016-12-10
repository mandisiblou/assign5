package assign5.assign5.Factories;

/**
 * Created by 211014486 on 4/17/2016.
 */
import assign5.assign5.EntityObjects.Staffs;
import assign5.assign5.EntityObjectsFactories.StaffFactory;
import assign5.assign5.EntityObjectsFactories.StaffFactoryImp.StaffFactoryImp;

import org.junit.Before;
import org.junit.Test;
import junit.framework.Assert;

public class StaffsTest {
    private StaffFactory factory;

    @Before
    public void setUp() throws Exception {
        factory = StaffFactoryImp.getInstance();
    }

    @Test
    public void studenttestRoleCreation() throws Exception {
        Staffs staffs = factory.createStaff(215L, 16, "mandisi");
        Assert.assertEquals(215L, staffs.getSID(),4.4);
    }


    @Test
    public void testStudentUpdate() throws Exception {
        Staffs staffs = factory.createStaff(213L, 12, "Blou");
        Assert.assertEquals(213L, staffs.getSID(),4.4);

        // Updated Name
        Staffs updateStaffs = new Staffs.Builder()
                .copy(staffs)
                .SID(216L)
                .build();

        Assert.assertEquals(216L, updateStaffs.getSID(),4.4);
    }
}
