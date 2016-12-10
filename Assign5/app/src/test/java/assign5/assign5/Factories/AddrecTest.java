package assign5.assign5.Factories;

/**
 * Created by 211014486 on 4/17/2016.
 */
import assign5.assign5.ValuesObjectFactories.AddrecFactory;
import assign5.assign5.ValuesObjectFactories.AddrecFactoryImp.AddrecFactoryImp;
import assign5.assign5.ValuesObjects.Addrec;

import org.junit.Before;
import org.junit.Test;
import junit.framework.Assert;

public class AddrecTest {
    private AddrecFactory factory;

    @Before
    public void setUp() throws Exception {
        factory = AddrecFactoryImp.getInstance();
    }

    @Test
    public void studenttestRoleCreation() throws Exception {
        Addrec addrec = factory.createAddrec(211L, "Kwezi", "Cape Town", "7784", "S.A");
        Assert.assertEquals(211L, addrec.getAddressId(),4.4);
    }


    @Test
    public void testResultsUpdate() throws Exception {
        Addrec addrec = factory.createAddrec(211L, "Kwezi", "Cape Town", "8000", "S.A");
        Assert.assertEquals("Cape Town", addrec.getTown());

        // Updated Name
          Addrec updateAddrec = new Addrec.Builder()
                .copy(addrec)
                .addressId(233L)
                .build();

        Assert.assertEquals(233L, updateAddrec.getAddressId(),4.4);
    }
}

