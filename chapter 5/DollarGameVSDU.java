// Vincenzo Scotto Di Uccio chapter 5 problem 21

public class DollarGameVSDU
{
   public static void main(String[] args)
   {
      final int DOLLAR = 100;
      final int QUARTER = 25;
      final int DIME = 10;
      final int NICKEL = 5;
      
      CoinVSDU quarter = new CoinVSDU();
      CoinVSDU dime = new CoinVSDU();
      CoinVSDU nickel = new CoinVSDU();
      
      int balance =0;
      
      while(balance <=DOLLAR)
      {
         quarter.toss();
         dime.toss();
         nickel.toss();
         
         if(quarter.getSideUp().equals("heads"))
            balance +=QUARTER;
         if(dime.getSideUp().equals("heads"))
            balance +=DIME;
         if(nickel.getSideUp().equals("heads"))
            balance +=NICKEL;
       }
       
       if(balance == DOLLAR)
         System.out.println("You win the game.");
       else
         System.out.println("You lose the game.");
   }
}