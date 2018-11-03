// Vincenzo Scotto Di Uccio Chapter 9 problem 3

public class TeamLeader extends ProductionWorker
{
// instancevariables
   private double monthlyBonus;
   private int trainingHoursRequired;
   private int trainingHoursAttended;

//constructors
   public TeamLeader(String name, String number, StringhireDate, int shift, double hourlyRate, double monthlyBonus, double trainingHoursRequired)
   {
      super(name, number, hireDate, shift,hourlyRate);

      setMonthlyBonus(monthlyBonus);
      setTrainingHoursRequired(trainingHoursRequired);
   }

// accessors
   public double getMonthlyBonus()
   {
      return monthlyBonus;
   }
   public int getTrainingHoursRequired()
   {
      return trainingHoursRequired;
   }
   public int getTrainingHoursAttended()
   {
      return trainingHoursAttended;
   }

// modifiers
   public void setMonthlyBonus(double m)
   {
      monthlyBonus = m;
   }
   public void setTrainingHoursRequired(int t)
   {
      trainingHoursRequired= t;
   }
   public void setTrainingHoursAttended(int t)
   {
      trainingHoursAttended= t;
   }
}