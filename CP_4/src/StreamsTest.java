import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Hernan Y.Ke on 2015/11/19.
 */
public class StreamsTest {
    public static void main(String[] args) {

        //iterator method, param:(initial value, func)
        IntStream.iterate(0, n -> n + 1).filter(n -> n > 10).limit(10).forEach(n -> System.out.println(n));
        String[] team1 = {"cat", "dog", "bee"};
        String[] team2 = {"pen", "pencil", "paper"};
        Random random = new Random();
        Stream.iterate(team1[random.nextInt(3)] + " " + team2[random.nextInt(3)], m -> team1[random.nextInt(3)] + " " + team2[random.nextInt(3)]).limit(8).forEach(System.out::println);

        //supplier
        Supplier intSupplier = () -> 0;
        Stream.generate(intSupplier).limit(4).forEach(System.out::println);

        //using a function
        Supplier<Double> randomSupplier = Math::random;
        Stream.generate(randomSupplier).limit(4).forEach(System.out::println);

    }
}
