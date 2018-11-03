// Vincenzo Scotto Di Uccio Chapter 9 problem 10

public class CargoShip extends Ship

{

   private int cargoCap;

   public CargoShip(String n, String b)

   {

      super(n, b);

   }

   public void setCargoCap(int cc)

   {

      cargoCap = cc;

   }

   public int getCargoCap()

   {

      return cargoCap;

   }

   public String toString()

   {

      String str;

      str = super.toString() +

      "\nShip's Name: " + n +

      "\nCargo Capacity; " + cargoCap;

      return str;

   }

}