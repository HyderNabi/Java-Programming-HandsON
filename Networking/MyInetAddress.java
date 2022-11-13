package Networking;
import java.net.*;
public class MyInetAddress {

	public static void main(String[] args) throws UnknownHostException {
		
		byte[] addr = new byte[4];
		
		String ad = "192.168.29.175";
		String[] str = ad.split("\\.");

		for(int i = 0;i<str.length;i++)
		{
			
			addr[i] = (byte)Integer.parseInt(str[i]);
		}
		
	//	System.out.println(str[0]);
		
		
		//Return Local Host Address
		InetAddress address = InetAddress.getLocalHost();
	System.out.println("Local Address = "+address);
		
	//	InetAddress loopback = InetAddress.getLoopbackAddress();
	//	System.out.println("Loopback Address = " +loopback);
		
	//	address = InetAddress.getByName("www.HerbSchildt.com");
	//	System.out.println(address);
		
		InetAddress address2 = InetAddress.getByAddress(addr);
		System.out.println("Address Objec by Address : "+address2);
		
	//	byte[] ad = address.getAddress(); 
	//	System.out.println("Only Address [in byte array] = "+ad);
		
	//	String add = address.getHostAddress(); 
	//	System.out.println("Only Address [in String] = "+add);
		
	//	String name = address.getHostName(); 
	//	System.out.println("Only Host name = "+name);
		
	//	boolean ismulticast = address.isMulticastAddress();
	//	System.out.println("isMulticastAddress = "+ismulticast);
		
		
	}

}
