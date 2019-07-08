package by.java.EPAM._2_Algoritmization;
//Дана последовательность чисел. Найти числа больше z и заменить на z эти числаю. Количество

import java.util.Scanner;

public class Task_2_1_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter integer K");
        int z = scn.nextInt();
        int x = 0;
        int [] arr = new int[15];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = (int) Math.round(Math.random() * 30);
            System.out.print(arr[i]+" ");
            if (arr[i]>z){
                arr[i] = z;
                x++;
            }
        }
        System.out.println(" ");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        System.out.println("Количество замен "+x);
    }
}