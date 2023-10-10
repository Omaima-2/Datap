
import java.util.Scanner;

public class PhoneBook extends LinkedListADT {
      private LinkedListADT contactlist; 
Contact Contact =new Contact();
         public Contact Searchbyname (String x){
             

            if (Contact.IsEmpty()){
                return null;}
            Contact.FindFirst();
            while (!Contact.Last())
            {
                
                if (Contact.Retrieve().getContactName().equals(x))
                    return Contact.Retrieve();
                
                Contact.FindNext();    
            }
            if (Contact.Retrieve().getContactName().equals(x))
                 return  Contact.Retrieve();
                 
                 
                 return null;
              }
   
    public Contact SearchthePhonenumber (String x){
             

            if (Contact.IsEmpty()){
                return null;}
            Contact.FindFirst();
            while (!Contact.Last())
            {
                
                if (Contact.Retrieve().getPhoneNumber().equals(x))
                    return Contact.Retrieve();
                
                Contact.FindNext();    
            }
            if (Contact.Retrieve().getPhoneNumber().equals(x))
                 return  Contact.Retrieve();
                 
                 
                 return null;
              }
   //seash by Email return list
              public static LinkedListADT<Contact> SearchbyEmail (String x){
       LinkedListADT<Contact> res= new  LinkedListADT<Contact>();
            if (res.IsEmpty())
                return res;
            res.FindFirst();
            while (!res.Last())
            {
                
                if (res.Retrieve().getEmailAddress().equals(x))
                    res.insert(res.Retrieve());
                
                res.FindNext();    
            }
            if (res.Retrieve().getEmailAddress().equals(x))
                 res.insert(res.Retrieve());
            return res;
              }
            
         public static LinkedListADT<Contact> SearchbyAddress (String x){
       LinkedListADT<Contact> res= new  LinkedListADT<Contact>();
            if (res.IsEmpty())
                return res;
            res.FindFirst();
            while (!res.Last())
            {
                
                if (res.Retrieve().getAddress().equals(x))
                    res.insert(res.Retrieve());
                
                res.FindNext();    
            }
            if (res.Retrieve().getAddress().equals(x))
                 res.insert(res.Retrieve());
            return res;
              }
            
            public LinkedListADT<Contact> SearchbyBirthday(String x){
       LinkedListADT<Contact> res= new  LinkedListADT<Contact>();
            if (res.IsEmpty())
                return res;
            res.FindFirst();
            while (!res.Last())
            {
                if (res.Retrieve().getBirthday().equals(x))
                    res.insert(res.Retrieve());
                
                res.FindNext();    
            }
            if (res.Retrieve().getBirthday().equals(x))
                 res.insert(res.Retrieve());
            return res;
              }
        
        public static void main(String[] args) {
              do{
        System.out.println("Please choose an option:\n" +
                "1. Add a contact\n" +
                "2. Search for a contact\n" +
                "3. Delete a contact\n" +
                "4. Schedule an event\n" +
                "5. Print event details\n" +
                "6. Print contacts by first name\n" +
                "7. Print all events alphabetically\n" +
                "8. Exit");
        
        System.out.println("Enter your choice:");
        
         
         selection = input.nextInt();

        
          switch(selection){
            case 1:
               System.out.println("Enter the contact's name: ");
               String  Name = input.nextLine();
               input.nextLine();
               System.out.println("Enter the contact's phone number: ");
               String PhoneNumber = input.nextLine();
               System.out.println("Enter the contact's email address:");
               String Email = input.nextLine();
               System.out.println("Enter the contact's address: ");
               String Address = input.nextLine();
               System.out.println("Enter the contact's birthday: ");
               String Birthday = input.nextLine();
               System.out.println("Enter any notes for the contact: ");
               String Notes = input.nextLine();
               System.out.println();
               
               
               contact1=new Contact(Name,PhoneNumber,Email,Address,Birthday,Notes);
               list.Insert(contact1);
               //list.addContact(contact1,list);
               break;

            case 2:
               System.out.println("Enter search criteria:\n" +
                            "1. Name\n" +
                            "2. Phone Number\n" +
                            "3. Email Address\n" +
                            "4. Address\n" +
                            "5. Birthday"); 
               
               break;
            

            case 3:
               System.out.println("Enter amount to be credited");
               break;
               
               
            case 4:
               System.out.println("Enter event title: ");
               String title = input.nextLine();
               System.out.println("Enter contact name: ");
               String name = input.nextLine();
               System.out.println("Enter event date and time (MM/DD/YYYY HH:MM): ");
               String date = input.nextLine();
               System.out.println("Enter event location: ");
               String location = input.nextLine();
             
               break;  
         
               
            case 5:
               System.out.println("Enter search criteria:\n" +
                "1. contact name\n" +
                "2. Event tittle");
               while (selection<3)
               {  switch(selection){
               case 1:
               System.out.println("Enter the contact name:");
               String  contact= input.nextLine();
               
               
               break;

               case 2:
               System.out.println("Enter the event title:"); 
               String  Title= input.nextLine();
               
               
               break;

                          }
               System.out.println("1. Transfer\n2.Check balance\n3.Recharge");
                 }
               
             
               break;   
               
               
            case 6:
               System.out.println("Enter the first name: ");
               String  Nname= input.nextLine();
               break;   
               
               
            case 7:
              printList(list);
               break;   
               
               
               
           /* case 8:
               
               break;  
             */  
                          
        
     
     };
    }while(selection!=8);
       System.out.println("Goodbye!"); }
       
}
