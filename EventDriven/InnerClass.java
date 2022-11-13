import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class InnerClass extends Applet{
		String msg;
		int X,Y;
		@Override
		public void init() {
			msg = "";
			X = 0;
			Y = 0;
			MyMouseAdapter mma = new MyMouseAdapter();
			addMouseMotionListener(mma);
		}
		@Override 
		public void paint(Graphics o)
		{
			o.drawString(msg, X, Y);
		}
		@Override 
		public void update(Graphics g)
		{
			paint(g);
		}
		class MyMouseAdapter extends MouseMotionAdapter
		{
			@Override 
			public void mouseDragged(MouseEvent me)
			{
				X = me.getX();
				Y = me.getY();
				msg = ".";
				repaint();
			}
		}
}
//<applet code = InnerClass width = 500 height = 400></applet>