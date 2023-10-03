package array;
import java.util.*;

import java.util.Scanner;

public class sumofHappyNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int l=s.nextInt();
		int[] arr=new int[l];
		System.out.println("enter the "+l+ "elements");
		for(int i=0;i<l;i++) {
			arr[i]=s.nextInt();
		}

		getEle(arr);

	}

	static void getEle(int[] arr) {

		for(int i=0;i<arr.length;i++) {
			int a=isHappy(arr[i]);
			if(a==1||a==7)
				System.out.println(a+" is happy number");

		}
	}

	private static int isHappy(int i) {

		
		int t=i;
		while(i<9) {
			int count=0;
			while(t>9&&count>9) {
				int a=t%10;
				count=count+a;
				t=t/10;
			}
			i=count;
		}
		return i;

	}
}