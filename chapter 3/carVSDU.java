//Vincenzo
public class carVSDU
{
   private int year; 
   private String make;
   private int speed;
   public carVSDU(int yr, String mk)
   {
      year = yr;
      make = mk;
      speed = 0;
   }
   public void setYr(int yr)
   {
      year = yr;
   }
   public void setMk(String mk)
   {
      make = mk;
   }
   public int accl()
   {
      speed += 5;
      return speed;
   }
   public int brk()
   {
      speed -= 5;
      return speed;
   }
   public int getYr()
   {
      return year;
   }
   public String getMk()
   {
      return make;
   }
   public int getSpeed()
   {
      return speed;
   }
}
