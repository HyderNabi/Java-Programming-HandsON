package exceptionHandling;
class InSuffBalance extends Exception
{
	String details;
	InSuffBalance(String details)
	{
		this.details = details;
	}
	public String getMessage()
	{
		return details;
	}
	public String toString()
	{
		return details;
	}
}
class Balance
{
	public double balance = 0;
	Balance(){};
	Balance(double balance){
		this.balance = balance;
	}
	public void totalBalance()
	{
		System.out.println("Total Balance = " + this.balance);
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public void debetBalance(double amount) {
		this.balance += amount;
		System.out.println("Debeted Sucdessfully !!!");
		this.totalBalance();
	}
	public void creditBalance(double amount) {
		if(this.balance<=0 || this.balance<amount)
		{
			try {
				throw new InSuffBalance("Insufficient Balance in your Account");
			}catch(InSuffBalance e)
			{
				System.out.println(e);
				this.totalBalance();
			}
		}
		else
		{
			this.balance -= amount;
			System.out.println("Credeted Sucdessfully !!!");
			this.totalBalance();
			
		}
	}
}
public class CustomException {

	public static void main(String[] args) {
		Balance balance = new Balance(1000);
		balance.totalBalance();
		balance.creditBalance(1500);

	}

}
