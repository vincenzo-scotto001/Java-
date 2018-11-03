// Vincenzo Scotto Di Uccio chp 3 problem 6 feb. 10 2016
import java.util.Scanner;
class payrolltestVSDU
{
   public static void main(String [] args)
   {
      String name,s1;
      int hrs,rate,id;
      
      payrollVSDU employee = new payrollVSDU();
      
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter your name: ");
      name = keyboard.nextLine();
      
      System.out.println("Enter ID: ");
      s1 = keyboard.nextLine();
      id = Integer.parseInt(s1);
      
      System.out.println("Enter hourly rate: ");
      s1 = keyboard.nextLine();
      rate = Integer.parseInt(s1);
      
      System.out.println("Enter hours: ");
      s1 = keyboard.nextLine();
      hrs = Integer.parseInt(s1);
      
      employee.setName(name);
      employee.setID(id);
      employee.setHourlyRate(rate);
      employee.setHours(hrs);
      
      System.out.println("Your gross pay is: "+ employee.grossPay());
      }
}