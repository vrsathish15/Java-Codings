package array;

public class replace_every_arrayElement {

	public static void main(String[] args) {
		int[] a = {123, 456 ,34, 2 ,89};
		System.out.println("THE SUM OF ARRAY ELEMENT: ");
		for(int i = 0;i<a.length; i++) {
			int sum =0;
			while(a[i]>0) {
				int d = a[i]%10;
				sum = sum+d;
				a[i]=a[i]/10;
			}
			System.out.print(sum+" ");
		}

	}

}


