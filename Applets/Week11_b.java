import java.io.*;
public class Week11_b{

	public static void main(String[] args) {
		int c;
		FileInputStream fin = null;
		FileOutputStream fout = null;
	  /*if(args.length != 2)
		{
			System.out.println("USAGE: File Names Not Specified.");
			return;
		}*/
		try {
			fin = new FileInputStream("f2");//args[0]);
			fout = new FileOutputStream("f3");//args[1]);
			do {
				c = fin.read();
				if(c != -1)
					fout.write(c);
			}while(c != -1);
			System.out.println("File copied Successfully !!!");		
		}catch(FileNotFoundException f)
		{
			System.out.println("File not Found !!!");
		}catch(IOException e)
		{
			System.out.println("IO Exception Occured !!!");
		}
		finally
		{
			if(fin != null) {
				try {
					fin.close();
				}catch(IOException e)
				{
					System.out.println("Problem Occured while Closing input File !!!");
				}
			}
			if(fout != null) {
				try {
					fout.close();
				}catch(IOException e)
				{
					System.out.println("Problem Occured while Closing output File !!!");
				}
			}
		}

	}

}