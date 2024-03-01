import java.util.ArrayList;
import java.util.List;

 class Ques1 {
    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>();
        elements.add(2);
        elements.add(3);
        elements.add(4);
        elements.add(5);
        elements.add(6);
        elements.stream()
                .filter(e -> e % 2 == 0)
                .sorted()
                .limit(5)
                .forEach(System.out::println);
    }
}