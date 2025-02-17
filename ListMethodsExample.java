import java.util.*;

public class ListMethodsExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        
        // 1. Add elements
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println(names);

        // 2. Insert at a specific index
        names.add(1, "David"); // ["Alice", "David", "Bob", "Charlie"]

        // 3. Remove an element
        names.remove("Bob"); // Removes "Bob" from the list

        // 4. Get element at index 1
        System.out.println("Element at index 1: " + names.get(1)); // Output: David

        // 5. Replace element at index 1
        names.set(1, "Eve"); // ["Alice", "Eve", "Charlie"]

        // 6. Check if list contains an element
        System.out.println("Contains Alice? " + names.contains("Alice")); // true

        // 7. Find index of an element
        System.out.println("Index of Eve: " + names.indexOf("Eve")); // 1

        // 8. Sort the list alphabetically
        Collections.sort(names);
        System.out.println("Sorted List: " + names);

        // 9. Remove all elements
        names.clear();
        System.out.println("Is list empty? " + names.isEmpty()); // true
    }
}
