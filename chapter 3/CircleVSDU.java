// Vincenzo Scotto Di Uccio chp 3 problem 9

class CircleVSDU
{
   private double radius;
   private final double PI;
   
   public CircleVSDU()
   {
      radius = 0;
      PI = 3.14159;
   }
   
   public CircleVSDU(double rad, double pi)
   {
      radius = rad;
      PI = pi;
   }
   
   public void setRadius(double rad)
   {
      radius = rad;
   }
   public double getRadius()
   {
      return radius;
   }
   public double getArea()
   {
      return PI * radius * radius;
   }
   public double getDiameter()
   {
      return radius * 2;
   }
   public double getCircumference()
   {
      return 2*PI *radius;
   }
}