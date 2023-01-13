package org.example.lesson24;

import java.time.*;

public class TimeExample {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);


        Instant instant = Instant.now();
        System.out.println(instant);


        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        OffsetTime offsetTime = OffsetTime.now();
        System.out.println(offsetTime);

        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        System.out.println(offsetDateTime);
        System.out.println();

        Period period = Period.between(LocalDate.ofEpochDay(2002-1-19), LocalDate.now());
        System.out.println(period.getDays());

    }
}
