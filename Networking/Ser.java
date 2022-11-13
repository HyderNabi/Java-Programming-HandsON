import java.io.*;
import java.net.*;
public class Ser {
	public static void main(String args[])
	{
		try {
			ServerSocket s = new ServerSocket(999);
			Socket ss = s.accept();
			BufferedReader reader = new BufferedReader(new InputStreamReader(ss.getInputStream()));
		
			System.out.print(reader.readLine());
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
