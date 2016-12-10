package assign5.assign5.ValuesObjectFactories.TestsFactoryImp;

import assign5.assign5.ValuesObjectFactories.TestsFactory;
import assign5.assign5.ValuesObjects.Tests;

/**
 * Created by Mandisi on 11/14/2016.
 */


public class TestsFactoryImp implements TestsFactory {
    private static TestsFactoryImp factory = null;

    private  TestsFactoryImp() {
    }
    public static TestsFactoryImp getInstance(){
        if(factory ==null)
            factory = new TestsFactoryImp();
        return factory;
    }
    public Tests createCode(Long testsId, String name) {
       Tests tests = new Tests
                .Builder()
                .testId(testsId)
                .name(name)
                .build();
        return tests;
    }
}
