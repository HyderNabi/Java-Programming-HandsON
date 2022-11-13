import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class AnonymousInnerClass extends Applet{
		String msg;
		int X,Y;
		@Override
		public void init() {
			msg = "";
			X = 0;
			Y = 0;
			addMouseMotionListener(new MouseMotionAdapter() {
				@Override 
				public void mouseDragged(MouseEvent me)
				{
					X = me.getX();
					Y = me.getY();
					msg = "HYDER NABI";
					repaint();
				}
					
					
			});
			
			addMouseListener(new MouseAdapter() {
				@Override 
				public void mouseClicked(MouseEvent me)
				{
					X = me.getX();
					Y = me.getY();
					msg = "HYDER NABI";
					repaint();
				}
					
					
			});
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
		
}
//<applet code = AnonymousInnerClass width = 500 height = 400></applet>