import javax.swing.*;
import java.awt.*;

public class MiscellaneousPanel extends JPanel
{
   public final double TAPE = 10.0;
   public final double BEARINGS = 30.00;
   public final double PADS = 2.00;
   public final double NUTS = 28.00;

   private JRadioButton tape; 
   private JRadioButton bearings; 
   private JRadioButton pads; 
   private JRadioButton nuts; 
   private ButtonGroup bg; 
   public MiscellaneousPanel()
   {
      setLayout(new GridLayout(4, 1));
      tape = new JRadioButton("Grip Tape", true);
      bearings = new JRadioButton("Bearings");
      pads = new JRadioButton("Riser Pads");
      nuts = new JRadioButton("Nuts & Bolts Kit");
      bg = new ButtonGroup();
      bg.add(tape);
      bg.add(bearings);
      bg.add(pads);
      bg.add(nuts);
      setBorder(BorderFactory.createTitledBorder("Miscellaneous Products"));
      add(tape);
      add(bearings);
      add(pads);
      add(nuts);
   }
}
