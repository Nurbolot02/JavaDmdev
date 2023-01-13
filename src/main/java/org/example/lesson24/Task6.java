package org.example.lesson24;

import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class Task6 {
    /*
    7. Написать свою реализацию интерфейса TemporalAdjuster, которая бы
    прибавляла к дате 42 дня
     */
    public static void main(String[] args) {
        TemporalAdjuster temporalAdjuster = new AddDay();
        LocalDate localDate = LocalDate.now();
        Temporal temporal = temporalAdjuster.adjustInto(localDate);
        System.out.println(localDate);
        System.out.println(temporal);
    }
}
