// vincenzo scotto di uccio chapter 5 problem 6 feb. 25 2016

import java.util.*;

public class PopulationVSDU
{
   public static void main(String[] args)
   {
      int startingNumber;
      double increasingAveragePercentage;
      double numberOfMultiplyingDays;
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter the starting number of organisms: ");
      
      startingNumber = input.nextInt();
      
      while(startingNumber < 2)
      {
         System.out.println("Starting number should not be less than two.");
         
         System.out.println("Please enter a valid number: ");
      }
         
      System.out.println("Enter average daily population increase in percentage: ");
      
      increasingAveragePercentage = input.nextDouble();
      
      while(increasingAveragePercentage < 0)
      {
         System.out.println("Number cannot be negative.");
         
         System.out.println("Enter a valid percent value: ");
      }
      System.out.println("Enter the amount of days they will multiply: ");
      numberOfMultiplyingDays = input.nextDouble();
      while(numberOfMultiplyingDays < 1)
      {
         System.out.println("The number of days cannot be less than one. ");
         System.out.println("Enter a valid number for the days: ");
      }
      System.out.printf("%-6s%20s","Day","Size of population");
      
      System.out.println("---------");
      
      double dailyPopulation = startingNumber;
      
      for(int day =1; day <= numberOfMultiplyingDays; day++)
      {
         if(day != 1)
            dailyPopulation = dailyPopulation*increasingAveragePercentage/100;
      
            System.out.printf("%-6d%20.2f",day,dailyPopulation);
      }
   }   
}