import java.awt.event.*;
import java.awt.*;
import java.applet.Applet;
public class MouseWheelEvents extends Applet implements MouseWheelListener {
		String msg;
		int x;
		int y;
		@Override
		public void init()
		{
			msg = "Hello";
			x = 10;
			y = 10;
			addMouseWheelListener(this);
		}
		@Override
		public void paint(Graphics g)
		{
			g.drawString(msg, x, y);
		}
		@Override
		public void mouseWheelMoved(MouseWheelEvent e) {
			//double i = e.getPreciseWheelRotation();
			//showStatus(Double.toString(i));
			
			int i = e.getScrollType();
			showStatus(Integer.toString(i));
		}
}
	
//<applet code = MouseWheelEvents width = 600 height = 600></applet>