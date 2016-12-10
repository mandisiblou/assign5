package assign5.assign5.ValuesObjectFactories.QuestionsFatoryImp;

/**
 * Created by 211014486 on 4/17/2016.
 */
import assign5.assign5.ValuesObjectFactories.QuestionsFactory;
import assign5.assign5.ValuesObjects.Questions;

import java.util.UUID;

public class QuestionsFatoryImp implements QuestionsFactory{
    private static QuestionsFatoryImp factory = null;

    private  QuestionsFatoryImp() {
    }
    public static QuestionsFatoryImp getInstance(){
        if(factory ==null)
            factory = new QuestionsFatoryImp();
        return factory;
    }
    public Questions createQuestions(Long questionID, String questionName, String questions, String corrects) {
        Questions  questionz = new Questions
                .Builder()
                .questionID(questionID)
                .questionName(questionName)
                .questions(questions)
                .corrects(corrects)
                .build();
        return questionz;
    }

}