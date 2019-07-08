package by.java.EPAM._2_Algoritmization;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Task_2_1_8 {
    public static void main(String[] args) {

        // Date in String format.
        String dateString = "2018-09-05";

        // Converting date to Java8 Local date
        LocalDate startDate = LocalDate.parse(dateString);
        LocalDate endtDate = LocalDate.now();
        // Range = End date - Start date
        Long range = ChronoUnit.DAYS.between(startDate, endtDate);
        System.out.println("Колличество недель для Насти  ==>  "+range/7+" неделя и "+range%7+" дней");
    }

}
