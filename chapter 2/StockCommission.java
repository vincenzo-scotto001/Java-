// Vincenzo Scotto Di Uccio Chapter 2 program 14
public class StockCommission
{
   public static void main(String[] args)
   {
      final int num = 600;
      final double stock = 21.77;
      final double comm_percent = 0.02;
      
      double stockCost;
      double commission;
      double total;
      
      stockCost = stck * num;
      
      commission = stockCost * comm_percent;
      total = stock + commission;
      System.out.println("stock cost: " +stock+"\ncommission: "+commission+"\n total: "+total);
      }
}