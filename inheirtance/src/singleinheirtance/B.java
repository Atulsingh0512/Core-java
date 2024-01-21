package singleinheirtance;


//SINGLE INHERITANCE
class A
{
	void methodA()
	{
		System.out.println("This is base class method");
	}
}
		public class B extends A {

			public void methodB()
			{
				System.out.println("This is child class");
			}
			public static void main(String[] args)
			{
				B b=new B();
				b.methodB();
				b.methodA();
			}

}
