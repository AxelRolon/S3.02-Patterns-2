package Observer;
import java.util.Scanner;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class StockExchange_Agency {

	private List<Broker_Observer> observer = new ArrayList<Broker_Observer>();
	private double tendenciax;
	private double tendenciay;
	private int z ;

	public double getTendenciax() {
		return tendenciax;
		
	}
	public double getTendenciay() {
		return tendenciay;
		
	}

	public void setTendencia() {
		
		
		
		do {
			System.out.println("Welcome to Axel Stock Exchange, choose a exchange for fluctuation");
			System.out.println("Nasdaq = 1 " + "\t" + "Nyse = 2" + "\t"+ "Exit = 0");
			Scanner sc = new Scanner(System.in);
			z = sc.nextInt();
		
			switch (z) {
			case 1:
				double x ;
				
				System.out.println("Introduce a new value , add...");
				
				Scanner nv = new Scanner(System.in);
				
				x = nv.nextDouble();
				this.tendenciax= x;
				
				updateObserver();
				break;
				
			case 2:
				
	            double y ;
				
				System.out.println("Introduce a new value , add...");
				
				Scanner nv2 = new Scanner(System.in);
				
				y = nv2.nextDouble();
				this.tendenciay= y;
				
				updateObserver();
				break;
			case 0 :
				System.out.println("Thanks ¡¡");
				z = 0;
				break;
			
			default:
				System.out.println("enter a correct integer value between 1 and 2 ");
			break;
		}
			}
		while( z != 0 );
		
		
		

	}

	public void joinObserver(Broker_Observer object) {
		observer.add(object);
	}

	public void updateObserver() {
		observer.forEach(x -> x.update());
	}
}
