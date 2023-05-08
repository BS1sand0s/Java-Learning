package restaurantServer;

import java.util.Scanner;

public class restaurantOrder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Table[] tables = new Table[5];
		for (int i = 0; i < tables.length; i++) {
			tables[i] = new Table(i + 1);
		}
		Menu menu = new Menu();
		boolean isRunning = true;
		System.out.println("Welcome to the Hotel Ordering App!");
		while (isRunning) {
			System.out.println("1. View menu");
			System.out.println("2. Place order");
			System.out.println("3. Exit");
			System.out.print("Enter choice: ");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				menu.printMenu();
				break;
			case 2:
				boolean isTableAvailable = false;
				int tableNumber = -1;
				while (!isTableAvailable) {
					System.out.print("Enter table number: ");
					tableNumber = scanner.nextInt();
					if (tableNumber > 5) {
						System.out.println("Table does not exist. Please check your table number.");
					} else if (tables[tableNumber - 1].isOccupied()) {
						System.out.println("Table is occupied. Please try another table.");
					} else {
						isTableAvailable = true;
						tables[tableNumber - 1].setOccupied(true);// can open thread for table and close on bill
																	// printing
					}
				}
				Order order = new Order(tableNumber);
				boolean isOrdering = true;
				while (isOrdering) {
					System.out.println("Enter item number to add to order (0 to finish order):");
					int itemNumber = scanner.nextInt();
					if (itemNumber == 0) {
						isOrdering = false;
					} else {
						MenuItem item = menu.getItem(itemNumber);
						if (item != null) {
							System.out.print("Enter quantity: ");
							int quantity = scanner.nextInt();
							order.addItem(item, quantity);
						} else {
							System.out.println("Invalid item number.");
						}
					}
				}
				tables[tableNumber - 1].setOccupied(false);
				// Bill bill = new Bill(order);
				order.printBill();
				break;
			case 3:
				System.out.println("Exiting application...");
				isRunning = false;
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
				break;
			}
		}
		scanner.close();
	}
}
