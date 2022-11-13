
public class VarArgs {
	public static void  VarArgsMethod(int ... arg)
	{
		System.out.println("The Number of arguments = " + arg.length);
		for(int i : arg)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		VarArgsMethod(1,4,9,6,7,3,4,5,6,0,2,1,3,4,8,9);
		VarArgsMethod();
		

	}

}
