import java.net.*;
public class Week12_a_Server {
	public static int buffer_size = 1024;
	public static byte buffer[];
	public static DatagramSocket socket;
	public static DatagramPacket packet;
	public static String msg;
	
	public static void main(String[] args) {
		//Creating a Datagram Socket
		try {
			socket = new DatagramSocket(998);
			buffer = new byte[buffer_size];
			packet = new DatagramPacket(buffer, buffer_size);
			
		
			
			while(true)
			{
				socket.receive(packet);
				System.out.println("The length of message = "+packet.getLength());
				msg = new String(packet.getData(),0,packet.getLength());
				System.out.println(msg);
			}
			
		}catch(Exception se) {
			System.out.println("Exception Occured !!!" + se);
		}
		
	}

}