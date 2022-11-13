package GUI;
import java.awt.*;

public class BasicGUI {

	public static void main(String[] args) {
	Frame frame = new Frame();
	frame.setSize(500, 500);
	frame.setTitle("This is my Demo Frame");
	frame.setLayout(new FlowLayout());
	TextField tf = new TextField();
	
	String a = tf.getText();
	
	frame.add(tf);
	frame.setVisible(true);
	}

}
