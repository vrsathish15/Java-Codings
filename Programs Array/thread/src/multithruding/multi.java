package multithruding;

public class multi {
	public static void main(String[] args) throws Exception{
		Fruits f=new Fruits();
		Thread t1=new AppleThread(){
			public void run() {
				f.saleOrange();
			}
		};
		
		t1.start();
		
		Thread t2=new OranceThread() {
			public void run() {
				f.saleapple();
			}

		};
		t2.start();
	}

}
