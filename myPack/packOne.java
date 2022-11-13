package myPack;

public class packOne {
	int i = 5;
	public int  i_pub = 4;
	private int i_pri = 23;
	protected int i_pro = 67;
	public packOne()
	{
		System.out.println("From the PackOne");
		System.out.println("i = " + i);
		System.out.println("i_pub = " + i_pub);
		System.out.println("i_pri = " + i_pri);
		System.out.println("i_pro = " + i_pro);
		
	}
	
}

