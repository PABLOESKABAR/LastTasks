package _1_Basics_of_software_code_development;

import java.util.Scanner;

public class Task_1_3_7 {


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Введите переменную m");
        int m = scn.nextInt();
        System.out.println("Введите переменную n");
        int n = scn.nextInt();
        for (int i = m; i <=n; i++) {
            System.out.print("Число "+i+" имеет следующие делители: ");
            if (i%2==0){
                System.out.print(2+" ");

            if (i%3==0){
                System.out.print(3+" ");

            if (i%4==0){
                System.out.print(4+" ");

            if (i%5==0){
                System.out.print(5+" ");

            if (i%6==0){
                System.out.print(6+" ");

            if (i%7==0){
                System.out.print(7+" ");

            if (i%8==0){
                System.out.print(8+" ");

            if (i%9==0){
                System.out.print(9+" ");
            }
            }
            }
            }
            }
            }}}
            else {
                System.out.print("Делится либо на один либо на само себя");
            }
            System.out.println(" ");
        }
    }
}


