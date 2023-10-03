package multithruding;

public class OranceThread extends Thread {
	Fruits f=new Fruits();
	public void run() {
		f.saleOrange();
	}

}
