// Vincenzo Scotto Di Uccio Hand out problem 2

import java.io.*;
public class Savings extends Account
{
   float interest;
   Savings(int no,float i)
   {
      super(no);
      interest = i;
   }
   public void getAccno()
   {
      System.out.println("\n\nSaving Account Information");
      System.out.println("\nAccount number is : "+accno);
   }  
   public void getBal()
   {
      System.out.println("\nThe balance is : "+accbal);
      System.out.println("\nThe rate of interest is : "+interest+"%");
   }
}