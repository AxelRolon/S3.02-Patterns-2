package Observer_Main;
import Observer.Nasdaq_Exchange;
import Observer.Nyse_Exchange;
import Observer.StockExchange_Agency;

public class Main {
	public static void main(String[] args) {
		
		StockExchange_Agency subject = new StockExchange_Agency();
		
		new Nasdaq_Exchange(subject);
		new Nyse_Exchange(subject);

		subject.setTendencia();
		
		
		
	}

}
