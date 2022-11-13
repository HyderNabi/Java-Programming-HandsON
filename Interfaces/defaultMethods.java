package Interfaces;
interface shape{
	void dimensions();
	default void area()
	{
		System.out.println("Not Qualified");
	}
	default void circumference() {
		System.out.println("Not Qualified");
	}
	default void perimeter() {
		System.out.println("Not Qualified");
	}
	double PI = 3.14;
}

class obangle implements shape{
	private double len;
	private double bred;
	public obangle(double length, double breadth)
	{
		this.len = length;
		this.bred = breadth;
	}
	public void dimensions()
	{
		System.out.println("Length = " + this.len + " Breadth = " + this.bred);
	}
	public void area() {
		System.out.println("Area = " + this.len * this.bred);
	}
	public void perimeter()
	{
		System.out.println("Perimeter = " + 2 * (this.len + this.bred));
	}
	
	
}


class circle implements shape{
	private double radius;
	
	public circle(double radius)
	{
		this.radius = radius;
	}
	public void dimensions()
	{
		System.out.println("Radius = " + this.radius);
	}
	public void area() {
		System.out.println("Area = " + PI * this.radius * this.radius);
	}
	public void circumference()
	{
		System.out.println("Circumference = " + 2 * PI * this.radius);
	}
	
	
}

public class defaultMethods {

	public static void main(String[] args) {
		shape ob = new obangle(10,5);
		ob.dimensions();
		ob.area();
		ob.circumference();
		ob.perimeter();
		
		ob = new circle(10);
		ob.dimensions();
		ob.area();
		ob.circumference();
		ob.perimeter();
		
		
	}

}
