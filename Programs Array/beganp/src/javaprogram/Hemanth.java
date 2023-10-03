package javaprogram;

public class Hemanth {
	public static void main(String[] args) {
		Properties p=new Main();
		p.age();
		
		Properties p1=new Main1();
		p1.age();
		
	}
     
}

abstract class Properties{
	abstract void age();
}

class Main extends Properties{
	@Override
	void age() {
		System.out.println("22");
	}
}

class Main1 extends Properties{
	@Override
	void age() {
		System.out.println("23");
	}
}

