import java.applet.*;
import java.awt.*;
import java.util.Random;
public class Applet2 extends Applet implements Runnable {
	
	String a;
	Thread t;
	@Override 
	public void init()
	{
		a  = "Hi i am Hyder Nabi and i am a good boy !!!";
	}
	public void start()
	{
		t = new Thread(this);
		t.start();
	}
	public void run()
	{
		while(true)
		{
			try {
				repaint();
				Thread.sleep(500);
			}catch(Exception e) {}
					
		}
	}
	@Override
	public void paint(Graphics g) {
		char ch;
		ch = a.charAt(0);
		a = a.substring(1,a.length());
		a+=ch;
		g.drawString(a,50,30); 
	}
}
/* <applet code = Applet2 width = 500 height = 500 ></applet> */