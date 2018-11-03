// Vincenzo Scotto Di Uccio chapter 4 problem 4

import javax.swing.JOptionPane;

public class softwareSalesVSDU
{
   public static void main(String[] args)
   {
      double Packages,cost,Discount,Total;
      String input;
      
      input = JOptionPane.showInputDialog("Enter number of packages purchased");
      
      Packages = Double.parseDouble(input);
      
      cost=(Packages * 99);
      
      if (Packages >=10 && Packages <= 19)
         Discount = (cost*0.2);
      else if (Packages >=20 && Packages <= 49)
         Discount = cost * 0.3 ;
      else if (Packages >=50 && Packages <= 99)
         Discount = cost * 0.4 ;
      else if (Packages >= 100)
         Discount = cost * 0.5 ;
      else
         Discount = 0;
         
      
         Discount = cost * 0.3 ;
      
      Total = cost - Discount;
      
      JOptionPane.showMessageDialog(null,"Discount of the amount is "+ Discount+"\n Total amount is "+Total);
      System.exit(0);
      }
}