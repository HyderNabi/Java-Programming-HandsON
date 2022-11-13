package javaLabWork;

public class Week2_f {

	public static void main(String[] args) {
		int arr[][] = {
				{1,2,3,4,5},
				{1,5,6},
				{1,2,3,4,5,6,7,8,9},
				{90,89,78,67},
				{000}
		};
		for(int[] i:arr)
		{
			for(int j:i)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
