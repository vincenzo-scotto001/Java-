//Vincenzo Scotto Di Uccio Chapter 9 problem 1

import java.text.DecimalFormat;
import java.util.Scanner;

class Emp 
{

   public String nm;//empname
   public String num;//empno
   public String hireDt;//hiredt
   private boolean validEmpNumber = false;
//constructor method

   Emp(String n, String nu, String hd) 
   {
      nm = n;
      num = nu;
      hireDt = hd;
   }

   public String getName() 
   {
      return nm;
   }

   public String getNumber() 
   {
      while (validEmpNumber = false) 
      {
         if (num.length() != 5) 
         {
            System.out.println("Invalid employee number, please try again.");
         } 
         else if (((!Character.isDigit(num.charAt(0))) || ((!Character.isDigit(num.charAt(1))))
                             || ((!Character.isDigit(num.charAt(2)))) || (num.charAt(3) != '-')
                             || (!(num.charAt(4) >= 'A' && num.charAt(4) <= 'M')))) 
         {
            System.out.println("Invalid employee number, please try again.");
            System.out.println("Enter your employee number: ");
         } 
         else 
         {
            validEmpNumber = true;
         }
      }
   return num;
   }

   public String getHireDate() 
   {
      return hireDt;
   }

// * Checking validity of employee number
// *
   public boolean isValidEmployeeNumber(String number) 
   {
      boolean status = true;
      if (number.length() != 5) 
      {
         System.out.println("Invalid employee number.");
      } 
      else 
      {
         if (((!Character.isDigit(number.charAt(0))) || ((!Character.isDigit(number.charAt(1))))
                        || ((!Character.isDigit(number.charAt(2)))) || (number.charAt(3) != '-')
                        || ((!Character.isDigit(number.charAt(4))))
                        || (!(number.charAt(4) >= 'A' && number.charAt(4) <= 'M')))) 
         {
            status = false;
         }
      }
      return status;
   }

   public String toString() 
   {
      String str = "Name: " + nm + "\nEmployee Number: ";
      if (num == "") 
      {
         str += "Invalid Employee Number";
      } 
      else 
      {
         str += num;
      }
      str += ("\nHire Date: " + hireDt);
      return str;
   }
}

class ProductionWorker extends Emp //productioworker is the subclass of emp
{

   public static int dayShift = 1;
   public static int nightShift = 2;
   private int shift;
   private double payRate;
   private boolean rightShift = false;

   public String getShift() //EDIT#2: FIXED (this will be good enough for me!)
   {
      String shiftTime;

      if (shift == 1) 
      {
         shiftTime = "Day";
      } 
      else if (shift == 2) 
      {
         shiftTime = "Night";
      } 
      else if (shift == 3) 
      {
         shiftTime = "Alternating";
      } 
      else 
      {
         shiftTime = "On Call";
      }

      return shiftTime;
    }

   public void setShift(int s) 
   {
      shift = s;
   }

   public double getPayRate() 
   {
      return payRate;
   }

   public void setPayRate(double rate) 
   {
      payRate = rate;
   }

/**
* Constructor initializes a name, number and hire date
*/
   public ProductionWorker(//String name, String number, String hireDate,
   String n, String num, String hd, int sh, double rate) 
   {

      super(n, num, hd);
      shift = sh;
      payRate = rate;
   }

   public ProductionWorker(String n, String num, String hd) 
   {
      super(n, num, hd);
      shift = dayShift;
      payRate = 0.0;
   }

   public String toString() 
   {
      DecimalFormat dollar = new DecimalFormat("#,##0.00");

      String str = super.toString();

      str += "\nShift: ";
      if (shift == dayShift) 
      {
         str += "Day";
      } 
      else if (shift == nightShift) 
      {
         str += "Nights";
      } 
      else 
      {
         str += "Invalid Shift Number";
      }

      str += ("\n Hourly Pay Rate: $"
      + dollar.format(payRate));

      return str;
   }
}

public class ProductionWorkerMain 
{
   public static void main(String[] args) 
   {//driver program
      String nm;
      String n;
      String numb;
      String num;
      String hireDate;
      String hd;
      int shift;
      double payRate;
      double rate;
      Scanner s = new Scanner(System.in);
      System.out.println("Enter your name: ");
      nm = s.nextLine();
      System.out.println("Enter your employee number: ");
      System.out.println("(Format: NNN-L)");
      numb = s.nextLine();
      System.out.println("Enter your hire date: ");
      hireDate = s.nextLine();
      System.out.println("Enter your payrate: ");
      payRate = s.nextDouble();
      System.out.println("Enter your shift (day=1, night=2): ");
      shift = s.nextInt();
      //Production worker object
      ProductionWorker ProductionWorker = new ProductionWorker(nm, numb,
      hireDate, shift, payRate);

      System.out.println("---------- Employee Information -----------");
      System.out.println("Name: " + ProductionWorker.getName());
      System.out.println("Employee Number: " + ProductionWorker.getNumber());
      System.out.println("Hire Date: " + ProductionWorker.getHireDate());
      System.out.println("Pay Rate: " + ProductionWorker.getPayRate());
      System.out.println("Shift: " + ProductionWorker.getShift());
    }
}