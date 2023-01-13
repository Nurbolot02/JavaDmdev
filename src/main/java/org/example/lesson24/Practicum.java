package org.example.lesson24;

import java.time.LocalDateTime;

public class Practicum {
    public static void main(String[] args) {
        /*
        1. Создать объект LocalDateTime, представляющий собой
        дату 25.06.2020 19:47. Используя этот объект, создать другой объект LocalDateTime,
        представляющий собой дату через 3 месяца после сегодняшней.
        Вывести на консоль содержащиеся в нем объеты LocalDate and LocalTime.
         */
        LocalDateTime localDateTime = LocalDateTime.of(2020, 6, 25, 19, 47);
        LocalDateTime localDateTime1 = localDateTime.plusMonths(3);
        System.out.println(localDateTime1.toLocalDate() + " " + localDateTime1.toLocalTime());
        System.out.println(localDateTime1);
    }
}
