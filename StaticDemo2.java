class Person{
	public static double height;
	public static int age;
	//static {
	//	age = 90;
	//}
	public static void set(double h, int a)
	{
		height = h;
		age = a;
	}
	
	
}
public class StaticDemo2 {
	
	public static void main(String[] args) {
		
		new Person().set(5.6,34);
		
		//Person.height = 4.7;
		System.out.println(Person.height);
		System.out.println(Person.age);
		//Person ob = new Person();
		//System.out.println(ob.height);
		//ob.height++;
		//System.out.println(Person.height);
		
	}

}
