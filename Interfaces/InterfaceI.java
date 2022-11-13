package Interfaces;
interface workStatus{
	void putWorkStatus();
}
class A implements workStatus{
	public void  putWorkStatus() {
		System.out.println("I am working ... ");
	}
}
class B implements workStatus{
	public void putWorkStatus() {
		System.out.println("I am doing Rest ...");
	}
}
//Partial Interfaces
abstract class C implements workStatus{
	public void myMethod() {
		System.out.println("I am inside my own method");
	}
}
class D extends C{
	//implementing putWorkStatus method of workStatus interface
	public void putWorkStatus()
	{
		System.out.println("I am inside class D ...");
	}
}
public class InterfaceI {
	public static void main(String args[])
	{
		workStatus ws;
		A a = new A();
		B b = new B();
		D d = new D();
		//Dynamic Dispatch
		ws = a;
		ws.putWorkStatus();
		ws = b;
		ws.putWorkStatus();
		
		ws = d;
		ws.putWorkStatus();
	}
}
