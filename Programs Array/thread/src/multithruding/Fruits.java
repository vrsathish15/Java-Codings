package multithruding;

public class Fruits {
	void saleapple() {
		for(int i=0;i<=11;i++) {
			System.out.println(i+"apple");
			if(i>=5)
				try {
					Thread.sleep(2000);
				}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}

	public void saleOrange() {
		for(int i=0;i<=11;i++) {
			System.out.println(i+"--->orange");
			if(i>=5)
				try {
					Thread.sleep(1000);
				}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	

}
