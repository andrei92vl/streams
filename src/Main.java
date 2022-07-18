import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        IntStream
           .range(1, 7)
           .forEach(System.out::print);
        System.out.println();
        ////
        IntStream
                .range(1,7)
                .skip(4)
                .forEach(x -> System.out.print(x));
        System.out.println();
        ///
        System.out.println(IntStream.range(1,10).sum());
        ///
        Stream.of("Andrei", "Marius", "Ana", "Mihai", "Gigel")
                .sorted()
                .findFirst()
                .ifPresent(x -> System.out.println(x));
        ///
        String str[] = {"Andrei","Marius", "Gigel", "Ramona", "Ana"};
        Arrays.stream(str)
              .filter(x -> x.startsWith("A"))
              .sorted()
              .forEach(x -> System.out.println(x));
        /////
        Arrays.stream(new int[] {2,3})//(2*2+3*3) /2
                .map(x -> x*x)
                .average()
                .ifPresent(System.out::println);
    }
}
