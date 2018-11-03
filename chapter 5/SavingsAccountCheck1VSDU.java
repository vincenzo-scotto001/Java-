// Vincenzo Scotto Di Uccio chapter 5 problem 11 march 2nd 2016

import java.util.*;
import java.lang.*;
import java.io.*;

public class SavingsAccountCheck1VSDU
{
   private static double totalDepositAmount;
   private static double totalWithdrawAmount;
   private static double totalInterestAmount;
   
   public static void main(String[] args) throws IOException
   {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter the annual interest rate: ");
      
      double annualInterestRate = keyboard.nextDouble();
      
      double startingBalance = 500.00;
      
      int numberOfMonths = 1;
      
      SavingsAccountVSDU sa = new SavingsAccountVSDU(startingBalance);
      
      for(int i =0; i < numberOfMonths; i++)
      {
         File file1 = new File("Deposits.txt");
         Scanner depositFile = new Scanner(file1);
         while(depositFile.hasNext())
         {
            String temp = depositFile.nextLine();
            double amountDeposited = Double.parseDouble(temp);
            
            sa.deposit(amountDeposited);
            
            totalDepositAmount = totalDepositAmount + amountDeposited;
         }
         File file2 = new File("Withdrawals.txt");
         Scanner withdrawFile = new Scanner(file2);
         while(withdrawFile.hasNext())
         {
            String temp = withdrawFile.nextLine();
            
            double amountWithdrawn = Double.parseDouble(temp);
            
            sa.withdraw(amountWithdrawn);
            
            totalWithdrawAmount = totalWithdrawAmount + amountWithdrawn;
         }
      }
      System.out.println("Total amount deposited: "+ totalDepositAmount);
      System.out.println("Total amount withdrawn: "+ totalWithdrawAmount);
      System.out.println("total interest earned: "+ totalInterestAmount);
      System.out.println("End Balance: "+(startingBalance + totalDepositAmount + totalInterestAmount - totalWithdrawAmount));
   }
}