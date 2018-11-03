//Vincenzo Scotto Di Uccio Chapter 9 problem 7

import java.util.Scanner;
public class CustomerDemo
{
   public static void main(String[] args)
   {
       String name;
       String address;
       String telephonenumber;
       int idnumber;
       boolean onlist = false;
       String letter;
      
       Scanner sc = new Scanner(System.in);
      
       System.out.println("Name: ");
       name = sc.nextLine();
      
       System.out.println("Address: ");
       address = sc.nextLine();
      
       System.out.println("Telephonenumber: ");
       telephonenumber = sc.nextDouble();
      
       System.out.println("IdNumber: ");
       idnumber = sc.nextInt();
      
       System.out.println("Would you like to be on the mailing list? y/n: ");
       letter = sc.nextLine();
      
       if(letter.equalsIgnoreCase("Y"))
       {
           onlist = true;
       }
       else
       {
           onlist = false;
       }      
      
       Customer cust1 = new Customer(idnumber, onlist, name, telephonenumber, address);
      
       System.out.println("Here is some information about the customer.");
      
       System.out.println("Name: " + cust1.getName());
       System.out.println("Address: " + cust1.getAddress());
       System.out.println("Phone Number: " + cust1.getNumber());
       System.out.println("IdNumber: " + cust1.getIdNumber());
       System.out.println("Would you like to be on the mailing list: " + cust1.getToBeOnList());
   }
}