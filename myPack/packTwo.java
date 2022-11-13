package myPack;

public class packTwo extends packOne {
	packTwo(){
	System.out.println("From the PackTwo");
	System.out.println("i = " + i);
	System.out.println("i_pub = " + i_pub);
	//Private can't be accessed here
	//System.out.println("i_pri = " + i_pri);
	System.out.println("i_pro = " + i_pro);
	
	}
}
