package Networking;
import java.net.*;
import java.io.*;
public class ClientSocket {

	public static void main(String[] args) throws Exception {
		int c;
		
		Socket socket = new Socket("whois.internic.net", 43);
		
		//getting input and output streams
		InputStream in = socket.getInputStream();
		OutputStream out = socket.getOutputStream();
		
		String str = "MHProfessional.com";
		
		//convert to bytes
		byte buf[] = str.getBytes();
		
		//send request
		out.write(buf);
		
		//read and display response
		while((c = in.read()) != -1) {
			System.out.print((char) c);
		}
		
		//close socket: it will automatically close its associated input and output streams
		
		//socket.close();

	}

}
