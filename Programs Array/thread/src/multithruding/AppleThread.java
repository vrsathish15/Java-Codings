package multithruding;

public class AppleThread extends Thread {
	Fruits f=new Fruits();
	public void run() {
		f.saleapple();
	}

}
