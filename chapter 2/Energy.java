// Vincenzo Scotto Di Uccio Chapter 2 program 16
import java.util.*;
public class Energy
{
   public static void main(String[] args)
   {
      final int num_sur = 12467;
      final double drk_per = 0.14;
      final double citrus  = 0.64;
      double energyD;
      double preCit;
      
      energyD = num_sur * drk_per;
      preCit = energyD * citrus;
      System.out.println("We surveyed " + num_sur +" people. Out of those surveyed, approximately " + energyD + " purchase at least one energy drink per year.");
      System.out.println("Approximately " +preCit+ " of those " + "prefer citrus flavored energy drinks.");
    }
}