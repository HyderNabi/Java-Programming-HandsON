package exceptionHandling;

public class ChainedException {

	public static void main(String[] args) {
		try {
			//Master Exception
			NullPointerException np = new NullPointerException("The Top Level Exception !!");
			//Cause Exception
			ArithmeticException ae = new ArithmeticException("The Cause EXception !!!");
			np.initCause(ae);
			throw np;
		}catch(NullPointerException e) {
			System.out.println(e);
			System.out.println(e.getCause());
		}

	}

}
