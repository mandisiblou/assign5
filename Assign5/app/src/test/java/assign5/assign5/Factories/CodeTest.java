package assign5.assign5.Factories;

/**
 * Created by 211014486 on 4/17/2016.
 */
import assign5.assign5.ValuesObjectFactories.CodeFactory;
import assign5.assign5.ValuesObjectFactories.CodeFactoryImp.CodeFactoryImp;
import assign5.assign5.ValuesObjects.Code;

import org.junit.Before;
import org.junit.Test;
import junit.framework.Assert;

public class CodeTest {
    private CodeFactory factory;

    @Before
    public void setUp() throws Exception {
        factory = CodeFactoryImp.getInstance();
    }

    @Test
    public void studenttestRoleCreation() throws Exception {
        Code code = factory.createCode(211L, "A");
        Assert.assertEquals(211L, code.getCodeId(),4.4);
    }


    @Test
    public void testResultsUpdate() throws Exception {
        Code code = factory.createCode(210L, "B");
        Assert.assertEquals(210L, code.getCodeId(),4.4);

        // Updated Name
        Code updateCode = new Code.Builder()
                .copy(code)
                .codeId(222L)
                .build();

        Assert.assertEquals(222L, updateCode.getCodeId(),4.4);
    }
}
