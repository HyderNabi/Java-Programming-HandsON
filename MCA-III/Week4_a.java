package javaLabWork;
class A{
	private int pri_n = 5;
	public int pub_n = 10;
	protected int pro_n = 20;
	int def_n = 40;
	
	private void pri_method(){
		System.out.println("I am Private Method in Super Calss");
	}
	public void pub_method(){
		System.out.println("I am public Method in Super Calss");
	}
	void def_method(){
		System.out.println("I am default Method in Super Calss");
	}
	protected void pro_method(){
		System.out.println("I am Protected Method in Super Calss");
	}
	
}
class B extends A{
	
	//Shadowing Inherited Instance Variables
	public int pub_n = 1001;
	protected int pro_n = 2001;
	int def_n = 4001;
	//Overriding Inherited Methods
	public void pub_method(){
		System.out.println("I am public Method in BASE CLASS");
	}
	void def_method(){
		System.out.println("I am default Method in BASE CLASS");
	}
	protected void pro_method(){
		System.out.println("I am Protected Method in BASE CLASS");
	}
	
	void AccessSuperMembers()
	{
		//Accessing Members and Shadowing
		System.out.println("Accessing Instance Variables of Super Class");
		//System.out.println("Pri_n : " + super.pri_n);
		System.out.println("Pub_n : " + super.pub_n);
		System.out.println("Def_n : " + super.def_n);
		System.out.println("Pro_n : " + super.pro_n);
		
		System.out.println("Accessing Member Functions of Super Class");
		//super.pri_method();
		super.pub_method();
		super.def_method();
		super.pro_method();
	}
}
public class Week4_a {

	public static void main(String[] args) {
		new B().AccessSuperMembers();
		System.out.println("\nTrying to Access the Overridden Method of Class A in the Object of B\nIt will call always BASE Class's Method");
		A a = new B();
		a.pro_method();
		System.out.println("\nAccessing the Shadowed Instance member of Class B using Reference of type Class A");
		System.out.println("Value of Public Shadowed method in Class B = " + a.pub_n);
		

	}

}
