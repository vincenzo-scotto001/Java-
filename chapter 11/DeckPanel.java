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

// AssembliesPanel

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

// WheelsPanel:

public class WheelsPanel extends JPanel
{
public final double WHEEL1 = 20.0;
public final double WHEEL2 = 22.00;
public final double WHEEL3 = 24.00;
public final double WHEEL4 = 28.00;
private JRadioButton wheel1;
private JRadioButton wheel2;
private JRadioButton wheel3;
private JRadioButton wheel4;
private ButtonGroup bg;
public WheelsPanel()
{
setLayout(new GridLayout(4, 1));
wheel1 = new JRadioButton("51 mm", true);
wheel2 = new JRadioButton("55 mm");
wheel3 = new JRadioButton("58 mm");
wheel4 = new JRadioButton("61 mm");
bg = new ButtonGroup();
bg.add(wheel1);
bg.add(wheel2);
bg.add(wheel3);
bg.add(wheel4);
setBorder(BorderFactory.createTitledBorder("Wheels"));
add(wheel1);
add(wheel2);
add(wheel3);
add(wheel4);
}
}

// MiscellaneousPanel

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
setBorder(BorderFactory.createTitledBorder
("Miscellaneous Products"));
add(tape);
add(bearings);
add(pads);
add(nuts);
}
}


public class OrderCalculatorGUI extends JFrame
{
private final int WINDOW_WIDTH = 400;
private final int WINDOW_HEIGHT = 200;
private DeckPanel decks; // Deck panel
private AssembliesPanel assemblies;
private WheelsPanel wheels;
private MiscellaneousPanel miscellaneous;
private JPanel buttonPanel = new JPanel(); private JButton calcButton;
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

// DeckPanel

public class DeckPanel extends JPanel implements ListSelectionListener
{

private JPanel deckPanel;
private JList deckList;


String[] decks = {"The Master Trasher" , "The Dictator", "The Street King"};
public DeckPanel()
{
setBorder(BorderFactory.createTitledBorder("Decks"));

deckList = new JList(decks);
add(deckList);
JScrollPane scrollbar = new JScrollPane(deckList);

scrollbar.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
scrollbar.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
add(scrollbar);
deckList.setVisibleRowCount(2);
deckList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
deckList.addListSelectionListener(this);
setLayout(new GridLayout(3, 1));
}


public void valueChanged(ListSelectionEvent e)
{
if (!e.getValueIsAdjusting())
{
String selection = (String) deckList.getSelectedValue();
System.out.println(selection);
}

}
}