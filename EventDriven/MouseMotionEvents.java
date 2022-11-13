import java.awt.event.*;
import java.awt.*;
import java.applet.Applet;
public class MouseMotionEvents extends Applet implements MouseMotionListener {
		String msg;
		int x;
		int y;
		@Override
		public void init()
		{
			msg = "Hello";
			x = 10;
			y = 10;
			addMouseMotionListener(this);
		}
		@Override
		public void mouseDragged(MouseEvent e) {
			
			x = e.getX();
			y = e.getY();
			msg = "*";
			repaint();
			showStatus("Dragged");
		}
		@Override
		public void mouseMoved(MouseEvent e) {
			x = e.getX();
			y = e.getY();
			msg = "Hyder Nabi";
			repaint();
		}
		@Override
		public void paint(Graphics g)
		{
			g.drawString(msg, x, y);
		}
}
	
//<applet code = MouseMotionEvents width = 600 height = 600></applet>