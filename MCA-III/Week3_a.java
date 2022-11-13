package javaLabWork;
class Student
{
	private long Enrollment_NO;
	private String name;
	private double age;
	private static long Object_Counter = 2004110000;
	Student()
	{
		Object_Counter ++;
		this.Enrollment_NO = Object_Counter;
	}
	public void Register(String name,double age)
	{
		if(age<4 || age>40)
		{
			System.out.println("Please Ensure the age between 4 to 40.");
		}
		else {
			this.age = age;
			this.name = name;
		}
	}
	protected void finalize()
	{
		Object_Counter --;
	}
	public static void CounterDec()
	{
		Object_Counter --;
	}
	void getDetails()
	{
		System.out.println("Name = " + this.name);
		System.out.println("Age = " + this.age);
		System.out.println("Enrollment No = " + this.Enrollment_NO);
		System.out.println("::::::::::::::::::::::");
		
	}
}
public class Week3_a {

	public static void main(String[] args) {
		
		Student student[] = new Student[10];
		student[0] = new Student();
		student[0].Register("Hyder Nabi",23);
		student[0].getDetails();
		
		student[1] = new Student();
		student[1].Register("Yasir Nazir",23.6);
		student[1].getDetails();
		
		student[2] = new Student();
		student[2].Register("Adil Amin",24);
		student[2].getDetails();
		
		Student.CounterDec();
		System.out.println("Object Deleted");
		
		student[3] = new Student();
		student[3].Register("Shahid Ahmad", 29);
		student[3].getDetails();
	}

}
