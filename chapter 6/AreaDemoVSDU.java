// Vincenzo Scotto Di Uccio chapter 6 problem 1 march 8th 2016
public class AreaDemoVSDU
{
   public static void main(String[] args)
   {
      final double circleradius = 10;
      final int rectanglelength = 20;
      final int rectanglewidth = 30;
      final double cylinderradius = 20;
      final double cylinderheight = 40;
      
      System.out.println("The area of the circle is: "+AreaVSDU.Area(circleradius));
      System.out.println("Area of the rectangle is: "+AreaVSDU.Area(rectanglelength,rectanglewidth));
      System.out.println("Area of the cylinder is: "+AreaVSDU.Area(cylinderradius,cylinderheight));
      
      System.exit(0);
   }
}