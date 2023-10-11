
public class Event {
       private String eventTitle;
    private String eventdate;
    private String eventTime;
    private String eventLocation;
    private String contactName ;
  

    public Event(String eventTitle, String eventdate, String eventTime, String eventLocation, String contactName) {
        this.eventTitle = eventTitle;
        this.eventdate = eventdate;
        this.eventTime = eventTime;
        this.eventLocation = eventLocation;
        this.contactName = contactName;
    }

    @Override
    public String toString() {
        return "Event{" + "eventTitle=" + eventTitle + ", eventdate=" + eventdate + ", eventTime=" + eventTime + ", eventLocation=" + eventLocation + ", contactName=" + contactName + '}';
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public String getEventdate() {
        return eventdate;
    }

    public void setEventdate(String eventdate) {
        this.eventdate = eventdate;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }
   
}

