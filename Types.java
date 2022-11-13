import javax.swing.*;
public class Types {
	public static void main(String args[])
	{
		int[] arr = new int[4];
		arr[0] = 34;
		arr[1] = 24;
		arr[2] = 14;
		arr[3] = 15;
		for(int i = 0;i<arr.length;i++)
			System.out.println(arr[i]);
		
		String names[] = new String[] {"Haid","Hyder Nabi","haidii","haidiya"};
		for(String name: names)
			System.out.println(name);
		
		int[][] tri = new int[4][5];

		for(int a = 0; a<tri.length;a++)
		{
			for(int b = 0;b<tri[a].length;b++)
			{
				tri[a][b] = Integer.parseInt(JOptionPane.showInputDialog("Enter tri["+a+"]["+b+"]"));
			}
		}
		
		
		for(int a = 0; a<tri.length;a++)
		{
			for(int b = 0;b<tri[a].length;b++)
			{
				System.out.print(tri[a][b]+"\t");
				
			}
			System.out.println();
		}
		
		
		
		
		
	}
}
 