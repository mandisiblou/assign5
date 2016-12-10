package assign5.assign5.ValuesObjectFactories;

import assign5.assign5.ValuesObjects.Tests;

/**
 * Created by 211014486 on 4/17/2016.
 */
public interface TestsFactory {
    Tests createCode(Long testId, String name);
}
