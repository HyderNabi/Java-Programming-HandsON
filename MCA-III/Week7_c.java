package javaLabWork;
import java.util.Scanner;
public class Week7_c {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		
		System.out.print("Enter String:");
		String str = scan1.nextLine();
		System.out.print("Enter Character:");
		char targetChar = scan2.next().charAt(0);
		int counter = 0;
	
		
		
		for(int i = 0;i<str.length();i++){
			if(str.charAt(i) == targetChar) {
				counter ++;
			}
		}
		System.out.println("The Frequency of '"+targetChar+"' in the Given String is : " + counter);

	}

}
