// Vincenzo Scotto Di Uccio chapter 5 problem 15 march 3rd 2016

import java.util.Scanner;
import java.io.*;

class UpperCaseFileVSDU
{
   String file1;
   String file2;
   public UpperCaseFileVSDU(String firstfile,String secondfile)throws IOException
   {
      File readfile = new File(firstfile);
      Scanner inputFile = new Scanner(readfile);
      PrintWriter outputFile = new PrintWriter(secondfile);
      
      while(inputFile.hasNext())
      {
         String line = inputFile.nextLine();
         outputFile.println(line.toUpperCase());
      }
      inputFile.close();
      outputFile.close();
   }
}

public class filesTestVSDU
{
   public static void main(String[] args) throws IOException
   {
      String firstfile;
      String secondfile;
      
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter first file name: ");
      firstfile = keyboard.nextLine();
      
      System.out.println("Enter second file name: ");
      secondfile = keyboard.nextLine();
      
      UpperCaseFileVSDU object = new UpperCaseFileVSDU(firstfile,secondfile);
      
      System.exit(0);
  }
}