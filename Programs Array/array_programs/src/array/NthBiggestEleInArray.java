package array;
import java.util.*;
public class NthBiggestEleInArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of an array ");
		int size = s.nextInt();
		int[]a = readArray(size);
		System.out.println("enter the n value to fin n th biggest ");
		int n = s.nextInt();
		getNthBiggest(a,n);
		
		
	}
	 static void getNthBiggest(int[] a, int n) {
		
		for(int i=0;i<a.length;i++) {
			int count =0;
			for(int j =i;j<a.length;j++) {
				if(a[i]<a[j])
					count++;
			}
			if(count==n-1)
				System.out.println("the "+ n+ "nd biggest element is " + a[i]);
		}
		
	}
	static int[] readArray(int n) {
		Scanner s = new Scanner(System.in);
		int a[]= new int[n];
		
		System.out.println("enter the elements to insert in array");
		for(int i = 0 ; i<a.length;i++) {
			a[i]= s.nextInt();

		}
		return a;
	}

}