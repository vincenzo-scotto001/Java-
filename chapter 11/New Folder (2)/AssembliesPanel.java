// Vincenzo Scotto Di Uccio 
import javax.swing.*;
import java.awt.*;
public class AssembliesPanel extends JPanel
{

   public final double AXLE1 = 35.00;
   public final double AXLE2 = 40.00;
   public final double AXLE3 = 45.00;

   private JCheckBox axle1; 
   private JCheckBox axle2; 
   private JCheckBox axle3; 

   public AssembliesPanel()
   {

      setLayout(new GridLayout(3, 1));
      
      axle1 = new JCheckBox("7.75 inch axle");
      axle2 = new JCheckBox("8 inch axle");
      axle3 = new JCheckBox("8.5 inch axle");

      setBorder(BorderFactory.createTitledBorder("Truck Assemblies"));


      add(axle1);
      add(axle2);
      add(axle3);
   }

}