//Vincenzo Scotto Di Uccio Chapter 9 problem 2

public class Employee 
{
   String name;
   String date;
   String id;
//constructor method
   public Employee(String name, String date, String id) 
   {
      this.name = name;
      this.date = date;
      this.id = id;
   }
//getter setter methods
   public String getName() 
   {
      return name;
   }

   public void setName(String name) 
   {
      this.name = name;
   }

   public String getDate() 
   {
      return date;
   }

   public void setDate(String date) 
   {
      this.date = date;
   }

   public String getId() 
   {
      return id;
   }

   public void setId(String id) 
   {
      this.id = id;
   }
//to string method to print object data
@Override
   public String toString() 
   {
      return "Employee{" + "name=" + name + ", date=" + date + ", id=" + id + '}';
   }
  
}


