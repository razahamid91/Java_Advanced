
import java.util.*;
import java.util.stream.Collectors;

public class MyMapStrem {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

        List<Integer> square = numbers.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(numbers);
        System.out.println(square);

        // original arry is not mutable
        System.out.println(numbers);
    }

}
