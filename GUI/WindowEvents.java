package GUI;
import java.awt.event.*;
import java.awt.*;
class WindowDemo implements WindowListener{
	Frame f;
	WindowDemo()
	{
		f = new Frame();
		f.setSize(400, 400);
		f.setVisible(true);
		f.addWindowListener(this);
	}
	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("Opened");
		
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Being Closed");
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Closed");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	System.out.println("Iconified");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Deiconified");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("Activated");
		
	}

	
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("DeActivated");
		
	}
}

public class WindowEvents{
		public static void main(String args[]) {
			new WindowDemo();
		}

		
}
	