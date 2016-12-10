package assign5.assign5.EntityObjectsFactories;

import assign5.assign5.EntityObjects.Staffs;

/**
 * Created by 211014486 on 4/17/2016.
 */
public interface StaffFactory {
    Staffs createStaff(Long SID, int yearOfBirth, String name);
}
