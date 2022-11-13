/* initialize the object with already existing object */
class Box
{
	double length;
	double breadth;
	Box(double l,double b)
	{
		this.length = l;
		this.breadth = b;
	}
	Box(Box ob)
	{
		this.length = ob.length ;
		this.breadth = ob.breadth ;
	}
	void showDimensions()
	{
		System.out.println("length = " + this.length + " Breadth = " + this.breadth);
	}
}
public class ObjArg {

	public static void main(String[] args) {
		Box box1 = new Box(10,6);
		box1.showDimensions();
		
		//assign box1 to box2;
		Box box2 = new Box(box1);
		box2.showDimensions();
		
		

	}

}
