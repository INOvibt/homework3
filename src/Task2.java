import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static List<String> processStrings(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .sorted((s1, s2) -> s2.compareTo(s1))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> strings = List.of("Ivan", "John", "Peter", "Alice", "Bob");

        List<String> result = processStrings(strings);

        System.out.println(result);
    }
}
