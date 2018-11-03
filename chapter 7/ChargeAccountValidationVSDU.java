// Vincenzo Scotto Di Uccio Chapter 7 problem 3

import java.util.Scanner;

public class ChargeAccountValidationVSDU
{
   public static void main(String[] args)
   {
      int chargeNumber;
      boolean isValid;
      
      Scanner keyboard = new Scanner(System.in);
      int[] chargeAccountNumbers= {5658845,4520125,7895122,8777541,8451277,1302850,8080152,4562555,5552012,5050552,7825877,125255,1005231,6545231,3852085,7576651,7881200,4581002};
      ChargeAccountValidation accounts = new ChargeAccountValidation(chargeAccountNumbers);
      
      System.out.println("Enter a charge number: ");
      
      chargeNumber = keyboard.nextInt();
      
      isValid = accounts.isValidChargeAccountNumber(chargeNumber);
      
      if(isVaild)
      {
         System.out.println(chargeNumber+"is a valid charge account number. ");
      }
      else
         System.out.println(chargeNumber+"is not a valid charge account number.");
   }
}