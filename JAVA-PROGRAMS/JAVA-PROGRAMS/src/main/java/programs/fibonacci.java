package programs;

import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a  num");
		int n=sc.nextInt();
		
		int f1=0,f2=1;
		
		while(n>0) {
			int f3=f1+f2;
			f1=f2;
			f2=f3;
			n--;
			System.out.print(f3+" ");
		}
	
		
	}

}
