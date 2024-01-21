package Interface;


interface drawable
{
	void draw();
}

class rectangle implements drawable
{
	public void draw()
	{
		System.out.println("draw rectangle...");
	}
	
}

class circle implements drawable
{
	public void draw()
	{
		System.out.println("draw circle...");
	}
	
}
public class A1 {

	public static void main(String[] args) {
		
		drawable d=new circle();
		d.draw();
		drawable d1=new rectangle();
		d1.draw();
	}

}
