package assign5.assign5.EntityObjectsFactories.StaffFactoryImp;

/**
 * Created by 211014486 on 4/17/2016.
 */
import assign5.assign5.EntityObjects.Staffs;
import assign5.assign5.EntityObjectsFactories.StaffFactory;

import java.util.UUID;

public class StaffFactoryImp implements StaffFactory {
    private static StaffFactoryImp factory = null;

    private  StaffFactoryImp() {
    }
    public static StaffFactoryImp getInstance(){
        if(factory ==null)
            factory = new StaffFactoryImp();
        return factory;
    }
    public Staffs createStaff(Long SID, int yearOfBirth, String name) {
        Staffs staffs = new Staffs
                .Builder()
                .SID(SID)
                .yearOfBirth(yearOfBirth)
                .name(name)
                .build();
        return staffs;
    }
}
