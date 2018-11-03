// Vincenzo Scotto Di Uccio chapter 6 problem 11 march 10th 2016

import java.util.Scanner;
import java.math.*;

class GeometryDemoVSDU
{
   public static void main(String[] args)
   {
      int choice;
      
      GeometryVSDU obj = new GeometryVSDU();
      
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Geometry calculator");
      System.out.println("1. Area of a Circle");
      System.out.println("2. Area of a Rectangle");
      System.out.println("3. Area of a Triangle");
      System.out.println("4. Quit");
      System.out.println("Please enter your choice: ");
      
      choice = keyboard.nextInt();
      
      switch(choice)
      {
         case 1: System.out.println("Area of the circle: "+ obj.CircleArea(5.5));
                 break;
         case 2: System.out.println("Area of the rectangle: "+ obj.RectangleArea(5.6,5.2));
                 break;
         case 3: System.out.println("Area of the triangle: "+ obj.TriangleArea(12,3));
                 break;
         case 4: System.exit(0);
                 break;
      }
         
         System.exit(0);
   }
}