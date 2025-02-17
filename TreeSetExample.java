// gives the numbers in the sorter order
import java.util.TreeSet;
import java.util.Set;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        
        numbers.add(30);
        numbers.add(10);
        numbers.add(50);
        numbers.add(20);
        
        System.out.println(numbers);  // Output: [10, 20, 30, 50] (Sorted order)
    }
}
