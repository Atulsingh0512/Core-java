package thiskeyword;


		//this keyword can be used to return current class instance 
		//from the method
		
		//or used to return statement from the method
		
		class A6{
			A6 getA()
			{
				return this;
			}
			void msg()
			{
				System.out.println("Hello java");
			}
		}
		
		public class TestThis6 {

			public static void main(String[] args) {
				new A6().getA().msg();
			
		
		
	}

}
