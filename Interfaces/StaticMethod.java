package Interfaces;
interface staticM{
	void message();
	static void callMe()
	{
		System.out.println("I am Static methos inside an interface");
	}
}
public class StaticMethod implements staticM {

	public static void main(String[] args) {
		staticM.callMe();
		staticM ob;
		StaticMethod a = new StaticMethod();
		ob = a;
		ob.message();

	}
	public void message() {
		System.out.println("Hello Dear !!");
	}

}
