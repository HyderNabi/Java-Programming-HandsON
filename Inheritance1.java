class ClosedFigure
{
	protected double length;
	protected double breadth;
	ClosedFigure(){}
	ClosedFigure(double length,double breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	public void showDimen()
	{
		System.out.println("Length = " + this.length + "\nBreadth = " + this.breadth);
	}
}
class Square extends ClosedFigure{
	Square(double side)
	{
		//calling the constructor of ClosedFigure class
		super(side,side);
	}
	public void perimeter()
	{
		System.out.println("The perimeter of Square = " + (2 * (super.length + super.breadth)));
	}
	public void showDimen()
	{
		System.out.println("Length = " + super.length + "\nBreadth = " + super.breadth);
	}
	
	
	
}
class Cuboid extends ClosedFigure
{
	private double height;
	Cuboid(double length,double breadth,double height)
	{
		super(length,breadth);
		this.height = height;
	}
	public void volume()
	{
		System.out.println("The Volume of Cuboid = " + (super.length * super.breadth * this.height));
	}
	public void showDimen()
	{
		System.out.println("Length = " + super.length + "\nBreadth = " + super.breadth + "\nHeight = " + this.height);;
	}
}
public class Inheritance1 {

	public static void main(String[] args) {		
		Square square = new Square(10);
		
		System.out.println("Perimeter of Square");
		square.perimeter();
		System.out.println("Dimensions of Square");
		square.showDimen();
		
		Cuboid cuboid = new Cuboid(5,3,4);
		System.out.println("Volume of Cuboid");
		cuboid.volume();
		System.out.println("Dimensions of Cuboid");
		cuboid.showDimen();
		

	}

}
