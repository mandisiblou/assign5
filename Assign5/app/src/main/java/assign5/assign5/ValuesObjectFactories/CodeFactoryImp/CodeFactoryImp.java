package assign5.assign5.ValuesObjectFactories.CodeFactoryImp;

/**
 * Created by 211014486 on 4/17/2016.
 */
import assign5.assign5.ValuesObjectFactories.CodeFactory;
import assign5.assign5.ValuesObjects.Code;

import java.util.UUID;


public class CodeFactoryImp implements CodeFactory {
    private static CodeFactoryImp factory = null;

    private  CodeFactoryImp() {
    }
    public static CodeFactoryImp getInstance(){
        if(factory ==null)
            factory = new CodeFactoryImp();
        return factory;
    }
    public Code createCode(Long codeId, String name) {
        Code code = new Code
                .Builder()
                .codeId(codeId)
                .name(name)
                .build();
        return code;
    }
}
