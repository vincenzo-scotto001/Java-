import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;


public class OrderCalculatorGUI extends JFrame
{
   private final int WINDOW_WIDTH = 400; 
   private final int WINDOW_HEIGHT = 200;
   private DeckPanel decks; 
   private AssembliesPanel assemblies; 
   private WheelsPanel wheels; 
   private MiscellaneousPanel miscellaneous; 
   private JPanel buttonPanel = new JPanel(); 
   private JButton calcButton; 
   private JButton exitButton;
   private final double TAX_RATE = 0.06; 

   public OrderCalculatorGUI()
   {
      setTitle("Skateboard Designer");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);


      setLayout(new GridLayout(3, 4));


      miscellaneous = new MiscellaneousPanel();
      decks = new DeckPanel();
      assemblies = new AssembliesPanel();
      wheels = new WheelsPanel();


      buildButtonPanel();


      add(decks);
      add(assemblies);
      add(wheels);
      add(miscellaneous);
      add(buttonPanel);


      pack();
      setVisible(true);
    }
    private void buildButtonPanel()
    {
      calcButton = new JButton("Calculate");
      exitButton = new JButton("Exit");
      

      buttonPanel.add(calcButton);
      buttonPanel.add(exitButton);
    }

    private class ExitButtonListener implements ActionListener
    {
      public void actionPerformed(ActionEvent e)
      {
          System.exit(0);
      }
    }
 }