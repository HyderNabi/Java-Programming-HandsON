package javaLabWork;
import java.util.*;
public class Week2_c {
	public static void main(String args[]) {
		int monthNumber;
		Scanner scanner = new Scanner(System.in);
		try {
		System.out.print("Enter Month Number = ");
		monthNumber = scanner.nextInt();
		
		}catch(InputMismatchException e) {
			System.out.println("Exception : Input Wasn't an Integer !!!");
			monthNumber = 0;
		}
		switch(monthNumber)
		{
		case 12:
		case 1:
		case 2:
			System.out.println("It's Winter");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("It's Spring");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("It's Spring");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("It's Autumn/Fall");
			break;
		default:
			System.out.println("Your input was Wrong !!");
			
		}
		
		
	}
}
