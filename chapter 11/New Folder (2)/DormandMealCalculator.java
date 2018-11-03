// Vincenzo Scotto Di Uccio Chapter 12 problem 3

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DormandMealCalculator extends JFrame
{
   private JLabel label;
   private JPanel dormPanel;
   private JPanel selectedDormPanel;
   private JComboBox dormBox;
   private JTextField selectedDorm;
   private JPanel mealPanel;
   private JPanel selectedMealPanel;
   private JComboBox mealBox;
   private JTextField selectedMeal;
   private JPanel totalPanel;
   private JTextField total;
   private String[] dorm ={"Allen Hall $"+1500,"Pike Hall $"+1600,"Farthing Hall $"+1200,"University Suites $"+ 1800};
   
   double[] drate = {1500,1600,1200,1800};
   
   private String[] meal = {"7 meals per week $"+560, "14 meals per week $"+1095, "Unlimited $"+1500};
   
   double[] mrate ={560,1095,1500};
   
   public DormandMealCalculator()
   {
      setTitle("Dorm and Meal Plan Calculator");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new GridLayout(3,2));
      
      buildDormPanel();
      buildMealPanel();
      buildTotalPanel();
      add(dormPanel);
      add(mealPanel);
      add(totalPanel);
      pack();
      setVisible(true);
   }
   
   private void buildDormPanel()
   {
      dormPanel = new JPanel();
      dormBox = new JComboBox(dorm);
      dormBox.addActionListener(new ComboBoxListener());
      dormPanel.add(dormBox);
   }
   
   private void buildMealPanel()
   {
      mealPanel = new JPanel();
      
      mealBox = new JComboBox(meal);
      mealBox.addActionListener(new ComboBoxListener());
      mealPanel.add(mealBox);
   }
   
   private void buildSelectedDormPanel()
   {
      selectedDormPanel = new JPanel();
      label = new JLabel("Your Dormitory is: ");
      selectedDorm = new JTextField(20);
      selectedDorm.setEditable(false);
      selectedDormPanel.add(label);
      selectedDormPanel.add(selectedDorm);
   }
   
   private void buildSelectedMealPanel()
   {
      selectedMealPanel = new JPanel();
      label = new JLabel("Your meal plan is: ");
      selectedMeal = new JTextField(20);
      selectedMeal.setEditable(false);
      selectedMealPanel.add(label);
      selectedMealPanel.add(selectedMeal);
   }
   
   private void buildTotalPanel()
   {
      totalPanel = new JPanel();
      label = new JLabel("Your total charges are: ");
      total = new JTextField(20);
      total.setEditable(false);
      totalPanel.add(label);
      totalPanel.add(total);
   }
   
   private class ComboBoxListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         int dorm;
         int meal;
         double total1;
         
         String selection1 = (String) dormBox.getSelectedItem();
         dorm = dormBox.getSelectedIndex();
         
         String selection2 = (String) mealBox.getSelectedItem();
         meal = mealBox.getSelectedIndex();
         
         total1 = drate[dorm]+mrate[meal];
         total.setText("$"+total1);
      }
   }
   
   public static void main(String[] args)
   {
      DormandMealCalculator dmc = new DormandMealCalculator();
   }
}
