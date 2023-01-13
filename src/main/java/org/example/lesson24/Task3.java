package org.example.lesson24;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class Task3 {
    /*
    3. Дана строка вида "26-03-1968T09:24". Получить объект LocalDateTime, представляющий
    собой дату, полученную из этой строки.
    Использовать LocalDateTime из предыдущего задания, преобразовать его
    в объект типа Instant, указав тайм зону "America/Chicago". Вывести количество
    прошедших миллисекунд.
     */
    public static void main(String[] args) {
        String dateTime = "26-03-1968T09:24";
        LocalDateTime localDateTime = LocalDateTime.parse(dateTime, DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm"));
        System.out.println(localDateTime);

        Instant instant = localDateTime.toInstant(ZoneId.of("America/Chicago").getRules().getOffset(localDateTime));
        System.out.println(instant);
        System.out.println(instant.toEpochMilli());
    }
}
