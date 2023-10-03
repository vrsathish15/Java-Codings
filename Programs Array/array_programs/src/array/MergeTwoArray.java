package array;
import java.util.*;

public class MergeTwoArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of  1 st array ");
		int size1 = s.nextInt();
		System.out.println("enter the size of  2 nd array ");
		int size2 = s.nextInt();
		System.out.println("enter the elements to insert 1st array");
		int[]a = readArray(size1);
		System.out.println("enter the elements to insert in 2nd array");
		int[]b = readArray(size2);
		mergedArray(a,b);

	}
	static void mergedArray(int[] a, int[] b) {
		int[] c = new int[a.length+b.length];
		for(int i = 0 ;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int i = 0 ;i<b.length;i++) {
			c[i+a.length]=b[i];
		}
		for(int i = 0;i<c.length;i++) {
			int temp = c[0];
			for(int j =i+1;j<c.length;j++) {
				if(c[i]<c[j]) {
					temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}

			}
		}
		System.out.println("after sorted and merging ");
		for(int i =0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}

	}
	static int[] readArray(int n) {
		Scanner s = new Scanner(System.in);
		int a[]= new int[n];
		for(int i = 0 ; i<a.length;i++) {
			a[i]= s.nextInt();

		}
		return a;
	}

}