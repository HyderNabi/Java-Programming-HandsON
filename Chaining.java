class ChainDemo{
	private int a;
	private int  b;
	public ChainDemo seta(int a)
	{
		this.a = a;
		return this;
	}
	public ChainDemo setb(int b){
		this.b = b;
		return this;
	}
	void display()
	{
		System.out.println("a = " +a);
		System.out.println("b = " +b);
	}
	
}
public class Chaining {

	public static void main(String args[])
	{
		ChainDemo ob = new ChainDemo(); 
		//ob.seta(45).setb(56).display();
		ob.seta(12);
		ob.setb(45);
		ob.display();
	}
}
