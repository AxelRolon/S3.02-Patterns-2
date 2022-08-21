package Observer;

public class Nasdaq_Exchange extends Broker_Observer {
		
	private double value = 13.2;
	private double newvaluex ;
	
	public Nasdaq_Exchange(StockExchange_Agency subject) {
		this.subject = subject ;
		this.subject.joinObserver(this);
		
	}

	@Override
	public void update() {
		System.out.println("Welcome to Nasdaq News");
		do {
			newvaluex= value+subject.getTendenciax();
			
			if(newvaluex > value){
				
				System.out.println("Nasdaq current value : "  + newvaluex + " HIGH TREND.");
			}
			else if(newvaluex < value ) {
				System.out.println("Nasdaq current value : "  + newvaluex + " low TREND.");
			}else {
				System.out.println("Nasdaq current value : "  + value + " no change");
			}
			break;
		} while (subject.getTendenciax() != 0);
		
		
		}
	}

