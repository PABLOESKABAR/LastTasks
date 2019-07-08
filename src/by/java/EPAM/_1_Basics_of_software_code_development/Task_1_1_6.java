package by.java.EPAM._1_Basics_of_software_code_development;

import java.util.Scanner;

public class Task_1_1_6 {
    public static void main(String[] args) {


        Scanner scaner = new Scanner(System.in);
        int x = scaner.nextInt();
        int y = scaner.nextInt();
        boolean b = true;



        if (-5<x & x<5 & -4<y & y<1){
            b = true;
            System.out.println(b);
        }
        else if (-3<x & x<3 & -1<y & y<5){
            b = true;
            System.out.println(b);
        }
        else {
            b = false;
            System.out.println(b);
        }



    }
}
