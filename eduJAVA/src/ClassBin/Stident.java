package ClassBin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@FunctionalInterface 								//helps eclipse check for single method and throw error other wise.
interface StidentPredicate {
	boolean test(Stident Stident);
}

public class Stident {
	private int id;
	private String name;
	private String course;

	public Stident(int id, String name, String course) {
		this.id = id;
		this.name = name;
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCourse() {
		return course;
	}

	public static void main(String[] args) {
		List<Stident> stidents = new ArrayList<>();
        stidents.add(new Stident(41, "Satwik", "JSD"));
        stidents.add(new Stident(32, "Gourav", "Apti"));
        stidents.add(new Stident(53, "Nilesh", "JSD"));
        stidents.add(new Stident(64, "Sandip", "Apti"));
        stidents.add(new Stident(25, "Shyam", "JSD"));

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the course to filter for: ");
		String course = scanner.nextLine();

		StidentPredicate coursePredicate = Stident -> Stident.getCourse().equals(course);
		List<Stident> filteredStidents = filterStidents(stidents, coursePredicate);

		for (Stident Stident : filteredStidents) {
			System.out.println(
					"ID: " + Stident.getId() + ", Name: " + Stident.getName() + ", Course: " + Stident.getCourse());
		}
	}

	private static List<Stident> filterStidents(List<Stident> Stidents, StidentPredicate predicate) {
		List<Stident> filteredStidents = new ArrayList<>();
		for (Stident Stident : Stidents) {
			if (predicate.test(Stident)) {
				filteredStidents.add(Stident);
			}
		}
		return filteredStidents;
	}
}
