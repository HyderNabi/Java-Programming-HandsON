import java.io.*;
import java.net.*;
public class CLi{
	public static void main(String args[])
	{
		try {
			Socket ss = new Socket("localhost",999);
			PrintWriter pw = new PrintWriter(ss.getOutputStream());
			pw.print("hello how are you");
		
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
