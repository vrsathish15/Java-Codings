package atm;

import java.util.Scanner;

public class ATM implements bank{
	Scanner sc=new Scanner(System.in);


	int balance=0;

	public void deposite() {
		System.out.println("enter deposite amout");
		int amount=sc.nextInt();
		System.out.println("deposite rs."+amount);
		balance+=amount;
		System.out.println("amount successfully deposited!."+balance);
		m.deside();

	}
	public void withdraw() {
		System.out.println("enter withdeaw amout");
		int amount=sc.nextInt();
		if(amount<=balance) {
		System.out.println("withdraw "+ amount);
		balance-=amount;
		System.out.println("available amount"+ balance);}
		else
			System.out.println(balance +" balance");

	}
	public void checkbalance() {
		System.out.println("available balance :"+balance);
	}

}



