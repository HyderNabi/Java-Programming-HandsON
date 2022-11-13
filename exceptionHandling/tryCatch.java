package exceptionHandling;

public class tryCatch {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int a;
		try {
			a = arr[34];
			a = arr[4] / (arr[4]-arr[4]);
		}catch(Exception e) { //ArithmeticException | ArrayIndexOutofBoundsException
			System.out.println(e);
		}
		
	}

}
