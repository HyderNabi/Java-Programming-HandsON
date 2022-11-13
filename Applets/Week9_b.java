import java.applet.*;
import java.awt.*;
import java.util.Random;
public class Week9_b extends Applet implements Runnable {
	
	String str;
	Thread th;
	int i;
	Font font = new Font("serif",Font.PLAIN,25);
	@Override 
	public void init()
	{
		str  = "Hi i am Hyder Nabi";
		i = str.length();
	}
	public void start()
	{
		th = new Thread(this);
		th.start();
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
		g.setFont(font);
		char ch;
		i--;
		ch = str.charAt(i);
		
		g.drawString(Character.toString(ch),100,100); 
		if(i == 0)
		{
			i = str.length();
		}
	}
}
/* <applet code = Week9_b width = 500 height = 500 ></applet> */