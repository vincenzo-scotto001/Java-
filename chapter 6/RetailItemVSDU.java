// Vincenzo Scotto Di Uccio March 24th 2016 problem 8 chapter 6
import java.text.DecimalFormat;
import java.util.*;
class RetailItemVSDU
{
   public String description;
   public int itemNumber;
   public CostData cost;
   
   public RetailItemVSDU()
   {
   }
   
   public RetailItemVSDU(String desc, int itemNum, double wholesale, double retail)
   {
      description = desc;
      itemNumber = itemNum;
      cost = new CostData(wholesale, retail);
   }
   
   public void setDescription(String str)
   {
      description = str;
   }
   
   public void setItemNumber(int item)
   {
      itemNumber = item;
   }
   
   public void setCost(double whole, double retail)
   {
      cost= new CostData(wholesale,retail);
   }
   
   public String getDescription()
   {
      return description;
   }
   
   public int getItemNumber()
   {
      return itemNumber;
   }
   
   public void getCost()
   {
      System.out.println("Whole sale cost is: "+cost.getWholesale());
      System.out.println("Retail cost is: "+cost.getRetail());
   }
   
   public String toString()
   {
      String str;
      
      DecimalFormat dollar = new DecimalFormat("#,##0.00");
      
      str = "Description: "+ description + "\nItemNumber: "+itemNumber+"\nWholesale Cost: $"+dollar.format(cost.wholesale)+"\nRetail Price: $"+dollar.format(cost.retail);
      
      return str;
   }
   
   
   public class CostData
   {
      public double wholesale,retail;
      
      public CostData(double w, double r)
      {
         wholesale = w;
         retail = r;
      }
      public double getRetail()
      {
         return retail;
      }
      
      public double getWholesale()
      {
         return wholesale;
      }
   }
}

class CashRegisterVSDU
{
   public RetailItemVSDU Ritem;
   public int items;
   
   public CashRegisterVSDU(RetailItemVSDU obj, int n)
   {
      Ritem = new RetailItemVSDU(obj.description,obj.itemNumber,obj.cost.wholesale,obj.cost.retail);
      
      items = n;
   }
   
   public String toString()
   {
      String str;
      
      System.out.println(Ritem);
      
      DecimalFormat dollar = new DecimalFormat("#,##0.00");
      str ="Sales subtotal: $"+dollar.format(getSubTotal())+"\nSales Tax: $"+dollar.format(getTax())+"\nTotal: $"+dollar.format(getTotal());
      return str;
   }
   
   public double getSubTotal()
   {
      return Ritem.cost.retail*items;
   }
   
   public double getTax()
   {
      return getSubTotal()*0.06;
   }
   
   public double getTotal()
   {
      return getSubTotal()+getTax();
   }
}

