// Vincenzo Scotto Di Uccio march 8th 2016 chapter 6 problem 1
import java.io.*;
public class AreaVSDU
{
   static final double pi = Math.PI;
   static double Area(double radius)
   {
      return pi*radius*radius;
   }
   
   static double Area(int width, int length)
   {
      return width * length;
   }
   
   static double Area(double radius, double height)
   {
      return pi*radius*radius*height;
   }
   
}