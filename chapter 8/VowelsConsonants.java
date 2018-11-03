// Vincenzo Scotto Di Uccio chapter 8 problem 4 April 5th 2016

import java.util.Scanner;
import java.io.*;

class VowelsConsonants
{
   private static String sentence;
   public VowelsConsonants(String str)
   {
      sentence = str;
   }
   public static int vowelCount()
   {
      int count = 0;
      for(int i=0;i<sentence.length();i++)
      if(sentence.charAt(i)=='a'||sentence.charAt(i)=='A'||
         sentence.charAt(i)=='e'||sentence.charAt(i)=='E'||
         sentence.charAt(i)=='i'||sentence.charAt(i)=='I'||
         sentence.charAt(i)=='o'||sentence.charAt(i)=='O'||
         sentence.charAt(i)=='u'||sentence.charAt(i)=='U')
      {
         count++;
      }
      return count;
   }
   
   public static int consonantCount()
   {
      int count = 0;
      for (int i = 0;i<sentence.length();i++)
      if(sentence.charAt(i)!='a'||sentence.charAt(i)!='A'||
         sentence.charAt(i)!='e'||sentence.charAt(i)!='E'||
         sentence.charAt(i)!='i'||sentence.charAt(i)!='I'||
         sentence.charAt(i)!='o'||sentence.charAt(i)!='O'||
         sentence.charAt(i)!='u'||sentence.charAt(i)!='U')
      {
         count++;
      }
      return count;
   }
   
}