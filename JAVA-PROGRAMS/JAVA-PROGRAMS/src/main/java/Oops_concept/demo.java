package Oops_concept;

public class demo {
	public static void main(String[] args) {
		int sumo=0,sume=0;
		for(int i=0;i<=10;i++) {
			if(i%2==1) {
				System.out.println(i);
				 sumo +=i;	
			}
			else sume +=i;
			
		}
		 System.out.println("sum of odd "+sumo);
		 System.out.println("sum of even "+sume);
		

	}
}
