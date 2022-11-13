
import java.net.*;
public class client {
	public static int C_port = 999;
	public static int S_port = 998;
	public static int buffer_size = 1024;
	public static DatagramSocket ds;
	public static byte buffer[] = new byte[buffer_size];
	
		public static void TheClient() throws Exception {
		while(true) {
		DatagramPacket p = new DatagramPacket(buffer, buffer.length);
		ds.receive(p);
		//System.out.println(new String(p.getData(), 0, p.getLength()));
		System.out.println(new String(p.getData()));
		}
		}
	
	public static void main(String[] args) throws Exception {
		ds = new DatagramSocket(C_port);
		TheClient();
	}

}