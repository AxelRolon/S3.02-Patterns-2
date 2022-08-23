package Main;

import java.util.Scanner;

import Callback_Pattern.CC;
import Callback_Pattern.CreditCard;
import Callback_Pattern.Paypal;
import Callback_Pattern.Tienda_Alexandra;

public class Main {
		
	public static void main(String[] args) {

		Tienda_Alexandra tienda = new Tienda_Alexandra();
		int user ;
		
		do {
			System.out.println("----------------------------------------------------------------------");
			System.out.println("choose the payment method ");
			System.out.println(" 1 = CreditCard " + "\t" + " 2 = BankAccount " + "\t" + " 3 = Paypal");
			System.out.println("----------------------------------------------------------------------");
			Scanner sc = new Scanner(System.in);
			user = sc.nextInt();
			
			switch (user) {
			case 1:
				Scanner nw = new Scanner(System.in);
				System.out.println("Put your email "+"\t"+"validando...");
				String mail = nw.nextLine();
				System.out.println("Password");
				int pw = nw.nextInt();
				
				tienda.Mysql_C(new Paypal(mail, pw));
				
				break;
		
			case 2:
				Scanner cdc = new Scanner(System.in);
				System.out.println(" Introduce a name ");
				String name = cdc.next();
				System.out.println("Introduce a last name ");
				String lname = cdc.next();
				System.out.println("Introduce your Account number");
				int anum = cdc.nextInt();
				System.out.println(" Introduce your cvv ");
				int cod = cdc.nextInt();
				
				tienda.Mysql_C(new CreditCard(name, lname, anum, cod));
				
				break;
				
			case 3:
				Scanner bnk = new Scanner(System.in);
				System.out.println("Introduce your name");
				String nm = bnk.next();
				System.out.println("Introduce your Account Number");
				int ac = bnk.nextInt();
				
				tienda.Mysql_C(new CC(nm,ac));
				
				break;
			
			case 0:
				System.out.println("Thanks BRO");
				user = 0 ;
				break;
			
			default:
				System.out.println("enter a correct integer value between 1 and 3 ");
			break;
			}
			
		} while( user != 0 );
		
		}
	}
		
