package superkeyword;

//super keyword is used to refer parent class instance method
class Animal1 {
	void eat() {
		System.out.println("khana khao....");
	}
}

class Dog1 extends Animal1 {
	void eat() {
		System.out.println("eating....");
	}

	void bark() {
		System.out.println("barking....");

	}

	void work()
	{
		super.eat();
		bark();
	}

}

public class TestSuper2 {

	public static void main(String[] args) {
		Dog1 call = new Dog1();
		call.work();

	}

}
