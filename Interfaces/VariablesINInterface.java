package Interfaces;
interface ME{
	//using interface variables as Constants, they are implicitly declared as FINAL
	//They can be used as Global Constants, like we used to do in C/C++ Header Declarations
	String Name = "HYDER NABI";
	int Age = 23;
	String IrisColor = "Brown";
	String HairColor = "Black";
	String ContactNo = "7006246837";
	String EMail = "hydernabi22@gmail.com";
	
}
class Haid implements ME{
	public void myInfo()
	{
		System.out.println("NAME = " + Name);
		System.out.println("AGE = " + Age);
		System.out.println("IRIS COLOR = " + IrisColor);
		System.out.println("HAIR COLOR = " + HairColor);
		System.out.println("CONTACT NUMBER = " + ContactNo);
		System.out.println("E-mial = " + EMail);
		
	}
}
public class VariablesINInterface {

	public static void main(String[] args) {
		Haid haid = new Haid();
		haid.myInfo();	
	}

}
