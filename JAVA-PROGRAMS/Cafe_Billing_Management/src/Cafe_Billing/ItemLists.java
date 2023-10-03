package Cafe_Billing;

import java.util.Scanner;
public class ItemLists {
		int menu;
		Scanner sc = new Scanner(System.in);
		int[] serialno = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		String[] itemCategory = {"South Indian","North Indian","Chinese","Desserts"};
		
		String[] southitems = {"Medu Vada    ","Sambhar Idli ","Masala Dosa  ","Sambhar      ","Uttapam      ",};
		int southrate[] = {75,70,120,30,130};
		
		String[] northitems = {"Chapati       ","Mixed Veg     ","Chawal        ","Raajma        ","Chhola        ","Kadhai Paneer ","Daal Tadka    "};
		int northrate[] = {40,55,60,65,65,140,70};
		
		String[] chineseitems = {"Fried Rice       ","Hakka Noodles    ","Manchurian       ","Schezwan Noodles ","Spring Rolls     "};
		int chinrate[] = {110,90,120,130,70};
		
		String[] dessertitems = {"Kheer       ","Pastry      ","Gulab Jamun ","Jalebi      ","Rasgulla    ","Custord     ","Ice Cream   "};
		int dessertrate[] = {100,40,50,40,50,65,70};
		
		
	 	public void itemCatg() {
	 		System.out.println();
	 		System.out.println(" *********Dishes Category*********");
			for (int i = 0; i < itemCategory.length; i++) {
				System.out.println(serialno[i]+". "+itemCategory[i]);
			}
		}
	 	public void southInItems() {
			for (int i = 0; i < southitems.length; i++) {
				System.out.println(serialno[i]+". "+southitems[i]+"       "+southrate[i]);
			}
		}
		public void northInItems() {
			for (int i = 0; i < northitems.length; i++) {
				System.out.println(serialno[i]+". "+northitems[i]+"        "+northrate[i]);
			}
		}
		public void chineseInItems() {
			for (int i = 0; i < chineseitems.length; i++) {
				System.out.println(serialno[i]+". "+chineseitems[i]+"       "+chinrate[i]);
			}
		}
		public void dessertInItems() {
			for (int i = 0; i < dessertitems.length; i++) {
				System.out.println(serialno[i]+". "+dessertitems[i]+"        "+dessertrate[i]);
			}
		}
		public void displayLines() {
			System.out.println("---------------------------------");
	 		System.out.println("  Items List          Rate(@ Rs)");
	 		System.out.println("---------------------------------");
		}
		
		public void menuShow() {
			System.out.print("Enter the serial no. to select the Dishes Category : ");
			menu = sc.nextInt();
			System.out.println("\n");
			
			if(menu==1) {
				System.out.println("  ***** South Indian ***** ");
				displayLines();
				southInItems();
				System.out.print("Select the item from the menu using serial no. :"); 
			}else if(menu==2) {
				System.out.println("  ***** North Indian ***** ");
				displayLines();
				northInItems();
				System.out.print("Select the item from the menu using serial no. :"); 
			}else if(menu==3) {
				System.out.println("  *****  Chinese  ***** ");
				displayLines();
				chineseInItems();
				System.out.print("Select the item from the menu using serial no. :"); 
			}else if(menu==4) {
				System.out.println("  *****  Desserts  ***** ");
				displayLines();
				dessertInItems();
				System.out.print("Select the item from the menu using serial no. :"); 
			}else {
				System.out.println("SORRY! Invalid Choice.. Try Aga!n");
				menuShow();
			}
		}

}
