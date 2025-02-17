import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> names = new LinkedHashSet<>();
        
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Alice");  // Duplicate, will be ignored
        
        System.out.println(names);  // Output: [Alice, Bob, Charlie] (Maintains order)
    }
}
