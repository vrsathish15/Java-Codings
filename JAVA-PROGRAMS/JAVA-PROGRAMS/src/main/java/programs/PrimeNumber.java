package programs;

public class PrimeNumber {
	public static void main(String[] args) {
		boolean b=getPrime2(2);
		if(b)
			System.out.println("is prime");
		else
			System.out.println("not a prime");
	}

	private static boolean getPrime2(int a) {
		if(a==0||a==1) return false;
		else {
			for(int i=2;i<a;i++) {
				if(a%i==0)
					return false;
			}
		}
		return true;
	}

	
	
	

	private static boolean getPrime1(int n) {
//		if(n!=0||n!=1) {
//			for(int i=2;i<n;i++)
//				if(n%i==0) return false;
//		}
//		return true;
		
		
		
		int i=2;
		while(i<n) {
			if(n%2==0)
				return false;
		}
		return true;
		
		
		
	}

	private static boolean getPrime(int n) {
		if(n==0||n==1) return false;
		else {
			for(int i=2;i<n;i++) {
				if(n%i==0) return false;
			}
		}
		return true;


	}

}
