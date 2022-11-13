package javaLabWork;
import java.util.Scanner;
public class Week7_d {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter String : ");
		String str = scan.nextLine();
		
		char arr[] = new char[str.length()];
		for(int i=0;i<str.length();i++) {
			arr[i]= str.charAt(i);
			System.out.println("arr["+i+"] = " + arr[i]);
		}
		
		
	}
}
