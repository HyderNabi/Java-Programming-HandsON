abstract class Figure{
	int side1;
	int side2;	
	Figure(int a,int b)
	{
		side1 = a;
		side2 = b;
	}
	abstract public double _area();
}
class _Square extends Figure{
	_Square(int a, int b){
		super(a,b);
	}
	public double _area(){
		System.out.println("Area of Square : ");
		return side1 * side2;
	}
}
class Triangle extends Figure{
	Triangle(int a, int b){
		super(a,b);
	}
	public double _area()
	{
		System.out.println("Area of Triangle : ");
		return (side1 * side2) / 2;
	}
	
	
}
public class AbstractEx {

	public static void main(String[] args) {
		Figure fig;
		
		Triangle t = new Triangle(10,5);
		_Square s = new _Square(10,5);
		
		//late OR dynamic binding or dynamic dispatch
		fig = t;
		System.out.println(fig._area());
		fig = s;
		System.out.println(fig._area());
		
	}

}
