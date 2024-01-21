package thiskeyword;


//this is used to refer current class method..

class A{
	void m()
	{
		System.out.println("hello m");
	}
	void n()
	{
		System.out.println("hello n");
		this.m();
	}
}


public class TestThis2 {

	public static void main(String[] args) {
		A call=new A();
		call.n();
		
	}

}
