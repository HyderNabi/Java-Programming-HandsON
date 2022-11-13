import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
public class Week12_b_Server {
	public static int buffer_size = 1024;
	public static int Client_Port = 901;
	public static int Server_Port = 900;
	public static byte[] buffer1;
	public static byte[] buffer2;
	public static DatagramSocket socket;
	public static DatagramPacket packet;
	
	public static void Send() throws Exception
	{
		int byte_c;
		int index = 0;
		while(true) {
			if(index == 0)
			{
				System.out.print("SENT : ");
			}
			byte_c = System.in.read();
			if(byte_c == '\n')
			{
				//index --> length of the packet(no of bytes in the packet)
				packet.setLength(index);
				socket.send(packet);
				index = 0;
				break;
			}else if(byte_c == '0')
			{
				socket.close();
				break;
				
			}else
			{
				//store the byte in the buffer
				buffer1[index++] = (byte)byte_c;
			}
		}
		
		
	}
	
	public static void Recieve() throws Exception
	{

		DatagramPacket p = new DatagramPacket(buffer2, buffer2.length);
		socket.receive(p);
		int length = p.getLength();
		System.out.println("RECIEVED : "  +new String(p.getData(),0,length));
	}
	
	//Client Server
	public static void main(String args[]) throws Exception {
		
		buffer1 = new byte[buffer_size];
		buffer2 = new byte[buffer_size];
		socket = new DatagramSocket(Server_Port);
		packet = new DatagramPacket(buffer1, buffer_size, InetAddress.getLocalHost(),Client_Port);
		
		while(true)
		{ 
			Send();
			if(socket.isClosed()) {
				break;
			}
			Recieve();
			
		}
		System.out.println("Socket Closed !!!");
	}
}
