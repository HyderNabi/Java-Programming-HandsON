package myPack;

public class packThree {

	packThree()
	{
		packOne packone = new packOne();
		System.out.println("From the PackThree");
		System.out.println("i = " + packone.i);
		System.out.println("i_pub = " + packone.i_pub);
		//Private can't be accessed here
		//System.out.println("i_pri = " + packone.i_pri);
		System.out.println("i_pro = " +packone. i_pro);
	}
}
