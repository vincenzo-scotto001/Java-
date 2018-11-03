//Vincenzo Scotto Di Uccio Chapter 11 problem 7

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class LongDistancecall extends JFrame
{
   private JPanel panel;
   private JLabel messageLabel;
   private JTextField minutesTextField;
   
   private JRadioButton DayButton;
   private JRadioButton EveningButton;
   private JRadioButton Off_peakButton;
   private ButtonGroup radioButtonGroup;
   
   private final int WINDOW_WIDTH = 300;
   private final int WINDOW_HEIGHT = 250;
   
   
   public LongDistancecall()
   {
      setTitle("Long Distance Calls");
      setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      buildPanel();
      add(panel);
      setVisible(true);
   }
   
   private void buildPanel()
   {
      messageLabel = new JLabel("Enter number of minutes: ");
      minutesTextField = new JTextField(10);
      
      DayButton = new JRadioButton("Day Time");
      EveningButton = new JRadioButton("Evening Time");
      Off_peakButton = new JRadioButton("Off-peak");
      
      radioButtonGroup = new ButtonGroup();
      radioButtonGroup.add(DayButton);
      radioButtonGroup.add(EveningButton);
      radioButtonGroup.add(Off_peakButton);
      
      DayButton.addActionListener(new RadioButtonListener());
      EveningButton.addActionListener(new RadioButtonListener());
      Off_peakButton.addActionListener(new RadioButtonListener());
      
      panel= new JPanel();
      
      panel.add(messageLabel);
      panel.add(minutesTextField);
      panel.add(DayButton);
      panel.add(EveningButton);
      panel.add(Off_peakButton);
   }
   
   private class RadioButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         String input;
         
         double result = 0.0;
         input = minutesTextField.getText();
         
         if(e.getSource() == DayButton)
            result = Double.parseDouble(input)*0.07;
         else if (e.getSource() == EveningButton)
            result = Double.parseDouble(input)*0.12;
         else if (e.getSource() == Off_peakButton)
            result = Double.parseDouble(input)* 0.05;
         
         
         JOptionPane.showMessageDialog(null,"Call Charges is: $"+result);
       }
   }
   
   public static void main(String[] args)
   {
      new LongDistancecall();
   }
}