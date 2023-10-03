package array;

public class frequency {



	public static void main(String[] args) {

		int a[]= {1,2,3,2,3,5,6};

		int big = a[0];
		for(int i = 0;i<a.length;i++) {
			if(big<a[i])
				big=a[i];
		}
		int[] b = new int[big+1];

		for(int i =0;i<a.length;i++) {
			b[a[i]]++;
		}

		for(int i =0 ; i<b.length;i++) {
			if(b[i]!=0)
				System.out.println(i +"--->"+ b[i]);


		}

	}
}


