package thiskeyword;


//this is passed as argument in method call

class S2{
	void m1(S2 obj)
	{
		System.out.println("method is invoked");
	}
	
	public void m2() {
			m1(this);
		
	}
}
public class TestThis4 {

	public static void main(String[] args) {
		  S2 call=new S2();
		  call.m2();

	}

}
