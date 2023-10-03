package Oops_concept;
import java.util.*;

class encap{

	private int age;

	public void setage(int age) {
		this.age=age;
	}

	int getage() {
		return age;
	}
	public void validate(int e) {
		if(e>18) {
			System.out.println("valid voter ");
		}
		else
			System.out.println("invalid voter");
	}

}
class Enacpsulation {
	
	
	
	public static void main(String[] args) {

		encap e=new encap();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter u r age");
		int a=sc.nextInt();
		e.setage(a);
		e.validate(e.getage());

		

	}

}
