// Vincenzo Scotto Di Uccio Chapter 9 problem 7

public class Customer1 extends Person
{
   private int idnumber;
   private boolean onlist = true;
  
   public Customer1(int idnumber, boolean onlist, String name, String telephonenumber, String address)
   {
       super(name, address, telephonenumber);
       this.idnumber = idnumber;
       this.onlist = onlist;
   }
  
   public void setIdNumber(int idnumber)
   {
       this.idnumber = idnumber;
   }
   public void setToBeOnList(boolean onlist)
   {
       if(onlist)
       {
           System.out.println("Customer requesting to be on mailing list.");
       }
   }
   public int getIdNumber()
   {
       return idnumber;
   }
   public boolean getToBeOnList()
   {
       return onlist;
   }
}