
public class LinkedListADT <T> {
private Node <T> Head;
private Node <T> Current;

    public LinkedListADT() {
        Head=Current=null;
    }
    
      public boolean IsEmpty(){
        
        return Head==null;
    }
      public boolean IsFull(){
       return false;      
      }
      public boolean Last(){
       return Current.next==null;
      }
      public void FindFirst(){
          Current=Head;
        
      }
      
      public void FindNext(){
          
          Current=Current.next;
      }
      public void Update(T t){
          Current.data=t;
          
      }
      public T Retrieve(){
         return Current.data;
      }
      
      public void Delete(){
          
          if (Current==Head){
              Head=Head.next;
          Current=Current.next;}
          else{
              Node <T > temp=Head;
              while(temp.next!=Current)
                  temp=temp.next;
              temp.next=Current.next;
          }
          if (Current.next!=null)
              Current= Current.next;
              else{
              Current=Head;
         
          
      }}
        public void insert(T d){
        
        Node <T> p =new Node <T>(d);
       if (Head==null) {
           Head=Current=p;
          
       }
       else{ 
       p.next=Current.next;
       Current.next=p;
       
      Current=p;
       }
       
      
    }
        
        public boolean contains(Contact contact) {
        Node <T> current = Head;
        
        // Traverse the linked list
        while (current != null) {
            // Compare the current node's contact with the target contact
            if (current.data.equals(contact)) {
                return true; // Contact found
            }
            
            // Move to the next node
            current = current.next;
        }
        
        return false; // Contact not found
        }
    
    public void addcontact(T t){
          Node <T> p=new Node<T>(t);
          if (Head==null){
              Head=Current=p; 
                    
          }
          else{ 
                if(((Contact)t).compareTo((Contact)Head.data)<0){
                   p.next=Head;
                   Head = p;
                  
                }
                else{
                  Node <T> r = Head;
                  Node <T> q = null;
                   while(r!=null&&(((Contact)r.data).compareTo((Contact)t)<=0)){
                    q=r;
                    r=r.next;}
                   
          }
          }
          
     }
          
      public void addEvent(T e){
      Node <T> newnode = new  Node <T>(e);
        if (Head==null){
              Head=Current=newnode; 
                    
          }
        
      
      
      
      }
      
      
    /*  public List<Event> ListAIIEvents(){
          
          
          
          
          
      }*/
          
          
          public boolean Search (T x){
              Node <T> temp =Head;
              while (temp!=null){
                 if (temp.data.equals(x))
                     return true;
                 else
                     return false;
              }
              return false;
                  
              }
          }
