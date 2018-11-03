import java.util.Scanner;

public class SalesTax
{
   public static void main(String[] args)
   {  
      final double STATE_RATE = 0.055;
      final double COUNTY_RATE = 0.02;
      double state_tax;
      double county_tax;
      double TotalCost;
      double TotalTax;
      double purchase;
      
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter the amount of the purchase: ");
      purchase = keyboard.nextDouble();
      
      state_tax = purchase * STATE_RATE;
      county_tax = purchase * COUNTY_RATE;
      TotalTax = state_tax + county_tax;
      TotalCost = purchase + TotalTax;
      
      System.out.println("The cost of the item is: " + purchase);
      System.out.println("The state tax is: " + state_tax);
      System.out.println("The county tax is: " + county_tax);
      System.out.println("The total tax is: " + TotalTax);
      System.out.println("The total for the purchase is: " + TotalCost);
      }
}