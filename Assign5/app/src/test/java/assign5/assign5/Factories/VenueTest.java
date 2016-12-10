package assign5.assign5.Factories;

/**
 * Created by 211014486 on 4/17/2016.
 */

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import assign5.assign5.ValuesObjectFactories.QuestionsFactory;
import assign5.assign5.ValuesObjectFactories.QuestionsFatoryImp.QuestionsFatoryImp;
import assign5.assign5.ValuesObjectFactories.VenueFactory;
import assign5.assign5.ValuesObjectFactories.VenueFactoryImp.VenueFatoryImp;
import assign5.assign5.ValuesObjects.Questions;
import assign5.assign5.ValuesObjects.Venue;

public class VenueTest {
    private VenueFactory factory;

    @Before
    public void setUp() throws Exception {
        factory = VenueFatoryImp.getInstance();
    }

    @Test
    public void studenttestRoleCreation() throws Exception {
        Venue venue = factory.createVenue(213L,"A","Morning");
         Assert.assertEquals(213L, venue.getVenueID(),4.4);
    }


    @Test
    public void testResultsUpdate() throws Exception {
        Venue venue = factory.createVenue(213L,"B","Afternoon");
        Assert.assertEquals(213L, venue.getVenueID(),4.4);


        // Updated Name
        Venue updateVenue = new Venue.Builder()
                .copy(venue)
                .venueID(214L)
                .build();

        Assert.assertEquals(214L, updateVenue.getVenueID(),4.4);
    }
}

