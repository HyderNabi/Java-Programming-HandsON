package Networking;
import java.awt.*; 
public class SimpleTalk{
	public static Frame TopFrame;
	public static Panel Wrapper;
	public static void main(String[] args) {
		//Top Level Frame
		TopFrame = new Frame();
		TopFrame.setSize(new Dimension(500,700));
		TopFrame.setTitle("Top Level Frame");
		TopFrame.setVisible(true);
	}

}
