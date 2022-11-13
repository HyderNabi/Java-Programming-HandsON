final class A
{
	
	final void show()
	{
		System.out.println("Hello i am from SuperClass");
	}
}
/*class B extends A{ // ERROR... A can't be extended 
	void show()
	{
		//super.show(); // ERROR... show() can't be overridden.
		System.out.println("Hello i am from SubClass");
	}
}*/
public class FinalEx {

	public static void main(String[] args) {
		//B ob = new B();
		//ob.show();

	}

}
