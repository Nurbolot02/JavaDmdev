package org.example.java17_features;

public class SwitchImprove {
    static record Human(String name, int age, String profession){};
    public static void main(String[] args) {
        Human human = new Human("Alex", 50, "Java developer");

        String str = "just string";
        int number = 5;

        System.out.println(checkObject(human));
        System.out.println(checkObject(str));
    }
    
    
    public static String checkObject(Object obj) {
        return switch (obj) {
            case Human h -> "This is %s".formatted(h.name);
            case String s -> "text: %s".formatted(s);

            default -> "this is an object";
        };
    }


}
