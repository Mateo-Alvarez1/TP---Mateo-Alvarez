import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 1000000).forEach(System.out::println);
    }
}