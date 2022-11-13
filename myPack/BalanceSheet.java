package myPack;

public class BalanceSheet {
	String name;
	double balance;
	//default Constructor 
	public BalanceSheet() {};
	public BalanceSheet(String name,double balance)
	{
		this.name = name;
		this.balance = balance;
	}
	public void setBalance(String name, double balance)
	{
		this.name = name;
		this.balance = balance;
	}
	public double getBalance()
	{
		System.out.println("Name of Account Holder = " + this.name);
		return this.balance;
	}
}
