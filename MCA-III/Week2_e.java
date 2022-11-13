package javaLabWork;
import java.util.*;
public class Week2_e {
	public static long fact(long n) {
		if(n == 1) return 1;
		else return n*fact(n-1);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number = ");
		long n = scanner.nextInt();
		System.out.println("Factorial of "+ n +" = "+fact(n));
	}

}
