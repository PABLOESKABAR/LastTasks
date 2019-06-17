package _1_Basics_of_software_code_development;

import java.util.Scanner;
/*
Задание:
Найти совпадающие цифры в двух заданных числах
*/
public class Task_1_3_8 {


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Введите преременную n");
        int n = scn.nextInt();
        System.out.println("Введите переменную m");
        int m = scn.nextInt();
        char [] chars1 = String.valueOf(n).toCharArray();
        char [] chars2 = String.valueOf(m).toCharArray();
        System.out.print("В числах "+n+" и "+m+" совпадают следующие цифры : ");
        for (int i=0;i<chars1.length;i++){
            for (int j = 0; j < chars2.length; j++) {
                if (chars1[i]==chars2[j]){
                    System.out.print(chars1[i]+" ");
                }

            }

        }

    }
}


