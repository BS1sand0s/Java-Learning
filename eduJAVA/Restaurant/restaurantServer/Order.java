package restaurantServer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
	private int tableId;
	private LocalDateTime dateTime;
	private List<OrderItem> items;

	public Order(int tableId) {
		this.tableId = tableId;
		dateTime = LocalDateTime.now();
		items = new ArrayList<OrderItem>();
	}

	public void addItem(MenuItem item, int quantity) {
		OrderItem NewItem = new OrderItem(item, quantity);
		items.add(NewItem);
	}

	public void printBill() {
		System.out.println("------------Bill------------");
		System.out.printf("Table: %d%n", tableId);
		System.out.printf("Date: %s%n", dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		System.out.printf("Time: %s%n", dateTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
		System.out.println("----------------------------");

		double total = 0.0;

		for (OrderItem item : items) {
			double price = item.getMenuItem().getPrice() * item.getQuantity();
			System.out.printf("%s x%d ₹%.2f%n", item.getMenuItem().getName(), item.getQuantity(), price);
			total += price;
		}

		System.out.println("----------------------------");
		System.out.printf("Total: ₹%.2f%n", total);
	}
}
