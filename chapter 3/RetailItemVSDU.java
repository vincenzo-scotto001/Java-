// Vincenzo Scotto Di Uccio chapter 3 problem 5

public class RetailItemVSDU
{
   private String description;
   private int unitsonHand;
   private double price;
   
   public RetailItemVSDU()
   {
      description = " ";
      unitsonHand = 0;
      price = 0;
   }
   public RetailItemVSDU(String desc, int units, double pri)
   {
      description = desc;
      unitsonHand = units;
      price = pri;
   }
   public void setDescription(String descrip)
   {
      description = descrip;
   }
   public void setUnitsOnHand(int unitsonhand)
   {
      unitsonHand = unitsonhand;
   }
   public void setPrice(double pric)
   {
      price = pric;
   }
   public String getDescription()
   {
      return description;
   }
   public int getUnitsonhand()
   {
      return unitsonHand;
   }
   public double getPR()
   {
      return price;
   }
}