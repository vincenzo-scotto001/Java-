// Vincenzo Scotto Di Uccio Hand out problem 3
class Ford extends Auto

{

     public Ford()

     {

          super("Ford");

          setPrice();

     }  

     public void setPrice()

     {

          price = 20000;

     }   

     public void print()

     {

          System.out.println("A new " + carType + " costs $" + price);

     }

}