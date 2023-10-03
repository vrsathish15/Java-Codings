package programs;
import java.util.*;

public class palandrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a  num");
		int n=sc.nextInt();
		int rev=0;
		int temp=n;
		for(int i=0;n>0;i++){
			int d=n%10;
			rev = rev*10+d;
			n=n/10;	
		}
		if(temp==rev) {
			System.out.println("palandrome");
		}
		else
			System.out.println("not a palendrome");
		
	}

}
