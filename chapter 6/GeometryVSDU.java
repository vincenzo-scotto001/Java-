// Vincenzo Scotto Di Uccio chapter 6 problem 11 march 10th 2016

import java.util.Scanner;
import java.math.*;

class GeometryVSDU
{
   public static double CircleArea(double radius)
   {
      if(radius <0)
      {
         //Error
         System.out.print("Circle's radius ");
         return 0;
      }
      else
         return Math.PI*radius*radius;
   }
   
   public static double RectangleArea(double len, double wid)
   {
      if(len<0 || wid<0)
      {
         //Error
         System.out.print("Rectangle's length or width");
         return 0;
      }
      else
         return len * wid;
   }
   
   public static double TriangleArea(double base, double height)
   {
      if(base<0||height<0)
      {
         //Error
         System.out.print("Triangle's height or base");
         return 0;
      }
      else
         return 0.5*base*height;
   }
   
}