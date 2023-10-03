package Cafe_Billing;

import java.util.Scanner;

public class Restaurants {
	public static void main(String[] args) {
		int input=101;
		int bill=0;
		int count = 0;
		// Scanner class object creation..
		ItemLists itls = new ItemLists();
		Scanner sc = new Scanner(System.in);

		System.out.println("       Welcome to Apna Restaurant     ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		itls.itemCatg();
		System.out.println("\n");
		itls.menuShow();
		System.out.println();
		
		
		  String[] itemselect = new String[100];
		  System.out.println();
		  
		  while(input!=100) {
			  int inp = sc.nextInt();
			  for (int i = 0; i <50 ; i++) {
				  
				  if(i==inp) {
					  if(itls.menu==1) {
						  for (int j = 0; j < itls.southitems.length; j++) {
							  itemselect[i]=itls.southitems[inp-1];
						  }
						  
					  }else if(itls.menu==2) {
						  for (int j = 0; j < itls.northitems.length; j++) {
							  itemselect[i]=itls.northitems[inp-1];
						  }
					  }else
						  if(itls.menu==3) {
							  for (int j = 0; j < itls.chineseitems.length; j++) {
								  itemselect[i]=itls.chineseitems[inp-1];
							  } 
							  
					  }else {
						  for (int j = 0; j < itls.southitems.length; j++) {
							  itemselect[i]=itls.dessertitems[inp-1]; 
						  }
					  }
					  count++;
						 
					  System.out.println();
					  System.out.print("How much Quantity, you want to have: ");
					  int iter=sc.nextInt();
					  if(itls.menu==1) {
						  bill+=itls.southrate[i-1]*iter; 
					  }else if(itls.menu==2) {
						  bill+=itls.northrate[i-1]*iter; 
					  }else if(itls.menu==3) {
						  bill+=itls.chinrate[i-1]*iter; 
					  }else {
						  bill+=itls.dessertrate[i-1]*iter; 
					  }
					  System.out.println("If want any other item from this menu plz enter serial no. : ");
					  System.out.println("Or, If you want to order other type of dishes plz.. enter 50 : ");
					  System.out.print("Or, Enter 100 to generate the final bill for your order : ");
				  }
			  }
					 
			  if(inp==100) {
				  break;
			  }else if(inp==50){
				  itls.itemCatg();
				  itls.menuShow();
			  }else {
				  continue;
			  }
		  }
		 
		System.out.println("\n");
		System.out.println("Order is Placed Successfully.. Thank You!");
		System.out.println();
		System.out.println("You have Ordered:");
		for (int i = 0; i < count; i++) {
		  System.out.println(itemselect[i]);
		}
		System.out.println("\n");
		System.out.println("Bill generated..Your Bill is "+bill);
		System.out.println("\n");
		System.out.println("Thanks! Visit Aga!n");
		
	}
}
  