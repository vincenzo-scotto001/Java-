// Vincenzo Scotto Di Uccio Chapter 4 problem 1 february 16th 2016

import javax.swing.JOptionPane;

public class RomanNumeralsVSDU
{
   public static void main(String[] args)
   {
      int number;
      String input;
      
      input = JOptionPane.showInputDialog("Enter a number: ");
      number = Integer.parseInt(input);
      
      if (number == 1)
         JOptionPane.showMessageDialog(null, "I");
      else if (number == 2)
         JOptionPane.showMessageDialog(null, "I");
      else if (number == 3)
         JOptionPane.showMessageDialog(null, "III");
      else if (number == 4)
         JOptionPane.showMessageDialog(null, "IV");
      else if (number == 5)
         JOptionPane.showMessageDialog(null, "V");
      else if (number == 6)
         JOptionPane.showMessageDialog(null, "VI");
      else if (number == 7)
         JOptionPane.showMessageDialog(null, "VII");
      else if (number == 8)
         JOptionPane.showMessageDialog(null, "VIII");
      else if (number == 9)
         JOptionPane.showMessageDialog(null, "IX");
      else if (number == 10)
         JOptionPane.showMessageDialog(null, "X");
      else
         JOptionPane.showMessageDialog(null,"Invalid Number");
         
      System.exit(0);
   }
}