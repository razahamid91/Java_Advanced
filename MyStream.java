import java.util.ArrayList;
import java.util.stream.Stream;

public class MyStream {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);
        al.add(10);
        al.add(12);
        al.add(5);
        al.add(9);
        al.add(56);
        al.add(9);
        al.add(12);
        al.add(23);

        Stream<Integer> str = al.stream();
        System.out.println(al);
        str.forEach(x -> System.out.println(x));

        // Create a new stream after applying distinct and sorted operations
        Stream<Integer> newStr = al.stream().distinct().sorted();
        System.out.println("After sorted in distinct order");
        newStr.forEach(x -> System.out.println(x));
    }
}