package org.example;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class DeleteFiles {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7};
        Arrays.stream(array)
                .peek(System.out::print)
                .filter(i -> i > 5)
                .peek(System.out::print)
                .findFirst();

        String path = "D:\\Docker and Kubernetes The Complete Guide 2018";

        deleteEmptyMp4AndSrt(path);
    }

    private static boolean deleteEmptyMp4AndSrt(String path){
//        "D:\\Spring Boot Microservices и Spring Cloud"

        File file = new File(path);

        File[] files = file.listFiles();

        assert files != null;
//        int i = 0;
        for (File file1: files){
//            if (i >= 8) {
//                break;
//            }
            for (File file2: Objects.requireNonNull(file1.listFiles())){
                if (file2.getAbsolutePath().endsWith(".mp4") || file2.getAbsolutePath().endsWith(".srt")){
                    file2.delete();
                }
            }
//            i++;
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
