package assign5.assign5.ValuesObjectFactories.VenueFactoryImp;

/**
 * Created by 211014486 on 4/17/2016.
 */
import assign5.assign5.ValuesObjectFactories.VenueFactory;
import assign5.assign5.ValuesObjects.Venue;

public class VenueFatoryImp implements VenueFactory{
    private static VenueFatoryImp factory = null;

    private VenueFatoryImp() {
    }
    public static VenueFatoryImp getInstance(){
        if(factory ==null)
            factory = new VenueFatoryImp();
        return factory;
    }
    public Venue createVenue(Long venueID, String name, String timetable) {
        Venue  venue = new Venue
                .Builder()
                .venueID(venueID)
                .name(name)
                .timetable(timetable)
                .build();
        return venue;
    }

}