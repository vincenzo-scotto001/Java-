// Vincenzo Scotto Di Uccio Chapter 2 program 5
import java.util.Scanner;
public class Cookie
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int total_cal = 10*300;
      int cal_per = total_cal/40;
      
      System.out.println("Enter number of cookies eaten: ");
      int n = keyboard.nextInt();
      
      int total = n*cal_per;
      System.out.println("Calories consumed: "+total);
      }
   
}