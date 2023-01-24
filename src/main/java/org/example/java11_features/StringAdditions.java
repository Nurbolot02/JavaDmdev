package org.example.java11_features;

import org.springframework.lang.NonNull;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StringAdditions {
    public static void main(String[] args) throws IOException {
        String repeat = "La".repeat(2) + "Land";
        System.out.println(repeat);


        String strip = "\n\t hello \u2005";
        System.out.println(strip.strip());


        String isBlank = "\n\t\u2005 h";
        System.out.println(isBlank.isBlank());


        String multiLineStr = "This is \n \n a multiline \n str";
        long count = multiLineStr.lines()
                .filter(String::isBlank)
                .count();

        System.out.println(count);


        List<String> stringList = Arrays.asList("Hello", "world", "My", "name", "is", "Ntg");
        System.out.println(String.join(" ", stringList));

        String str = "abs";
        String str2 = "ABS";
        str.chars().forEach(System.out::println);
        str2.codePoints().forEachOrdered(System.out::println);

        Path path = Files.writeString(Files.createTempFile("test", ".txt"), "Write by java 11 support");
        System.out.println(path);
        System.out.println(Files.readString(path));

        System.out.println(Math.log(100));


        List<String> stringList1 = Arrays.asList("This is", "\n \n", "end of text");
        stringList1.stream()
                .filter(Predicate.not(String::isBlank))
                .forEach(System.out::println);

        stringList1
                .forEach(System.out::println);


        Stream.of("Str1", "", null, "end")
                .filter(Objects::nonNull)
                .map((@NonNull var str1) -> str1.toUpperCase())
                .forEach(System.out::println);
    }
}
