package Callback_Pattern;

public class CreditCard implements RedsysTrucho {
	private String name, last_name ;
	private int numAccount;
	private int cvv;
	
	public CreditCard(String name1, String last_name1, int numAccount1,int cvv1) {
		this.name = name1;
		this.last_name = last_name1;
		this.numAccount = numAccount1 ;
		this.cvv = cvv1 ;
	}

	@Override
	public String toString() {
		return "CreditCard [name=" + name + ", last_name=" + last_name + ", numAccount=" + numAccount + ", cvv=" + cvv
				+ "]";
	}

	@Override
	public void pago() {

	    System.out.println(toString());
	    System.out.println("Payment in process : Creditcard : Finish");
		
	}
	
	
}
