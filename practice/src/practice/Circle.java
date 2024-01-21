package practice;

public class Circle {
	
	private float radius;

	public Circle(float radius) {
		super();
		this.radius = radius;
	}
	
	
	public float calArea()
	{
		return (float)3.14*radius*radius;
	}
	
	public float calCircum()
	{
		return (float) ((float)2*3.14*radius);
	}


	public float getRadius() {
		return radius;
	}


	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	public static void main(String[] args) {
		Circle ci=new Circle(3);
		float area=ci.calArea();
		float circumf=ci.calCircum();
		System.out.println(area);
		System.out.println(circumf);	
		
	}
	

}
