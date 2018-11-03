import javax.swing.*;
import java.awt.event.*;

class MonthlySalesTaxDemo extends JFrame
{
   private JPanel panel;
   private JLabel messageLabel_monthlysales;
   private JTextField monthlysalesTextField;
   private JButton salestaxButton;
   
   private final int WINDOW_WIDTH = 250;
   private final int WINDOW_HEIGHT = 250;
   
   public MonthlySalesTaxDemo()
   {
      setTitle("Monthly Sales Tax");
      setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      buildPanel();
      add(panel);
      setVisible(true);
   }
   
   private void buildPanel()
   {
      messageLabel_monthlysales = new JLabel("Enter sales for this month: ");
      
      monthlysalesTextField = new JTextField(10);
      salestaxButton = new JButton("Calculate monthly sales tax.");
      
      salestaxButton.addActionListener(new CalculateMST());
      
      panel = new JPanel();
      panel.add(messageLabel_monthlysales);
      panel.add(monthlysalesTextField);
      panel.add(salestaxButton);
   }
   
   public class CalculateMST implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         String input;
         double CountyTax;
         double StateTax;
         double TotalsalesTax;
         input = monthlysalesTextField.getText();
         CountyTax = (Double.parseDouble(input)*0.02);
         StateTax = (Double.parseDouble(input)*0.04);
         TotalsalesTax = (CountyTax + StateTax);
         
         JOptionPane.showMessageDialog(null,"The amount of county sales tax: "+ CountyTax+"\n The amount of state tax: "+StateTax+"\n Total sales tax: "+TotalsalesTax);
      }
   }
}
  public class hi
  {
      public static void main(String [] args)
      {
         MonthlySalesTaxDemo ST = new MonthlySalesTaxDemo();
      }
  }
