import java.applet.*;
import java.awt.*;
import java.awt.event.*;
class MyAdapter extends MouseAdapter
{
	MouseAdapterDemo mad;
	public MyAdapter(MouseAdapterDemo a)
	{
		this.mad = a;
	}
	@Override
	public void mouseClicked(MouseEvent me)
	{
		mad.showStatus("Mouse Clicked Successfully");
	}
}
public class MouseAdapterDemo extends Applet{
	@Override
	public void init()
	{
		MyAdapter ma = new MyAdapter(this);
		addMouseListener(ma);
	}
}
//<applet code = MouseAdapterDemo width = 500 height = 400></applet>