package thread;

public class threadMain {
	
	static void mul() throws Exception{
		int a[]= {2,3,4};
		System.out.println(a[1]);
		for(int i=0;i<=8;i++) {
			System.out.print(i+" ");
			Thread.sleep(1000);
		
		}
	}
	static void div() {
		System.out.println(10/0);
	}
	public static void main(String[] args) {
		
		try {
		div();
		}
		catch(Exception e) {
			System.out.println("invalid");
		}
		try {
			mul();
		}
		catch(Exception x) {
			System.out.println(x);
		}
		
	}

}
