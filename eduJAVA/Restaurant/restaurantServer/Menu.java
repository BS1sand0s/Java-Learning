package restaurantServer;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	private List<MenuItem> starters;
	private List<MenuItem> mainCourses;
	private List<MenuItem> desserts;
	private List<MenuItem> drinks;

	public Menu() {
		starters = new ArrayList<>();
		starters.add(new MenuItem("Soup", 400));
		starters.add(new MenuItem("Salad", 300));
		starters.add(new MenuItem("Garlic bread", 200));
		starters.add(new MenuItem("Manchuria", 500));

		mainCourses = new ArrayList<>();
		mainCourses.add(new MenuItem("Steak", 1200));
		mainCourses.add(new MenuItem("Pizza", 900));
		mainCourses.add(new MenuItem("Burger", 800));
		mainCourses.add(new MenuItem("Pasta", 1100));

		desserts = new ArrayList<>();
		desserts.add(new MenuItem("Ice cream", 300));
		desserts.add(new MenuItem("Chocolate cake", 400));
		desserts.add(new MenuItem("Cheesecake", 500));
		desserts.add(new MenuItem("Rasmalai", 400));

		drinks = new ArrayList<>();
		drinks.add(new MenuItem("Coke", 100));
		drinks.add(new MenuItem("Orange juice", 250));
		drinks.add(new MenuItem("Tea", 150));
		drinks.add(new MenuItem("Coffee", 200));
	}

	public void printMenu() {
		System.out.println("----Starters----");
		for (int i = 0; i < starters.size(); i++) {
			System.out.printf("%d. %s (₹%.2f)%n", i + 1, starters.get(i).getName(), starters.get(i).getPrice());
		}

		System.out.println("\n----Main Courses----");
		for (int i = 0; i < mainCourses.size(); i++) {
			System.out.printf("%d. %s (₹%.2f)%n", i + 5, mainCourses.get(i).getName(), mainCourses.get(i).getPrice());
		}

		System.out.println("\n----Desserts----");
		for (int i = 0; i < desserts.size(); i++) {
			System.out.printf("%d. %s (₹%.2f)%n", i + 9, desserts.get(i).getName(), desserts.get(i).getPrice());
		}

		System.out.println("\n----Drinks----");
		for (int i = 0; i < drinks.size(); i++) {
			System.out.printf("%d. %s (₹%.2f)%n", i + 13, drinks.get(i).getName(), drinks.get(i).getPrice());
		}
	}

	public MenuItem getItem(int itemNumber) {
		if (itemNumber >= 1 && itemNumber <= starters.size()) {
			return starters.get(itemNumber - 1);
		} else if (itemNumber > starters.size() && itemNumber <= starters.size() + mainCourses.size()) {
			return mainCourses.get(itemNumber - starters.size() - 1);
		} else if (itemNumber > starters.size() + mainCourses.size()
				&& itemNumber <= starters.size() + mainCourses.size() + desserts.size()) {
			return desserts.get(itemNumber - starters.size() - mainCourses.size() - 1);
		} else if (itemNumber > starters.size() + mainCourses.size() + desserts.size()
				&& itemNumber <= starters.size() + mainCourses.size() + desserts.size() + drinks.size()) {
			return drinks.get(itemNumber - starters.size() - mainCourses.size() - desserts.size() - 1);
		} else {
			return null;
		}
	}

}
