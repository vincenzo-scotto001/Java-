// Vincenzo Scotto Di Uccio Chapter 8 problem 4 April 5th 2016
import java.util.Scanner;
import java.io.*;

class TestClass
{
   public static void main(String[] args)
   {
      String str, choice;
      char ch;
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter String: ");
      str = keyboard.nextLine();
      
      VowelsConsonants object = new VowelsConsonants(str);
      
      do
      {
         System.out.println("Menu:");
         System.out.println("A: Count Vowels");
         System.out.println("B: Count Consonants");
         System.out.println("C: Count Both Vowels and Consonats");
         System.out.println("D: Enter another string");
         System.out.println("E: Exit Program");
         System.out.println("Enter Choice(A,B,C,D,E): ");
         choice =keyboard.nextLine();
         ch = choice.charAt(0);
         switch(ch)
         {
            case 'a':
               System.out.println("Number of Vowels: "+object.vowelCount());
               break;
            
            case 'b':
               System.out.println("Number of Consonants: "+object.consonantCount());
               break;
            
            case 'c':
               System.out.println("Number of Vowels: "+object.vowelCount());
               System.out.println("Number of Consonants: "+object.consonantCount());
               break;
            
            case 'd':
               System.out.println("Enter String: ");
               str=keyboard.nextLine();
               break;
            
            case 'e':
               System.exit(0);
               break;
         }
      }
      while(ch=='d');
      System.exit(0);
   }
}