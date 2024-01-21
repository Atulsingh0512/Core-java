package MethodOverriding;


//A real example of Java Method Overriding
//Consider a scenario where Bank is a class that 
//provides functionality to get the rate of interest. 
//However, the rate of interest varies according to banks.
//For example, SBI, ICICI and AXIS banks
//could provide 8%, 7%, and 9% rate of interest.

//it is also example of heirarchy inheritance...
 

class Bank{
	int getRateOfInt()
	{
		return 0;
	}
}

class SBI extends Bank{
	int getRateOfInt()
	{
		return 8;
	}
	
}

class ICICI extends Bank{
	int getRateOfInt()
	{
		return 7;
	}
	
}

class AXIS extends Bank{
	int getRateOfInt()
	{
		return 9;
	}
	
}
public class Test2 {

	public static void main(String[] args) {
		AXIS a=new AXIS();
		SBI s=new SBI();
		ICICI i=new ICICI();
		
		System.out.println("axis r.o.i is "+a.getRateOfInt());
		System.out.println("sbi r.o.i is "+s.getRateOfInt());
		System.out.println("icici r.o.i is "+i.getRateOfInt());
		

	}

}
