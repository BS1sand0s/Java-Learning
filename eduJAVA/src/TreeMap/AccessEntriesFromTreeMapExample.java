package TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class AccessEntriesFromTreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> employees = new TreeMap<>();

        employees.put(1003, "Rajeev");
        employees.put(1001, "James");
        employees.put(1002, "Sachin");
        employees.put(1004, "Chris");

        System.out.println("Employees map : " + employees);
        System.out.println("Total number of employees : " + employees.size());
        Integer id = 1004;
        if(employees.containsKey(id)) {
            String name = employees.get(id);
            System.out.println("Employee with id " + id + " : " + name);
        } else {
            System.out.println("Employee does not exist with id : " + id);
        }
        System.out.println("First entry in employees map : " + employees.firstEntry());
        System.out.println("Last entry in employees map : " + employees.lastEntry());
        Map.Entry<Integer, String> employeeJustBelow = employees.lowerEntry(1002);
        System.out.println("Employee just below id 1002 : " + employeeJustBelow);
        Map.Entry<Integer, String> employeeJustAbove = employees.higherEntry(1002);
        System.out.println("Employee just above id 1002 : " + employeeJustAbove);
    }
}
