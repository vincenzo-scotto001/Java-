// Vincenzo Scotto Di Uccio Chapter 9 problem 8

public class Person 
{

   private String Name; // The Persons Name
   private int phoneNumber; // The Persons Phone Number
   private String address; // The Persons Address

   public Person()
   {
      Name="";
      phoneNumber = 0;
      address = "";
   }

   public Person (String n, int pn, String ad)
   {
      Name = n;
      phoneNumber = pn;
      address = ad;
   }
   public void setName(String n)
   {
      Name = n;
   }
   public void setidnumber(int pn)
   {
      phoneNumber = pn;
   }
   public void setdepartmen(String ad)
   {
      address = ad;
   }
   public String getName()
   {
      return Name;
   }
   public int getphoneNumber()
   {
      return phoneNumber;
   }
   public String getaddress()
   {
      return address;
   }
}
