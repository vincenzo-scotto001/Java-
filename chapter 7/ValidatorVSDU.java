// Vincenzo Scotto Di Uccio Chapter 7 problem 4
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.io.*;

class ValidatorVSDU
{
   private int[] valid;
   public ValidatorVSDU() throws IOException
   {
      valid = new int[20];
      String inputfile;
      
      inputfile = JOptionPane.showInputDialog("Enter file name: ");
      
      File file = new File(inputfile);
      
      Scanner input = new Scanner(file);
      int i =0;
      while (input.hasNext())
         valid[i] =input.nextInt();
         i++;
      input.close();
   }
   
   public boolean isValid(int number)
   {
      boolean found = false;
      int index = 0;
      while(!found && index<valid.length)
         if(valid[index]==number)
            found =true;
         else
            index++;
      return found;
   }
}