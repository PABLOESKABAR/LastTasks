package by.java.EPAM._1_Basics_of_software_code_development;

import java.util.Scanner;


public class Task_1_2_2 {


    public static void main(String[] args) {
        int min1,min2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите переменную а");
        int a = scanner.nextInt();
        System.out.println("Ведите переменную b");
        int b = scanner.nextInt();
        System.out.println("Ведите переменную c");
        int c = scanner.nextInt();
        System.out.println("Ведите переменную d");
        int d = scanner.nextInt();
        if (a<b){min1=a;}
        else {min1=b;}
        if (c<d){min2=c;}
        else {min2=d;}
        if (min1<min2){
            System.out.println(min2);
        }
        else {
            System.out.println(min1);
        }

    }
}

