import java.awt.event.*;
import javax.swing.BoxLayout;

import java.awt.*;
import java.applet.Applet;
public class AdjustmentEvents extends Applet implements AdjustmentListener {
		String msg,msg2;
		int x;
		int y;
		Scrollbar sc;
		@Override
		public void init()
		{
			msg = "Hello";
			msg2 = "lskj";
			x = 10;
			y = 10;
			setLayout(new BorderLayout());
			sc = new Scrollbar();
			sc.addAdjustmentListener(this);
			add(sc,BorderLayout.EAST);
			
		}
		@Override
		public void paint(Graphics g)
		{
			g.drawString(msg, x, y);
			g.drawString(msg2, 50, 50);
		}
		@Override
		public void adjustmentValueChanged(AdjustmentEvent e) {
			showStatus("scrolling");
			msg =Integer.toString(e.getValue()); 
			msg2 =Integer.toString(e.getAdjustmentType()); 
			repaint();
			
			
		}
		
}
	
//<applet code = AdjustmentEvents width = 600 height = 600></applet>