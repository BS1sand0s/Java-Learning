package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CreateLinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> friends = new LinkedList<>();

        friends.add("Rajeev");
        friends.add("John");
        friends.add("David");
        friends.add("Chris");

        System.out.println("Initial LinkedList : " + friends);

        friends.add(3, "Lisa");
        System.out.println("After add(3, \"Lisa\") : " + friends);

        friends.addFirst("Steve");
        System.out.println("After addFirst(\"Steve\") : " + friends);

        friends.addLast("Jennifer");
        System.out.println("After addLast(\"Jennifer\") : " + friends);

        List<String> familyFriends = new ArrayList<>();
        familyFriends.add("Jesse");
        familyFriends.add("Walt");

        friends.addAll(familyFriends);
        System.out.println("After addAll(familyFriends) : " + friends);
    }
}
