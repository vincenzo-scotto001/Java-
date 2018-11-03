// Vincenzo Scotto Di Uccio Hand out problem 4

public class UseDivision
{
   public static void main(String args[])
   {
      InternationalDivision d1 = new InternationalDivision("Division1", 1234, "USA", "English");
      d1.display();
      InternationalDivision d2 = new InternationalDivision("Division2", 9999, "Italy", "Italian");
      d2.display();
      DomesticDivision d3 = new DomesticDivision("Division3", 1234, "California");
      d3.display();
      DomesticDivision d4 = new DomesticDivision("Division4", 9999, "New York");
      d4.display();
   }
}