import java.io.*;
public class Week11_a{

	public static void main(String[] args) {
		int c;
		int count = 0;
		FileInputStream fin = null;
	  /*if(args.length != 1)
		{
			System.out.println("USAGE: File Name Not Specified.");
			return;
		}*/
		try {
			fin = new FileInputStream("f1");//args[0]);
			do {
				c = fin.read();
				if((char)c == ' ')
				{
					count++;
				}
					
			}while(c != -1);			
			System.out.println("Total number of words in the file = "+count);
		}catch(FileNotFoundException f)
		{
			System.out.println("File not Found !!!");
		}catch(IOException e)
		{
			System.out.println("IO Exception Occured !!!");
		}finally{
			if(fin != null) {
				try {
					fin.close();
				}catch (IOException e) {
					System.out.println("Problem Occured while Closing File !!!");
				}
			}
		}
	}

}