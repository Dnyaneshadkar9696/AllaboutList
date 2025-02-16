import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args){
        LinkedList<String> city = new LinkedList<>();

        city.add("Pune");
        city.add("junnar");
        city.add("andra");
        city.add("mumbai");

        // well used for proper insertion and deletion opration

        //  and the retrival

        System.out.println("the frist element " + city.getFirst());
        System.out.println("the frist element " + city.getLast());
        System.out.println("the second  index " + city.get(2));

    }
    
}
