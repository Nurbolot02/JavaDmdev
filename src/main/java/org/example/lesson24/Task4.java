package org.example.lesson24;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Task4 {
    /*
        Создать объект LocalDate, представляющий собой сегодняшнюю
        дату. Создать объект LocalDate, представляющий собой дату
        07.07.2018. Используя созданные объекты, найти количество дней между
        этими двумя датами.
        5. Даны два объекта LocalDate из предыдущего задания. Подсчитать количество
    секунд между полуночью первой даты и полуночью второй даты.
     */
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.of(2018, 7, 7);
        Period period = Period.between(localDate1, localDate);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        long between = ChronoUnit.MONTHS.between(localDate1, localDate);
        System.out.println(between);

        LocalDateTime localDateTime = localDate.atStartOfDay();
        LocalDateTime localDateTime1 = localDate1.atStartOfDay();

        Duration duration = Duration.between(localDateTime1, localDateTime);
        System.out.println(duration.getSeconds());
    }
}
