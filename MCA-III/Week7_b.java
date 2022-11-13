package javaLabWork;
class Palindrome{
	String string;
	Palindrome(String string){
		this.string = string;
	}
	
	public void checkPalindrome() {
		int i = 0;
		int j = this.string.length() - 1;
		char arr[] = this.string.toCharArray();
		while(i<=j) {
			if(arr[i] == arr[j]) {
				i++;j--;
			}else {
				break;
			}				
		}
		if(i>j) {
			System.out.println("The String is Palindrome");
		}else {
			System.out.println("The String isn't Palindrome");	
		}
	}
}
public class Week7_b {

	public static void main(String[] args) {
		Palindrome p = new Palindrome("TibiT");
		p.checkPalindrome();

	}

}
