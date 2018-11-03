// Vincenzo Scotto Di Uccio Chapter 3 problem 5

public class RetailItemTestVSDU
{
   public static void main(String[] args)
   {
      RetailItemVSDU item1 = new RetailItemVSDU();
      item1.setDescription("Jacket");
      item1.setUnitsOnHand(12);
      item1.setPrice(59.95);
      
      RetailItemVSDU item2 = new RetailItemVSDU();
      item2.setDescription("Designer Jeans");
      item2.setUnitsOnHand(40);
      item2.setPrice(34.95);
      
      RetailItemVSDU item3 = new RetailItemVSDU();
      item3.setDescription("Shirt");
      item3.setUnitsOnHand(20);
      item3.setPrice(24.95);
      
      System.out.println(item1.getDescription());
   }
}