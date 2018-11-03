// Vincenzo Scotto Di Uccio chapter 5 problem 20

public class CoinTesterVSDU
{
   public static void main(String[] args)
   {
      int headCount = 0;
      int tailCount = 0;
      
      CoinVSDU coin = new CoinVSDU();
      
      System.out.println("Coin object");
      System.out.println("Initial Side up: "+ coin.getSideUp());
      
      for(int index = 0;index <20;index++)
      {
         coin.toss();
         if(coin.getSideUp().equals("heads"))
            headCount++;
         else if(coin.getSideUp().equals("tails"))
            tailCount++;
      }
      
      System.out.println("Head Count: "+headCount);
      System.out.println("Tail Count: "+tailCount);
   }
}