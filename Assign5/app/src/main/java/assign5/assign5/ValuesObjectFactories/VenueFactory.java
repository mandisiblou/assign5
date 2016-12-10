package assign5.assign5.ValuesObjectFactories;

import assign5.assign5.ValuesObjects.Venue;

/**
 * Created by 211014486 on 4/17/2016.
 */
public interface VenueFactory {
    Venue createVenue(Long venueID, String name, String timetable);
}