package assign5.assign5.EntityObjectsFactories.StudentFactoryImp;

/**
 * Created by 211014486 on 4/17/2016.
 */
import assign5.assign5.EntityObjects.Students;
import assign5.assign5.EntityObjectsFactories.StudentFactory;
import assign5.assign5.ValuesObjects.Addrec;

import java.util.UUID;

public class StudentFactoryImp implements StudentFactory {
    private static StudentFactoryImp factory = null;

    private  StudentFactoryImp() {
    }
    public static StudentFactoryImp getInstance(){
        if(factory ==null)
            factory = new StudentFactoryImp();
        return factory;
    }
    public Students createStudents(Long studentID, int yearOfBirth, String name) {
        Students  students = new Students
                .Builder()
                .studentID(studentID)
                .yearOfBirth(yearOfBirth)
                .name(name)
                .addrec(new Addrec())
                .build();
        return students;
    }
}