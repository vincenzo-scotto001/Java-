// Vincenzo Scotto Di Uccio Chapter 7 problem 16 March 31st 2016

import java.io.*;

class ArrayDemo
{
   public static void main(String[] args)
   {
      int[][]list = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
      
      System.out.println("Total: "+getTotal(list));
      System.out.println("Average: "+getAverage(list));
      System.out.println("Row 2 value: "+getRowTotal(list,2));
      System.out.println("Column 3 Total: "+getColumnTotal(list,3));
      System.out.println("Highest value in row 1 is: "+getHighest(list,1));
      System.out.println("Lowest value in row 2 is: "+ getLowest(list,2));
      System.exit(0);
   }
   
   public static int getTotal(int[][]numbers)
   {
      int tot =0;
      
      for(int row =0 ; row<numbers.length;row++)
         for(int col=0 ; col<numbers[row].length;col++)
            tot+=numbers[row][col];
      
      return tot;
   }
   
   public static double getAverage(int[][]numbers)
   {
      double avg;
      avg =(double)(getTotal(numbers)/20);
      return avg;
   }
   
   public static int getRowTotal(int[][]numbers, int index)
   {
      int tot = 0;
      
         for(int col = 0;col<4;col++)
            tot+=numbers[index][col];
      return tot;
   }
   
   public static int getColumnTotal(int[][]numbers,int index)
   {   
      int tot =0;
      for(int row=0;row<numbers.length;row++)
      {
         tot+=numbers[row][index];
      }
      return tot;
   }
   
   public static int getHighest(int[][]numbers, int row)
   {
      int high = numbers[row][0];
      
      for(int i=1;i<5;i++)
         if(numbers[row][i]> high)
            high = numbers[row][i];
      return high;
   }
   
   public static int getLowest(int[][]numbers,int row)
   {
      int low = numbers[row][0];
      
      for(int i=1;i<5;i++)
         if(numbers[row][i]<low)
            low = numbers[row][i];
      return low;
   }
}