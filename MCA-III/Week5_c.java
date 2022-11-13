package javaLabWork;
import java.util.*;
class myExp extends Exception{
	String msg;
	myExp(String msg){
		this.msg = msg;
	}
	@Override
	public String toString() {
		return msg;
	}
	
}
public class Week5_c {
	public static void div(int a, int b) throws myExp
	{
		if (b == 0)
		{
			throw new myExp("Denominator Can't be 0 !!!");
		}else if(b<0){
			throw new myExp("Denominator Can't be Negative !!!");
		}
		else if(b>a) {
			throw new myExp("Denominator Can't be Greater than Numrator !!!");
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
		
		try {
			div(a,b);
		}catch(myExp e) {
			System.out.println("Exception Occured : "+e);
		}

	}

}
