import java.net.*;
public class Week12_a_Client {
	public static int buffer_size = 1024;
	public static byte buffer[];
	public static DatagramSocket socket;
	public static DatagramPacket packet;
	
	public static void main(String[] args) {
		//Creating a Datagram Socket
		try {
			socket = new DatagramSocket(999);
			buffer = new byte[buffer_size];
			packet = new DatagramPacket(buffer, 0,InetAddress.getLocalHost(),998);
			
			int c;
			int index = 0;
			System.out.println("Type your message: ");
			while(true)
			{
				c = System.in.read();
				if(c == '\n') {
					System.out.println("The Length of the Message = "+index);
					packet.setLength(index);
					socket.send(packet);
					index = 0;
				}else if(c == '0')
				{
					//socket.unbound
					socket.close();
					break;
				}
				else
				{
					buffer[index++] = (byte)c;
				}
			}
			System.out.println("Connection Closed !!!");
		}catch(Exception se) {
			System.out.println("Exception Occured !!!" + se);
		}
		
	}

}