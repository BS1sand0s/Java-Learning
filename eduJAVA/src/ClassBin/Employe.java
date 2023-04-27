package ClassBin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Employe {
	private int id;
	private String name;
	private int salary;
	private int Exp;

	public Employe(int id, String name, int salary, int exp) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.Exp = exp;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getsalary() {
		return salary;
	}
	
	public int getexp() {
		return Exp;
	}
	
	public void setsalary(int x) {
		this.salary = x;
	}
	

	public static List<Employe> increment(List<Employe> list, int E) {
		List<Employe> newEmployees = list.stream().filter(emp -> emp.getexp() > E).map(emp -> {
			  emp.setsalary(emp.getsalary() * 11/10);
			  return emp;
			}).collect(Collectors.toList());
		return newEmployees;
	}
	
	

	public static void main(String[] args) {
		List<Employe> Employes = new ArrayList<>();
		Employes.add(new Employe(41, "Satwik", 100, 1));
		Employes.add(new Employe(32, "Gourav", 500, 2));
		Employes.add(new Employe(53, "Nilesh", 600, 3));
		Employes.add(new Employe(64, "Sandip", 400, 4));
		Employes.add(new Employe(25, "Shyam", 800, 5));
/*
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the salary to filter for: ");
		int salary = Integer.parseInt(scanner.nextLine());
		scanner.close();

		Predicate<Employe> salaryPredicate = Employe -> Employe.getsalary() < salary;
		List<Employe> filteredEmployes = filterEmployes(Employes, salaryPredicate);

		for (Employe Employe : filteredEmployes) {
			System.out.println(
					"ID: " + Employe.getId() + ", Name: " + Employe.getName() + ", Salary: " + Employe.getsalary());
		}*/
		for (Employe Employe : increment(Employes, 3)) {
			System.out.println(
					"ID: " + Employe.getId() + ", Name: " + Employe.getName() + ", Salary: " + Employe.getsalary());
		}
		
		
	
	}

	private static List<Employe> filterEmployes(List<Employe> Employes, Predicate<Employe> predicate) {

		List<Employe> filteredEmployes = Employes.stream().filter(predicate).collect(Collectors.toList());

		return filteredEmployes;
	}
}
