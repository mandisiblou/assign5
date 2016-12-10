package assign5.assign5.ValuesObjectFactories.DepartmentFactoryImp;

/**
 * Created by 211014486 on 4/17/2016.
 */
import assign5.assign5.ValuesObjectFactories.DepartmentFactory;
import assign5.assign5.ValuesObjects.Department;

import java.util.UUID;

public class DepartmentFactoryImp implements DepartmentFactory {
    private static DepartmentFactoryImp factory = null;

    private  DepartmentFactoryImp() {
    }
    public static DepartmentFactoryImp getInstance(){
        if(factory ==null)
            factory = new DepartmentFactoryImp();
        return factory;
    }
    public Department createDepartment(Long SID, String name) {
        Department department = new Department
                .Builder()
                .SID(SID)
                .name(name)
                .build();
        return department;
    }
}
