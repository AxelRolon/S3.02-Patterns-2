package Observer;

import java.util.Scanner;

public abstract class Broker_Observer {
	
	protected StockExchange_Agency subject;
	
	public abstract void update();
}
