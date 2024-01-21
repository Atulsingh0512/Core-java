package enacapsulation;

public class TestEncapsulation {

	public static void main(String[] args) {
			Account call=new Account();
			call.setAcc_no(5427364);
			call.setName("ATUL");
			call.setEmail("abv123@gmail.com");
			call.setAmount(143332f);
			System.out.println(call.getAcc_no()+" "+call.getName()
			+" "+call.getEmail()+" "+call.getAmount());
			
			

	}

}
