// Vincenzo Scotto Di Uccio Hand out problem 5


public abstract class Child 
{
   protected String name;
   protected String Gender;
   protected double age;

   public Child(String name, String gender)
   {
       this.name = name;
       this.Gender = gender;
   }
   public abstract void setAge();
  
   public abstract void display();
      
}