package javaprogram;

public class EarlyBinding {
	public static void main(String[] args) {
		Cab c=new Ola();
		c.bookCab();
		
		Cab c1=new Uber();
		c1.bookCab();
	}

}

class Cab{
	void bookCab() {
		System.out.println("Booking Cab");
	}
}

class Ola extends Cab{
	void bookCab() {
		System.out.println("Bookcab using ola ");
	}
	
}

class Uber extends Cab{
	void bookCab() {
		System.out.println("Bookcab using uber");
	}
}