package GUI;
import java.awt.*;
import java.awt.event.*;
class _ComponentEvent implements ContainerListener,ComponentListener
{
	Frame f;
	public _ComponentEvent()
	{
		TextField tf = new TextField("Hello there !");
		f = new Frame();
		f.addContainerListener(this);
		f.addComponentListener(this);
		f.setSize(300, 300);
		f.setVisible(true);
		f.add(tf);
		f.remove(tf);
		//f.setVisible(false);
		
	}

	@Override
	public void componentAdded(ContainerEvent e) {
		System.out.println("Component Added");
		
	}

	@Override
	public void componentRemoved(ContainerEvent e) {
		
		System.out.println("Component Removed");
	}

	@Override
	public void componentResized(ComponentEvent e) {
		System.out.println("Component Resized");
	}

	@Override
	public void componentMoved(ComponentEvent e) {
		System.out.println("Component Moved");
		
	}

	@Override
	public void componentShown(ComponentEvent e) {
		System.out.println("Component Shown");
		
	}

	@Override
	public void componentHidden(ComponentEvent e) {
		System.out.println("Component Hidden");
		
	}
	
}
public class ComponentEvents {

	public static void main(String[] args) {
		new _ComponentEvent();

	}

}
