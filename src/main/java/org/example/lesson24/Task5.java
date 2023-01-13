package org.example.lesson24;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Task5 {
    /*
    6. Создать объект Instant. Вывести его на консоль. Затем создать
    объект ZonedDateTime на основании предыдущего объекта с тайм зоной "Africa/Cairo".
     */
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);

        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("Asia/Almaty"));
        System.out.println(zonedDateTime);
    }
}
