import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class MouseEvents extends Applet implements MouseListener
{
	int X=25,Y=25;
	String msg = "default string";
	Point p;
	public void init()
	{
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent me)
	{
		showStatus("clicked");
		X = me.getX();
		Y = me.getY();
		p = me.getPoint();
		msg = Integer.toString(me.getClickCount());
		showStatus(p.x +" " + p.y);
		repaint();
	}
	public void mouseExited(MouseEvent me)
	{
		showStatus("exited");
	}
	public void mouseEntered(MouseEvent me)
	{
		showStatus("entered");
	}
	public void mousePressed(MouseEvent me)
	{
		showStatus("pressed");
		showStatus(Integer.toString(me.getButton()));
	}
	public void mouseReleased(MouseEvent me)
	{
		showStatus("released");
		p = me.getLocationOnScreen();
		showStatus(p.x+" "+p.y);
	}
	
	public void paint(Graphics g)
	{
		g.drawString(msg,X,Y);
	}
}
//<applet code = MouseEvents width = 600 height = 600></applet>