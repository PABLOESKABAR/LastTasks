package _1_Basics_of_software_code_development;

import java.util.Scanner;


public class Task_1_2_1 {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        int x=scn.nextInt();
        int y=scn.nextInt();
        int z=x+y;
        if (180>z) {
            System.out.println("Данный треугольник существует");
           if (z==90){
                System.out.println("Данный треугольник прямоугольный");
            }
            else {
                System.out.println("Треугольник не прямоугольный");
            }


        }
        else {
            System.out.println("Данный треугольник не существует");
        }
    }
}
