// Vincenzo Scotto Di Uccio Hand out problem 4

public class InternationalDivision extends Division 
{
   protected String country;
   protected String language;
      
   public InternationalDivision(String name, int number, String c, String l)
   {
      super(name, number);
      country = c;
      language = l;
   }

   public void display()
   {
      System.out.println("Division Name is : " + divisionName);
      System.out.println("Account Number is : " + accountNumber);
      System.out.println("Country is : " + country);
      System.out.println("Language is : " + language);
   }
}