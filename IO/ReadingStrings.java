package IO;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingStrings {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String str[] = new String[10];
		try {
			int i=-1;
			do {
				i++;
				str[i] = new String(reader.readLine());
			}while(!str[i].equals("stop"));
		}catch (IOException e) {}
		
	
	for(int i=0;i<str.length;i++)
	{
		System.out.println(str[i]);
	}
	}
}
