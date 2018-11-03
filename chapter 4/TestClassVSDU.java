// Vincenzo Scotto Di Uccio feb. 23 2016
import java.util.Scanner;

class TestClassVSDU
{
   public static void main(String [] args)
   {
      SubstanceVSDU item1 = new SubstanceVSDU();
      int temp;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter a Temperature: ");
      temp = keyboard.nextInt();
      item1.setTemperature(temp);
      
      if(item1.isEthylBoiling())
         System.out.println("Ethyl will Boil.");
      if(item1.isEthylFreezing())
         System.out.println("Ethyl will Freeze.");
      if(item1.isOxygenBoiling())
         System.out.println("Oxygen will Boil.");
      if(item1.isOxygenFreezing())
         System.out.println("Oxygen will Freeze.");
      if(item1.isWaterBoiling())
         System.out.println("Water will Boil.");
      if(item1.isWaterBoiling())
         System.out.println("Water will Freeze.");
      
      System.exit(0);
    }
}