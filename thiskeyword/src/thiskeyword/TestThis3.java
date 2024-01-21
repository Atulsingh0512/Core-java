package thiskeyword;


//this is used to call current class constructor
class A1{
	A1()// default constructor 
	{
		System.out.println("Hello a");
	}
	A1(int x)//parametrized constructor
	{
		this();
		System.out.println(x);
	}
}
public class TestThis3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 call=new A1(5);

	}

}
