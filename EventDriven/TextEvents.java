import java.awt.event.*;
import java.awt.*;
import java.applet.Applet;
public class TextEvents extends Applet implements TextListener {
		String msg;
		int x;
		int y;
		TextField tf;
		@Override
		public void init()
		{
			msg = "";
			x = 10;
			y = 10;
			tf = new TextField();
			tf.setText("I AM HYDER NABI");
			add(tf);
			tf.addTextListener(this);
		}
		@Override
		public void paint(Graphics g)
		{
			g.drawString(msg, x, y);
		}
		
		@Override
		public void textValueChanged(TextEvent e) {
			showStatus("text Changed");
			
		}
}
	
//<applet code = TextEvents width = 600 height = 600></applet>