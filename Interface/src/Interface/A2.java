package Interface;


interface bank{
	float roi();
}

class sbi implements bank
{
	public float roi()
	{
		return 9.15f;
	}
}

class pnb implements bank
{
	public float roi()
	{
		return 8.15f;
	}
}

public class A2 {
	public static void main(String[] args) {
		bank b=new pnb();
		System.out.println("rate of interest is : "+b.roi());
		
	}
	
	
}