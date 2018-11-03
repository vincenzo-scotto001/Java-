// Vincenzo Scotto Di Uccio Chapter 9 problem 7

public class Person
{
   private String name;
   private String address;
   private String telephonenumber;
  
   public Person(String name, String address, String telephonenumber)
   {
       this.name = name;
       this.address = address;
       this.telephonenumber = telephonenumber;
   }
   public void setName(String name)
   {
       this.name = name;
   }
   public void setAddress(String address)
   {
       this.address = address;
   }
   public void setNumber(int telephonenumber)
   {
       this.telephonenumber = telephonenumber;
   }
   public String getName()
   {
       return name;
   }
   public String getAddress()
   {
       return address;
   }
   public String getNumber()
   {
       return telephonenumber;
   }
}