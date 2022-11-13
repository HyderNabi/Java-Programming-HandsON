package exceptionHandling;
public class try_catch_finally {

	public static void main(String[] args) {
		
		try {
			
			try {
				throw new TypeNotPresentException("type not found", null);
			}catch(NullPointerException e){
				System.out.println(e);
			}
		}catch(TypeNotPresentException e) {
			System.out.println(e);
		}finally
		{
			System.out.println("This is going to execute anyhow");
		}
		
	}

}
