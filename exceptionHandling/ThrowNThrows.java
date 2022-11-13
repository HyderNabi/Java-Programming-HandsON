package exceptionHandling;

public class ThrowNThrows {
	public static void ExcThrow(boolean arg) throws IllegalAccessException,InstantiationException
	{
		if(arg == true)
			throw new IllegalAccessException("Access to a Class is denied");
		else throw new InstantiationException("You can't create an object of an abstract class");
			// unhandled exception types
			//need to mention in the throws list
	}

	public static void main(String[] args) {
		try {
			ExcThrow(false);
		}catch(IllegalAccessException r) {
			System.out.println(r);
		}
		catch(InstantiationException e) {
			System.out.println(e);
		}

	}

}
