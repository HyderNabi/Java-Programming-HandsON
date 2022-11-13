import java.applet.Applet;
import java.awt.*;
public class Week9_a extends Applet {
	int a,b,sum = 0;
	String data;
	public void init()
	{
		//a = Integer.parseInt(getParameter("a"));//
		//b = Integer.parseInt(getParameter("b"));//
		a = 5;
		b = 89;
		sum = a+b;
		data = Integer.toString(sum);
	}
	@Override 
	public void paint(Graphics o)
	{
		o.drawString("The Sum is : " + data, 50, 50);
	}
}
/*
	<applet code = Week9_a width = 500 height = 500></applet>
*/
