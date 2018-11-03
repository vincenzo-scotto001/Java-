// Vincenzo Scotto Di Uccio Hand out problem 2
import java.io.*;
public class Checking extends Account
{
   Checking(int no)
   {
      super(no);
   }
   public void getAccno()
   {
      System.out.println("\n\nChecking Account Information");
      System.out.println("\nAccount number is : "+accno);
   }
   public void getBal()
   {
      System.out.println("\nThe balance is : "+accbal);
   }
}