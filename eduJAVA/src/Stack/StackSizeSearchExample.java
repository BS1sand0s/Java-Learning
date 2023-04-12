package Stack;

import java.util.Stack;

public class StackSizeSearchExample {
    public static void main(String[] args) {
        Stack<String> stackOfCards = new Stack<>();

        stackOfCards.push("Jack");
        stackOfCards.push("Queen");
        stackOfCards.push("King");
        stackOfCards.push("Ace");

        System.out.println("Stack : " + stackOfCards);
        System.out.println("Is Stack empty? : " + stackOfCards.isEmpty());
        System.out.println("Size of Stack : " + stackOfCards.size());
        int position = stackOfCards.search("Queen");

        if(position != -1) {
            System.out.println("Found the element \"Queen\" at position : " + position);
        } else {
            System.out.println("Element not found");
        }

    }
}
