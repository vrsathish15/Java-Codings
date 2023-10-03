package programs;

import java.util.Scanner;

public class Reverse_String {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String st=sc.nextLine();

		char[] ch=st.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		
	}


}
