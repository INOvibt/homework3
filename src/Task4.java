import java.util.stream.Stream;

public class Task4 {
    public static Stream<Long> generateRandomStream(long a, long c, long m, long seed, int limit) {
        return Stream.iterate(seed, x -> (a * x + c) % m)
                .limit(limit);
    }

    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11;
        long m = (long) Math.pow(2, 48);
        long seed = 42;

        Stream<Long> randomStream = generateRandomStream(a, c, m, seed, 10);
        randomStream.forEach(System.out::println);
    }
}
