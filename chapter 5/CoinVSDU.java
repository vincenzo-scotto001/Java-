// Vincenzo Scotto Di Uccio chapter 5 problem 20

import java.util.Random;

public class CoinVSDU
{
   private String sideUp;
   
   public CoinVSDU()
   {
      toss();
   }
   
   public void toss()
   {
      Random rand = new Random();
      
      int value = rand.nextInt(2);
      if(value == 0)
         sideUp = "heads";
      else if(value == 1)
         sideUp = "tails";
   }
   public String getSideUp()
   {
      return sideUp;
   }
}