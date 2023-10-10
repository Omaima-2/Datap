
public class Event {
         private String eventTitle;
    private String dateAndTime;
    private String location;
    private Contact contact ;

    public Event(String eventTitle, String dateAndTime, String location, Contact contact) {
        this.eventTitle = eventTitle;
        this.dateAndTime = dateAndTime;
        this.location = location;
        this.contact = contact;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    public String getLocation() {
        return location;
    }

    public Contact getContact() {
        return contact;
    }
 
    
    
}
