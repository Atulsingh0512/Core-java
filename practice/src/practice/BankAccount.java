package practice;

public class BankAccount {
	
	private int acc_num;
	private float bal;
	
	//constructor
	public BankAccount(int acc_num, float bal) {
		super();
		this.acc_num = acc_num;
		this.bal = bal;
	}
	
	public void deposit(float amount)
	{
		bal+=amount;
	}
	
	public void withdraw(float amount)
	{
		if(bal>amount)
		{
		bal-=amount;
		}
		else
			System.out.println("insufficient balance");
		
	}
	
	public void display_balance()
	{
		System.out.println("Account number is "+acc_num);
		System.out.println("Account balance is "+bal);
	}
	
	public static void main(String[] args) {
		BankAccount ba=new BankAccount(12345,5645.0f);
		ba.display_balance();
		
		
		ba.deposit(10000);
		ba.display_balance();
		
		ba.withdraw(5030);
		ba.display_balance();
		
		ba.withdraw(20000);
		ba.display_balance();
			
	}
}
