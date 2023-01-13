package org.example.test;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> stringHashMap = new HashMap<>();
        stringHashMap.put("1", "100");
        System.out.println(stringHashMap.get("1"));
        System.out.println();
    }
}
