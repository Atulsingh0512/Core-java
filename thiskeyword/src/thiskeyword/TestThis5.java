package thiskeyword;
//this: to pass as argument in the constructor call

class Test {
	Test(TestThis5 td) {
		System.out.println("test class constructor");
	}
}

public class TestThis5 {

	void m1() {
		Test t = new Test(this);
	}

	public static void main(String args[]) {
		TestThis5 call = new TestThis5();
		call.m1();
	}
}
