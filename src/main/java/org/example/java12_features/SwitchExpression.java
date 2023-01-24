package org.example.java12_features;

public class SwitchExpression {
    public static void main(String[] args) {
        String day = "s";
        String res = switch (day) {
            case "m","w", "f" -> "mwf";
            case "t", "th", "s" -> "tths";
            case "su" -> "it's a Sunday";
            default -> "Please insert a valid day";
        };
        System.out.println(res);
    }
}
