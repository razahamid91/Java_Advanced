package parallel_Stream;

import java.util.Arrays;
import java.util.List;

public class demo_stremparllel {


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Using parallel stream to process the list in parallel
        numbers.parallelStream()
               .map(num -> num * 2)
               .forEach(System.out::println);
    }
}
    

