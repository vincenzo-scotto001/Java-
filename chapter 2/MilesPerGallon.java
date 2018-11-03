// Vincenzo Scotto Di Uccio Chapter 2 program 8
import java.util.Scanner; 
public class MilesPerGallon
{
   public static void main(String[] args)
   {
      double miles;
      double gal;
      double mpg;
      
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter miles");
      miles = keyboard.nextDouble();
      
      Scanner keyboard2 = new Scanner(System.in);
      System.out.print("Enter gallons");
      gal = keyboard2.nextDouble();
      
      mpg = miles / gal;
      
      System.out.println("Your cars MPG is: " + mpg);

      }
}