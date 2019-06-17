package _1_Basics_of_software_code_development;

import java.util.Scanner;

public class Task_1_1_1 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter a");
        double a = scaner.nextDouble();
        System.out.println("Enter b");
        double b = scaner.nextDouble();
        System.out.println("Enter c");
        double c = scaner.nextDouble();
        double z = ((a-3)*(b/2))+c;
        System.out.println("Variable value z = "+z);



    }
}
