// Vincenzo Scotto Di Uccio feb 23 2016

import javax.swing.JOptionPane;
import java.util.Scanner;

public class SubstanceVSDU
{
   private int temperature;
   
   public SubstanceVSDU()
   {
      temperature = 0;
   }
   public SubstanceVSDU(int temp)
   {
      temperature = temp;
   }
   
   public void setTemperature(int temp)
   {
      temperature=temp;
   }
   public int getTemperature()
   {
      return temperature;
   }
   
   public boolean isEthylFreezing()
   {
      if(temperature <= -173)
         return true;
      else
         return false;
   }
    
   public boolean isEthylBoiling()
   {
      if(temperature >=172)
         return true;
      else
         return false;
    }
    
    public boolean isOxygenFreezing()
    {
      if(temperature >= -362)
         return true;
      else
         return false;
     }
     
     public boolean isOxygenBoiling()
     {
         if(temperature >= 306)
            return true;
         else
            return false;
     }
     public boolean isWaterBoiling()
     {
         if(temperature >= 212)
            return true;
         else
            return false;
     }
     
}