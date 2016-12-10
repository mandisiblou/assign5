package assign5.assign5.ValuesObjectFactories;

import assign5.assign5.ValuesObjects.Department;

/**
 * Created by 211014486 on 4/17/2016.
 */
public interface DepartmentFactory {
    Department createDepartment(Long SID, String name);
}
