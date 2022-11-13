package IO;

import java.io.*;

public class BufferedOutput {

	public static void main(String[] args) {
		try {
			int i;
			FileInputStream fin = new FileInputStream("D:\\data.txt");
			BufferedInputStream bi = new BufferedInputStream(fin);
		//	do {
				//i = bi.read();
				//System.out.print((char)i);
			//}while(i != -1);
			
			byte[] b = new byte[bi.available()];
			bi.read(b);
			System.out.println(new String(b));
			for(byte k:b)
			{
				System.out.print((char)k);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
