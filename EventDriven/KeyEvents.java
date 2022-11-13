import java.awt.event.*;
import java.awt.*;
import java.applet.Applet;
public class KeyEvents extends Applet implements KeyListener {
		String msg;
		int x;
		int y;
		@Override
		public void init()
		{
			msg = "";
			x = 10;
			y = 10;
			addKeyListener(this);
		}
		@Override
		public void paint(Graphics g)
		{
			g.drawString(msg, x, y);
		}
		@Override
		public void keyPressed(KeyEvent ke)
		{
			//showStatus("Pressed");
		}
		@Override
		public void keyReleased(KeyEvent ke)
		{
		//	showStatus("Released");
		}
		@Override
		public void keyTyped(KeyEvent ke)
		{
			msg += Character.toString(ke.getKeyChar());
			showStatus(Integer.toString(ke.getKeyCode()));
			repaint();
		}
}
	
//<applet code = KeyEvents width = 600 height = 600></applet>