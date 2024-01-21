package abstraction;


abstract class shape 
{
	abstract void draw();
	
}

class Rectangle extends shape{
	void draw()
	{
		System.out.println("drawing rectangle...");
	}
}

class circle extends shape{
	void draw()
	{
		System.out.println("drawing circle...");
	}
}


public class TestAbstraction1 {

	public static void main(String[] args) {
		shape s1=new Rectangle();
		s1.draw();
		shape s2=new circle();
		s2.draw();
	}

}
