//Vincenzo Scotto Di Uccio Chapter 7 problem 2
import java.util.*;

public class payRollTestVSDU
{
   public static void main(String[] args)
   {
      System.out.println(" Payroll Application");
      
      PayrollVSDU payroll = new PayrollVSDU();
      Scanner kb = new Scanner(System.in);
      
      int hours;
      double payRate;
      double wages;
      int employeeID;
      
      for(int i=0; i <7;i++)
      {
         System.out.println("Employee: "+(i+1));
         
         do
         {
            System.out.println("\tHours: ");
            hours = Integer.parseInt(kb.nextLine());
         }
         while(hours<0);
         payroll.setHours(i,hours);
         
         do
         {
            System.out.println("\tPay Rate: ");
            payRate = Double.parseDouble(kb.nextLine());
         }
         while(payRate<6.00);
         payroll.setPayRate(i,payRate);
         employeeID = payroll.getEmployeeID(i);
         wages =payroll.calculateGrossPay(employeeID);
         payroll.setWages(i,wages);
      }
      System.out.println("      ");
      for(int i=0;i<7;i++)
      {
         System.out.print("Employee ID: "+payroll.getEmployeeID(i));
         System.out.print("Gross Wages: "+payroll.getWages(i));
      }
      System.exit(0);
   }
}