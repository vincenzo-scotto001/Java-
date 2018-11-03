// Vincenzo Scotto Di Uccio Chapter 5 problem 10 march 2nd 2016

public class SavingsAccountVSDU
{
   private double annualInterestRate;
   private double currentBalance;
   private double initialBalance;
   
   SavingsAccountVSDU(double initialBalance)
   {
      currentBalance = initialBalance;
   }
   
   public void withdraw(double amount)
   {
      currentBalance = currentBalance - amount;
   }
   
   public void deposit(double amount)
   {
      currentBalance = currentBalance + amount;
   }
   public double monthlyInterest(double rate)
   {
      return (currentBalance*(rate/100));
   }
}