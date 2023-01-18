package org.example.test;

import java.util.HashMap;
import java.util.regex.Pattern;

public class YandexTask1 {
    public static void main(String[] args) {
        String str = "AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBB";
        System.out.println(rle(str));
    }
    public static String rle(String str){
        if (str == null || !str.matches("^[A-Z]*")) {
            throw new IncorrectElementException(str);
        }

        HashMap<String, Long> map = new HashMap<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            String charAt = String.valueOf(str.charAt(i));
            String charAt2 = String.valueOf(str.charAt(i + 1));
            if (map.containsKey(charAt) && charAt2.equals(charAt)){
                Long aLong = map.get(charAt);
                map.put(charAt, ++aLong);
            } else {
                map.put(charAt, 1L);
            }
        }

        map.forEach((key, value) -> result.append(key).append(value));
        return result.toString();
    }

    static class IncorrectElementException extends RuntimeException{
        public IncorrectElementException(String message) {
            super(message);
        }
    }
}
