// Vincenzo Scotto Di Uccio chapter 7 problem 3

public class ChargeAccountValidation
{
   private int [] validNumbers;
   
   public ChargeAccountValidation(int[] accountNumbers)
   {
      validNumbers = new int[accountNumbers.length];
      
      for(int i=0;i<accountNumbers.length;i++)
      validNumbers[i]=accountNumbers[i];
      
      public boolean isValidChargeAccountNumber(int userNumber);
      {
         for(int i = 0;i<validNumbers.length;i++)
            if (validNumbers[i]=userNumber)
               return true;
            else
               return false;
      }
   }
}