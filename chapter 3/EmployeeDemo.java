public class EmployeeDemo
{
   public static void main(String[] args)
   {
      
      Employee num1  = new Employee();
      num1.setName("Susan Meyers");
      num1.setIDnum(47899);
      num1.setDep("Accounting");
      num1.setPos("VP");
      
      Employee num2 = new Employee();
      num2.setName("Mark Jones");
      num2.setIDnum(39119);
      num2.setDep("IT");
      num2.setPos("Programmer");
      
      Employee num3 = new Employee();
      num3.setName("Joy Rogers");
      num3.setIDnum(81774);
      num3.setDep("Manufacturing");
      num3.setPos("Enginner");

      
      System.out.println("Name: "+ num1.getName());
      System.out.println("IDnum: "+ num1.getIDnum());
      System.out.println("Department: "+ num1.getDep());
      System.out.println("Position: "+ num1.getPos());
      
      System.out.println("Name: "+ num2.getName());
      System.out.println("IDnum: "+ num2.getIDnum());
      System.out.println("Department: "+ num2.getDep());
      System.out.println("Position: "+ num2.getPos());
      
      System.out.println("Name: "+ num3.getName());
      System.out.println("IDnum: "+ num3.getIDnum());
      System.out.println("Department: "+ num3.getDep());
      System.out.println("Position: "+ num3.getPos());
      
  }
}