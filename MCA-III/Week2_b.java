package javaLabWork;
import java.util.*;
public class Week2_b {
	public static void main(String args[]) {
		int a = 0,b = 0,sum = 0;
		try {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter First Number = ");
		a = scanner.nextInt();
		System.out.print("Enter Second Number = ");
		b = scanner.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("Exception : Input Wasn't an Integer !!!");
		}
		sum = a + b;
		System.out.println("Sum = " + sum);
		
	}
}
