import java.awt.event.*;
import java.awt.*;
import java.applet.*;
public class ItemEvents extends  Applet implements ItemListener {
	Checkbox cb1,cb2,cb3;
	String msg = "hello";
	int x = 40;
	int y = 50;
	@Override
	public void init()
	{
		cb1 = new Checkbox();
		cb2 = new Checkbox();
		cb3 = new Checkbox();
		cb1.setLabel("Apple");
		cb2.setLabel("Orange");
		cb3.setLabel("Grape");
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		add(cb1);
		add(cb2);
		add(cb3);
	}
	@Override
	public void paint(Graphics g)
	{
		g.drawString(msg, x, y);
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		msg = Integer.toString(e.getStateChange());
		repaint();
	}
}
//<applet code = ItemEvents width = 600 height = 600></applet>