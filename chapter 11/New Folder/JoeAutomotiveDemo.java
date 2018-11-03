// Vincenzo Scotto Di Uccio Problem 6 Chapter 11

import javax.swing.*;
import java.awt.event.*;
public class JoeAutomotiveDemo extends JFrame
{
   private JPanel panel;
   private JCheckBox oilCB,lubeCB,radCB,transCB,inspectCB,mufflerCB,tireCB,otherCB;
   private JLabel laborCharges,numOfHours;
   private JButton totalAmount;
   private JTextField hours;
   private final double OIL = 26.00;
   private final double LUBE = 18.00;
   private final double RAD= 30.00;
   private final double TRANS = 80.00;
   private final double INSPECT = 15.00;
   private final double MUFFLER = 100.00;
   private final double TIRE = 20.00;
   private final double LABOR_PER_HOUR = 20.00;
   private final double OTHER = 50.00;
   private final int WINDOW_WIDTH = 210;
   private final int WINDOW_HEIGHT = 400;
   
   public JoeAutomotiveDemo()
   {
      setTitle("Joe's Automotive");
      setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      buildPanel();
      add(panel);
      setVisible(true);
   }
   
   private void buildPanel()
   {
      panel = new JPanel();
      oilCB = new JCheckBox("Oil Change: $"+OIL);
      lubeCB = new JCheckBox("Lube job: $"+LUBE);
      radCB = new JCheckBox("Radiator flush: $"+RAD);
      transCB = new JCheckBox("Transmisson flush: $"+TRANS);
      inspectCB = new JCheckBox("Inspection: $"+INSPECT);
      mufflerCB = new JCheckBox("Muffler change: $"+MUFFLER);
      tireCB = new JCheckBox("Tire rotation: $"+TIRE);
      otherCB = new JCheckBox("Other: $"+OTHER);
      
      laborCharges = new JLabel("Labor charges: $"+LABOR_PER_HOUR+"per hour.");
      numOfHours = new JLabel("Enter numebr of hours: ");
      
      hours = new JTextField(3);
      totalAmount = new JButton("Total");
      totalAmount.addActionListener(new CalcButtonListener());
      
      panel.add(oilCB);
      panel.add(lubeCB);
      panel.add(radCB);
      panel.add(transCB);
      panel.add(inspectCB);
      panel.add(mufflerCB);
      panel.add(tireCB);
      panel.add(otherCB);
      panel.add(laborCharges);
      panel.add(numOfHours);
      panel.add(hours);
      panel.add(totalAmount);
   }
   
   private class CalcButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         double amount = 0.00;
         
         if(oilCB.isSelected())
            amount +=OIL;
         if(lubeCB.isSelected())
            amount +=LUBE;
         if(radCB.isSelected())
            amount +=RAD;
         if(transCB.isSelected())
            amount +=TRANS;
         if(inspectCB.isSelected())
            amount+=INSPECT;
         if(mufflerCB.isSelected())
            amount += MUFFLER;
         if(tireCB.isSelected())
            amount += TIRE;
         if(otherCB.isSelected())
            amount +=OTHER;
         
         String input = hours.getText();
         int hrs = Integer.parseInt(input);
         
         amount +=LABOR_PER_HOUR *hrs;
         
         JOptionPane.showMessageDialog(null, "You should pay the amount of $"+amount);
       }
    }
    
    public static void main(String [] args)
    {
      JoeAutomotiveDemo j = new JoeAutomotiveDemo();
    }
}