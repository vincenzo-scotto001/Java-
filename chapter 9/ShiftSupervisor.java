//Vincenzo Scotto Di Uccio Chapter 9 problem 2

public class ShiftSupervisor extends Employee
{
   double annualSalary,productionBonus;
//calling parent constructor
   public ShiftSupervisor(String name, String date, String id) 
   {
      super(name, date, id);
   }
   public ShiftSupervisor() 
   {
      super("john", "11-11-2005", "123-A");
   }
  
//setter methods
   public void setAnnualSalary(double annualSalary) 
   {
      this.annualSalary = annualSalary;
   }

   public void setProductionBonus(double productionBonus) 
   {
      this.productionBonus = productionBonus;
   }

@Override
   public String toString() 
   {
      return "ShiftSupervisor{"+"name="+this.getName()+"id= "+this.getId()+"Date= "+this.getDate()+"annualSalary=" + annualSalary + ", productionBonus=" + productionBonus + '}';
   }
   public static void main(String args[])
   {
//objects created
      ShiftSupervisor worker1 = new ShiftSupervisor("John Smith","11-15-2005","123-A");
      ShiftSupervisor worker2 = new ShiftSupervisor("Joan Jones","12-12-2005","222-L");
  
//calling setter methods
      worker1.setAnnualSalary(48000);
      worker1.setProductionBonus(6500);
  
      worker2.setAnnualSalary(55000);
      worker2.setProductionBonus(8000);
  
//printing data
      System.out.println(worker1);
      System.out.println(worker2);
   }
}