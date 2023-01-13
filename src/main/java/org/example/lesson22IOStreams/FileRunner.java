package org.example.lesson22IOStreams;

import java.io.File;
import java.io.IOException;

public class FileRunner {
    public static void main(String[] args) throws IOException {
        File resourcesDir = new File("resources");
        File file = new File(".");
        File file3 = new File("~");
        System.out.println(file3.getAbsolutePath());
        String absolutePath = file.getAbsolutePath();
        System.out.println(absolutePath);
        boolean exists = resourcesDir.exists();
        if (!exists){
            System.out.printf("directory resourcesDir Created now %s\n", resourcesDir.mkdir());
        }

        System.out.println("is directory is file " +resourcesDir.isFile());
        System.out.println("is directory is directory " +resourcesDir.isDirectory());
        System.out.println("is directory hidden " + resourcesDir.isHidden());

        File fileRunnerTxt = new File("./resources/fileRunner.txt");
        if (!fileRunnerTxt.exists()){
            System.out.printf("file fileRunnerTxt Created now %s\n", fileRunnerTxt.createNewFile());
        }
        fileRunnerTxt.setReadOnly();
        System.out.println("is file is file " +fileRunnerTxt.isFile());
        System.out.println("is file is directory " +fileRunnerTxt.isDirectory());
        System.out.println("is file hidden " + fileRunnerTxt.isHidden());
    }
}
