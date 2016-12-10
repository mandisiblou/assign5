package assign5.assign5.EntityObjectsFactories;

import assign5.assign5.EntityObjects.Person;

/**
 * Created by 211014486 on 4/17/2016.
 */
public interface PersonFactory {
    Person createPerson(Long id, String name, int yearOfBirth);
}
