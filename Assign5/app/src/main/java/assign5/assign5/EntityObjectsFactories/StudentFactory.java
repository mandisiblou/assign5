package assign5.assign5.EntityObjectsFactories;

import assign5.assign5.EntityObjects.Students;

/**
 * Created by 211014486 on 4/17/2016.
 */
public interface StudentFactory {
    Students createStudents(Long SID, int yearOfBirth, String name);
}
