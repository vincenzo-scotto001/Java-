// Vincenzo Scotto Di Uccio Hand out problem 2
import java.io.*;

public class DemoAccounts
{
   public static void main(String args[])
   {
/* Instantiating and displaying both Checking and Savings objects */
      Checking ch = new Checking(12001);
      ch.setBal(10000.59);
      ch.getAccno();
      ch.getBal();

      Savings sav = new Savings(19261, 10.9F);
      sav.setBal(100500.72);
      sav.getAccno();
      sav.getBal();

   }
}