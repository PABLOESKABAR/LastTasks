import java.util.Scanner;

public class Task_1_3_2 {


    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        int x = 3;
        int y = 2;
        System.out.println("Введите положительное целое число a");
        int a = scaner.nextInt();
        System.out.println("Введите положительное целое число b");
        int b = scaner.nextInt();
        System.out.println("Введите шаг");
        int h = scaner.nextInt();
        for (int i = 0; i < 100; i++) {
            x = x+h;
            y= -((-y)-h);
            if (x==y){
                if (a<x && x<b) {
                    System.out.println(x);
                }
            }
        }
    }
}

