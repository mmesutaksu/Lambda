package StreamOrnekler;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;
import java.util.stream.Stream;

public class Stream06Files {

    public static void main(String[] args) throws IOException {

        String path="src/StreamOrnekler/mars.txt";
        Stream<String> satirlar = Files.lines(Path.of(path));
        satirlar.forEach(System.out::println);
        System.out.println("================================================");
        // Harfleri büyük olarak yazdiralim
        Files.lines(Path.of(path)).
                map(t-> t.toUpperCase()).
                forEach(System.out::println);

    }
}
