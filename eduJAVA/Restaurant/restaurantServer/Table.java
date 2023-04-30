package restaurantServer;

public class Table {
	private int tableNumber;
	private boolean isOccupied;

	public Table(int tableNumber) {
		this.tableNumber = tableNumber;
		this.isOccupied = false;
	}

	public int getTableNumber() {
		return tableNumber;
	}

	public boolean isOccupied() {
		return isOccupied;
	}

	public void setOccupied(boolean isOccupied) {
		this.isOccupied = isOccupied;
	}
}
