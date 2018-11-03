//Vincenzo
import java.util.Scanner;
public class CarTesVSDU
{
   public static void main(String[] args)
   {
      int year;
      String make;
      
      
      Scanner keyboard = new Scanner(System.in);
      System.out.println("What is the year: ");
      year = keyboard.nextInt();
      
      keyboard.nextLine();
      System.out.println("What is the make: ");
      make = keyboard.nextLine();
      
      carVSDU myCar = new carVSDU(year, make);
      
      myCar.accl();
      myCar.accl();
      myCar.accl();
      myCar.accl();
      myCar.accl();
      
      System.out.println(myCar.getSpeed());
      
      myCar.brk();
      myCar.brk();
      myCar.brk();
      myCar.brk();
      myCar.brk();
      
      System.out.println(myCar.getSpeed());
      }
}