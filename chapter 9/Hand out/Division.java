// Vincenzo Scotto Di Uccio Hand out problem 4
abstract class Division 
{
   protected String divisionName;
   protected int accountNumber;
   Division(String name, int number)
   {
       divisionName = name;
       accountNumber = number;
   }
   abstract public void display();
}