package Callback_Pattern;

public class Paypal implements RedsysTrucho{
	
	private int password ;
	private String email;
	
	public Paypal (String email1 , int password1) {
		
		this.password = password1;
		this.email = email1 ;
	}
	
	
	
	@Override
	public String toString() {
		return "Paypal [password=" + password + ", email=" + email + "]";
	}



	@Override
	public void pago() {
		// TODO Auto-generated method stub
	
		System.out.println(toString() + " Procesando... ");
		System.out.println("Payment in process : Paypal : Finish");
		
		
	}
	
	
		
}
