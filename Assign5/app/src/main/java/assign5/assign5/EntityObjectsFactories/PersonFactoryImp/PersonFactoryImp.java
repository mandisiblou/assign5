package assign5.assign5.EntityObjectsFactories.PersonFactoryImp;

/**
 * Created by 211014486 on 4/17/2016.
 */
import assign5.assign5.EntityObjects.Person;
import assign5.assign5.EntityObjectsFactories.PersonFactory;

import java.util.UUID;
public class PersonFactoryImp implements PersonFactory{
    private static PersonFactoryImp factory = null;

    private  PersonFactoryImp() {
    }
    public static PersonFactoryImp getInstance(){
        if(factory ==null)
            factory = new PersonFactoryImp();
        return factory;
    }
    public Person createPerson(Long id, String name, int yearOfBirth) {
        Person  person = new Person
                .Builder()
                .id(id)
                .name(name)
                .yearOfBirth(yearOfBirth)
                .build();
        return person;
    }
}
