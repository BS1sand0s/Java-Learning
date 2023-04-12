package Treeset;

import java.util.SortedSet;
import java.util.TreeSet;

public class CreateTreeSetExample {
    public static void main(String[] args) {
        SortedSet<String> fruits = new TreeSet<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Orange");

        System.out.println("Fruits Set : " + fruits);
        fruits.add("Apple");
        System.out.println("After adding duplicate element \"Apple\" : " + fruits);
        fruits.add("banana");
        System.out.println("After adding \"banana\" : " + fruits);
    }
}
