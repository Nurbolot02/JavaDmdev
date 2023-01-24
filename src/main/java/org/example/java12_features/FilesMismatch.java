package org.example.java12_features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesMismatch {
    public static void main(String[] args) throws IOException {
        Path file1 = Files.createTempFile("file1", ".txt");
        Path file2 = Files.createTempFile("file2", ".txt");


        Files.writeString(file1, "Hello World");
        Files.writeString(file2, "Hello World");

        long mismatch = Files.mismatch(file1, file2);
        System.out.println(mismatch);



        Path file3 = Files.createTempFile("file3", ".txt");
        Path file4 = Files.createTempFile("file4", ".txt");

        Files.writeString(file3, "Hello World");
        Files.writeString(file4, "Hello  World");

        long mismatch1 = Files.mismatch(file3, file4);
        System.out.println(mismatch1);
    }
}
