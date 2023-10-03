package atm;
import java.util.*;


public class main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		main m=new main();
		System.out.println("enter 1 for deposite\n 2 for withdrw\n 3 for checkbalance ");
		int choice=s.nextInt();
		
		m.desideBank(choice);
		



	}
	ATM a=new ATM();
	public void desideBank(int choice) {
		
		if(choice==1) {
			a.deposite();
		}
		else if(choice==2) {
			a.withdraw();		}
		else if(choice==3) {
			a.checkbalance();
		}
		
		
	}
	
	
	
	
}
