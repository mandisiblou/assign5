package assign5.assign5.ValuesObjects;

/**
 * Created by Mandisi on 11/14/2016.
 */
public class Venue {
    private static final long serialVersionUID = 1L;
    private Long venueID;
    private String name;
    private String timetable;

    public Long getVenueID() {
        return venueID;
    }

    public String getName() {
        return name;
    }

    public String getTimetable() {
        return timetable;
    }


    public Venue() {
    }

    public Venue(Builder builder) {
        this.venueID = builder.venueID;
        this.name = builder.name;
        this.timetable = builder.timetable;
    }
    public static class Builder {
        private Long venueID;
        private String name;
        private String timetable;

        public Builder venueID(Long venueID) {
            this.venueID = venueID;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder timetable(String timetable) {
            this.timetable = timetable;
            return this;
        }

        public Builder copy(Venue value) {
            this.venueID = value.venueID;
            this.name = value.name;
            this.timetable = value.timetable;
            return this;
        }
        public Venue build() {
            return new Venue(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Venue)) return false;

        Venue questions1 = (Venue) o;

        if (venueID != null ? !venueID.equals(questions1.venueID) : questions1.venueID != null)
            return false;
        if (name != null ? !name.equals(questions1.name) : questions1.name != null)
            return false;
        return timetable != null ? timetable.equals(questions1.timetable) : questions1.timetable == null;

    }

    @Override
    public int hashCode() {
        int result = venueID != null ? venueID.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (timetable != null ? timetable.hashCode() : 0);
        return result;
    }
}