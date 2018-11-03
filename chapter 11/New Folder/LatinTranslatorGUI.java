// Vincenzo Scotto Di Uccio Chapter 11 problem 8

import javax.swing.*;
import java.awt.event.*;

public class LatinTranslatorGUI extends JFrame
{
   private JButton button1;
   private JButton button2;
   private JButton button3;
   private JPanel panel;
   private final int WINDOW_WIDTH = 320;
   private final int WINDOW_HEIGHT = 100;


   public LatinTranslatorGUI()
   {
      super("Simple Latin Translator");
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      button1 = new JButton("Sinister");
      button2 = new JButton("Dexter");
      button3 = new JButton("Medium");

      button1.addActionListener(new ButtonListener());
      button2.addActionListener(new ButtonListener());
      button3.addActionListener(new ButtonListener());

      panel = new JPanel();
      panel.add(button1);
      panel.add(button2);
      panel.add(button3);
      add(panel);
      setVisible(true);
   }

   private class ButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         if (e.getSource() == button1)
            JOptionPane.showMessageDialog(null, "Left");
         else if (e.getSource() == button2)
            JOptionPane.showMessageDialog(null, "Right");
         else if (e.getSource() == button3)
            JOptionPane.showMessageDialog(null, "Center");

      }
   }

   public static void main(String[] args)
   {
      LatinTranslatorGUI latinTranslate = new LatinTranslatorGUI();
   }

}