package by.java.EPAM._1_Basics_of_software_code_development;

import java.util.Scanner;

public class Task_1_2_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите переменную x1");
        int x1 = scanner.nextInt();
        System.out.println("Ведите переменную y1");
        int y1 = scanner.nextInt();
        System.out.println("Ведите переменную x2");
        int x2 = scanner.nextInt();
        System.out.println("Ведите переменную y2");
        int y2 = scanner.nextInt();
        System.out.println("Ведите переменную x3");
        int x3 = scanner.nextInt();
        System.out.println("Ведите переменную y3");
        int y3 = scanner.nextInt();
        double side1 = Math.sqrt(Math.pow((Math.abs(x1-x2)),2)+Math.pow((Math.abs(y1-y2)),2));
        double side2 = Math.sqrt(Math.pow((Math.abs(x2-x3)),2)+Math.pow((Math.abs(y2-y3)),2));
        double side3 = Math.sqrt(Math.pow((Math.abs(x3-x1)),2)+Math.pow((Math.abs(y3-y1)),2));

        double per = (side1+side2+side3)/2;
        double s = Math.sqrt(per*(per-side1)*(per-side2)*(per-side3));
        System.out.println(s);
        if (s==0){
            System.out.println("Точки расположены в доль одной прямой");
        }
        else {
            System.out.println("Точки не расположены в доль одной прямой");
        }
    }
}

