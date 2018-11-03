//Vincenzo Scotto Di Uccio Problem 4 chapter 12
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SkateShop extends JFrame implements ActionListener 
{
   JLabel result;
   JComboBox deckList, truckList, wheelsList;
   String[] decks = { "Select", "The Master Thrasher", "The Dictator",
           "The Street King" };
   int[] deckprices = { 0, 60, 45, 50 };
   String[] truckAssems = { "Select", "--7.75 inch axle--", "--8 inch axle--",
           "--8.5 inch axle--" };
   int[] trackprices = { 0, 35, 40, 45 };

   String[] wheels = { "Select", "51 mm", "55 mm", "58 mm", "61 mm" };
   int[] wheelprices = { 0, 20, 22, 24, 28 };

   SkateShop() 
   {
       setTitle("SkateBoard Shop");
       setLayout(new FlowLayout());

       deckList = new JComboBox(decks);

       truckList = new JComboBox(truckAssems);

       wheelsList = new JComboBox(wheels);
       add(new JLabel("Decks:"));
       add(deckList);
       add(new JLabel("Truck Assemblies:"));
       add(truckList);
       add(new JLabel(" Wheels:"));
       add(wheelsList);
       deckList.addActionListener(this);
       truckList.addActionListener(this);
       wheelsList.addActionListener(this);
       result = new JLabel();
       add(result);
   }

   public static void main(String[] args) 
   {
       SkateShop shop = new SkateShop();
       shop.setSize(700, 300);
       shop.setVisible(true);
   }

   @Override
   public void actionPerformed(ActionEvent ae) 
   {
       int subtotal = deckprices[deckList.getSelectedIndex()]
               + wheelprices[wheelsList.getSelectedIndex()]
               + trackprices[truckList.getSelectedIndex()];
       result.setText("sub total:$ " + (subtotal) + ", amount of sales:$ "
               + ((double) 6 / 100) * subtotal + ", total:$ "
               + (subtotal + ((double) 6 / 100) * subtotal));
   }
}