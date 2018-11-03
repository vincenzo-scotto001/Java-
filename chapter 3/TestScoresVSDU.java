// Vincenzo Scotto Di Uccio chapter 3 problem 8

public class TestScoresVSDU
{
   private int score1;
   private int score2;
   private int score3;
   
   public TestScoresVSDU()
   {
      score1 = 0;
      score2 = 0;
      score3 = 0;
   }
   public TestScoresVSDU(int sc1, int sc2, int sc3)
   {
      score1 = sc1;
      score2 = sc2;
      score3 = sc3;
   }
   public void setScore1(int scor1)
   {
      score1 = scor1;
   }
   public void setScore2(int scor2)
   {
      score2 = scor2;
   }
   public void setScore3(int scor3)
   {
      score3 = scor3;
   }
   
   public int getScore1()
   {
      return score1;
   }
   public int getScore2()
   {
      return score2;
   }
   public int getScore3()
   {
      return score3;
   }
   public int AvgT()
   {
      return (score1+score2+score3)/3;
   }
}