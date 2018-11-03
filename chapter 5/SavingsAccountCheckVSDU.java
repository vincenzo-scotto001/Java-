// Vincenzo Scotto Di Uccio chapter 5 problem 10 march 2nd 2016

import java.util.Scanner;

public class SavingsAccountCheckVSDU
{
   private static double totalDepositAmount;
   private static double totalWithdrawAmount;
   private static double totalInterestAmount;
   
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter annual interest rate: ");
      double annualInterestRate = keyboard.nextDouble();
      System.out.println("Enter starting balance: ");
      double startingBalance = keyboard.nextDouble();
      System.out.println("Enter number of month(s): ");
      int numberOfMonths = keyboard.nextInt();
      
      SavingsAccountVSDU sa = new SavingsAccountVSDU(startingBalance);
      
      
      for(int i =0; i < numberOfMonths; i++)
         System.out.print("Enter the amount deposited: ");
         
         double amountDeposited = keyboard.nextDouble();
         
         totalDepositAmount = totalDepositAmount + amountDeposited;
         
         sa.deposit(totalDepositAmount);
         System.out.print("Enter the amount withdrawn: ");
         double amountWithdrawn = keyboard.nextDouble();
         totalWithdrawAmount = totalWithdrawAmount + amountWithdrawn;
         sa.withdraw(amountWithdrawn);
         totalInterestAmount = totalInterestAmount + sa.monthlyInterest(annualInterestRate/12);
      
      System.out.println("Total amount deposited: "+totalDepositAmount);
      System.out.println("Total amount withdrawn: "+totalWithdrawAmount);
      System.out.println("Total interest earned: "+totalInterestAmount);
      System.out.println("End balance: "+(startingBalance + totalDepositAmount + totalInterestAmount - totalWithdrawAmount));
   }
}