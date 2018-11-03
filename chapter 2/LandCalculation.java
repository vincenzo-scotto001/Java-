// Vincenzo Scotto Di Uccio chapter 2 program 7
import java.util.*;

public class LandCalculation
{
   public static void main(String[] args)
   {
      final int FPA = 43560;
      double tract = 389767;
      double acres;
      
      acres = tract / FPA;
      System.out.println("A tract of land with " + tract+ "sqft has " + acres + "acres.");  

   }
}