package IO;
import java.io.*;
public class ReadingConsoleInput {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//READ CHARACTER
		char c[] = new char[100];
		try {
			System.out.println("Enter a Character: ");
			int i=-1;
			do {
				i++;
				c[i] =  (char) reader.read();
			}while(c[i]!= '1');
		}catch(IOException e) {}
		System.out.println(c);
	
	}

}
