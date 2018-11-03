// Vincenzo Scotto Di Uccio Hand out problem 5

import java.util.*;

public class Female extends Child
{

   public Female(String name){      
       super(name, "male");
       setAge();
}
  
   public void setAge()
   {
       System.out.println("enter the age of the female child");
           Scanner in = new Scanner(System.in);
           double age = in.nextDouble();
       this.age = age;
   }
  
   public void display()
   {
       System.out.println("age of the female child is " + this.age);
   }

}