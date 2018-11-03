// Vincenzo Scotto Di Uccio Chapter 6 problem 8 march 24th 2016
import java.text.DecimalFormat;
import java.util.*;

public class InnerClassDemoVSDU
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      RetailItemVSDU item = new RetailItemVSDU("Candy Bar", 17789,8.9,10);
      
      System.out.println("Enter number of items: ");
      
      int n_items=keyboard.nextInt();
      
      CashRegisterVSDU rg1 = new CashRegisterVSDU(item,n_items);
      
      System.out.println(rg1);
   }
}