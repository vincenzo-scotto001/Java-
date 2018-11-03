// Vincenzo Scotto Di Uccio Chapter 7 problem 4

import javax.swing.JOptionPane;
import java.util.Scanner;
import java.io.*;

public class chargeAccountVSDU
{
   public static void main(String[] args) throws IOException
   {
      String input;
      int accountNumber;
      ValidatorVSDU val = new ValidatorVSDU();
      input = JOptionPane.showInputDialog("Enter your charge account number: ");
      
      accountNumber = Integer.parseInt(input);
      
      if(val.isValid(accountNumber))
         JOptionPane.showMessageDialog(null, "That's a valid account number.");
      else
         JOptionPane.showMessageDialog(null,"That's an invalid account number.");
      System.exit(0);
   }
}