import java.awt.event.*;
import java.awt.*;
import java.applet.Applet;
public class ActionEvents extends Applet implements ActionListener {
		String msg;
		int x;
		int y;
		Button b1,b2;
		@Override
		public void init()
		{
			msg = "Hello";
			x = 10;
			y = 10;
			b1 = new Button("Click me");
			b2 = new Button("Click me too");
			b1.addActionListener(this);
			b2.addActionListener(this);
			add(b1);
			add(b2);
		}
		@Override
		public void paint(Graphics g)
		{
			g.drawString(msg, x, y);
			
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == b1) {
				msg = "i am Hyder nabi";
				x = 50;
				y = 50;
			}
			else if(e.getSource() == b2)
			{
				msg = "i am a good boy";
				x = 30;
				y = 30;
			}
			showStatus(e.getActionCommand());
			repaint();
		}
		
		
}
	
//<applet code = ActionEvents width = 600 height = 600></applet>