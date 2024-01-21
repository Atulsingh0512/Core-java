package superkeyword;


//1. super keyword is used to refer parent class instance variable


class Animal{
	String color="black";
}

class Dog extends Animal{
	String color="pink";
	void m1()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
}

public class TestSuper1 {

	public static void main(String[] args) {
		Dog call=new Dog();
		call.m1();
		
		  

	}

}
