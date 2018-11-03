// Vincenzo Scotto Di Uccio chp.3 problem 6 feb. 10 2016
import java.util.Scanner;

class payrollVSDU
{
   private String Name;
   private int ID;
   private int hourly_rate;
   private int hours;
   
   public payrollVSDU()
   {
      Name = " ";
      ID = 0;
      hourly_rate = 0;
      hours = 0;
   }
   public payrollVSDU(String name, int id)
   {
      Name = name;
      ID = id;
   }
   public void setName(String name)
   {
      Name = name;
   }
   public void setID(int id)
   {
      ID=id;
   }
   public void setHourlyRate(int rate)
   {
      hourly_rate = rate;
   }
   public void setHours(int hrs)
   {
      hours= hrs;
   }
   public String getName()
   {
      return Name;
   }
   public int getId()
   {
      return ID;
   }
   public int getHourlyRate()
   {
      return hourly_rate;
   }
   public int getHours()
   {
      return hours;
   }
   public int grossPay()
   {
      return (hourly_rate*hours);
   }
}