package assign5.assign5.ValuesObjectFactories;

import assign5.assign5.ValuesObjects.Code;

/**
 * Created by 211014486 on 4/17/2016.
 */
public interface CodeFactory {
    Code createCode(Long codeId, String name);
}
