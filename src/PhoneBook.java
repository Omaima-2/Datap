
import java.util.Scanner;

public class PhoneBook {
      private LinkedListADT contactlist; 
        
        public static void main(String[] args) {
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
        
         Scanner input=new Scanner(System.in);
         int selection = input.nextInt();

          while (selection<8)
        {  switch(selection){
            case 1:
               System.out.println("Enter the contact's name: ");
               String  Name = input.nextLine();
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
               
               break;   
               
               
               
            case 8:
               
               break;  
               
                          }
        
     }
     System.out.println("Goodbye!");
    }
}
