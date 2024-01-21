package Interface;

//1) It is used to achieve abstraction.(100%)
//2) By interface, we can support the functionality of 
//   multiple inheritance.
//3) It can be used to achieve loose coupling.

interface printable {
	void print();
}

class A6 implements printable {
	public void print() {
		System.out.println("Hello brother....");
	}

	public static void main(String args[]) {
		A6 obj = new A6();
		obj.print();
	}
}