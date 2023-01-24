package org.example.java12_features;

public class java12StringFeatures {
    public static void main(String[] args) {
        String text = "Hello \nNurbolot!";
        text = text.indent(15);
        System.out.println(text);
        text = text.indent(-10);
        System.out.println(text);


        String olleH = "olleH";
        olleH = olleH.transform(str -> new StringBuffer(str).reverse().toString());
        System.out.println(olleH);


        int numbers = 987654321;
        Integer integer = Integer.valueOf(new StringBuffer(String.valueOf(numbers)).reverse().toString());
        System.out.println(integer);
    }
}
