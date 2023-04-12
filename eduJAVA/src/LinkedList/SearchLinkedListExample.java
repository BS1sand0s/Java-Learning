package LinkedList;

import java.util.LinkedList;

public class SearchLinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> employees = new LinkedList<>();

        employees.add("John");
        employees.add("David");
        employees.add("Lara");
        employees.add("Chris");
        employees.add("Steve");
        employees.add("David");
        System.out.println("Does Employees LinkedList contain \"Lara\"? : " + employees.contains("Lara"));
        System.out.println("indexOf \"Steve\" : " + employees.indexOf("Steve"));
        System.out.println("indexOf \"Mark\" : " + employees.indexOf("Mark"));
        System.out.println("lastIndexOf \"David\" : " + employees.lastIndexOf("David"));
        System.out.println("lastIndexOf \"Bob\" : " + employees.lastIndexOf("Bob"));
    }
}
