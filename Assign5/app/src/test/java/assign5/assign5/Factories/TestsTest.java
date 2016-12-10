package assign5.assign5.Factories;

/**
 * Created by 211014486 on 4/17/2016.
 */

import assign5.assign5.ValuesObjectFactories.TestsFactory;
import assign5.assign5.ValuesObjectFactories.TestsFactoryImp.TestsFactoryImp;
import assign5.assign5.ValuesObjects.Tests;

import org.junit.Before;
import org.junit.Test;
import junit.framework.Assert;

public class TestsTest {
    private TestsFactory factory;

    @Before
    public void setUp() throws Exception {
        factory = TestsFactoryImp.getInstance();
    }

    @Test
    public void studenttestRoleCreation() throws Exception {
        Tests tests = factory.createCode(211L, "A");
        Assert.assertEquals(211L, tests.getTestId(),4.4);
    }


    @Test
    public void testResultsUpdate() throws Exception {
        Tests tests = factory.createCode(210L, "B");
        Assert.assertEquals(210L, tests.getTestId(),4.4);

        // Updated Name
        Tests updateCode = new Tests.Builder()
                .copy(tests)
                .testId(222L)
                .build();

        Assert.assertEquals(222L, updateCode.getTestId(),4.4);
    }
}
