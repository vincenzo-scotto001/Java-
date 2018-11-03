// Vincenzo Scotto Di Uccio chapter 3 problem 8
import java.util.Scanner;

class TestScoreTestVSDU
{
   public static void main(String[] args)
   {
      int score1,score2,score3;
      
      
      
      TestScoresVSDU scores = new TestScoresVSDU();
      System.out.println("Please enter first test score: ");
      Scanner keyboard = new Scanner(System.in);
      score1 = keyboard.nextInt();
      scores.setScore1(score1);
      
      System.out.println("Please enter second test score: ");
      score2 = keyboard.nextInt();
      scores.setScore2(score2);
      
      System.out.println("Please enter third test score: ");
      score3 = keyboard.nextInt();
      scores.setScore3(score3);
      
      System.out.println("The average of these scores is: "+scores.AvgT());
      }
}