import java.util.Date;

public class Event {
    private int id;
    private String artist;
    private int countryId;
    private int locationId;
    private int venueId;
    private int hour;
    private Date date;
    private int duration;
    private int attendees;

    public Event(int id, String artist, int countryId, int locationId, int venueId, int hour, Date date, int duration, int attendees) {
        this.id = id;
        this.artist = artist;
        this.countryId = countryId;
        this.locationId = locationId;
        this.venueId = venueId;
        this.hour = hour;
        this.date = date;
        this.duration = duration;
        this.attendees = attendees;
    }

 
}
