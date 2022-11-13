package javaLabWork;

public class Week7_a {

	public static void main(String args[]) {
		int len = args.length;
		
		System.out.println(args[0]);
		
		int counter = 0;
		
		for(int i=0;i<args[0].length();i++) {
			if(args[0].charAt(i) == ' ') {
				counter++;
			}
		}
		System.out.println("The total number of words in the String is = " + ++counter);
	}

}
