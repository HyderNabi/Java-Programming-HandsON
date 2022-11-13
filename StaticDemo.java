
public class StaticDemo {
	//instance variables declared as static are essentially global variables
	static int a = 4;
	static int b;
	public static void me(int x)
	{
		System.out.println(x);
		System.out.println(a);
		System.out.println(b);
	}
	static {
		b = a * 4;
	}
	public static void main(String[] args) {
		
		System.out.println("Working with Static Keyword");
		//StaticDemo.me();
		// OR
		// new StaticDemo().me;
		//OR
		me(99);
		
		System.out.println(++a);
	}

}
