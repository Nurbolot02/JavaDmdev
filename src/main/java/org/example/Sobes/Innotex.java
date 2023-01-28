package org.example.Sobes;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Innotex {
    public static void main(String[] args) {
        /*
        На вход приходит строка вида "cdabcdji", необходимо преобразовать к виду "abcdij",
         то есть удалить повторяющиеся символы и вывести результат в отсортированном виде.
         */
        String str = "cdabcdji";
        String res = deleteUnUniqCharsAndSort(str);
        System.out.println(res);
    }

    public static String deleteUnUniqCharsAndSort(String str) {
        return Arrays.stream(str.split(""))
                .distinct()
                .sorted()
                .collect(Collectors.joining());
    }

    public static String deleteUnUniqCharsAndSort2(String str) {
        TreeSet<Character> result = new TreeSet<>();
        for (int i = 0; i < str.length(); i++) {
            result.add(str.charAt(i));
        }
        return "";
        
    }

}
