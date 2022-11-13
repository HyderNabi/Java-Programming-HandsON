package IO;

import java.io.*;

public class BufferedInput {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("D:\\data.txt");
			BufferedOutputStream bo = new BufferedOutputStream(fout);
			String str = "hello i am hyder nabi here talking to oyou ....";
			byte[] buf = str.getBytes();
			bo.write(buf);
			bo.flush();
			bo.close();
			fout.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
