import java.awt.event.*;
import java.awt.*;
import java.applet.*;
public class FocusEvents extends  Applet implements FocusListener {
	TextField tf;
	@Override
	public void init()
	{
		tf = new TextField();
		add(tf);
		tf.addFocusListener(this);
	}
	public void paint()
	{
		
	}
	@Override
	public void focusGained(FocusEvent e) {
		showStatus("Focus Gained");		
	}
	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		showStatus("Focus Lost");
	}
}
//<applet code = FocusEvents width = 600 height = 600></applet>