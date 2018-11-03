// Vincenzo Scotto Di Uccio chapter 4 problem 6 

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class shippingChargesVSDU
{
   public static void main(String[] args)
   {
      double weight,Miles,charges=0;
      String input;
      
      DecimalFormat formatter = new DecimalFormat("0.00");
      
      input = JOptionPane.showInputDialog("Enter the weight of the pacakge");
      
      weight = Double.parseDouble(input);
      
      input = JOptionPane.showInputDialog("Enter the miles shipped");
      
      Miles = Double.parseDouble(input);
      
      Miles = (Miles+499)/500;
      
      if (weight<=2)
         charges = Miles*1.10;
      else if(weight > 2 && weight <=6)
         charges = Miles*2.20;
      else if(weight > 6 && weight <=10)
         charges = Miles*3.70;
      else if (weight > 10)
         charges = Miles*4.80;
      
      JOptionPane.showMessageDialog(null,"Charge for shipping is "+ formatter.format(charges));
      
      System.exit(0);
      }
}