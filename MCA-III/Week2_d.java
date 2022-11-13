package javaLabWork;

public class Week2_d {

	public static void BubbleSort(int arr[],int n)
	{
		int i,j,temp;
		for(i = 0;i<n;i++)
		{
			for(j=0;j<n-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {10,9,8,7,6,5,4,3,2,1};
		int n = arr.length;
		BubbleSort(arr,n-1);
		for(int i: arr)
		{
			System.out.println(i);
		}
		
		
	}

}
