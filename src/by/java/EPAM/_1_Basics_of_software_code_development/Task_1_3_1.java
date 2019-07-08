package by.java.EPAM._1_Basics_of_software_code_development;

import java.util.Scanner;

public class Task_1_3_1 {


    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите положительное целое число");
        int x = scaner.nextInt();
        int y=0;
        for (int i = 0; i <=x; i++) {
            y = y+i;

        }
        System.out.println("Сумма чисел от 0 до "+x+" равна "+y);
    }

}

