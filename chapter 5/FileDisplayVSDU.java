//  Vincenzo Scotto Di Uccio chapter 5 problem 14 march 3rd 2016

import java.util.Scanner;
import java.io.*;
class FileDisplayVSDU
{
   String filename;
   public FileDisplayVSDU(String name)
   {
      filename = name;
   }
   
   public void displayHead() throws IOException
   {
      String input;
      File file = new File(filename);
      Scanner inFile = new Scanner(file);
      int LineCount = 1;
      
      while(inFile.hasNext() && LineCount <=5)
      {
         input = inFile.nextLine();
         System.out.println(input);
         LineCount++;
      }
      inFile.close();
   }
   
   public void displayContents() throws IOException
   {
      String input;
      File file = new File(filename);
      Scanner inFile = new Scanner(file);
      
      while(inFile.hasNext())
      {
         input = inFile.nextLine();
         System.out.println(input);
      }
      inFile.close();
   }
   
   public void displayWithLineNumbers() throws IOException
   {
      String input;
      File file = new File(filename);
      Scanner inFile = new Scanner(file);
      
      int i=1;
      int LineCount = 0;
      
      while(inFile.hasNext())
      {
         input=inFile.nextLine();
         System.out.println(i+input);
         LineCount++;
         i++;
      }
      inFile.close();
   }
}

class FileDisplayTestVSDU
{
   public static void main(String[] args)throws IOException
   {
      String filename;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter the file name: ");
      filename = keyboard.nextLine();
      FileDisplayVSDU object = new FileDisplayVSDU(filename);
      
      object.displayHead();
      object.displayContents();
      object.displayWithLineNumbers();
      System.exit(0);
   }
}