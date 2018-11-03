import java.util.Scanner;


public class Application {
public static void main(String[]args)
{
   double total=0.0;
   int choice;
   Scanner s=new Scanner(System.in);
System.out.println("input your choice for Decks(1-3)");

System.out.println("1:The Master Thrasher 60$\n2:The Dictator 45$\n3:The Street King 50$\n");

   choice=s.nextInt();
   switch(choice)
   {
   case 1:
   {
       total=total+60;
       break;
   }
   case 2:
   {
       total=total+45;
       break;
   }
  
   case 3:
   {
       total=total+50;
       break;
   }
  
  
  
  
   }
  
   System.out.println("input your choice for Truck Assemblies(1-3)");

   System.out.println("1:7.75 inch axle 35$\n2:8 inch axle 40$\n3:8.5 inch axle 45$\n");
   choice=s.nextInt();
   switch(choice)
   {
   case 1:
   {
       total=total+35;
       break;
   }
   case 2:
   {
       total=total+40;
       break;
   }
  
   case 3:
   {
       total=total+45;
       break;
   }
  
  
  
  
   }
  
  
  
  
   System.out.println("input your choice for Wheels(1-4)");

   System.out.println("1:51mm 20$\n2:55mm 22$\n3:58mm 24$\n4:61 mm 28$\n");
   choice=s.nextInt();
   switch(choice)
   {
   case 1:
   {
       total=total+20;
       break;
   }
   case 2:
   {
       total=total+22;
       break;
   }
  
   case 3:
   {
       total=total+24;
       break;
   }
  
   case 4:
   {
       total=total+28;
       break;
   }
  
  
   }
  
  

   System.out.println("1:Grip tape = 10$\n2:Bearings = 30$\n3:Riser pads = 10$\n4:Nuts and bolts kit = 3$\n");
  
   char ch='y';
   while(ch!='n')
   {
       System.out.println("input your choice for miscellaneous products(1-4)");

   choice=s.nextInt();
  
   switch(choice)
   {
   case 1:
   {
       total=total+10;
       break;
   }
   case 2:
   {
       total=total+30;
       break;
   }
  
   case 3:
   {
       total=total+10;
       break;
   }
  
   case 4:
   {
       total=total+3;
       break;
   }
  
  
   }
   System.out.println("Want to choose more(y/n)");
   ch=s.next().charAt(0);

  
  
  
   }
  
   System.out.println("Subtotal "+total);
  
   double tax=(total*6)/100.0;
   System.out.println("Amount after sales tax(6%)"+tax);
   System.out.println("Total of the order "+(total+tax));


  
  
}

}