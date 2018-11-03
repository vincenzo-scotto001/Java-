
// Vincenzo Scotto Di Uccio Chapter 9 problem 10
public class Ship 
{

   private String name;
   
   private String builtDate;

   public Ship(String n, String date)

   {

      name = n;

      builtDate = date;

   }

   public Ship()

   {

      name = "";

      builtDate = "";

   }

   public void setName(String n)

   {

      name = n;

   }

   public void setBuiltDate(String b)

   {

      builtDate = b;

   }

   public String getName()

   {

      return name;

   }

   public String getBuiltDate()

   {

      return builtDate;

   }

   public String toString()

   {

      String str = "Name: " + name;
      
      str += ("\nBuiltDate: " + builtDate);

      return str;

   }

}