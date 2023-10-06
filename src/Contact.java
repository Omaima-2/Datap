import java.io.*;
import java.util.*;
class Contact implements Comparable<Contact>{
    private String contactName;
    private String phoneNumber;
    private String emailAddress;
    private String address;
    private String birthday;
    private String notes;

    public Contact(String contactName, String phoneNumber, String emailAddress, String address, String birthday, String notes) {
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.address = address;
        this.birthday = birthday;
        this.notes = notes;
    }
        public int compareTo(String a){
        
        return this.getContactName().compareTo( a) ;
    }

    public int compareTo(Contact a){
        
        return this.getContactName().compareTo( a.getContactName() ) ;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getContactName() {
        return contactName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getAddress() {
        return address;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getNotes() {
        return notes;
    }
    public void display(){
       System.out.println("Name Of Contact: " + contactName);
       System.out.println("Phone Number: " + phoneNumber);
       System.out.println("Email Address: " + emailAddress);
       System.out.println("Address: " + address);
       System.out.println("Birthday: " + birthday);
       System.out.println("Notes: " + notes);
       
 
        
    }
    
    

    
    
}
