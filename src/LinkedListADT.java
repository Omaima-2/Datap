public class LinkedListADT<T> {
private Node Head;
private Node Current;

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
  
  
  public void addcontact(T t){
    Node <T> p=new Node<T>(t);
          if (Head==null){
              Head=Current=p; 
              return;
          }
          
          if (((Contact)t).compareTo((Contact)Head.data)<0)
      p.next=Head;
          Head=p;
    return;
  
  }
      
      public void Insert(T t){
          Node <T> p=new Node<T>(t);
          if (Head==null){
              Head=Current=p;  
          }
          else {
          p.next=Current.next;
   Current.next=p;
   
  Current=p;     
        
          }
         
      }
      
      
      
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
