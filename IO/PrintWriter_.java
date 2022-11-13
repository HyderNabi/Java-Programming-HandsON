package IO;
import java.io.*;
public class PrintWriter_ {

	public static void main(String[] args) {
			PrintWriter wr = new PrintWriter(System.out);
			wr.println("hello dear");
			wr.print("how are you\n");
			wr.append("j;lskdfj\n");
			wr.write("jks;ldkfjsa;lk");
			wr.flush();
	}

}
