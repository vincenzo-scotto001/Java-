// Vincenzo Scotto Di Uccio Feb. 23 2016

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class SpeedofSoundVSDU
{
   public static void main(String[] args)
   {
      int choice;
      double distance;
      double Time = 0;
      String input;
      
      DecimalFormat formatter = new DecimalFormat("0.00");
      
      input = JOptionPane.showInputDialog("1: Air,\n 2: Water, \n 3: Steel\n Enter your choice: ");
      choice = Integer.parseInt(input);
      
      switch(choice)
      {
         case 1:
                 input = JOptionPane.showInputDialog("Enter Distance: ");
                 
                 distance = Double.parseDouble(input);
                 
                 Time = distance/1100;
                 
                 JOptionPane.showMessageDialog(null,"It takes "+formatter.format(Time)+"seconds to travel in air");
                 break;
                 
          case 2:
                 input = JOptionPane.showInputDialog("Enter Distance: ");
                 
                 distance = Double.parseDouble(input);
                 
                 Time = distance/4900;
                 
                 JOptionPane.showMessageDialog(null,"It takes "+formatter.format(Time)+"seconds to travel in water");
                 break;
                 
          case 3:
                 input = JOptionPane.showInputDialog("Enter Distance: ");
                 
                 distance = Double.parseDouble(input);
                 
                 Time = distance/16400;
                 
                 JOptionPane.showMessageDialog(null,"It takes "+formatter.format(Time)+"seconds to travel in steel");
                 break;
                 
         default:
                  JOptionPane.showMessageDialog(null,"Invalid Choice");
         }
         System.exit(0);
     }
}