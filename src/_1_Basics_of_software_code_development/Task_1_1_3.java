package _1_Basics_of_software_code_development;

import java.util.Scanner;

public class Task_1_1_3 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter x");
        double x = scaner.nextDouble();
        System.out.println("Enter y");
        double y = scaner.nextDouble();
        double z = (Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x*y);
        System.out.println("Variable value z = "+z);

    }
}
