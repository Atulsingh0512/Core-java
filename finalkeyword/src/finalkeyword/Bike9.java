package finalkeyword;


//final keyword is used with variable,class,method
//final keyword ---stop value change
//              ---stop method overriding
//              ---stop inheritance



// 1.Java final variable


public class Bike9 {
	final int speedlimit=90;
	void run()
	{
		speedlimit=500;//show compile time error
	}
	

	public static void main(String[] args) {
		Bike9 call=new Bike9();
		call.run();
	}

}
