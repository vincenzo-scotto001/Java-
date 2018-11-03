// Vincenzo Scotto Di Uccio Chapter 7 problem 18 April 5th 2016
import java.util.*;

public class PhoneBookEntry 
{

   private String name;
   private String number;

   public PhoneBookEntry(String name, String number) 
   {
      this.name=name;
      this.number=number;
   }

   public String getName() 
   {
      return name;
   }

   public void setName(String name) 
   {
      this.name = name;
   }

   public String getNumber() 
   {
      
      return number;
   }

   public void setNumber(String number) 
   {
      this.number = number;
   }


   public static void main(String[] args) 
   {
      List<PhoneBookEntry> phoneList = new ArrayList<PhoneBookEntry>();
      phoneList.add(new PhoneBookEntry("Sue","347-2984"));
      phoneList.add(new PhoneBookEntry("Rod","384-2898"));
      phoneList.add(new PhoneBookEntry("Ike","382-9082"));
      phoneList.add(new PhoneBookEntry("Ann","389-9083"));
      phoneList.add(new PhoneBookEntry("Sid","982-8984"));
      for (PhoneBookEntry entry : phoneList) 
      
      {
         System.out.println(entry.getName()+" "+entry.getNumber());
      }
   }

}