package abstraction;

//abstraction--hiding implementation..
//showing only functionality to user..
//eg.sms sending(you dont know internal functioning...)

//		There are two ways to achieve abstraction in java
//		Abstract class (0 to 100%)
//		Interface (100%)

//Abstarct class 
//rule --1)abstarct class must be declared with abstract keyword
//2)it can have abstract and non abstract method
//3)it cannot be instantiated
//4)it can have final method
//5)it can have constructor and static method also

//Example of Abstract class that has an abstract method
abstract class Bike 
{
	abstract void run();
}

class Honda4 extends Bike
{
	void run() 
	{
		System.out.println("running safely");
	}

	public static void main(String args[]) 
	{
		Bike obj = new Honda4();
		obj.run();
	}
}
