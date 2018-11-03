// Vincenzo Scotto Di Uccio Hand out problem 4
public class DomesticDivision extends Division 
{
   protected String state;
      
   public DomesticDivision(String name, int number, String s)
   {
      super(name, number);
      state = s;
   }

   public void display()
   {
      System.out.println("Division Name is : " + divisionName);
      System.out.println("Account Number is : " + accountNumber);
      System.out.println("State is : " + state);
   }
}