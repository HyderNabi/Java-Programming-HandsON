package javaLabWork;
import java.util.*;
class DemOne extends Exception{
	String msg;
	DemOne(String msg){
		this.msg = msg;
	}
	@Override
	public String toString() {
		return msg;
	}
	
}
public class Week5_b {
	public static void div(int a, int b) {
		if (b == 1)
		{
			try {
				DemOne exp = new DemOne("The Denominator is 1.");
				throw exp;
			}catch(DemOne e)
			{
				System.out.println("Exception Occured : "+ e);
			
			}
		}
		else {
			System.out.println("The Division = " + a/b);
		}
		
	}
	public static void main(String[] args) {
		int a,b;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter First Integer : ");
		a = scan.nextInt();
		System.out.print("Enter Second Integer : ");
		b = scan.nextInt();
		div(a,b);
		

	}

}
