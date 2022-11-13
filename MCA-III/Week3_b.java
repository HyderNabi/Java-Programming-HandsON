package javaLabWork;
class OverLoad{
	public int sum(int a,int b) {
		return a+b;
	}
	public double sum(double a,double b) {
		return a+b;
	}
}
public class Week3_b {

	public static void main(String[] args) {
		OverLoad a = new OverLoad();
		System.out.println("Floating Point Sum = " + a.sum(4.7, 7.8));
		System.out.println("Integer Sum = " + a.sum(15, 8));

	}

}
