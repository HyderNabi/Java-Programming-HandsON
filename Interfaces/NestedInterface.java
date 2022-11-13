package Interfaces;
class Outer{
	//declaring a member interface inside a class
	interface inner{
		void doWork();
	}
}
//declaring a member interface inside interface
interface OuterII{
	interface innerII{
		void doAnothrWork();
	}
}
class clsA implements Outer.inner,OuterII.innerII{
	//implementing a member interface
	public void doWork() {
		System.out.println("Implementing a Member Interface within Class");
	}
	public void doAnotherWork() {
		System.out.println("Implementing a Member Interface within Interface");
	}
}

public class NestedInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.inner ob;
		clsA a = new clsA();
		ob = a;
		a.doWork();
		
		OuterII.innerII ob2;
		ob2 = a;
		a.doAnotherWork();

	}

}
