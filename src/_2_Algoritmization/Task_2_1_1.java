package _2_Algoritmization;

//Найти сумму элементов которые кратны К


import java.util.Scanner;

public class Task_2_1_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter integer K");
        int k = scn.nextInt();
        int x = 0;
        int [] arr = new int[15];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = (int) Math.round(Math.random() * 30);
            System.out.print(arr[i]+" ");
            if (arr[i]%k==0){
                x =x + arr[i];
            }
        }
        System.out.println(" ");
        System.out.println(x);
    }
}
