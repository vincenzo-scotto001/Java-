// Vincenzo Scotto Di Uccio Chapter 8 problem 5

import java.util.Scanner;

public class Password
{
   public static void main(String[] args)
   {
      String input;
      
      boolean hasUpper = false;
      boolean hasLower = false;
      boolean hasDigit = false;
      boolean hasSomething = false;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter Password: ");
      input = keyboard.nextLine();
      int passLength = input.length();
      
      for(int i = 0; i< passLength; i++)
      {
         char c = input.charAt(i);
         if(Character.isUpperCase(c))
                      hasUpper = true;
         else if(Character.isLowerCase(c))
                      hasLower = true;
         else if(Character.isDigit(c))
                      hasDigit = true;
         else
            hasSomething = true;
      }
      
      if(hasUpper && hasDigit && hasLower && !hasSomething && (passLength >= 6))
      {
         System.out.println("Password is correctly formatted. ");
      }
      else if(!hasUpper)
      {
         System.out.println("Must use at least one upper case.");
      }
      else if(!hasDigit)
      {
         System.out.println("Must use at least one number.");
      }

      else if(!hasLower)
      {
         System.out.println("Must use at least one lower case.");
      }
      else if(!hasSomething)
      {
         System.out.println("Must use at least one special character.");
      }
      else if(passLength < 6)
      
      {
         System.out.println("Must use at least 6 characters.");
      }


   }
}