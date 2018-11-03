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