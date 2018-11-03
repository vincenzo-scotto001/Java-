// Vincenzo Scotto Di Uccio Chapter 4 problem 3 feb 18th 2016
import javax.swing.JOptionPane;

public class BodyMassIndexVSDU
{
   public static void main(String[] args)
   {
      double weight;
      double height;
      double BMI;
      String input;
      
      input = JOptionPane.showInputDialog("Enter your weight in pounds");
      
      weight = Double.parseDouble(input);
      
      input = JOptionPane.showInputDialog("Enter your heigh in inches");
      
      height = Double.parseDouble(input);
      
      BMI = ((weight * 703)/(height*height));
      
      if (BMI >= 18.5 && BMI <= 25)
         JOptionPane.showMessageDialog(null,"BMI is"+BMI+", the person is underweight");
         
         else if (BMI < 18.5)
            JOptionPane.showMessageDialog(null,"BMI is"+BMI+", the person is underweight");
         else
             JOptionPane.showMessageDialog(null,"BMI is"+BMI+", the person overweight");
             
             System.exit(0);
     }
}
