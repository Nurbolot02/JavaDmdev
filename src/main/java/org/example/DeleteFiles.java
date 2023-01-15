package org.example;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class DeleteFiles {
    public static void main(String[] args) {
        String path = "D:\\IELTS Пошаговая инструкция  ОСВОЕНИЕ ВСЕХ НАВЫКОВ 7";
        deleteEmptyMp4(path);

        System.out.println();
    }

    private static boolean deleteEmptyMp4(String path){
//        "D:\\Spring Boot Microservices и Spring Cloud"

        File file = new File(path);

        File[] files = file.listFiles();

        assert files != null;
        for (File file1: files){
            for (File file2: Objects.requireNonNull(file1.listFiles())){
                if (file2.getAbsolutePath().endsWith(".mp4") || file2.getAbsolutePath().endsWith(".srt")){
                    file2.delete();
                }
            }
        }
        System.out.printf("all video(.mp4) and subtitles(.srt) were deleted from %s", path);
        return true;
    }

    private boolean deleteEmptyFolders(String path){
//        "D:\\Spring Boot Microservices и Spring Cloud"

        File file = new File(path);

        File[] files = file.listFiles();

        assert files != null;

        for (File file1: files){
            if (file1.isDirectory() && file1.list().length == 0){
                file1.delete();
            }
        }
        return true;
    }
}
