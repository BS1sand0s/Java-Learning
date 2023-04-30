/*package restaurantServer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Bill {
    private final int tableId;
    private final Date date;
    private final List<OrderItem> orderItems;

    public Bill(int tableId, List<OrderItem> orderItems) {
        this.tableId = tableId;
        this.date = new Date();
        this.orderItems = orderItems;
    }

    public void printBill() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String dateStr = formatter.format(date);

        System.out.println("--------------- Bill ---------------");
        System.out.println("Table: " + tableId);
        System.out.println("Date: " + dateStr);
        System.out.println("-------------------------------------");
        System.out.println("Menu Items:\t\tQuantity:\tPrice:");
        System.out.println("-------------------------------------");

        double totalCost = 0.0;
        for (OrderItem orderItem : orderItems) {
            MenuItem menuItem = orderItem.getMenuItem();
            int quantity = orderItem.getQuantity();
            double price = menuItem.getPrice() * quantity;
            System.out.println(menuItem.getName() + "\t\t" + quantity + "\t\t" + price);
            totalCost += price;
        }

        System.out.println("-------------------------------------");
        System.out.println("Total cost:\t\t\t\t" + totalCost);
        System.out.println("-------------------------------------");
    }
}

*/