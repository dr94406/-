package src;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamPractice {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a1","a2","b1","b2","c2","c1","c3");

        Stream<String> stream = list.stream(); // stream 통로의 개념과 유사하다.
        Stream<String> filtered = stream.filter(s -> s.startsWith("a"));
        filtered.forEach(System.out::println);
    }
}
