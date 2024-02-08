package parallel_Stream;

import java.util.*;

class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {

        return name;
    }

    public int getScore() {
        return score;
    }
}

public class Paralle_Stream {

    public static void main(String[] args) {

        // IntStream is= IntStream.rangeClosed(1,5);

        // System.out.println("sequential streaming");
        // is.forEach(System.out::println);

        // System.out.println("paralle_stream");

        // IntStream ps= IntStream.rangeClosed(1,5 );
        // ps.parallel().forEach(System.out::println);

        List<Student> s = Arrays.asList(
                new Student("raj", 25),
                new Student("tin", 87),
                new Student("jim", 90),
                new Student("sam", 76),
                new Student("hamid", 99),
                new Student("sunny", 67));

        // implementation of sequenatial stream
        System.out.println("sequenatial stream");
        s.stream().filter(e -> e.getScore() >= 75)
                .limit(4)
                .forEach(t -> System.out.println("name: " + t.getName() + " score: " + t.getScore()));

        // implementation of parallel stream

        System.out.println("parallel stream");

        s.parallelStream().filter(e -> e.getScore() >= 75)
                .limit(4)
                .forEach(t -> System.out.println("name: " + t.getName() + " score: " + t.getScore()));
    }

}
