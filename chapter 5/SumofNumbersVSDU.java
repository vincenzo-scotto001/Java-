// Vincenzo Scotto Di Uccio feb. 25 2016 chapter 5 problem 1

import javax.swing.JOptionPane;

public class SumofNumbersVSDU
{
   public static void main(String [] args)
   {
      int number,sum = 0;
      String input;
      input = JOptionPane.showInputDialog("Enter a positive nonzero value: ");
      number = Integer.parseInt(input);
      
      for(int i = 1; i <= number; i++)
      {
         sum +=i;
      }
      JOptionPane.showMessageDialog(null,"Sum of the total numbers is: "+sum);
      
      System.exit(0);
    }
}