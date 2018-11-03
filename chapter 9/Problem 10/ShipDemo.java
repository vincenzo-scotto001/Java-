// Vincenzo Scotto Di Uccio Chapter 9 problem 10

public class ShipDemo

{

   public static void main(String[] args)

   {

//Create an array of Ship References.

   Ship[] types = new Ship[6];

   types[0] = new Ship();

   types[0].setName("Carnival");

   ((CruiseShip) types[0]).setMaxPass(500);

   types[1] = new Ship();

   types[1].setName("Royal Caribbean");

   ((CruiseShip) types[1]).setMaxPass(1000);

   types[2] = new Ship();

   types[2].setName("Sony");

   ((CargoShip) types[2]).setCargoCap(10000);

   types[3] = new Ship();

   types[3].setName("Playskool");

   ((CargoShip) types[2]).setCargoCap(25000);

   for (int i=0; i < types.length; i++)

   {

      System.out.println("Ship " + (i + 1) + ": ");

//Need something here to call the toString methods

   }

}

}