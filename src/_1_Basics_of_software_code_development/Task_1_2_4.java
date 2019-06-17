package _1_Basics_of_software_code_development;

import java.util.Scanner;


public class Task_1_2_4 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите переменную A");
        int a = scanner.nextInt();
        System.out.println("Ведите переменную B");
        int b = scanner.nextInt();
        System.out.println("Ведите переменную x");
        int x = scanner.nextInt();
        System.out.println("Ведите переменную y");
        int y = scanner.nextInt();
        System.out.println("Ведите переменную z");
        int z = scanner.nextInt();
        if (x<=a){
            if(y<=b ){
                System.out.println("Кирпич сторонами "+x+" и "+y+" пролезет в отверстие");
            }
            if(z<=b){
                System.out.println("Кирпич сторонами "+x+" и "+z+" пролезет в отверстие");
            }
        }
        if (y<=a){
            if(x<=b ){
                System.out.println("Кирпич сторонами "+x+" и "+y+" пролезет в отверстие");
            }
            if(z<=b){
                System.out.println("Кирпич сторонами "+y+" и "+z+" пролезет в отверстие");
            }
        }
        if (z<=a){
            if(y<=b ){
                System.out.println("Кирпич сторонами "+z+" и "+y+" пролезет в отверстие");
            }
            if(x<=b){
                System.out.println("Кирпич сторонами "+x+" и "+y+" пролезет в отверстие");
            }
        }
    }
}

