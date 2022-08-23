package Callback_Pattern;

public class CC implements RedsysTrucho {
	
		private String name ;
		private int numA;
		
		public CC(String name1, int numA1) {
			
			this.name = name1 ; 
			this.numA = numA1;
			
		}

	@Override
		public String toString() {
			return "CC [name=" + name + ", numA=" + numA + "]";
		}


	@Override
	public void pago() {
		// TODO Auto-generated method stub
		System.out.println(toString() + " Payment in process..");
		System.out.println(" Bank Account payment : Finish ");
		
		
	}
	
	
	
}
