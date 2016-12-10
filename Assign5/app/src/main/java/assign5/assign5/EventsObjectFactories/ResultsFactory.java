package assign5.assign5.EventsObjectFactories;

import assign5.assign5.EventsObjects.Results;

/**
 * Created by 211014486 on 4/17/2016.
 */
public interface ResultsFactory {
    Results createQuestions(Long resultsID, String questionName, String questions, String corrects);
}