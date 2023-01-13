package org.example.lesson24;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task2 {
    /*
    2. Создать объект LocalDate, представляющий собой сегодняшнюю
    дату. Преобразовать дату в строку вида "05.05.2017". Вывести эту строку на
    консоль.
     */
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        String format = localDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        System.out.println(format);
    }
}
