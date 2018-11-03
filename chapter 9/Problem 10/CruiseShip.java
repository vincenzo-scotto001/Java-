//Vincenzo Scotto Di Uccio Chapter 9 problem 10
public class CruiseShip extends Ship

{

   private int maxPass;

   public CruiseShip(String n, String b)

   {

      super(n, b);

   }

   public void setMaxPass(int mp)

   {

      maxPass = mp;

   }

   public int getMaxPass()

   {

      return maxPass;

   }

   public String toString()

   {

      String str;

      str = super.toString() +

      "\nShip's Name: " + n +

      "\nMaximum Passengers: " + maxPass;

      return str;

   }

}