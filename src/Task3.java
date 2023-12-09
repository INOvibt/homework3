import java.util.Arrays;
import java.util.stream.Collectors;

public class Task3 {
    public static String processArray(String[] array) {
        return Arrays.stream(array)
                .flatMap(s -> Arrays.stream(s.split(", ")))
                .map(Integer::parseInt)
                .sorted()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
    }
    public static void main(String[] args) {
        String[] array = {"3, 5, 0", "8, 5"};

        String result = processArray(array);

        System.out.println(result);
    }
}
