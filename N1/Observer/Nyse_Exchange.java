package Observer;

import java.util.Scanner;

public class Nyse_Exchange extends Broker_Observer {

	private double value = 12.233;
	private double newvaluey;
	private Scanner sc = new Scanner(System.in);
	

	public Nyse_Exchange(StockExchange_Agency subject) {
		this.subject = subject;
		this.subject.joinObserver(this);

	}
	

	@Override
	public void update() {
		System.out.println("Welcome to Nyse News");
		do {
			newvaluey= value+subject.getTendenciay();
			
			if(newvaluey > value){
				
				System.out.println("Nyse current value : "  + newvaluey+ " HIGH TREND.");
			}
			else if(newvaluey < value ) {
				System.out.println("Nyse current value : "  + newvaluey + " low TREND.");
			}else {
				System.out.println("Nyse current value : "  + value + " no change");
			}
			break;
		} while (subject.getTendenciay() != 0);
		
		
	}
}
