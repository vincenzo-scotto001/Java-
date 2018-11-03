// Vincenzo Scotto Di Uccio Hand out problem 5

import java.util.Scanner;


public class UseChildren 
{

   
   public static void main(String[] args) 
   {
       

       System.out.println("enter the name of the male child");
       Scanner in = new Scanner(System.in);
       String name = in.next();
      
       Male malechild = new Male(name);
       malechild.display();
      
       System.out.println("==============================");
      
       System.out.println("enter the name of the female child");
       String fname = in.next();
       Female femalechild = new Female(fname);
       femalechild.display();
      
   }

}