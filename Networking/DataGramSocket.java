package Networking;
import java.net.*;
public class DataGramSocket {
	public static int C_port = 999;
	public static int S_port = 997;
	public static int buffer_size = 1024;
	public static DatagramSocket ds;
	public static byte buffer[] = new byte[buffer_size];
	public static void Server() throws Exception
	{
		int pos=0;
		while (true) {
		int c = System.in.read();
		switch (c) {
		case -1:
		System.out.println("Server Quits.");
		ds.close();
		return;
		case '\r':
		break;
		case '\n':
		ds.send(new DatagramPacket(buffer,pos,InetAddress.getLocalHost(),C_port));
		pos=0;
		break;
		default:
		buffer[pos++] = (byte) c;
		}
		}
		}
		public static void TheClient() throws Exception {
		while(true) {
		DatagramPacket p = new DatagramPacket(buffer, buffer.length);
		ds.receive(p);
		System.out.println(new String(p.getData(), 0, p.getLength()));
		
		}
		}
	
	public static void main(String[] args) throws Exception {
		ds = new DatagramSocket(S_port);
		Server();
	}

}
