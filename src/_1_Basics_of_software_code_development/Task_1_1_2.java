package _1_Basics_of_software_code_development;

import java.util.Scanner;



public class Task_1_1_2 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter a");
        double a = scaner.nextDouble();
        System.out.println("Enter b");
        double b = scaner.nextDouble();
        System.out.println("Enter c");
        double c = scaner.nextDouble();
        double z = ((b+Math.sqrt(Math.pow(b , 2)+4*a*c)))/2*a-Math.pow(a, 3)*c+Math.pow(b, -2);
        System.out.println("Variable value z = "+z);

    }
}
