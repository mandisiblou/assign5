package assign5.assign5.EventsObjectFactories.ResultsFatoryImp;

/**
 * Created by 211014486 on 4/17/2016.
 */
import assign5.assign5.EventsObjectFactories.ResultsFactory;
import assign5.assign5.EventsObjects.Results;

import java.util.UUID;

public class ResultsFatoryImp implements ResultsFactory{
    private static ResultsFatoryImp factory = null;

    private  ResultsFatoryImp() {
    }
    public static ResultsFatoryImp getInstance(){
        if(factory ==null)
            factory = new ResultsFatoryImp();
        return factory;
    }
    public Results createQuestions(Long resultsID, String questionName, String questions, String corrects) {
        Results  questionz = new Results
                .Builder()
                .resultsID(resultsID)
                .questionName(questionName)
                .questions(questions)
                .corrects(corrects)
                .build();
        return questionz;
    }


}
