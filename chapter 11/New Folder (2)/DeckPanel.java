// Vincenzo Scotto Di Uccio Chapter 12 problem 4
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
public class DeckPanel extends JPanel
{
   private JPanel deckPanel;
   private JList deckList;
   private JList selectedDeckList;

   private String[] decks = {"The Master Trasher" , "The Dictator", "The Street King"};

   public DeckPanel()
   {

      setBorder(BorderFactory.createTitledBorder("Decks"));

      setLayout(new GridLayout(3, 1));
   }
}