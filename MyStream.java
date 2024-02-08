import java.util.*;
import java.util.stream.*;

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
        
        str = str.distinct().sorted();
        System.out.println("After the sorted in distinct order");
        str.forEach(x -> System.out.println(x));
    }

}