package myPackII;
import myPack.BalanceSheet;

public class MyBalance {
	public static void main(String[] args)
	{
		int size = 9;
		BalanceSheet bs[] = new BalanceSheet[size];
		for(int a=0; a<size;a++) { bs[a] = new BalanceSheet(); };
		bs[0].setBalance("haidii", 78000);
		bs[1].setBalance("hyder nabi", 34000);
		bs[2].setBalance("hade", 62000);
		bs[3].setBalance("haider", 89000);
		bs[4].setBalance("aamir", 78000);
		bs[5].setBalance("aadil", 34000);
		bs[6].setBalance("umer", 62000);
		bs[7].setBalance("junaid", 89000);
		bs[8].setBalance("shahid", 89000);
		
		for(BalanceSheet i :  bs) {
			System.out.println("Total Balance in Account = INR " + i.getBalance());
		}
		
	}
}
