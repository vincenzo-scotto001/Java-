//Vincenzo Scotto Di Uccio Hand out problem 3
class Chevy extends Auto

{

     public Chevy()

     {

          super("Chevy");

          setPrice();

     }

     public void setPrice()

     {

          price = 22000;

     }

     public void print()

     {

          System.out.println("A new " + carType + " costs $" + price);

     }

}