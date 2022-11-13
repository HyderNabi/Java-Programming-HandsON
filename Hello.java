import javax.swing.*;
class Hello {
	public static void main(String args[])
	{
		System.out.println("hello world");
		int a;
		a = 65;
		System.out.println(a);
		char b = (char)a;
		System.out.print(b);
		
		int input = Integer.parseInt(JOptionPane.showInputDialog("Enter A"));
		JOptionPane.showMessageDialog(null, input);
	}

}
