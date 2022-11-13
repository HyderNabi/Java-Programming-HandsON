class Outer{
	public String MyName = "Hyder Nabi";
	void display()
	{
		System.out.println("Inside Outer Class");
	}
	class InnerA{
		
		void display()
		{
			System.out.println("Inside InnerA Class");
		}
		
	}
	class InnerB{
		String MyAnoName = "Haidii";
		void display()
		{
			System.out.println("Inside InnerB Class");
		}
		
		class InnerB_InnerA{
			public String MyYetAnoName = "Haid :)";
			void display() {
				System.out.println("Inside InnerB_InnerA Class");
				System.out.println("My Name = " + Outer.this.MyName);
				System.out.println("My Another Name = " + Outer.InnerB.this.MyAnoName);
				System.out.println("My Yet Another Name = " + Outer.InnerB.InnerB_InnerA.this.MyYetAnoName);
			}
		}
	}
}
public class Shadowing {

	public static void main(String[] args) {
		
		//creating object of Outer Class
		Outer outer = new Outer();
		outer.display();
		
		//Creating object of the innerA class
		Outer.InnerA innerA = outer.new InnerA();
		innerA.display();
		
		//Creating object of the innerB class
		Outer.InnerB innerB = outer.new InnerB();
		innerB.display();
		
		//Creating object of the innerB_InnerA class
		Outer.InnerB.InnerB_InnerA inn = innerB.new InnerB_InnerA(); 
		inn.display();

	}

}
