
class Stack
{
	private int arr[] = new int[50];
	private int top;
	int Max = 50;
	Stack() {
		top = -1;
	}
	public void push(int val)
	{
		if(top == Max)
		{
			System.out.println("STACK OVERFOLW");
		}
		else
		{
			top++;
			arr[top] = val;
			System.out.println("PUSHED SUCCESSFULLY");
		}
	}
	
	public int pop() {
		if(top == -1)
		{
			System.out.println("STACK UNDERFLOW");
			return 0;
		}
		else
		{
			int val;
			val = arr[top];
			top--;
			return val;
		}
	}
}

public class StackADT {
	public static void main(String args[])
	{
		Stack stack = new Stack();
		stack.push(12);
		stack.push(13);
		stack.push(14);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
