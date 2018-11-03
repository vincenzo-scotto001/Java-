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
