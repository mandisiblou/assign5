package assign5.assign5.ValuesObjectFactories;

import assign5.assign5.ValuesObjects.Questions;

/**
 * Created by 211014486 on 4/17/2016.
 */
public interface QuestionsFactory {
    Questions createQuestions(Long questionID, String questionName, String questions, String corrects);
}