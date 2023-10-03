package Cafe_Billing;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MenuItem {
	private String name;
	private double price;

	public MenuItem(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
}

class OrderItem {
	private MenuItem menuItem;
	private int quantity;

	public OrderItem(MenuItem menuItem, int quantity) {
		this.menuItem = menuItem;
		this.quantity = quantity;
	}

	public MenuItem getMenuItem() {
		return menuItem;
	}

	public int getQuantity() {
		return quantity;
	}
}

class Cafe {
	private List<MenuItem> menu;
	private List<OrderItem> currentOrder;

	public Cafe() {
		menu = new ArrayList<>();
		currentOrder = new ArrayList<>();
	}

	public void addToMenu(MenuItem item) {
		menu.add(item);
	}

	public void displayMenu() {
		System.out.println("Menu:");
		for (int i = 0; i < menu.size(); i++) {
			MenuItem item = menu.get(i);
			System.out.println((i + 1) + ". " + item.getName() + " - $" + item.getPrice());
		}
	}

	public void takeOrder(int menuItemIndex, int quantity) {
		if (menuItemIndex >= 0 && menuItemIndex < menu.size() && quantity > 0) {
			MenuItem menuItem = menu.get(menuItemIndex);
			OrderItem orderItem = new OrderItem(menuItem, quantity);
			currentOrder.add(orderItem);
			System.out.println(quantity + " " + menuItem.getName() + "(s) added to the order.");
		} else {
			System.out.println("Invalid menu item or quantity.");
		}
	}

	public double calculateTotal() {
		double total = 0.0;
		for (OrderItem item : currentOrder) {
			total += item.getMenuItem().getPrice() * item.getQuantity();
		}
		return total;
	}

	public void printBill() {
		System.out.println("\nBill:");
		for (OrderItem item : currentOrder) {
			MenuItem menuItem = item.getMenuItem();
			System.out.println(item.getQuantity() + " " + menuItem.getName() + " - $" + menuItem.getPrice());
		}
		System.out.println("Total: $" + calculateTotal());
	}
}

public class CafeBillingApp {
	public static void main(String[] args) {
		System.out.println("welcome to cafe");
		Cafe cafe = new Cafe();
		cafe.addToMenu(new MenuItem("Coffee", 2.50));
		cafe.addToMenu(new MenuItem("Sandwich", 5.99));
		cafe.addToMenu(new MenuItem("Cake", 3.99));

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\nCafe Billing Application");
			System.out.println("1. Display Menu");
			System.out.println("2. Take Order");
			System.out.println("3. Print Bill");
			System.out.println("4. Exit");
			System.out.print("Select an option: ");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				cafe.displayMenu();
				break;
			case 2:
				System.out.print("Enter menu item number: ");
				int menuItemIndex = scanner.nextInt() - 1;
				System.out.print("Enter quantity: ");
				int quantity = scanner.nextInt();
				cafe.takeOrder(menuItemIndex, quantity);
				break;
			case 3:
				cafe.printBill();
				break;
			case 4:
				System.out.println("Thank you for using Cafe Billing Application. Goodbye!");
				scanner.close();
				System.exit(0);
			default:
				System.out.println("Invalid option. Please try again.");
			}
		}
	}
}



