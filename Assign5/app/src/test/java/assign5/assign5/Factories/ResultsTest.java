package assign5.assign5.Factories;

/**
 * Created by 211014486 on 4/17/2016.
 */
import assign5.assign5.EventsObjectFactories.ResultsFactory;
import assign5.assign5.EventsObjectFactories.ResultsFatoryImp.ResultsFatoryImp;
import assign5.assign5.EventsObjects.Results;

import org.junit.Before;
import org.junit.Test;
import junit.framework.Assert;

public class ResultsTest {
    private ResultsFactory factory;

    @Before
    public void setUp() throws Exception {
        factory = ResultsFatoryImp.getInstance();
    }

    @Test
    public void studenttestRoleCreation() throws Exception {
        Results results = factory.createQuestions(214L,"A","Question1", "Answer1");
        Assert.assertEquals(214L, results.getResultsID(),4.4);
    }


    @Test
    public void testResultsUpdate() throws Exception {
        Results results = factory.createQuestions(214L,"B","Question1", "Answer3");
        Assert.assertEquals(214L, results.getResultsID(),4.4);

        // Updated Name
        Results updateResults = new Results.Builder()
                .copy(results)
                .resultsID(215L)
                .build();

        Assert.assertEquals(215L, updateResults.getResultsID(),4.4);
    }
}

