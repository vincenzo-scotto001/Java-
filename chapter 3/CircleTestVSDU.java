// Vincenzo Scotto Di Uccio chp 3 problem 9
import java.util.Scanner;

public class CircleTestVSDU
{
   public static void main(String[] args)
   {
      double radius;
      
      //CircleVSDU circle = new CircleVSDU();
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Please enter the radius of the circle: ");
      radius = keyboard.nextDouble();
      //circle = circle.setRadius(radius);
      
      CircleVSDU circle = new CircleVSDU(radius,3.14159);
      
      System.out.println("The area of the circle is: "+ circle.getArea());
      System.out.println("The diameter of the circle is: "+ circle.getDiameter());
      System.out.println("The circumference of the circle is: "+ circle.getCircumference());
      }
}