package singleinheirtance;

//SINGLE INHERITANCE
class Animal{
	void eat()
	{
		System.out.println("Dog is eating");
	}
}
public class Dog extends Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.eat();

	}

}
