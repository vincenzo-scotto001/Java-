import javax.swing.*;
import java.awt.event.*;

public class PropertyTaxDemo extends JFrame
{
   private JPanel panel;
   private JLabel actualValueLabel;
   private JLabel assessmentValueLabel;
   private JLabel propertyTaxLabel;
   private JTextField actualValueTF;
   private JButton calcButton;
   private final int WINDOW_WIDTH = 250;
   private final int WINDOW_HEIGHT = 200;
   
   public PropertyTaxDemo()
   {
      setTitle("Property Tax");
      setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      buildPanel();
      add(panel);
      setVisible(true);
   }
   
   private void buildPanel()
   {
      actualValueLabel = new JLabel("Enter actual value$: ");
      
      assessmentValueLabel = new JLabel();
      propertyTaxLabel = new JLabel();
      actualValueTF = new JTextField(8);
      calcButton = new JButton("Calculate");
      calcButton.addActionListener(new CalcButtonListener());
      
      panel = new JPanel();
      panel.add(actualValueLabel);
      panel.add(actualValueTF);
      panel.add(calcButton);
      panel.add(assessmentValueLabel);
      panel.add(propertyTaxLabel);
   }
   
   private class CalcButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         String input;
         double amount;
         double assessmentValue;
         double propertyTax;
         
         input = actualValueTF.getText();
         
         amount = Double.parseDouble(input);
         
         assessmentValue = amount * 0.6;
         propertyTax = assessmentValue * 0.64/100;
         assessmentValueLabel.setText("Assessment value$: "+assessmentValue);
         
         propertyTaxLabel.setText("Property tax$: "+propertyTax);
      }
   }
   public static void main(String [] args)
   {
      new PropertyTaxDemo();
   }
}