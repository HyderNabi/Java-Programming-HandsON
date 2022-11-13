package applets;
import java.applet.Applet;
import java.awt.Graphics;

public class helloApplet extends Applet{

	@Override
	public void paint(Graphics g) {
		g.drawString("lskdjfsald", 25,25);
	}
}

/*
 * <applet code = helloApplet height = 200 width = 300> </applet> 
 */
