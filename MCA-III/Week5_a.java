package javaLabWork;
import java.util.*;
public class Week5_a {
	public static int div(int a, int b) throws ArithmeticException
	{
		return a/b;
	}
	public static void main(String[] args) {
		int a,b;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter First Integer : ");
		a = scan.nextInt();
		System.out.print("Enter Second Integer : ");
		b = scan.nextInt();
		
		try {
			System.out.println("The Division is = "+ div(a,b));
		}catch(ArithmeticException e)
		{
			System.out.println("Can not Divide by Zero "+e);
		}

	}

}
