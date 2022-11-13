package Interfaces;
interface First{
	void method1() ;
	void method2() ;
}
interface Second extends First{
	void method3();
}
class myClass implements Second{
	public void method3()
	{
		System.out.println("Inside method 3");
	}
	public void method1()
	{
		System.out.println("Inside method 1");
	}
	public void method2()
	{
		System.out.println("Inside method 2");
	}
}
public class ExtendInterface {
	public static void main(String args[])
	{
		First ob = new myClass();
		ob.method1();
		ob.method2();
		Second ob2 = new myClass();
		ob2.method3();
	}
	
}
