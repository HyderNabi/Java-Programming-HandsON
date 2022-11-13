import java.applet.Applet;
import java.awt.*;
public class _Graphics extends Applet {
	public void init()
	{
		setBackground(Color.gray);
	}
	public void paint(Graphics o) {
		
		o.drawOval(50,50,400,400);
	}
}
/*
 	<applet code = _Graphics width = 500 height = 500></applet>
 */
 