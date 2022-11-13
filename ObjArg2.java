/* Check Whether two objects are same or not */
class BoxA
{
	double length;
	double breadth;
	BoxA(double l,double b)
	{
		this.length = l;
		this.breadth = b;
	}
	
	boolean cloneOf(BoxA ob)
	{
		if(this.length == ob.length && this.breadth == ob.breadth)
			return true;
		else
			return false;
	}
}
public class ObjArg2 {

	public static void main(String[] args) {
		BoxA box1 = new BoxA(10,6);
		BoxA box2 = new BoxA(20,7);
		BoxA box3 = new BoxA(20,7);
		
		
		if(box3.cloneOf(box2) == true)
			System.out.println("Objects are Same");
		else
			System.out.println("Objects are not Same");
		
		

	}

}
