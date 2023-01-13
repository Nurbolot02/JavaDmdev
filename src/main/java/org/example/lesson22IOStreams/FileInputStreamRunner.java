package org.example.lesson22IOStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;

public class FileInputStreamRunner {
    public static void main(String[] args) {
//        File resources = new File(String.join(File.separator, "resources", "fileRunner.txt"));
        File resources = Path.of("resources", "fileRunner.txt").toFile();
        try(
                FileInputStream fileInputStream = new FileInputStream(resources);
        ){
//            byte[] bytes = fileInputStream.readAllBytes();
//            String intern = new String(bytes).intern();
//            System.out.println(intern);

            byte[] bytes = new byte[fileInputStream.available()];
            byte currentByte;
            int counter = 0;
            while ((currentByte = (byte) fileInputStream.read()) != -1){
                bytes[counter++] =currentByte;
            }

            String intern = new String(bytes).intern();
            System.out.println(intern);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
